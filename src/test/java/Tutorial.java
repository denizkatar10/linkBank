import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kudik\\eclipse-workspace\\libs\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://gmibank-qa-environment.com");
        driver.findElement(By.id("account-menu")).click();
        driver.findElement(By.xpath("(//a[@class='dropdown-item'][2])")).click();
        driver.findElement(By.id("ssn")).sendKeys(""+Keys.ENTER);
        List<WebElement> elements = (List<WebElement>) driver.findElement(By.xpath("//*[@class=\"invalid-feedback\"]"));
        System.out.println("Number of elements:" +elements.size());

//        for (int i=0; i<elements.size();i++){
//            System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
//        }
    }
}



