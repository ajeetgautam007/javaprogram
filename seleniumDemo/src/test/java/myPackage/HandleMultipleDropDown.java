package myPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleDropDown {
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

driver.get("" );
/*approach---00001
Select noOfEmpdrp=new Select(driver.findElement(By.name("NoofEmloyess")));
noOfEmpdrp.selectByVisibleText("16-20");
Select industryDrp=new Select(driver.findElement(By.name("Industry")));
industryDrp.selectByVisibleText("travel");
Select Countrydrp=new Select(driver.findElement(By.name("Country")));
Countrydrp.selectByVisibleText("Aruba");

*/
WebElement  noOfEmpdrp=driver.findElement(By.name("NoofEmloyess"));
selectOptionFromDropDown(noOfEmpdrp,"16-20");
WebElement  industryEle=driver.findElement(By.name("Industry"));
selectOptionFromDropDown(industryEle,"Healthcare");
WebElement  country=driver.findElement(By.name("Country"));
selectOptionFromDropDown(country,"Ghana");
}
public static void selectOptionFromDropDown(WebElement ele,String value) {
	Select drp = new Select(ele);
	List<WebElement> alloptions=drp.getOptions();
	for(WebElement option :alloptions) {
if(	option.getText().equals("value")){
		option.click();
		break;
	}
	
	}
}













}
