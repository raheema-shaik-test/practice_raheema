package sample1;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classsample {

	
		// TODO Auto-generated method stub
		//String path="C:\\Users\\admin\\eclipse-workspace\\sample\\target";
	/*	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		WebElement element = driver.findElement(By.xpath("//*[@id=\"endpoint\"]/tp-yt-paper-item/yt-formatted-string"));
		 File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(src, new File("C:\\Users\\admin\\eclipse-workspace\\sample\\target\\send_feedback_elementss.png")); 
	//((Locatable)element).getCoordinates().inViewPort();
	 element.click();
	*/
	public static void main(String[] args) throws Exception {
	//	WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup(); //to clear the cache files in chrome

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://www.parasoft.com/");
      //  String text=driver.findElement(By.xpath("//*[@id=\"topPanel\"]/p")).getText();
      //  System.out.println(text);
     //   String attr=driver.findElement(By.xpath("//*[@id=\"topPanel\"]/p")).getAttribute("class");
      //  WebElement element =new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
   
		//FILLING A FORM IN THE WEBSITE 
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		String text=driver.findElement(By.xpath("//*[@id=\"q19\"]/div/h1")).getText();
		System.out.println(text);
		Thread.sleep(2000);
 String attri=driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-5\"]")).getAttribute("class");
	System.out.println(attri);
		Thread.sleep(2000);
		driver.findElement(By.name("RESULT_TextField-1")).sendKeys("Nasrin");
	System.out.println(driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).isDisplayed());
	Thread.sleep(2000);
		driver.findElement(By.name("RESULT_TextField-2")).sendKeys("Shaik");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-2\"]")).isEnabled());
		Thread.sleep(2000);
		driver.findElement(By.name("RESULT_TextField-3")).sendKeys("123456789");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-3\"]")));
		Thread.sleep(2000);
		driver.findElement(By.name("RESULT_TextField-4")).sendKeys("India");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-4\"]")));
		Thread.sleep(2000);
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Hyderabad");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-5\"]")));
		Thread.sleep(2000);
		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("abcd@gmail.com");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-6\"]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[2]/td/label")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[2]/td/label")).isSelected());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[2]/td/label")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[2]/td/label")).isSelected());
		Thread.sleep(2000);
		Select s=new Select(driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]")));
		s.selectByValue("Radio-0");
		Thread.sleep(5000);
        driver.quit();       
		
		 
	/*
		 
	//	WITH THE HELP OF MOUSE ACTION OPENING GOOGLE SEARCH,YOUTUBE,AFREEN SONG
        
		driver.get("https://www.google.com/search");
		driver.manage().window().maximize();
		driver.navigate().refresh();	
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Youtube");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[4]/div[6]/center/input[1]"))).perform();
		Thread.sleep(3000);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		action.doubleClick(driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3"))).perform();
		action.click(driver.findElement(By.name("search_query"))).sendKeys("Afreen afreen").perform();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]")).click();
		 Thread.sleep(4000);
		 action.click(driver.findElement(By.xpath("//a[@id='video-title']"))).build().perform();

		*/
		
		/*
		
		
		//DRAG AND DROP
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
     	Actions jquery=new Actions(driver);
		jquery.clickAndHold(driver.findElement(By.id("draggable"))).dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		
        //SCREENSHOT
		
		String path="C:\\Users\\admin\\eclipse-workspace\\mavenproject\\target";
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\admin\\eclipse-workspace\\mavenproject\\target\\bank.png"));
	    driver.quit();
		
	*/
		/*
		//WINDOWS SWITCH AND WINDOW HANDLE NAME
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		System.out.println(driver.getWindowHandle());
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[2]/div[1]/div[2]/aside/div[1]/div/div/div[1]/div[1]/div/div[1]/a/img")).click();
		Set<String> wins=driver.getWindowHandles();
		System.out.println(wins);
		driver.switchTo().window(wins.toArray()[0].toString());
		Thread.sleep(8000);
		driver.switchTo().window(wins.toArray()[1].toString());
		Thread.sleep(8000);
		driver.switchTo().window(wins.toArray()[0].toString());
		Thread.sleep(8000);
		driver.close();
		Thread.sleep(5000);
		driver.quit();
		*/
		/*
		//FRAMES EXAMPLE 1
				driver.get("https://www.parasoft.com/");
				//TO FIND OUT THE LIST OF IFRAMES PRESENT IN THE WEBPAGE
				List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
				System.out.println("Total number of iframes: " + iframeElements.size());
				//BELOW CODE TO RUN THE LOOP ON THE NO.OF FRAMES PRESENT IN THE LOOP ,
		//AND GIVE OUTPUT OF FRAMES ID,NAME,SOURCE ETC ... WE CAN DIRECTLY USE THEM COPY PASTE IN DRIVER.SWITCH TO FRAMES
				for (int i = 0; i < iframeElements.size(); i++) {
		            WebElement iframe = iframeElements.get(i);
		            String id = iframe.getAttribute("id");
		            String name = iframe.getAttribute("name");
		            String src = iframe.getAttribute("src");
		            System.out.println("Iframe " + (i + 1) + ":");
		            System.out.println("  ID: " + id);
		            System.out.println("  Name: " + name);
		            System.out.println("  Source: " + src);
				}
				//FOR FRAMES 
				driver.switchTo().frame("target_iframe_8ff72c87-c670-4012-9868-f6a1a6568a4b");
			    driver.switchTo().defaultContent();
				 driver.switchTo().frame("q-messenger-frame");
			  driver.switchTo().defaultContent();
				  Thread.sleep(10000);
				  driver.quit();

			
		//FRAMES EXAMPLE 2
		 driver.get("https://www.w3schools.com/html/html_iframe.asp");
	        driver.manage().window().maximize();

	        // Find all frames on the page and print their details
	        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	        System.out.println("Total frames on the page: " + frames.size());

	        for (int i = 0; i < frames.size(); i++) {
	            System.out.println("Frame " + i + ": " + frames.get(i).getAttribute("title"));
	        }

	        driver.quit();
		*/
		
	
		
		
		
		
	}


}
