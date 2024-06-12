package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomControlPage {
    WebDriver driver;
    @FindBy(xpath = "//input[@id='mat-input-0']")
    WebElement userName;
    @FindBy(xpath = "//input[@id='mat-input-1']")
    WebElement passWord;
    @FindBy(xpath = "//span[text()='Sign In']")
    WebElement login;
    @FindBy(xpath = "//div//h3[contains(text(),'Admin Dashboard')]")
    WebElement welcomeText;

    @FindBy(xpath = "//mat-icon[contains(text(),'keyboard_double_arrow_right')]")
    WebElement arrow;
    @FindBy(xpath = "//span[contains(text(),'App Studio')]")
    WebElement appStudio;
    @FindBy(xpath = "//h3[contains(text(),' APP STUDIO')]")
    WebElement appStudioText;

    @FindBy(xpath = "//button[@class='rt-mx-10 mdc-button mdc-button--raised mat-mdc-raised-button mat-primary mat-mdc-button-base']")
    WebElement newPage;
    @FindBy(xpath = "//input[@formcontrolname='name']")
    WebElement name;
    @FindBy(xpath = "//span[@class='mat-mdc-select-placeholder mat-mdc-select-min-line ng-tns-c3393473648-17 ng-star-inserted']")
    WebElement selectmasterPage;

    @FindBy(xpath = "//span[text()=' empty_master_page ']")
    WebElement emptyMasterpage;
    @FindBy(xpath = "//span[text()='SAVE']")
    WebElement save;
    @FindBy(id = "mat-input-4")
    WebElement search;
    @FindBy(xpath = "(//div[text()='Sample_Page'])[1]")
    WebElement img;

    @FindBy(xpath = "//span[text()='Outline']")
    WebElement outline;

    @FindBy(xpath = "//span[@id='node:Sample_Page_page_Web']")
    WebElement pageWeb;
    @FindBy(xpath = "//button//span[contains(text(),'Add child')]")
    WebElement addChild;
    @FindBy(xpath = "//button//span[contains(text(),' Container ')]")
    WebElement container;
    @FindBy(xpath = "(//button//span[@class='mat-mdc-menu-item-text'])[16]")
    WebElement addContainer;
    @FindBy(xpath = "//span[contains(text(),' Container-')]")
    WebElement containerText;


    @FindBy(xpath = "//button//span[contains(text(),'Add child')]")
    WebElement addChild1;
    @FindBy(xpath = "//span[contains(text(),' Basic Elements ')]")
    WebElement basicElement1;
    @FindBy(xpath = "//button//span[contains(text(),'TextBox ')]")
    WebElement textBox;
    @FindBy(xpath = "//span[contains(text(),' TextBox-')]")
    WebElement textboxText;
    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[9]")
    WebElement indicator;
    @FindBy(xpath = "//mat-tree-node//span[contains(text(),' TextBox')]")
    WebElement textBoxClick;

    @FindBy(xpath = "//span[@id='control-properties']")
    WebElement properties;


    @FindBy(xpath = "(//div//input[@type='number'])[3]")
    WebElement topMargin;
    @FindBy(xpath = "(//input[@type='number'])[1]")
    WebElement leftMargin;
    @FindBy(xpath = "(//input[@type='number'])[2]")
    WebElement rightMargin;
    @FindBy(xpath = "(//input[@type='number'])[4]")
    WebElement bottomMargin;

    @FindBy(xpath = "(//input[@type='number'])[5]")
    WebElement leftPadding;
    @FindBy(xpath = "(//input[@type='number'])[6]")
    WebElement rightPadding;
    @FindBy(xpath = "(//input[@type='number'])[7]")
    WebElement topPadding;
    @FindBy(xpath = "(//input[@type='number'])[8]")
    WebElement bottomPadding;

    @FindBy(xpath = "(//input[@type='number'])[9]")
    WebElement width;
    @FindBy(xpath = "(//input[@type='number'])[10]")
    WebElement height;

    @FindBy(xpath = "//mat-icon[text()='clear ']")
    WebElement clear;
    @FindBy(xpath = "//button[text()=' Yes, Leave ']")
    WebElement leave;

    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[9]")
    WebElement disableIndicator;
    @FindBy(xpath = "//span[contains(text(),'Disable')]")
    WebElement disable;
    @FindBy(xpath = "(//button[@class='mdc-button mdc-button--raised mat-mdc-raised-button mat-primary mat-mdc-button-base'])[3]")
    WebElement yesDisable;
    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[9]")
    WebElement disableIndicator1;
    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    WebElement delete;
    @FindBy(xpath = "//span[contains(text(),'YES, DELETE')]")
    WebElement yesDelete;
    @FindBy(xpath = "//p[contains(text(),' No records found ')]")
    WebElement deletePageText;

    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[1]//ancestor::button")
    WebElement logoutIndicator;
    @FindBy(xpath = "//span[contains(text(),'Logout')]")
    WebElement logout;


    public PomControlPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void verifyLoginPage() throws InterruptedException {
        userName.sendKeys("yasmin");
        passWord.sendKeys("Reactore123@");
        login.click();
        Thread.sleep(2000);
        String text1 = welcomeText.getText();
        if (text1.equalsIgnoreCase("Admin Dashboard")) {
            System.out.println("Test case passed: Login Page validated successfully");
        } else {
            System.out.println("Login Page is not validated");
        }
        Thread.sleep(500);


    }


    public void verifyAppStudioPage() throws InterruptedException {


        arrow.click();
        Actions a = new Actions(driver);
        a.click(appStudio).build().perform();
        String text2 = appStudioText.getText();
        System.out.println(text2);
        if (text2.equalsIgnoreCase("APP STUDIO")) {
            System.out.println("Test case passed: App studio page is validated");
        } else {
            System.out.println("App studio page is not validated");
        }
    }

    public void addingNewPage() throws InterruptedException {

        newPage.click();
        Thread.sleep(1000);
        name.sendKeys("Sample Page");
        Thread.sleep(500);
        selectmasterPage.click();
        emptyMasterpage.click();
        Thread.sleep(500);
        save.click();
        Thread.sleep(2000);
        String text3 = img.getText();
        System.out.println(text3);
        if (text3.equalsIgnoreCase("Sample_Page")) {
            System.out.println("Test case passed: New page has been created and validated successfully");
        } else {
            System.out.println("New Page has not been created");
        }
        Thread.sleep(500);
        search.clear();
        search.sendKeys("Sample_Page");
        Thread.sleep(2000);
        img.click();
        Thread.sleep(800);


    }

    public void addingContainerToNewPage() throws InterruptedException {

        outline.click();
        Actions a1 = new Actions(driver);
        a1.moveToElement(pageWeb).perform();
        Thread.sleep(500);
        a1.contextClick(pageWeb).perform();
        a1.moveToElement(addChild).perform();
        Thread.sleep(500);
        a1.moveToElement(container).perform();
        Thread.sleep(500);
        a1.click(addContainer).perform();
        Thread.sleep(1000);


    }

    public void addingControlToNewPage() throws InterruptedException {

        Actions a2 = new Actions(driver);
        a2.moveToElement(pageWeb).perform();
        Thread.sleep(500);
        a2.contextClick(pageWeb).perform();
        Thread.sleep(500);
        a2.moveToElement(addChild1).perform();
        a2.moveToElement(basicElement1).perform();
        Thread.sleep(200);
        a2.click(textBox).perform();
        Thread.sleep(200);
        indicator.click();
        Thread.sleep(500);
        if (textboxText.isDisplayed()) {
            System.out.println("Test case Passed: Text box is added and validated");
        } else {
            System.out.println("Text Box has been added");
        }
        Thread.sleep(1000);

        textBoxClick.click();
        Thread.sleep(1000);
        properties.click();
        System.out.println("Properties clicked successfully");
        Thread.sleep(1000);


    }

    public void settingMargin(int top, int left, int right, int bottom) throws InterruptedException {
        String topMarginValue = topMargin.getAttribute("value");
        System.out.println("Initial Top Margin Value = " + topMarginValue);
        topMargin.clear();
        topMargin.sendKeys(String.valueOf(top));
        Thread.sleep(500);
        String topMarginValueAdded = topMargin.getAttribute("value");
        System.out.println("Added Top Margin value = " + topMarginValueAdded);
        if (topMarginValue != topMarginValueAdded) {
            System.out.println("Test case passed: Top Margin value is Validate");
        } else {
            System.out.println("Top Margin Value not added");
        }


        String leftMarginValue = leftMargin.getAttribute("value");
        System.out.println("Initial Left margin Value = " + leftMarginValue);
        leftMargin.clear();
        leftMargin.sendKeys(String.valueOf(left));
        Thread.sleep(500);
        String leftMarginValueAdded = leftMargin.getAttribute("value");
        System.out.println("Added Left margin value = " + topMarginValueAdded);
        if (leftMarginValue != leftMarginValueAdded) {
            System.out.println("Test case passed: Left Margin value is Validated");
        } else {
            System.out.println("Left Margin Value not added");
        }


        String rightMarginValue = rightMargin.getAttribute("value");
        System.out.println("Initial Right Margin Value = " + rightMarginValue);
        rightMargin.clear();
        rightMargin.sendKeys(String.valueOf(right));
        Thread.sleep(500);
        String rightMarginValueAdded = rightMargin.getAttribute("value");
        System.out.println("Added Right Margin value = " + rightMarginValueAdded);
        if (rightMarginValue != rightMarginValueAdded) {
            System.out.println("Test case passed: Right Margin value is Validated");
        } else {
            System.out.println("Right Margin Value not added");
        }


        String bottomMarginValue = bottomMargin.getAttribute("value");
        System.out.println("Initial Bottom Margin Value = " + bottomMarginValue);
        bottomMargin.clear();
        bottomMargin.sendKeys(String.valueOf(bottom));
        Thread.sleep(500);
        String bottomMarginValueAdded = bottomMargin.getAttribute("value");
        System.out.println("Added Bottom Margin value = " + bottomMarginValueAdded);
        if (bottomMarginValue != bottomMarginValueAdded) {
            System.out.println("Test case passed: Bottom Margin value is Validated ");
        } else {
            System.out.println("bottom Margin Value not added");
        }


    }

    public void settingPadding(int top, int left, int right, int bottom) throws InterruptedException {
        String topPaddingValue = topPadding.getAttribute("value");
        System.out.println("Initial Top Padding Value = " + topPaddingValue);
        topPadding.clear();
        topPadding.sendKeys(String.valueOf(top));
        Thread.sleep(500);
        String topPaddingValueAdded = topPadding.getAttribute("value");
        System.out.println("Added Top Padding value = " + topPaddingValueAdded);
        if (topPaddingValue != topPaddingValueAdded) {
            System.out.println("Test case passed: Top Padding value is Validated");
        } else {
            System.out.println("Top Padding Value not added");
        }

        Thread.sleep(500);
        String leftPaddingValue = leftPadding.getAttribute("value");
        System.out.println("Initial Left Padding Value = " + leftPaddingValue);
        leftPadding.clear();
        leftPadding.sendKeys(String.valueOf(left));
        Thread.sleep(500);
        String leftPaddingValueAdded = leftPadding.getAttribute("value");
        System.out.println("Added Left padding value: " + leftPaddingValueAdded);
        if (leftPaddingValue != leftPaddingValueAdded) {
            System.out.println("Test case passed: left Padding value is Validated");
        } else {
            System.out.println("left Padding Value not added");


        }


        Thread.sleep(500);
        String rightPaddingValue = rightPadding.getAttribute("value");
        System.out.println("Initial Right Padding Value = " + rightPaddingValue);
        rightPadding.clear();
        rightPadding.sendKeys(String.valueOf(right));
        Thread.sleep(500);
        String rightPaddingValueAdded = rightPadding.getAttribute("value");
        System.out.println("Added Right Padding value = " + rightPaddingValueAdded);
        if (rightPaddingValue != rightPaddingValueAdded) {
            System.out.println("Test case passed: Right Padding value is Validated");
        } else {
            System.out.println("Right Padding Value is not added");


        }

        Thread.sleep(500);
        String bottomPaddingValue = bottomPadding.getAttribute("value");
        System.out.println("Initial Bottom Padding Value = " + bottomPaddingValue);
        bottomPadding.clear();
        bottomPadding.sendKeys(String.valueOf(bottom));
        Thread.sleep(500);
        String bottomPaddingValueAdded = bottomPadding.getAttribute("value");
        System.out.println("Added Bottom Padding value: " + bottomPaddingValueAdded);
        if (bottomPaddingValue != bottomPaddingValueAdded) {
            System.out.println("Test case passed: Bottom Padding value is Validated");
        } else {
            System.out.println("Bottom Padding Value is not added");
        }
    }


    public void settingWidth(int value) throws InterruptedException {
        String widthValue = width.getAttribute("value");
        System.out.println("Initial Width Value = " + width);
        width.clear();
        width.sendKeys(String.valueOf(value));
        Thread.sleep(500);
        String widthValueAdded = width.getAttribute("value");
        System.out.println("Added Width value = " + widthValueAdded);
        if (widthValue != widthValueAdded) {
            System.out.println("Test case passed: Width value is Validated");
        } else {
            System.out.println("Width Value is not added");

        }
    }

    public void settingHeight(int value1) throws InterruptedException {
        Thread.sleep(500);
        String heightValue = height.getAttribute("value");
        System.out.println("Initial Height Value = " + height);
        height.clear();
        height.sendKeys(String.valueOf(value1));
        Thread.sleep(1000);
        String heightValueAdded = height.getAttribute("value");
        System.out.println("Added height value = " + heightValueAdded);
        if (heightValue != heightValueAdded) {
            System.out.println("Test case passed: Height value is Validated");
        } else {
            System.out.println("Height Value is not added");


        }
    }


    public void deletePage() throws InterruptedException {
        clear.click();
        Thread.sleep(3000);
        leave.click();
        Thread.sleep(3000);
        System.out.println("Left Page successfully");
        disableIndicator.click();
        disable.click();
        Thread.sleep(1000);
        yesDisable.click();
        Thread.sleep(5000);
        disableIndicator1.click();
        Thread.sleep(1000);
        delete.click();
        Thread.sleep(1000);
        yesDelete.click();
        Thread.sleep(2000);
        if (deletePageText.isDisplayed()) {
            System.out.println("Test case Pass: The Page is Deleted");
        } else {
            System.out.println("Test case Fail : The Page is Not Deleted");
        }

        Thread.sleep(1000);
        logoutIndicator.click();
        Thread.sleep(800);
        logout.click();
        Thread.sleep(1000);
        System.out.println("Logged out successfully");


    }
}






