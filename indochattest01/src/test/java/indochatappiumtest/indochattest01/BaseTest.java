package indochatappiumtest.indochattest01;

import java.net.MalformedURLException;
import java.net.URL;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
	
    public AndroidDriver driver ;

    @BeforeClass
	public void ConfigureIndochatAppium () throws MalformedURLException
	{
		UiAutomator2Options options = new UiAutomator2Options ();
		options.setDeviceName ("Pixel 6 Rudi");
		options.setApp("//Users//indochatqa1//eclipse-workspace//indochattest01//src//test//java//resources//indochatstaging.apk");
		
		options.setCapability("unicodeKeyboard", false);
		options.setCapability("resetKeyboard", false);
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
	}
	
    @AfterClass
	public void tearDown ()
	{
		driver.quit ();
		
	}
}
