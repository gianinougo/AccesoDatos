public class Coord
{
    @JsonProperty("-lon")
    public String get-lon() { 
         return this.-lon 
    }
    public String set-lon(String -lon) { 
         this.-lon = -lon 
    }
    String -lon;

    @JsonProperty("-lat")
    public String get-lat() { 
         return this.-lat 
    }
    public String set-lat(String -lat) { 
         this.-lat = -lat 
    }
    String -lat;

    @JsonProperty("-self-closing")
    public String get-self-closing() { 
         return this.-self-closing 
    }
    public String set-self-closing(String -self-closing) { 
         this.-self-closing = -self-closing 
    }
    String -self-closing;

}

public class Sun
{
    @JsonProperty("-rise")
    public Date get-rise() { 
         return this.-rise 
    }
    public Date set-rise(Date -rise) { 
         this.-rise = -rise 
    }
    Date -rise;

    @JsonProperty("-set")
    public Date get-set() { 
         return this.-set 
    }
    public Date set-set(Date -set) { 
         this.-set = -set 
    }
    Date -set;

    @JsonProperty("-self-closing")
    public String get-self-closing() { 
         return this.-self-closing 
    }
    public String set-self-closing(String -self-closing) { 
         this.-self-closing = -self-closing 
    }
    String -self-closing;

}

public class City
{
    @JsonProperty("-id")
    public String get-id() { 
         return this.-id 
    }
    public String set-id(String -id) { 
         this.-id = -id 
    }
    String -id;

    @JsonProperty("-name")
    public String get-name() { 
         return this.-name 
    }
    public String set-name(String -name) { 
         this.-name = -name 
    }
    String -name;

    @JsonProperty("coord")
    public Coord getCoord() { 
         return this.coord 
    }
    public Coord setCoord(Coord coord) { 
         this.coord = coord 
    }
    Coord coord;

    @JsonProperty("country")
    public String getCountry() { 
         return this.country 
    }
    public String setCountry(String country) { 
         this.country = country 
    }
    String country;

    @JsonProperty("timezone")
    public String getTimezone() { 
         return this.timezone 
    }
    public String setTimezone(String timezone) { 
         this.timezone = timezone 
    }
    String timezone;

    @JsonProperty("sun")
    public Sun getSun() { 
         return this.sun 
    }
    public Sun setSun(Sun sun) { 
         this.sun = sun 
    }
    Sun sun;

}

public class Temperature
{
    @JsonProperty("-value")
    public String get-value() { 
         return this.-value 
    }
    public String set-value(String -value) { 
         this.-value = -value 
    }
    String -value;

    @JsonProperty("-min")
    public String get-min() { 
         return this.-min 
    }
    public String set-min(String -min) { 
         this.-min = -min 
    }
    String -min;

    @JsonProperty("-max")
    public String get-max() { 
         return this.-max 
    }
    public String set-max(String -max) { 
         this.-max = -max 
    }
    String -max;

    @JsonProperty("-unit")
    public String get-unit() { 
         return this.-unit 
    }
    public String set-unit(String -unit) { 
         this.-unit = -unit 
    }
    String -unit;

    @JsonProperty("-self-closing")
    public String get-self-closing() { 
         return this.-self-closing 
    }
    public String set-self-closing(String -self-closing) { 
         this.-self-closing = -self-closing 
    }
    String -self-closing;

}

public class FeelsLike
{
    @JsonProperty("-value")
    public String get-value() { 
         return this.-value 
    }
    public String set-value(String -value) { 
         this.-value = -value 
    }
    String -value;

    @JsonProperty("-unit")
    public String get-unit() { 
         return this.-unit 
    }
    public String set-unit(String -unit) { 
         this.-unit = -unit 
    }
    String -unit;

    @JsonProperty("-self-closing")
    public String get-self-closing() { 
         return this.-self-closing 
    }
    public String set-self-closing(String -self-closing) { 
         this.-self-closing = -self-closing 
    }
    String -self-closing;

}

public class Humidity
{
    @JsonProperty("-value")
    public String get-value() { 
         return this.-value 
    }
    public String set-value(String -value) { 
         this.-value = -value 
    }
    String -value;

    @JsonProperty("-unit")
    public String get-unit() { 
         return this.-unit 
    }
    public String set-unit(String -unit) { 
         this.-unit = -unit 
    }
    String -unit;

