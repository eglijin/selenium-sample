package services;

import domain.page.BBCNewsHomePage;
import domain.page.LocalWeatherPage;
import utils.BaseTest;

public class NavigationService {
    public BBCNewsHomePage homePage;
    public LocalWeatherPage localWeatherPage;

    public void openHomePage() {
        homePage = BBCNewsHomePage.open();
    }

    public void selectTopBarLink(String link) {
        localWeatherPage = homePage.selectWeatherLink(link);
    }

    public boolean isOnWeatherPage() {
        return BaseTest.getDriver().getCurrentUrl().equals("https://www.bbc.com/weather");
    }
}
