package ru.netology;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Testik {
    @org.junit.jupiter.api.Test
    void shouldPass() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("some data"))
        ;
    }
}

