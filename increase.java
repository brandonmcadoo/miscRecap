import java.util.Scanner;

public class increase {
	
	 public static int increase(int a){
		a = a + 1;
		return a;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int myVal = scan.nextInt();
		int newVal = increase(myVal);
		System.out.println(newVal);
	}
}