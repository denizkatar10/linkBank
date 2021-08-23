package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pojos.Customer1;
import utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class CustomerAPISteps<customers> {
    Response response;
    String bearerToken = ConfigurationReader.getProperty("api_bearer_token");
    Customer1 [] customers;
    String fileName  = ConfigurationReader.getProperty("allCustomerInfoFilePath");

    @Given("user sets all customer info to response {string}")
    public void user_sets_all_customer_info_to_response(String EndPoint) {
        response = given().headers(
                        "Authorization",
                        "Bearer " + bearerToken,
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when()
                .get(EndPoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();
    }

    @Given("Deserialize all customer info to Java")
    public void deserializeAllCustomerInfoToJava() throws IOException {

        ObjectMapper obj = new ObjectMapper();

        customers = obj.readValue(response.asString(), Customer1[].class);

//        System.out.println(customers[0].getMobilePhoneNumber());

//        for (int i = 0; i < customers.length; i++) {
//            if(customers[i].getCountry() != null){
//                System.out.println(customers[i].getCountry().getName());
//            }
//        }

        for (int i = 0; i < customers.length; i++) {
            if(customers[i].getFirstName().startsWith("M")){
                System.out.println(customers[i].getFirstName());
            }
        }


    }
//
    @And("All customer info should be saved to correspondent files")
    public void allCustomerInfoShouldBeSavedToCorrespondentFiles() {
//        System.out.println(fileName);
//        WriteToTxt.saveDataInFileWithSSN(fileName, customers);
//        System.out.println(customers.length);
    }

//
        @Then("validate customers info")
    public void validateCustomersInfo() {

//        String allCustomerInfoFilePath = ConfigurationReader.getProperty("allCustomerInfoFilePath");
//        String allCustomerInfoFilePath = ConfigurationReader.getProperty("customerInformationFile");
//        System.out.println(allCustomerInfoFilePath);
//        System.out.println(ReadTxt.returnAWholeUser(allCustomerInfoFilePath).size()-1);
//        String finalCusSSNid = ReadTxt.returnAWholeUser(allCustomerInfoFilePath).get(ReadTxt.returnAWholeUser(allCustomerInfoFilePath).size()-1).getSsn().toString();
//
//        List <String> actualSSNList = ReadTxt.returnCustomerSNNList(fileName);
//
//        List <String> expectedSSNList = new ArrayList<>();
//
//        expectedSSNList.add("224-71-4004");
//        expectedSSNList.add("231-89-4203");
//        expectedSSNList.add("159-63-9248");
//        Assert.assertTrue("The current data do not match with our records", actualSSNList.containsAll(expectedSSNList));
//
//        System.out.println("Final SSN id ==> " + finalCusSSNid);

    }
}