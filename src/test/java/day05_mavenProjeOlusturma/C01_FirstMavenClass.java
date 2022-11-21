package day05_mavenProjeOlusturma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_FirstMavenClass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        1- https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com/");
//        2- arama kutusunu locate edelim.
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.click();
//        3- “Samsung headphones” ile arama yapalim.
        searchBox.sendKeys("Samsung headphones" + Keys.ENTER);

//        4- Bulunan sonuc sayisini yazdiralim
        WebElement resultNoElement = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println(resultNoElement.getText());
//        5- Ilk urunu tiklayalim
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

//        6- Bir onceki sayfaya gidip, sayfadaki tum basliklari yazdiralim.
        driver.navigate().back();
        List<WebElement> headings = driver.findElements(By.xpath("//span[@class='a-size-base a-color-base puis-bold-weight-text']"));
        System.out.println("Headings " + headings.size());

        driver.close();

    }

}
