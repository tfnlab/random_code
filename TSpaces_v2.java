

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TSpaces_v2 {

	public TSpaces_v2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		/*
		try {
			System.setProperty("webdriver.gecko.driver","/Users/armenmerikyan/Downloads/geckodriver"); // Setting system properties of FirefoxDriver
			WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			for(int j=0;j>4;j++) {
				driver.get("https://api.opensea.io/api/v1/asset/0x1d48842ed318b739a2f8d251bc53fefac6d96372/" + j + "/?force_update=true");
//				driver.get("https://play.tfnlab.com");
				Thread.sleep(10000);
			}
			driver.quit();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		*/
        System.setProperty("java.awt.headless", "false");
        System.setProperty("DISPLAY", ":0");				
		for(int j=0;j< Integer.valueOf(args[3]);j++) {
		try {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-popup-blocking"); // Equivalent to Firefox preference "browser.link.open_newwindow"
				options.setBinary(args[2]);
				// options.setHeadless(true);
				options.addArguments("--headless");
				options.addArguments("--no-sandbox");
				

				System.setProperty("webdriver.chrome.driver", args[1]); // Setting system properties of ChromeDriver
				WebDriver driver = new ChromeDriver(options); // Creating an object of ChromeDriver
				// driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				String glbUrl = args[0];
				driver.get(glbUrl);

				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        Vector<String> animalVec = new Vector<String>();
			 try {



	 
 
 
				 
								System.out.println(glbUrl); 
								WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
								wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body")));
								
								WebElement listenLiveElement = driver.findElement(By.xpath("//span[contains(text(), 'Listen live')]"));
						        listenLiveElement.click();

								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(), 'Join this Space')]")));
								
								WebElement joinLiveElement = driver.findElement(By.xpath("//span[contains(text(), 'Join this Space')]"));
								joinLiveElement.click();

								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(), 'Got it')]")));
								
								WebElement gotitLiveElement = driver.findElement(By.xpath("//span[contains(text(), 'Got it')]"));
								gotitLiveElement.click();

								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(), 'Not now')]")));
								WebElement notnowLiveElement = driver.findElement(By.xpath("//span[contains(text(), 'Not now')]"));
								notnowLiveElement.click();
								driver.manage().window().minimize();
			} catch (Exception ex) {
			    ex.printStackTrace();
			}

			}catch(Exception ex) {
				ex.printStackTrace();
				j -= 1;
			}

		}
		try {
			Thread.sleep(111115000);

		}catch(Exception ex) {
			ex.printStackTrace();
		}		
	}

}
