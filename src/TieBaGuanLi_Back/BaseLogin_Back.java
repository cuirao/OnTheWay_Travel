package TieBaGuanLi_Back;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseLogin_Back {
	
	WebDriver driver = null;
	
	@BeforeClass
	//�򿪻���������ʹ��ҳ���
	public void openBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	//�˳���������
	public void quitBrowser(){
		driver.quit();
	}
	
	@Test
	public void loginBrowser() throws InterruptedException{
		//��ʽ�ȴ�
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//��¼��վ
		driver.get("http://localhost:8032/travel/index.php/admin/login/login");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='mws-login-form']/form/div[3]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='mws-navigation']/ul/li[4]/a")).click();
		Thread.sleep(3000);
	}


}
