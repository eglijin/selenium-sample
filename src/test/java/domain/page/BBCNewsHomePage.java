package domain.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BasePage;

public class BBCNewsHomePage extends BasePage<BBCNewsHomePage> {

    @FindBy(css = "#orb-header li.orb-nav-weather a")
    public WebElement weatherLink;

    public static BBCNewsHomePage open() {
        new BBCNewsHomePage().get("https://www.bbc.com");
        return PageFactory.initElements(driver, BBCNewsHomePage.class);
    }

    public LocalWeatherPage selectWeatherLink(String link) {
        System.out.println(weatherLink.getTagName());
        System.out.println(weatherLink.getText());
        System.out.println(weatherLink.getAttribute("href"));
        weatherLink.click();
        return PageFactory.initElements(driver, LocalWeatherPage.class);
    }
}
