import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\lione\\IdeaProjects\\HelloSelenium\\edgedriver\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("http://localhost:9000");
        Thread.sleep(2500); //this is to slow down how fast selenium does the automation


        WebElement inputElem1 = driver.findElement(By.id("username-input"));
        WebElement inputElem2 = driver.findElement(By.id("password-input"));
        WebElement inputElem3 = driver.findElement(By.id("role-input"));

        inputElem1.sendKeys("pmanning18");
        inputElem2.sendKeys("m@nn!ng18");
        inputElem3.sendKeys("2");

        WebElement btn1 = driver.findElement(By.id("login-btn"));
        btn1.click();

        Thread.sleep(2500);

        WebElement inputElem4 = driver.findElement(By.id("amount-input"));
        WebElement inputElem5 = driver.findElement(By.id("description-input"));
        WebElement inputElem6 = driver.findElement(By.id("author-input"));
        WebElement inputElem7 = driver.findElement(By.id("resolver-input"));

        inputElem4.sendKeys("100");
        inputElem5.sendKeys("Fuel");
        inputElem6.sendKeys("5");
        inputElem7.sendKeys("1");

        WebElement btn2 = driver.findElement(By.id("create-reimb-btn"));
        btn2.click();

        Thread.sleep(4000);

        WebElement btn3 = driver.findElement(By.id("logout-btn"));
        btn3.click();

        Thread.sleep(5000);


        driver.quit();

    }
}
