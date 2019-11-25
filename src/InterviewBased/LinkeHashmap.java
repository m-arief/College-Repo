package InterviewBased;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkeHashmap {

	
	public static void main(String[] args) {


 LinkedHashMap<Emp, Stu> lhm = new LinkedHashMap<Emp, Stu>();
    
    lhm.put(new Emp(1,"Tom"),new Stu (11,"AAA"));
    lhm.put(new Emp(2,"vom"),new Stu (22,"BBB"));
    
    
	Set<Emp > s1 = lhm.keySet();
	
	for( Emp ke :s1  ) {
	
	     System.out.println(ke.sid+ " "+ ke.sname);
	}
	
	
    Collection<Stu> c = 	lhm.values();
	
	for(  Stu s2 : c ) {
	
	System.out.println(s2.sid + " "+s2.sname);
	}
	
	
      Set<Entry<Emp,Stu>> s =	lhm.entrySet();
      
    Iterator<Entry<Emp,Stu>>  lh =      s.iterator();
	
	while(lh.hasNext()) {
	
	Entry <Emp,Stu> da = lh.next();
	
      Emp k=	da.getKey();
      
  Stu v=    da.getValue();
	
	
	System.out.println(k.sid+ " "+ k.sname );
	System.out.println(v.sid+ " "+ v.sname );
	}
	}   
    
    
        
}	
