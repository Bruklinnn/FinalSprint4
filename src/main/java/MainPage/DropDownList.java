package MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DropDownList {
    private final WebDriver driver;
    private static final String URL = "https://qa-scooter.praktikum-services.ru/";
    private final By cookie = By.xpath(".//Button[text()='да все привыкли']");
    private final By QuestionsAboutImportantThings = By.xpath(".//div[text()='Вопросы о важном']");
    private final By howMuchDoesItCost = By.xpath(".//div[text()='Сколько это стоит? И как оплатить?']");
    private final By iWantSeveralScootersAtOnce = By.xpath(".//div[text()='Хочу сразу несколько самокатов! Так можно?']");
    private final By rentalTimeCalculated = By.xpath(".//div[text()='Как рассчитывается время аренды?']");
    private final By scooterRightForToday = By.xpath(".//div[text()='Можно ли заказать самокат прямо на сегодня?']");
    private final By returnScooterEarlier = By.xpath(".//div[text()='Можно ли продлить заказ или вернуть самокат раньше?']");
    private final By doYouBringCharger = By.xpath(".//div[text()='Вы привозите зарядку вместе с самокатом?']");;
    private final By cancelTheOrder = By.xpath(".//div[text()='Можно ли отменить заказ?']");
    private final By MKAD = By.xpath(".//div[text()='Я жизу за МКАДом, привезёте?']");

    public DropDownList(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(URL);
    }

    public void clickCookie(){
        driver.findElement(cookie).click();
    }

    public void SkrollToAboutImportantThings(){
        WebElement QuestionsAboutImportantThings = driver.findElement(By.xpath(".//div[text()='Вопросы о важном']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",QuestionsAboutImportantThings);
    }

    public void clickHowMuchDoesItCost(){
        driver.findElement(howMuchDoesItCost).click();
        String text = driver.findElement(By.id("accordion__panel-0")).getText();
    }
    public void clickIWantSeveralScootersAtOnce(){
        driver.findElement(iWantSeveralScootersAtOnce).click();
        String text = driver.findElement(By.id("accordion__panel-1")).getText();
    }
    public void clickRentalTimeCalculated(){
        driver.findElement(rentalTimeCalculated).click();
        String text = driver.findElement(By.id("accordion__panel-2")).getText();
    }
    public void clickScooterRightForToday(){
        driver.findElement(scooterRightForToday).click();
        String text = driver.findElement(By.id("accordion__panel-3")).getText();
    }
    public void clickReturnScooterEarlier(){
        driver.findElement(returnScooterEarlier).click();
        String text = driver.findElement(By.id("accordion__panel-4")).getText();
    }
    public void clickDoYouBringCharger(){
        driver.findElement(doYouBringCharger).click();
        String text = driver.findElement(By.id("accordion__panel-5")).getText();
    }
    public void clickCancelTheOrder(){
        driver.findElement(cancelTheOrder).click();
        String text = driver.findElement(By.id("accordion__panel-6")).getText();
    }
    public void clickMkad(){
        driver.findElement(MKAD).click();
        String text = driver.findElement(By.id("accordion__panel-7")).getText();
    }
}
