package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;
import org.picocontainer.PicoContainer;
import org.testng.annotations.BeforeTest;
import services.NavigationService;
import services.ValidationService;

public class UiStepdefs {

    private static NavigationService navigationService;

    public static ValidationService validationService;

    public UiStepdefs(NavigationService navigationService, ValidationService validationService) {
        UiStepdefs.navigationService = navigationService;
        UiStepdefs.validationService = validationService;
    }

    @BeforeTest
    public void setup() {
        MutablePicoContainer pico = new DefaultPicoContainer();
        pico.addComponent(navigationService);
        pico.addComponent(validationService);
    }

    @Given("User is on {string}")
    public void userIsOn(String arg0) {
        navigationService.openHomePage();
    }

    @When("the user clicks on {string}")
    public void theUserClicksOn(String link) {
        navigationService.selectTopBarLink(link);
    }

    @Then("browser loads the Weather page")
    public void browserLoadsTheWeatherPage() {
        assert navigationService.isOnWeatherPage();
    }

}
