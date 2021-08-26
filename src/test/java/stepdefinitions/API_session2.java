package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Country;
import pojos.Customer;
import pojos.Customer1;
import utilities.ConfigurationReader;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class API_session2 {

    Response response;
    int createdCountryId;
    Response responseAll;
    String bearerToken = ConfigurationReader.getProperty("api_bearer_token");

    @Given("read all customer data using with api endpoint {string}")
    public void read_all_customer_data_using_with_api_endpoint(String api_endpoint)  {

        response = given().headers("Authorization",
                        "Bearer "+ ConfigurationReader.getProperty("token"),
                        "Content-Type",
                        ContentType.JSON,"Accept",ContentType.JSON)
                .when()
                .get(api_endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();

        System.out.println("===================================================================================");


    }

    @Then("validate customer data")
    public void validate_customer_data() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Customer[] customers = objectMapper.readValue(response.asString(),Customer[].class);

        // ilk musterinin ismi
        System.out.println(customers[0].getFirstName());

        // 5. musterinin email adresi
        System.out.println(customers[4].getEmail());

        System.out.println("===================================================================================");

        // tum musterilerin SsN numaralari
        for(int i = 0 ; i < customers.length ; i++){
            System.out.println(customers[i].getSsn());
        }

        System.out.println("===================================================================================");

        // M harfi ile baslayan musteri isimleri
        for(int i = 0 ; i < customers.length ; i++){
            if(customers[i].getFirstName().startsWith("M")){
                System.out.println(customers[i].getFirstName());
            }
        }

        System.out.println("===================================================================================");

        for(int i = 0 ; i < customers.length ; i++ ) {
            if(customers[i].getUser() != null) {
                System.out.println(customers[i].getUser().getFirstName());
            }
        }

    }


    // ============================  read all countries =================================


    @Then("read all countries and write country ids to txt using api endpoint {string}")
    public void read_all_countries_and_write_country_ids_to_txt_using_api_endpoint(String api_url) throws IOException {

        response = given().headers("Authorization",
                        "Bearer "+ConfigurationReader.getProperty("token"),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when()
                .get(api_url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();

        // validate isleminde kullanmak icin tum ulke idlerini bir listin icine atalim

        List<String> countryId = new ArrayList<>();

        // objectmapper kullanarak deserilazition yapiyoruz

        ObjectMapper objectMapper = new ObjectMapper();

        Country [] countries = objectMapper.readValue(response.asString(),Country[].class);

        // for dongusu ile tum country id lerini daha  once olusturdugumuz listin icine ekleyelim

        for(int i = 0 ; i < countries.length ; i++){
            countryId.add(String.valueOf(countries[i].getId()));
        }

        // ulke idlerini txt olarak yazdiralim
//
//        WriteToTxt.saveDataInFileWithCountryId("countryId2",countries);
//
//        // txt olarak yazdirdigimiz idleri readtxt uzerinden okutalim
//
//        List<String> readId = ReadTxt.returnCountryIdList("countryId2");
//
//        // validasyon
//
//        Assert.assertEquals("mot match" , countryId ,readId);
//        System.out.println("Validation is succesfull");
//
//


    }

    // ============================  create all countries =================================


    @Given("create country {string}")
    public void create_country(String api_url) {

//        response = given().headers("Authorization",
//                        "Bearer "+ConfigurationReader.getProperty("token"),
//                        "Content-Type",
//                        ContentType.JSON,
//                        "Accept", ContentType.JSON)
//                .when()
//                .body(createCountry)
//                .post(api_url)
//                .then()
//                .contentType(ContentType.JSON)
//                .extract()
//                .response();
//
//        response.prettyPrint();
//
//        JsonPath jsonPath = response.jsonPath();
//        createdCountryId = jsonPath.getInt("id");

        System.out.println("=======================================================");

        System.out.println(createdCountryId);


    }

    // ============================  validate created country =================================
    @Then("validate created a country")
    public void validate_created_a_country() {

        response = given().headers("Authorization",
                        "Bearer "+ConfigurationReader.getProperty("token"),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when()
                .get("https://www.gmibank.com/api/tp-countries")
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        JsonPath jsonPath = response.jsonPath();
        String stringIds = jsonPath.getString("id");

        String stringCreatedCountryId = String.valueOf(createdCountryId);

        Assert.assertTrue("not contain" ,stringIds.contains(stringCreatedCountryId));
        System.out.println("Validation is succesfull");



    }


    //======================= update created country ====================================

    @And("update created a country using api end point {string}  {string} and its extension {string}")
    public void updateCreatedACountryUsingApiEndPointAndItsExtension(String EndPoint, String name, String id) {

        Map <String, Object> putCountry = new HashMap<>();
        putCountry.put("id", id);
        putCountry.put("name", name);
        putCountry.put("states",null);

        response = given().headers(
                        "Authorization",
                        "Bearer " + bearerToken,
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                        .when()
                        .body(putCountry)
                .put(EndPoint)
                .then()
                .contentType(ContentType.JSON)
                .extract().response();

        response.prettyPrint();
    }

    //=============================== delete and validate created country ==========================

    @Given("delete updated a country using endpoint {string} and its extension {string} and validate")
    public void deleteUpdatedACountryUsingEndpointAndItsExtensionAndValidate(String EndPoint, String id) {


        //============= delete country ======================
        response = given().headers("Authorization",
                        "Bearer " + bearerToken,
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when()
                .delete(EndPoint+id)
                .then()
                .extract().response();


        Response responseNew = given().headers("Authorization",
                        "Bearer " + bearerToken,"Content-Type",
                        ContentType.JSON, "Accept", ContentType.JSON)
                .when().get(EndPoint).then()
                .contentType(ContentType.JSON)
                .extract().response();

        JsonPath jsonPath = responseNew.jsonPath();
        String ids = jsonPath.getString("id");

        Assert.assertFalse("not deleted", ids.contains(id));
        System.out.println("Validation is successful");
    }
}
