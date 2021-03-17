import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ApiTest {

    @Test
        public void checkResponseTest() {
            Response response = new RestAssured().get("https://reqres.in/api/users/2");
            assertEquals(response.getStatusCode(), 1);
            System.out.println(response.getBody().asString());
        }
    }

