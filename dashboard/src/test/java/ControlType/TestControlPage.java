package ControlType;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pomPackage.PomControlPage;

import java.util.concurrent.TimeUnit;

public class TestControlPage {
     WebDriver driver;
    PomControlPage page;




    @BeforeTest
    public void testLoginPage(){
        System.setProperty("webdriver.chrome.driver","C:\\Devum\\SampleProject\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://testbed.devum.com/#/security/login");
        driver.manage().window().maximize();
    }
 @Test
   public void testAppStudioPage () throws InterruptedException {
     page= new PomControlPage(driver);
     page.verifyLoginPage();
     page.verifyAppStudioPage();

    }
    @Test(priority = 1)
    public void testNewPage() throws InterruptedException {
        page=new PomControlPage(driver);
        page.addingNewPage();
    }

    @Test (priority = 2)

    public void testContainer() throws InterruptedException {
        page= new PomControlPage(driver);
        page.addingContainerToNewPage();


    }
      @Test(priority = 3)
    public void testControl() throws InterruptedException {
        page= new PomControlPage(driver);
        page.addingControlToNewPage();
    }



    @Test(priority = 4)
    public void testMarginAndPadding() throws InterruptedException {
        PomControlPage page=new PomControlPage(driver);
        page.settingMargin(-300,200,20,30);
        page.settingPadding(20,30,20,30);


    }
    @Test(priority= 5)
     public void testHeightAndWidth() throws InterruptedException {
        PomControlPage page=new PomControlPage(driver);
        page.settingWidth(50);
        page.settingHeight(50);


     }

        @Test (priority= 6)
     public void testDeletePage() throws InterruptedException {
         PomControlPage page=new PomControlPage(driver);
         page.deletePage();



    }








    }

