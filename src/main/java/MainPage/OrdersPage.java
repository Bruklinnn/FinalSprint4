package MainPage;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;

@RunWith(Parameterized.class)
public class OrdersPage {
    private static final String URL = "https://qa-scooter.praktikum-services.ru/";

    private final WebDriver driver;
    private final By upperOrderButton = By.xpath(".//button[@class='Button_Button__ra12g']");
    private final By lowerOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']");
    private final By orderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final By yesButton = By.xpath(".//button[text()='Да']");
    private final By nameField = By.xpath(".//input[@placeholder='* Имя']");
    private final By lastNameField = By.xpath(".//input[@placeholder='* Фамилия']");
    private final By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private final By metroStationField = By.xpath(".//div[@class='select-search']");
    private final By metroStation1 = By.xpath(".//div[@class='select-search__select']");
    private final By phoneNumberField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private final By commentForTheCourier = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    private final By calendar = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private final By rentalPeriod = By.xpath(".//div[@class='Dropdown-placeholder']");
    private final By colorBlack = By.xpath(".//input[@id='black']");
    private final By colorGrey = By.xpath(".//input[@id='Grey']");
    private final By metroList = By.xpath(".//div[@class='select-search__value']");
    private final By furtherButton = By.xpath(".//button[text()='Далее']");

    public void open() {
        driver.get(URL);
    }

    public OrdersPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void setLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void clickMetroStation() {
        driver.findElement(metroStationField).click();
    }

    public void clickStation1() {
        driver.findElement(metroStation1).click();
    }

    public void setPhoneNumber(String phoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }

    public void clickCommentForTheCourier() {
        driver.findElement(commentForTheCourier).click();
    }

    public void clickUpperOrderButton() {
        driver.findElement(upperOrderButton).click();
    }

    public void clickLowerOrderButton() {
        driver.findElement(lowerOrderButton).click();
    }

    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }

    public void clickYes(){
        driver.findElement(yesButton).click();
    }

    public void clickOrder(){
        driver.findElement(orderButton).click();
    }

    public void clickCalendar(){
        driver.findElement(calendar).click();
        driver.findElement(By.xpath(".//div[text()='18']")).click();
    }

    public void clickRentalPeriod() {
        driver.findElement(rentalPeriod).click();
        driver.findElement(By.xpath(".//div[text()='сутки']")).click();

    }

    public void clickColorBlack() {
        driver.findElement(colorBlack).click();
    }

    public void clickColorGrey() {
        driver.findElement(colorGrey).click();
    }

    public void clickMetroList() {
        driver.findElement(metroList).click();
    }
    public void clickFurtherButton() {
        driver.findElement(furtherButton).click();
    }

    public void WhoIsTheScooterFor(String name, String lastName, String address, String metroStation, String phoneNumber) {
        setName(name);
        setLastName(lastName);
        setAddress(address);
        clickMetroStation();
        clickStation1();
        setPhoneNumber(phoneNumber);
        clickFurtherButton();
    }

    public void aboutRent(String CommentForTheCourier) {
        clickCalendar();
        clickRentalPeriod();
        clickColorBlack();
        clickCommentForTheCourier();
        clickOrderButton();
        clickYes();
    }

    @Parameterized.Parameters
    public static Object[][]WhoIsTheScooterFor()
    {
        return new Object[][]{
                {"Юрий", "Тихонов", "Ново-Садовая", "Бульвар Рокоссовского", "88005553535"},
                {"Василий", "Иванов", "Ленинская", "Черкизовская", "88005553546"},
        };
    }
}