    @JsonProperty("-self-closing")
    public String get-self-closing() { 
         return this.-self-closing 
    }
    public String set-self-closing(String -self-closing) { 
         this.-self-closing = -self-closing 
    }
    String -self-closing;

}

public class Pressure
{
    @JsonProperty("-value")
    public String get-value() { 
         return this.-value 
    }
    public String set-value(String -value) { 
         this.-value = -value 
    }
    String -value;

    @JsonProperty("-unit")
    public String get-unit() { 
         return this.-unit 
    }
    public String set-unit(String -unit) { 
         this.-unit = -unit 
    }
    String -unit;

    @JsonProperty("-self-closing")
    public String get-self-closing() { 
         return this.-self-closing 
    }
    public String set-self-closing(String -self-closing) { 
         this.-self-closing = -self-closing 
    }
    String -self-closing;

}

public class Speed
{
    @JsonProperty("-value")
    public String get-value() { 
         return this.-value 
    }
    public String set-value(String -value) { 
         this.-value = -value 
    }
    String -value;

    @JsonProperty("-unit")
    public String get-unit() { 
         return this.-unit 
    }
    public String set-unit(String -unit) { 
         this.-unit = -unit 
    }
    String -unit;

    @JsonProperty("-name")
    public String get-name() { 
         return this.-name 
    }
    public String set-name(String -name) { 
         this.-name = -name 
    }
    String -name;

    @JsonProperty("-self-closing")
    public String get-self-closing() { 
         return this.-self-closing 
    }
    public String set-self-closing(String -self-closing) { 
         this.-self-closing = -self-closing 
    }
    String -self-closing;

}

public class Gusts
{
    @JsonProperty("-self-closing")
    public String get-self-closing() { 
         return this.-self-closing 
    }
    public String set-self-closing(String -self-closing) { 
         this.-self-closing = -self-closing 
    }
    String -self-closing;

}

public class Direction
{
    @JsonProperty("-value")
    public String get-value() { 
         return this.-value 
    }
    public String set-value(String -value) { 
         this.-value = -value 
    }
    String -value;

    @JsonProperty("-code")
    public String get-code() { 
         return this.-code 
    }
    public String set-code(String -code) { 
         this.-code = -code 
    }
    String -code;

    @JsonProperty("-name")
    public String get-name() { 
         return this.-name 
    }
    public String set-name(String -name) { 
         this.-name = -name 
    }
    String -name;

    @JsonProperty("-self-closing")
    public String get-self-closing() { 
         return this.-self-closing 
    }
    public String set-self-closing(String -self-closing) { 
         this.-self-closing = -self-closing 
    }
    String -self-closing;

}

public class Wind
{
    @JsonProperty("speed")
    public Speed getSpeed() { 
         return this.speed 
    }
    public Speed setSpeed(Speed speed) { 
         this.speed = speed 
    }
    Speed speed;

    @JsonProperty("gusts")
    public Gusts getGusts() { 
         return this.gusts 
    }
    public Gusts setGusts(Gusts gusts) { 
         this.gusts = gusts 
    }
    Gusts gusts;

    @JsonProperty("direction")
    public Direction getDirection() { 
         return this.direction 
    }
    public Direction setDirection(Direction direction) { 
         this.direction = direction 
    }
    Direction direction;

}

public class Clouds
{
    @JsonProperty("-value")
    public String get-value() { 
         return this.-value 
    }
    public String set-value(String -value) { 
         this.-value = -value 
    }
    String -value;

    @JsonProperty("-name")
    public String get-name() { 
         return this.-name 
    }
    public String set-name(String -name) { 
         this.-name = -name 
    }
    String -name;

    @JsonProperty("-self-closing")
    public String get-self-closing() { 
         return this.-self-closing 
    }
    public String set-self-closing(String -self-closing) { 
         this.-self-closing = -self-closing 
    }
    String -self-closing;

}

public class Visibility
{
    @JsonProperty("-value")
    public String get-value() { 
         return this.-value 
    }
    public String set-value(String -value) { 
         this.-value = -value 
    }
    String -value;

    @JsonProperty("-self-closing")
    public String get-self-closing() { 
         return this.-self-closing 
    }
    public String set-self-closing(String -self-closing) { 
         this.-self-closing = -self-closing 
    }
    String -self-closing;

}

public class Precipitation
{
    @JsonProperty("-mode")
    public String get-mode() { 
         return this.-mode 
    }
    public String set-mode(String -mode) { 
         this.-mode = -mode 
    }
    String -mode;

