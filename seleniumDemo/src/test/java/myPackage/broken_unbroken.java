package myPackage;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken_unbroken {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Amazon URL
        driver.get("https://www.amazon.in");

        // Get all anchor tags
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links found: " + links.size());

        int brokenLinks = 0;
        int validLinks = 0;

        for (WebElement link : links) {

            String url = link.getAttribute("href");

            // Skip empty or javascript links
            if (url == null || url.isEmpty() || url.startsWith("javascript")) {
                continue;
            }

            try {
                HttpURLConnection connection =
                        (HttpURLConnection) new URL(url).openConnection();

                connection.setRequestMethod("HEAD");
                connection.setConnectTimeout(5000);
                connection.connect();

                int responseCode = connection.getResponseCode();

                if (responseCode >= 400) {
                    System.out.println("❌ Broken Link: " + url + 
                                       " --> Response Code: " + responseCode);
                    brokenLinks++;
                } else {
                    System.out.println("✅ Valid Link: " + url + 
                                       " --> Response Code: " + responseCode);
                    validLinks++;
                }

            } catch (Exception e) {
                System.out.println("⚠️ Exception for URL: " + url);
            }
        }

        System.out.println("=================================");
        System.out.println("Valid Links  : " + validLinks);
        System.out.println("Broken Links : " + brokenLinks);

        driver.quit();
    }
}
