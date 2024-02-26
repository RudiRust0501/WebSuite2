package indochatappiumtest.indochattest01;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;

public class TermAndCondition extends BaseTest {
	
	@Test
	public void openTandC ()
	{
		driver.findElement(By.id("id.co.indochat.app:id/textPositiveButton")).click();		
		driver.findElement(By.id("android:id/content")).click();
		driver.findElement(By.id("id.co.indochat.app:id/rootLayout")).click();
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(6).click();
		driver.findElement(AppiumBy.className("android.widget.TextView")).getText();
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"icon indochat text indochat\"]/android.widget.Image[2]")).getText();
	}

}
