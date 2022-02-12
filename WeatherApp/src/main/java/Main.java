import bean.WeatherResponse;
import model.Location;
import model.Weather;
import model.Wind;
import service.WeatherService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Location location = new Location();
        location.setLat(41.327);
        location.setLon(19.818);
        location.setName("Tirana");

        // using hibernate DAO/Repository blabla Save to DB
        // Find location by Name  using Repository : returns Location


        //call external service in order to get weather datas
        WeatherResponse entity = new WeatherService().
                getLiveWeatherValues(Double.toString(location.getLat()), Double.toString(location.getLon()));

        // populate  Wind wind;

        Wind wind = new Wind();
        wind.setSpeed(entity.getWind().getSpeed());
        wind.setDirection(entity.getWind().getDeg());


        // get from fist call repo Location location;
        /// Integer temp;

        Weather  weather = new Weather();
        weather.setTemp(entity.getMain().getTemp());
        //... bla bla

        //childs
        weather.setWind(wind);
        weather.setLocation(location);
        // TODO Save weather to DB






        System.out.println(entity.toString());
    }
}
