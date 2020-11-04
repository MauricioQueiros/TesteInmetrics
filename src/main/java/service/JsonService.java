package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JsonService {


    public static String getJsonFormatter(String[] parametros, String jsonCall){
        String restJson = "";
        String json;

        try {
            StringBuffer sb = new StringBuffer();
            InputStream is = JsonService.class.getResourceAsStream("/json/"+jsonCall);
            InputStreamReader reader = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(reader);

            while((json = br.readLine()) != null){
                sb.append(json);
            }

            br.close();
            restJson = sb.toString();

            for(String parametro : parametros) {
                restJson = restJson.replaceFirst("\\?", parametro);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        return restJson;
    }
}
