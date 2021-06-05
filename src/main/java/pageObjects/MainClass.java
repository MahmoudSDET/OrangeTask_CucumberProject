package pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class MainClass {

	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.get("https://www.orange-business.com/en");
	      
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//nav[@id='main_nav']/div/div[3]/div[1]/nav/ul/li[1]/a")).click();
	      
	      Thread.sleep(1000);
	      
	      driver.findElement(By.xpath("//nav[@id='main_nav']/div/div[3]/div[1]/nav/ul/li[1]/ul/li/div/div[3]/ul/li/a")).click();

	      
	      WebElement solutions=driver.findElement(By.id("edit-solutions"));
	      
	      Select sol=new Select(solutions);
	      
	      List<WebElement> options=sol.getOptions();
	      
	     
	      
	      for ( WebElement i : options) {
	      
	      System.out.println(i.getText());}
	      
	      Thread.sleep(2000);
	    //  driver.close();*/
   sol.selectByValue("Cloud");
   Thread.sleep(2000);
   driver.findElement(By.id("edit-submit-subhomes")).click();
   Thread.sleep(2000);
    WebElement Exp=driver.findElement(By.xpath("//div[@class='col-xs-12 col-md-3 views-col col-2']/a/div/div[3]/div/span"));
    Thread.sleep(2000);
    String Expected=Exp.getText();
    Thread.sleep(2000);
    Exp.click();
    WebElement Act=driver.findElement(By.xpath("//*[@id=\"block-theme-boosted-page-title\"]/h1/span"));
    Thread.sleep(2000);
    String Actual=Act.getText();
    if(Expected.equals(Actual))
    {
    	System.out.println("Pass");
    	
    
	}else
		System.out.println("FAIL");	
	

	}
}
