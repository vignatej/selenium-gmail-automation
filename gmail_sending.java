package co.vigna.selenium.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class gmail_sending {
    public static WebDriver driver = null;
    
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.navigate().to("https://mail.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement myElement = driver.findElement(By.xpath("//*[@id='identifierId']"));
        myElement.sendKeys("420217@student.nitandhra.ac.in");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/span")).click();
        Thread.sleep(5000);

        WebElement passwordInput = driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));
        passwordInput.sendKeys("Nirmala@123");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/span")).click();
        Thread.sleep(15000);

        // clicking on latest sent emails
        driver.findElement(By.xpath("//*[@id=':kn']/div/div[2]/span/a")).click();
        Thread.sleep(5000);

        WebElement latestEmail = driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[5]/div/div/div/div/div[2]/div/div[1]/div/div[3]/div[4]/div[1]/div/table/tbody/tr[1]/td[4]/div[2]"));
        latestEmail.click();
        Thread.sleep(3000);

        WebElement replyOption = driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[5]/div/div/div/div/div[2]/div/div[1]/div/div[4]/div/table/tr/td/div[2]/div[2]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div/div/table/tbody/tr/td[2]/div/div/span[1]"));
        replyOption.click();
        Thread.sleep(3000);

        WebElement emailInputArea = driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[5]/div/div/div/div/div[2]/div/div[1]/div/div[4]/div/table/tr/td/div[2]/div[2]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[1]/td/div/div[2]/div[3]/div/table/tbody/tr/td[2]/div[2]/div/div[1]"));
        emailInputArea.sendKeys("This is email from automated selenium webdriver by vigna tej reddy roll: 420217");
        Thread.sleep(1000);

        WebElement sendEmailBtn = driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[5]/div/div/div/div/div[2]/div/div[1]/div/div[4]/div/table/tr/td/div[2]/div[2]/div/div[3]/div[2]/div/div/div/div/div[2]/div/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div[2]/div[1]/div[4]/table/tbody/tr/td[1]/div/div[2]/div[1]"));
        sendEmailBtn.click();
        Thread.sleep(3000);

        Thread.sleep(3000);


        //logout
        driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[3]/header/div[2]/div[3]/div[1]/div[2]/div[1]/div/img")).click();
        Thread.sleep(2000);
        WebElement ifame = driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[3]/header/div[2]/div[3]/div[3]/iframe"));
        driver.switchTo().frame(ifame);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/div/div/div/div[3]/span/a/span[2]/div/div")).click();


        Thread.sleep(3000);

        System.out.println("completed");
    }
}
