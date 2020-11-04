package service;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utils.Urls;

import static io.restassured.RestAssured.given;

public class EmpregadoControllerService extends JsonService{

    public Response cadastrarUsuario(String[]parametros){

        Response response = null;
        RestAssured.baseURI = Urls.BASE_URL_REST+"cadastrar";

        response = given()
                .auth()
                .preemptive()
                .basic("inmetrics", "automacao")
                .contentType("application/json")
                .body(getJsonFormatter(parametros, "post_cadastrar_empregado.json"))
                .when()
                .post();

        return response;
    }

    public void validateStatusCode(Response response, int statusCode){

        Assert.assertEquals("O status code retornado pela API é diferente de "+statusCode,
                response.getStatusCode(), statusCode);

    }
}
