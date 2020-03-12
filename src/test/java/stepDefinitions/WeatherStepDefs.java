package stepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.WeatherResponse;
import org.junit.jupiter.api.Assertions;
import requesters.WeatherRequester;

public class WeatherStepDefs {
    private String city; //vidno vsem funkcijam vnutri klassa
    private WeatherResponse response;

    @Given("city is: (.*)")
    public void set_city(String city) {
        this.city = city;
    }

    @When("we are requesting weather")
    public void request_weather() throws JsonProcessingException {
        WeatherRequester requester = new WeatherRequester();
        response = requester.requestWeather(city);
    }

    @Then("lon is (.*)")
    public void check_lon(Double lon) {
        Assertions.assertEquals(lon, response.getCoord().getLon(), "Wrong Lon!");
    }

    @Then("lat is (.*)")
    public void check_lat(Double lat) {
        Assertions.assertEquals(lat, response.getCoord().getLat(), "Worng Lan!");
    }

    @Then("temp is (.*)")
    public void check_temp(Double temp) {
        Assertions.assertEquals(temp, response.getMain().getTemp(), "Wrong Temp!");
    }

    @Then("pressure is (.*)")
    public void check_pressure(Double pressure) {
        Assertions.assertEquals(pressure, response.getMain().getPressure(), "Wrong Pressure!");
    }

    @Then("humidity is (.*)")
    public void check_humidity(Double humidity) {
        Assertions.assertEquals(humidity, response.getMain().getHumidity(), "Wrong Humidity!");
    }

    @Then("temp_min is (.*)")
    public void check_temp_min(Double temp_min) {
        Assertions.assertEquals(temp_min, response.getMain().getTemp_min(), "Wrong Minimal Temp!");
    }

    @Then("temp_max is (.*)")
    public void check_temp_max(Double temp_max) {
        Assertions.assertEquals(temp_max, response.getMain().getTemp_max(), "Wrong Maximal Temp!");
    }

    @Then("weather_id is (.*)")
    public void check_weather_id(Integer weather_id) {
        Assertions.assertEquals(weather_id, response.getWeather().get(0).getWeather_id(), "Wrong Weather Id!");
    }

    @Then("main is (.*)")
    public void check_main(String main) {
        Assertions.assertEquals(main, response.getWeather().get(0).getMain(), "Wrong Main!");
    }

    @Then("description is (.*)")
    public void check_description(String description) {
        Assertions.assertEquals(description, response.getWeather().get(0).getDescription(), "Wrong Description!");
    }

    @Then("icon is (.*)")
    public void check_icon(String icon) {
        Assertions.assertEquals(icon, response.getWeather().get(0).getIcon(), "Wrong Icon!");
    }

    @Then("base is (.*)")
    public void check_base(String base) {
        Assertions.assertEquals(base, response.getBase(), "Wrong Base!");
    }

    @Then("visibility is (.*)")
    public void check_visibility(Double visibility) {
        Assertions.assertEquals(visibility, response.getVisibility(), "Wrong Visibility!");
    }

    @Then("speed is (.*)")
    public void check_speed(Double speed) {
        Assertions.assertEquals(speed, response.getWind().getSpeed(), "Wrong Speed!");
    }

    @Then("deg is (.*)")
    public void check_deg(Double deg) {
        Assertions.assertEquals(deg, response.getWind().getDeg(), "Wrong Deg!");
    }

    @Then("all is (.*)")
    public void check_all(Integer all) {
        Assertions.assertEquals(all, response.getClouds().getAll(), "Wrong All!");
    }

    @Then("dt is (.*)")
    public void check_dt(Integer dt) {
        Assertions.assertEquals(dt, response.getDt(), "Wrong Dt!");
    }

    @Then("type is (.*)")
    public void check_type(Integer type) {
        Assertions.assertEquals(type, response.getSys().getType(), "Wrong Type!");
    }

    @Then("sys_id is (.*)")
    public void check_sys_id(Integer sys_id) {
        Assertions.assertEquals(sys_id, response.getSys().getSys_id(), "Wrong sys Id!");
    }

    @Then("message is (.*)")
    public void check_message(Double message) {
        Assertions.assertEquals(message, response.getSys().getMessage(), "Wrong Message!");
    }

    @Then("country is (.*)")
    public void check_country(String country) {
        Assertions.assertEquals(country, response.getSys().getCountry(), "Wrong Country!");
    }

    @Then("sunrise is (.*)")
    public void check_sunrise(Integer sunrise) {
        Assertions.assertEquals(sunrise, response.getSys().getSunrise(), "Wrong sunrise!");
    }

    @Then("sunset is (.*)")
    public void check_sunset(Integer sunset) {
        Assertions.assertEquals(sunset, response.getSys().getSunset(), "Wrong sunset!");
    }

    @Then("name is (.*)")
    public void check_name(String name) {
        Assertions.assertEquals(name, response.getName(), "Wrong name!");
    }

    @Then("id is (.*)")
    public void check_id(Integer id) {
        Assertions.assertEquals(id, response.getId(), "Wrong Id!");
    }

    @Then("cod is (.*)")
    public void check_cod(Integer cod) {
        Assertions.assertEquals(cod, response.getCod(), "Wrong cod!");
    }

}
