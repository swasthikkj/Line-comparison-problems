
public class CheckEquality {
	public static void main(String[] args)
	{
	    System.out.println("Welcome to Line Comparsion program");
		int x1;
		int x2;
		int y1;
		int y2;
		int x3;
		int y3;
		int l1;
		int l2;
		x1 = 1; y1 = 2;
		x2 = 3; y2 = 2;
		x3 = 3; y3 = 4;
		l1 = (int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		l2 = (int)Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
		System.out.println(l1);
		System.out.println(l2);

		Integer a = Integer.valueOf(l1);
	    Integer b = Integer.valueOf(l2);
	    int compare = a.compareTo(b);

	    if(compare>0) {
	System.out.println("l1 > y");
	    }
	    else if(compare<0) {
	  	  System.out.println("l1 < y");
	    }
	    else {
	  	  System.out.println("l1 = l2");
	    }
	}
}
