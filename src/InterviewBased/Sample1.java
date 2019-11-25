package InterviewBased;

public class Sample1 {

	public static void main(String[] args) {
		  
		
		String s ="arief";
		
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf('r'));
		System.out.println(s.lastIndexOf('e'));
		System.out.println(s.length());
		
		String s2 = "i will get the job";
		System.out.println(s2.contains("job"));
		System.out.println(s2.startsWith("i"));
		System.out.println(s2.endsWith("job"));
		
System.out.println("-=========================");



		String w = "unitedkingdom";
		
		System.out.println(w.trim());// to remove space
		System.out.println(w.length());
		System.out.println(w.substring(6));// to display from 6th index
		System.out.println(w.substring(0, 5));
		
		// length variable vs length ()
		
		int[]a = {10,20,30};
		System.out.println(a.length);
		
		
	// split
		String m = " am not well ";
      String[]	m1 =	m.split(" ");

	for (String data :m1)	{
		System.out.println(data);
	}	
	
	
	StringBuffer sb = new StringBuffer("Please give me");
	
//System.out.println(	sb.append(" Chocalate"));
//	
//System.out.println(sb.reverse());
sb.replace(0, 7, "Chocalate");
System.out.println(	"  "+"  "+  sb+" " );
	
	
	
		
		
		
	}

}
