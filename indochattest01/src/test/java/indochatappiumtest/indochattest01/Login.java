package indochatappiumtest.indochattest01;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;

public class Login extends BaseTest {
	@Test
	public void IndochatLogin ()
	{
		//Stage
		driver.findElement(By.id("id.co.indochat.app.staging:id/textPositiveButton")).click();		
		driver.findElement(By.id("android:id/content")).click();
		driver.findElement(By.id("id.co.indochat.app.staging:id/editSubscriberNumber")).sendKeys("83918010004");
		driver.findElement(By.id("id.co.indochat.app.staging:id/btNext")).click();
		driver.findElements(By.className("android.widget.LinearLayout")).get(1).click();
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[2]")).click();
		
		driver.findElement(By.id("id.co.indochat.app.staging:id/textTitle")).getText();
		driver.findElement(By.id("id.co.indochat.app.staging:id/verifyDescription")).getText();
		driver.findElement(By.id("id.co.indochat.app.staging:id/textLabel")).getText();
		
		//Input OTP
		driver.findElement(By.id("id.co.indochat.app.staging:id/editText0")).isSelected();
		Actions a = new Actions(driver);
        a.sendKeys("1");
        a.perform(); 
        
        driver.findElement(By.id("id.co.indochat.app.staging:id/editText1")).isSelected();
        a.sendKeys("0");
        a.perform();
        
        driver.findElement(By.id("id.co.indochat.app.staging:id/editText2")).isSelected();
        a.sendKeys("4");
        a.perform();
        
        driver.findElement(By.id("id.co.indochat.app.staging:id/editText3")).isSelected();
        a.sendKeys("5");
        a.perform();
        
        driver.findElement(By.id("id.co.indochat.app.staging:id/editText4")).isSelected();
        a.sendKeys("0");
        a.perform();
        
        driver.findElement(By.id("id.co.indochat.app.staging:id/editText5")).isSelected();
        a.sendKeys("8");
        a.perform();
     
        driver.findElement(By.id("id.co.indochat.app.staging:id/btNext")).click();
        driver.findElement(By.id("id.co.indochat.app.staging:id/textSubtitle")).getText();
        driver.findElement(AppiumBy.className("android.view.ViewGroup")).click();
        driver.findElement(By.id("id.co.indochat.app.staging:id/layoutContainerPinCode")).click();
        driver.findElement(By.id("id.co.indochat.app.staging:id/pinCode1")).isSelected();
        driver.findElement(By.id("id.co.indochat.app.staging:id/textNumberZero")).click();
        driver.findElement(By.id("id.co.indochat.app.staging:id/textNumberZero")).click();
        driver.findElement(By.id("id.co.indochat.app.staging:id/textNumberZero")).click();
        driver.findElement(By.id("id.co.indochat.app.staging:id/textNumberZero")).click();
        driver.findElement(By.id("id.co.indochat.app.staging:id/textNumberZero")).click();
        driver.findElement(By.id("id.co.indochat.app.staging:id/textNumberZero")).click();
        
        //Success Login Page
        driver.findElement(By.id("id.co.indochat.app.staging:id/textTip")).getText();
        driver.findElements(AppiumBy.className("android.widget.TextView")).get(0).getText();
	}
}

//Production
		/*
		 * driver.findElement(By.id("id.co.indochat.app:id/textPositiveButton")).click()
		 * ; driver.findElement(By.id("android:id/content")).click();
		 * driver.findElement(By.id("id.co.indochat.app:id/editSubscriberNumber")).
		 * sendKeys("81333308369");
		 * driver.findElement(By.id("id.co.indochat.app:id/btNext")).click();
		 * 
		 * 
		 * driver.findElements(By.className("android.widget.LinearLayout")).get(1).click
		 * ();
		 * 
		 * driver.findElement(By.xpath(
		 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
		 * "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[2]"
		 * )).click();
		 * 
		 * driver.findElement(By.id("id.co.indochat.app:id/textTitle")).getText();
		 * driver.findElement(By.id("id.co.indochat.app:id/verifyDescription")).getText(
		 * ); driver.findElement(By.id("id.co.indochat.app:id/textLabel")).getText();
		 */
