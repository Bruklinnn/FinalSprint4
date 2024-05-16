package Questions;

import MainPage.OrdersPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;


//тест ловит баг с нижней кнопкой "заказать" кнопка меняет свое название в классе

public class OrdersTest {
    private WebDriver Driver;

    @Before
    public void setup() {
        Driver = new ChromeDriver();
        Driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @Test
    public void upperOrder() {
        WebDriverWait wait = new WebDriverWait(Driver , Duration.ofSeconds(10));
        OrdersPage registration = new OrdersPage(Driver);
        registration.open();
        registration.clickUpperOrderButton();
        registration.WhoIsTheScooterFor("Андрей", "Андреев", "Андреевская", "Бульвар Рокоссовского", "88005553535");
        registration.aboutRent("Thanks");
        registration.clickOrderButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[text()='Order_Modal__YZ-d3']")));
        registration.clickYes();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[text()='Заказ оформлен']")));
        registration.orderHasBeenFormed();
        String text = Driver.findElement(By.xpath(".//div[@class='Order_Text__2broi']")).getAttribute("innerText");
        System.out.println(text);

    }
    //Заказ товара
    @Test
    public void lowerOrder() {
        OrdersPage registration = new OrdersPage(Driver);
        registration.open();
        WebDriver.Timeouts timeouts = Driver.manage().timeouts().implicitlyWait(Duration.of(2, ChronoUnit.SECONDS));
        registration.ToLowerButton();
        registration.clickLowerOrderButton();
        registration.WhoIsTheScooterFor("Иван", "Иванов", "Ивановская", "Бульвар Рокоссовского", "88005553536");
        registration.aboutRent("Thanks");
        registration.orderHasBeenFormed();
        String text = Driver.findElement(By.xpath(".//div[@class='Order_Text__2broi']")).getAttribute("innerText");
        System.out.println(text);
    }


    @After
    public void tearDown() {

        Driver.quit();
    }
}

