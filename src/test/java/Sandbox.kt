import domain.page.BBCNewsHomePage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.PageFactory
import org.testng.annotations.Test


class Sandbox {


    @Test
    fun navigation() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver")
        val driver: WebDriver = ChromeDriver()
        driver.get("https://www.bbc.com")
        println(driver.currentUrl)
        val homePage: BBCNewsHomePage = PageFactory.initElements(driver, BBCNewsHomePage::class.java)
        println("")
    }

}