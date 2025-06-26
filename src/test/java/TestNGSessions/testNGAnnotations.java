package TestNGSessions;

import org.testng.annotations.*;

public class testNGAnnotations {

    @BeforeSuite
    public void connectWithDB(){
        System.out.println("I am Before Suite Annotation");
    }

    @BeforeTest
    public void createUser(){
        System.out.println("I m in Before Test");
    }

    @BeforeClass
    public void launchBrowser(){
        System.out.println("I am in Before Class");
    }

    @BeforeMethod
    public void loginApp(){
        System.out.println("I am in Before Method");
    }

    @Test
    public void searchTest(){
        System.out.println("");
    }

    @Test
    public void addToCartTest(){
        System.out.println();
    }

    @Test
    public void checkOutTest(){
        System.out.println();
    }

    @AfterMethod
    public void logOut(){
        System.out.println("I am in After Method");
    }

    @AfterClass
    public void closeBrowser(){
        System.out.println("I am in After Class ");
    }

    @AfterTest
    public void deleteUser(){
        System.out.println("I am in After Test");
    }

    @AfterSuite
    public void disconnectWithDB(){
        System.out.println("I am in After Suite");
    }

}
