package service;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utils.PropertiesLoader;
import utils.Urls;

import static io.restassured.RestAssured.given;

public class EmpregadoControllerService extends JsonService{


    private static final PropertiesLoader props = new PropertiesLoader();

    static String user = props.getApiPropertie("user_api");
    static String pass = props.getApiPropertie("pass_api");

    public Response cadastrarUsuario(String[]parametros){

        Response response = null;
        RestAssured.baseURI = Urls.BASE_URL_REST+"cadastrar";

        response = given()
                .auth()
                .preemptive()
                .basic(user, pass)
                .contentType("application/json")
                .body(getJsonFormatter(parametros, "post_cadastrar_empregado.json"))
                .when()
                .post();

        return response;
    }

    public Response getAllUsers(){

        Response response = null;
        RestAssured.baseURI = Urls.BASE_URL_REST+"list_all";

        response = given()
                .auth()
                .preemptive()
                .basic(user, pass)
                .get()
                .andReturn();

        return response;
    }

    public Response getUsersById(String id){

        Response response = null;
        RestAssured.baseURI = Urls.BASE_URL_REST+"list/"+id;

        response = given()
                .auth()
                .preemptive()
                .basic(user, pass)
                .get()
                .andReturn();

        return response;
    }

    public void validateStatusCode(Response response, int statusCode){

        Assert.assertEquals("O status code retornado pela API é diferente de "+statusCode,
                response.getStatusCode(), statusCode);

    }
}
