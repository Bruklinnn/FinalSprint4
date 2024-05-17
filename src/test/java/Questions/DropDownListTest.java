package Questions;

import MainPage.DropDownList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.time.temporal.ChronoUnit;


public class DropDownListTest {

    private WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.of(5, ChronoUnit.SECONDS));
    }
    //Проверка выпадающего списка
    @Test
    public void dropDownList() {
        DropDownList dropDownList = new DropDownList(driver);
        dropDownList.open();
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(Duration.of(2, ChronoUnit.SECONDS));
        dropDownList.clickCookie();
        dropDownList.SkrollToAboutImportantThings();
        dropDownList.clickHowMuchDoesItCost();
        dropDownList.clickIWantSeveralScootersAtOnce();
        dropDownList.clickRentalTimeCalculated();
        dropDownList.clickScooterRightForToday();
        dropDownList.clickReturnScooterEarlier();
        dropDownList.clickDoYouBringCharger();
        dropDownList.clickCancelTheOrder();
        dropDownList.clickMkad();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

