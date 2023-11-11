package ru.netology;

import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;
public class PostmanEchoTest {

    @Test
    void shouldReturnSendData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("hi, Nikita")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("hi, Nikita"));
    }
}
