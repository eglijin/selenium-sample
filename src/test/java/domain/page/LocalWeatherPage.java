package domain.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class LocalWeatherPage extends BasePage<LocalWeatherPage> {

    @FindBy(css = "a[href=\"/weather\"]")
    WebElement weatherLink;

}
