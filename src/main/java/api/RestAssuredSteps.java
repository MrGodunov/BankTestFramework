package api;

import io.qameta.allure.Step;

import static io.restassured.RestAssured.given;

public class RestAssuredSteps {

    @Step("Очистка БД пользователей")
    public RestAssuredSteps cleanDb() {
        io.restassured.RestAssured.baseURI = "https://parabank.parasoft.com/parabank/services/bank";

        given()
                .header("Content-Type", "application/x-www-form-urlencoded")
                .when()
                .post("/cleanDB")
                .then()
                .statusCode(204);
        return this;
    }
}
