package ElementClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class ElementClass {

        WebDriver driver;

        //Elements on Register page
        public By btnregister =By.xpath("/html/body/div/form/center/a");
        public By firstNameLocator = By.name("firstname");
        public By lastNameLocator = By.name("lastname");
        public By emailLocator = By.name("email");
        public By passwordLocator = By.name("password");
        public By registerButtonLocator = By.xpath("/html/body/div/form/button");
        public By btnBook = By.xpath("/html/body/div/form/button");
        public By bodyTextLocator = By.tagName("body");

        //Elements on login page

        public By userEmail =By.xpath("//*[@id=\"inputEmail\"]");
        public By userPassword = By.xpath("//*[@id=\"inputPassword\"]");
        public By loginBtn = By.xpath("/html/body/div/form/button");
        public By btnHome = By.xpath ("/html/body/center[3]/a");
         }