    @JsonProperty("-self-closing")
    public String get-self-closing() { 
         return this.-self-closing 
    }
    public String set-self-closing(String -self-closing) { 
         this.-self-closing = -self-closing 
    }
    String -self-closing;

}

public class Weather
{
    @JsonProperty("-number")
    public String get-number() { 
         return this.-number 
    }
    public String set-number(String -number) { 
         this.-number = -number 
    }
    String -number;

    @JsonProperty("-value")
    public String get-value() { 
         return this.-value 
    }
    public String set-value(String -value) { 
         this.-value = -value 
    }
    String -value;

    @JsonProperty("-icon")
    public String get-icon() { 
         return this.-icon 
    }
    public String set-icon(String -icon) { 
         this.-icon = -icon 
    }
    String -icon;

    @JsonProperty("-self-closing")
    public String get-self-closing() { 
         return this.-self-closing 
    }
    public String set-self-closing(String -self-closing) { 
         this.-self-closing = -self-closing 
    }
    String -self-closing;

}

public class Lastupdate
{
    @JsonProperty("-value")
    public Date get-value() { 
         return this.-value 
    }
    public Date set-value(Date -value) { 
         this.-value = -value 
    }
    Date -value;

    @JsonProperty("-self-closing")
    public String get-self-closing() { 
         return this.-self-closing 
    }
    public String set-self-closing(String -self-closing) { 
         this.-self-closing = -self-closing 
    }
    String -self-closing;

}

public class Current
{
    @JsonProperty("city")
    public City getCity() { 
         return this.city 
    }
    public City setCity(City city) { 
         this.city = city 
    }
    City city;

    @JsonProperty("temperature")
    public Temperature getTemperature() { 
         return this.temperature 
    }
    public Temperature setTemperature(Temperature temperature) { 
         this.temperature = temperature 
    }
    Temperature temperature;

    @JsonProperty("feels_like")
    public FeelsLike getFeels_like() { 
         return this.feels_like 
    }
    public FeelsLike setFeels_like(FeelsLike feels_like) { 
         this.feels_like = feels_like 
    }
    FeelsLike feels_like;

    @JsonProperty("humidity")
    public Humidity getHumidity() { 
         return this.humidity 
    }
    public Humidity setHumidity(Humidity humidity) { 
         this.humidity = humidity 
    }
    Humidity humidity;

    @JsonProperty("pressure")
    public Pressure getPressure() { 
         return this.pressure 
    }
    public Pressure setPressure(Pressure pressure) { 
         this.pressure = pressure 
    }
    Pressure pressure;

    @JsonProperty("wind")
    public Wind getWind() { 
         return this.wind 
    }
    public Wind setWind(Wind wind) { 
         this.wind = wind 
    }
    Wind wind;

    @JsonProperty("clouds")
    public Clouds getClouds() { 
         return this.clouds 
    }
    public Clouds setClouds(Clouds clouds) { 
         this.clouds = clouds 
    }
    Clouds clouds;

    @JsonProperty("visibility")
    public Visibility getVisibility() { 
         return this.visibility 
    }
    public Visibility setVisibility(Visibility visibility) { 
         this.visibility = visibility 
    }
    Visibility visibility;

    @JsonProperty("precipitation")
    public Precipitation getPrecipitation() { 
         return this.precipitation 
    }
    public Precipitation setPrecipitation(Precipitation precipitation) { 
         this.precipitation = precipitation 
    }
    Precipitation precipitation;

    @JsonProperty("weather")
    public Weather getWeather() { 
         return this.weather 
    }
    public Weather setWeather(Weather weather) { 
         this.weather = weather 
    }
    Weather weather;

    @JsonProperty("lastupdate")
    public Lastupdate getLastupdate() { 
         return this.lastupdate 
    }
    public Lastupdate setLastupdate(Lastupdate lastupdate) { 
         this.lastupdate = lastupdate 
    }
    Lastupdate lastupdate;

}

public class City
{
    @JsonProperty("current")
    public Current getCurrent() { 
         return this.current 
    }
    public Current setCurrent(Current current) { 
         this.current = current 
    }
    Current current;

    @JsonProperty("#omit-xml-declaration")
    public String get#omit-xml-declaration() { 
         return this.#omit-xml-declaration 
    }
    public String set#omit-xml-declaration(String #omit-xml-declaration) { 
         this.#omit-xml-declaration = #omit-xml-declaration 
    }
    String #omit-xml-declaration;

}

