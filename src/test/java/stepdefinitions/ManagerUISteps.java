package stepdefinitions;

import com.github.javafaker.Faker;

public class ManagerUISteps {

    public static void main(String[] args) {
        Faker faker = new Faker();

        System.out.println(faker.phoneNumber().cellPhone());
    }

}
