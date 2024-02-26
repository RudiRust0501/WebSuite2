package indochatappiumtest.indochattest01;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SignUp extends BaseTest {
	
	public Actions action;

	@Test
	public void IndochatTest () throws MalformedURLException
	{
		//Stage
		driver.findElement(By.id("id.co.indochat.app.staging:id/textPositiveButton")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout")).click();
		
		driver.findElement(By.className("android.widget.LinearLayout")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText[1]")).sendKeys("8123348489");
		driver.findElement(By.id("id.co.indochat.app.staging:id/btNext")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton")).click();
		
		driver.findElement(By.id("id.co.indochat.app.staging:id/textTitle")).getText();
		driver.findElement(By.id("id.co.indochat.app.staging:id/verifyDescription")).getText();
		driver.findElement(By.id("id.co.indochat.app.staging:id/textLabel")).getText();
		driver.findElement(By.id("id.co.indochat.app.staging:id/viewEditArea")).click();
		
		 //Input OTP
		driver.findElement(By.id("id.co.indochat.app.staging:id/editText0")).isSelected(); 
		Actions a = new Actions(driver); 
		a.sendKeys("1"); a.perform();
		 
		driver.findElement(By.id("id.co.indochat.app.staging:id/editText1")).isSelected(); 
		a.sendKeys("0"); a.perform();
		 
		driver.findElement(By.id("id.co.indochat.app.staging:id/editText2")).isSelected(); 
		a.sendKeys("4"); a.perform();
		  
		driver.findElement(By.id("id.co.indochat.app.staging:id/editText3")).isSelected(); 
		a.sendKeys("5"); a.perform();
		 
		driver.findElement(By.id("id.co.indochat.app.staging:id/editText4")).isSelected(); 
		a.sendKeys("0"); a.perform();
		 
		driver.findElement(By.id("id.co.indochat.app.staging:id/editText5")).isSelected(); 
		a.sendKeys("8"); a.perform();
		 
        driver.findElement(By.id("id.co.indochat.app.staging:id/btNext")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
        		+ "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[10]")).getText();
	}
}

/*
 * //Production
 * //driver.findElement(By.id("id.co.indochat.app:id/textPositiveButton")).click
 * (); //driver.findElement(By.id("android:id/content")).click();
 * //driver.findElement(By.id("id.co.indochat.app:id/editSubscriberNumber")).
 * sendKeys("83899009900");
 * //driver.findElement(By.id("id.co.indochat.app:id/btNext")).click();
 * //driver.findElements(By.className("android.widget.LinearLayout")).get(1).
 * click(); //driver.findElement(By.xpath(
 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" //+
 * "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[2]"
 * )).click();
 * //driver.findElement(By.id("id.co.indochat.app:id/textTitle")).getText();
 * //driver.findElement(By.id("id.co.indochat.app:id/verifyDescription")).
 * getText();
 * //driver.findElement(By.id("id.co.indochat.app:id/textLabel")).getText();
 * //driver.findElements(By.className("android.widget.LinearLayout")).get(1).
 * click(); //driver.findElement(By.xpath(
 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" // +
 * "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[2]"
 * )).click();
 * //driver.findElement(By.id("id.co.indochat.app.staging:id/viewEditArea")).
 * click();
 */
