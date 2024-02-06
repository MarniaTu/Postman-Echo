import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostTest {

    @Test
    public void shouldReturnStatusCode200AndBodyValue() {

        // Given - When - Then
// Предусловия
        given().baseUri("https://postman-echo.com").body("Wellington is the capital of New Zealand") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when().post("/post")
// Проверки
                .then().statusCode(200).body("data", equalTo("Wellington is the capital of New Zealand"));
    }
}

