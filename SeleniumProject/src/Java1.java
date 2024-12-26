import java.util.ArrayList;

public class Java1 {
	public static void main(String[] args) {
		ArrayList<Integer> s = new ArrayList<Integer>();
		s.add(45);
		s.add(54);
		System.out.println(s.get(0)+s.get(1));
		
		String a = new String("Welcome India");
		String b = "I Love Java";
		
		String splittedString[] = a.split(" ");
		System.out.println(splittedString[1]);
		
		for(int i=b.length()-1;i>=0;i--) {
			System.out.println(b.charAt(i));
		}
	
	}
}
