package mymaintest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

@RunWith(JUnit4.class)
public class FirstTestClass {

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
    }

   @Test
    public void runMyFirstBrowser() {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://google.com");
    }


    @Test
    public void numberArray() {
        ArrayList<String> numberArray = new ArrayList<String>();

        numberArray.add("1");
        numberArray.add("2");
        numberArray.add("3");
        numberArray.add("4");
        numberArray.add("5");
        numberArray.add("6");
        numberArray.add("7");
        numberArray.add("8");
        numberArray.add("9");
        numberArray.add("10");

        for (int i = 0; i < 10; i += 2) {
            System.out.println(numberArray.get(i));
            System.out.println("Odd");
        }
        for (int i = 1; i < 10; i += 2) {
            System.out.println(numberArray.get(i));
            System.out.println("Even");
       }
    }


//        String myFirstString = "Hello World";
//
//        //To join 2 strings together on same line
//        String myFirstSting = "Hello";
//        String mySecondString = "World";
//        //Do:
//        String strings = myFirstSting + mySecondString;
//        int myFirstNumber = 1;
//        int mySecondNumber = 2;
//        int sum = myFirstNumber + mySecondNumber;
//        int multiply = myFirstNumber + mySecondNumber;
//        int divide = myFirstNumber / mySecondNumber;
//        int subtract = myFirstNumber - mySecondNumber;
//
//        System.out.println(myFirstString);
//
//        //To print line 17
//        System.out.println(sum);


                                 //Data Types

}

