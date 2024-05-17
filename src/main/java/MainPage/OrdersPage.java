package MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrdersPage {
    private static final String URL = "https://qa-scooter.praktikum-services.ru/";

    private final WebDriver driver;
    private final By upperOrderButton = By.xpath(".//button[@class='Button_Button__ra12g']"); //верхняя кнопка заказа
    private final By lowerOrderButton = By.xpath(".//button[@class='.//button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']"); //нижняя кнопка заказа
    private final By orderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"); //кнопка заказать
    private final By yesButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"); //кнопка "Да"
    private final By nameField = By.xpath(".//input[@placeholder='* Имя']"); //поле имя
    private final By lastNameField = By.xpath(".//input[@placeholder='* Фамилия']"); //поле Фамилия
    private final By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']"); //поле адрес
    private final By metroStationField = By.xpath(".//div[@class='select-search']"); // поле станция метро
    private final By metroStation1 = By.xpath(".//div[@class='select-search__select']"); //клик по станции метро
    private final By phoneNumberField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']"); //поле телефон
    private final By commentForTheCourier = By.xpath(".//input[@placeholder='Комментарий для курьера']"); //поле комментарий для курьера
    private final By calendar = By.xpath(".//input[@placeholder='* Когда привезти самокат']"); //поле календарь
    private final By rentalPeriod = By.xpath(".//div[@class='Dropdown-placeholder']"); //поле аренда
    private final By colorBlack = By.xpath(".//input[@id='black']"); //кнопка выбора черного самоката
    private final By colorGrey = By.xpath(".//input[@id='Grey']"); //кнопка выбора серого самоката
    private final By metroList = By.xpath(".//div[@class='select-search__value']"); //клик
    private final By furtherButton = By.xpath(".//button[text()='Далее']"); //кнопка далее
    private final By theOrderHasBeenFormed = By.xpath(".//div[@class='Order_Text__2broi']");

    public void open() {
        driver.get(URL);
    }

    public OrdersPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ToLowerButton(){
        WebElement lowerOrderButton = driver.findElement(By.xpath(".//div[@class='Home_FinishButton__1_cWm']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",lowerOrderButton);
    }

    public void setName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void setLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setAddress(String adress) {
        driver.findElement(addressField).sendKeys(adress);
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
    public void orderHasBeenFormed() {
        driver.findElement(theOrderHasBeenFormed).isDisplayed();
    }

    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }

    public void clickYes() {
        driver.findElement(yesButton).click();
    }

    public void clickOrder() {
        driver.findElement(orderButton).click();
    }

    public void clickCalendar() {
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
    }
}



