import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class IntroJava {

	public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int first = arr[0];
        int last  = arr[arr.length-1];
        
        System.out.println(first);
        System.out.println(last);
        
        for(int i: arr){
            System.out.println(i);
        }
        
        System.out.println(arr.length);
    }

}
