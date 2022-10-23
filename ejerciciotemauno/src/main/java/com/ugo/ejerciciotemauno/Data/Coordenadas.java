public class Coord
{
    @JsonProperty("lon")
    public double getLon() { 
         return this.lon 
    }
    public double setLon(double lon) { 
         this.lon = lon 
    }
    double lon;

    @JsonProperty("lat")
    public double getLat() { 
         return this.lat 
    }
    public double setLat(double lat) { 
         this.lat = lat 
    }
    double lat;

}

public class Weather
{
    @JsonProperty("id")
    public int getId() { 
         return this.id 
    }
    public int setId(int id) { 
         this.id = id 
    }
    int id;

    @JsonProperty("main")
    public String getMain() { 
         return this.main 
    }
    public String setMain(String main) { 
         this.main = main 
    }
    String main;

    @JsonProperty("description")
    public String getDescription() { 
         return this.description 
    }
    public String setDescription(String description) { 
         this.description = description 
    }
    String description;

    @JsonProperty("icon")
    public String getIcon() { 
         return this.icon 
    }
    public String setIcon(String icon) { 
         this.icon = icon 
    }
    String icon;

}

public class Main
{
    @JsonProperty("temp")
    public double getTemp() { 
         return this.temp 
    }
    public double setTemp(double temp) { 
         this.temp = temp 
    }
    double temp;

    @JsonProperty("feels_like")
    public double getFeels_like() { 
         return this.feels_like 
    }
    public double setFeels_like(double feels_like) { 
         this.feels_like = feels_like 
    }
    double feels_like;

    @JsonProperty("temp_min")
    public double getTemp_min() { 
         return this.temp_min 
    }
    public double setTemp_min(double temp_min) { 
         this.temp_min = temp_min 
    }
    double temp_min;

    @JsonProperty("temp_max")
    public double getTemp_max() { 
         return this.temp_max 
    }
    public double setTemp_max(double temp_max) { 
         this.temp_max = temp_max 
    }
    double temp_max;

    @JsonProperty("pressure")
    public int getPressure() { 
         return this.pressure 
    }
    public int setPressure(int pressure) { 
         this.pressure = pressure 
    }
    int pressure;

    @JsonProperty("humidity")
    public int getHumidity() { 
         return this.humidity 
    }
    public int setHumidity(int humidity) { 
         this.humidity = humidity 
    }
    int humidity;

}

public class Wind
{
    @JsonProperty("speed")
    public double getSpeed() { 
         return this.speed 
    }
    public double setSpeed(double speed) { 
         this.speed = speed 
    }
    double speed;

    @JsonProperty("deg")
    public int getDeg() { 
         return this.deg 
    }
    public int setDeg(int deg) { 
         this.deg = deg 
    }
    int deg;

}

public class Rain
{
    @JsonProperty("1h")
    public double get1h() { 
         return this.1h 
    }
    public double set1h(double 1h) { 
         this.1h = 1h 
    }
    double 1h;

}

public class Clouds
{
    @JsonProperty("all")
    public int getAll() { 
         return this.all 
    }
    public int setAll(int all) { 
         this.all = all 
    }
    int all;

}

public class Sys
{
    @JsonProperty("type")
    public int getType() { 
         return this.type 
    }
    public int setType(int type) { 
         this.type = type 
    }
    int type;

    @JsonProperty("id")
    public int getId() { 
         return this.id 
    }
    public int setId(int id) { 
         this.id = id 
    }
    int id;

    @JsonProperty("country")
    public String getCountry() { 
         return this.country 
    }
    public String setCountry(String country) { 
         this.country = country 
    }
    String country;

    @JsonProperty("sunrise")
    public int getSunrise() { 
         return this.sunrise 
    }
    public int setSunrise(int sunrise) { 
         this.sunrise = sunrise 
    }
    int sunrise;

    @JsonProperty("sunset")
    public int getSunset() { 
         return this.sunset 
    }
    public int setSunset(int sunset) { 
         this.sunset = sunset 
    }
    int sunset;

}

public class Coordenadas
{
    @JsonProperty("coord")
    public Coord getCoord() { 
         return this.coord 
    }
    public Coord setCoord(Coord coord) { 
         this.coord = coord 
    }
    Coord coord;

    @JsonProperty("weather")
    public List<Weather> getWeather() { 
         return this.weather 
    }
    public List<Weather> setWeather(List<Weather> weather) { 
         this.weather = weather 
    }
    List<Weather> weather;

    @JsonProperty("base")
    public String getBase() { 
         return this.base 
    }
    public String setBase(String base) { 
         this.base = base 
    }
    String base;

    @JsonProperty("main")
    public Main getMain() { 
         return this.main 
    }
    public Main setMain(Main main) { 
         this.main = main 
    }
    Main main;

    @JsonProperty("visibility")
    public int getVisibility() { 
         return this.visibility 
    }
    public int setVisibility(int visibility) { 
         this.visibility = visibility 
    }
    int visibility;

    @JsonProperty("wind")
    public Wind getWind() { 
         return this.wind 
    }
    public Wind setWind(Wind wind) { 
         this.wind = wind 
    }
    Wind wind;

    @JsonProperty("rain")
    public Rain getRain() { 
         return this.rain 
    }
    public Rain setRain(Rain rain) { 
         this.rain = rain 
    }
    Rain rain;

    @JsonProperty("clouds")
    public Clouds getClouds() { 
         return this.clouds 
    }
    public Clouds setClouds(Clouds clouds) { 
         this.clouds = clouds 
    }
    Clouds clouds;

    @JsonProperty("dt")
    public int getDt() { 
         return this.dt 
    }
    public int setDt(int dt) { 
         this.dt = dt 
    }
    int dt;

    @JsonProperty("sys")
    public Sys getSys() { 
         return this.sys 
    }
    public Sys setSys(Sys sys) { 
         this.sys = sys 
    }
    Sys sys;

    @JsonProperty("timezone")
    public int getTimezone() { 
         return this.timezone 
    }
    public int setTimezone(int timezone) { 
         this.timezone = timezone 
    }
    int timezone;

    @JsonProperty("id")
    public int getId() { 
         return this.id 
    }
    public int setId(int id) { 
         this.id = id 
    }
    int id;

    @JsonProperty("name")
    public String getName() { 
         return this.name 
    }
    public String setName(String name) { 
         this.name = name 
    }
    String name;

    @JsonProperty("cod")
    public int getCod() { 
         return this.cod 
    }
    public int setCod(int cod) { 
         this.cod = cod 
    }
    int cod;

}

