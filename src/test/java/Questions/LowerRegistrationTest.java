package Questions;

import MainPage.OrdersPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.time.temporal.ChronoUnit;


//тест ловит баг с нижней кнопкой "заказать" кнопка меняет свое название в классе

public class LowerRegistrationTest {
    private WebDriver Driver;

    @Before
    public void setup() {
        Driver = new ChromeDriver();
        Driver.manage().timeouts().implicitlyWait(Duration.of(5, ChronoUnit.SECONDS));
    }
    //Заказ товара
    @Test
    public void Registration() {
        OrdersPage registration = new OrdersPage(Driver);
        registration.open();
        WebDriver.Timeouts timeouts = Driver.manage().timeouts().implicitlyWait(Duration.of(2, ChronoUnit.SECONDS));
        registration.ToLowerButton();
        registration.clickLowerOrderButton();
        registration.WhoIsTheScooterFor("Иван", "Иванов", "Ивановская", "Бульвар Рокоссовского", "88005553536");
        registration.aboutRent("Thanks");
        String text = Driver.findElement(By.xpath(".//div[@class='Order_ModalHeader__3FDaJ']")).getText();
    }

    @After
    public void tearDown() {

        Driver.quit();
    }
}

