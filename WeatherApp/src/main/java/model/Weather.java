package model;

import lombok.Data;

@Data
public class Weather {
     private Wind wind;
     private Location location;
    private Double temp;
}
