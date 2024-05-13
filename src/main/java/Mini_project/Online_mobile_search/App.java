package Mini_project.Online_mobile_search;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class App 
{
	static String s1 = "1-16 of over 90,000 results for";
	static String s2 = "Newest Arrivals";
	public static void project(String s)
    {
    	WebDriver a;
    	if(s.equalsIgnoreCase("Chrome"))
    		a = new ChromeDriver();
    	else if(s.equalsIgnoreCase("Firefox"))
    		a =new FirefoxDriver();
    	else
    		a = new EdgeDriver();
        a.get("https://www.amazon.in/");
        a.findElement(By.cssSelector("input[aria-label='Search Amazon.in']")).sendKeys("mobile smartphones under 30000");
        a.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
        String s3= a.findElement(By.cssSelector("div[class='a-section a-spacing-small a-spacing-top-small'] span:nth-child(1)")).getText();
        System.out.println(s3);
        if(s3==s1)
        	System.out.println("Text Matched!");
        else
        	System.out.println("Text Didn't Match!");
        a.findElement(By.cssSelector("span[class='a-button-text a-declarative']")).click();
        
        
        WebElement element = a.findElement(By.xpath("//*[@id='s-result-sort-select']"));
    	Select option = new Select(element);
    	List<WebElement> list = option.getOptions();
    	System.out.println("The count of List Box options is "+ list.size());
    	System.out.println("The options of List Box are : "+ element.getText());
    	
                
        a.findElement(By.cssSelector("ul[tabindex='-1'] li:nth-child(5)")).click();
        String[] arr= a.findElement(By.cssSelector("span[class='a-button-text a-declarative']")).getText().split(":");
        String s4=arr[1];
        if(s4.equals(s2))
        	System.out.println("'Newest Arrivals' option got selected correctly.");
        else
        	System.out.println("'Newest Arrivals' option didn't get selected.");
        a.close();
    }
	
	
    public static void main( String[] args )
    {
        System.out.print( "Enter the browser : " );
        Scanner sc = new Scanner(System.in);
    	String s=sc.next();
    	if(s.equalsIgnoreCase("Chrome")||s.equalsIgnoreCase("Edge")||s.equalsIgnoreCase("Firefox")||s.equalsIgnoreCase("IE"))
    		project(s);
    	else
    		System.out.println(s+" browser doesn't exist");
    	sc.close();
    }
}










//public class App 
//{
//	static String s1 = "1-16 of over 90,000 results for";
//	static String s2 = "Newest Arrivals";
//    public static void main( String[] args )
//    {
//        Scanner sc = new Scanner(System.in);
//    	String s=sc.next();
//    	WebDriver a;
//    	if(s=="Chrome")
//    		a = new ChromeDriver();
//    	
//    	else if(s=="Firefox")
//    		a =new FirefoxDriver();
//        a.get("https://www.amazon.in/");
//        a.findElement(By.cssSelector("input[aria-label='Search Amazon.in']")).sendKeys("mobile smartphones under 30000");
//        a.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
//        String s3= a.findElement(By.cssSelector("div[class='a-section a-spacing-small a-spacing-top-small'] span:nth-child(1)")).getText();
//        if(s3==s1)
//        	System.out.println("Text Matched!");
//        else
//        	System.out.println("Text Didn't Match!");
//        a.findElement(By.cssSelector("span[class='a-button-text a-declarative']")).click();
//        
//        
//        a.findElement(By.cssSelector("ul[tabindex='-1'] li:nth-child(5)")).click();
//        String[] arr= a.findElement(By.cssSelector("span[class='a-button-text a-declarative']")).getText().split(":");
//        String s4=arr[1];
//        if(s4.equals(s2))
//        	System.out.println("'Newest Arrivals' option got selected correctly.");
//        else
//        	System.out.println("'Newest Arrivals' option didn't get selected.");
//        a.close();
//    }
//}
