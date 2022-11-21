package day05_mavenProjeOlusturma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpad_Practice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        1. https://demoqa.com/ sayfasina gidin
        driver.get("https://demoqa.com/");
//        2. Click on Forms.
        driver.findElement(By.xpath("(//div[@class='card-body'])[2]")).click();
//        3. Click on Practice Form
        driver.findElement(By.xpath("//*[text()='Practice Form']")).click();
//        4. Fill the Form
        driver.findElement(By.id("firstName")).sendKeys("Cengiz");
        driver.findElement(By.id("lastName")).sendKeys("Altintas");
        driver.findElement(By.id("userEmail")).sendKeys("c@gmail.com");
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.id("userNumber")).sendKeys("70 123 456");
        driver.findElement(By.id("subjectsContainer")).sendKeys("bla bla bla");
        driver.findElement(By.xpath("//*[text()='Music']")).click();
        driver.findElement(By.id("uploadPicture")).click();








    }
}
