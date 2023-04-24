import java.util.ArrayList;

public class alist {
	
	 public static void addIt(final ArrayList<Integer> a) {
		// This would cause an error
		// a = new ArrayList<Integer>();
		a.add(25);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> myInts = new ArrayList<Integer>();
		myInts.add(4);
		myInts.add(16);
		addIt(myInts);
		System.out.println(myInts);
	}
}