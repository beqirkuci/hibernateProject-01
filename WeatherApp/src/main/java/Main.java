import bean.WeatherResponse;
import service.WeatherService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String lat = "41.327";
        String lon = "19.818";
        //call external service in order to get weather datas
        WeatherResponse entity = new WeatherService().getLiveWeatherValues(lat,lon);
        // print values
        System.out.println(entity.toString());
    }
}
