package Strings;
import java.util.*;
import java.util.Arrays;
import java.util.List;
public class Stringsmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
    	int n = s.nextInt();
    	String[] strlist = new String[n];
    	for(int i=0;i<n;i++) {
    		strlist[i] = s.next();
    	}
    	List<String> list = Arrays.asList(strlist);
    	StringsA ans = new StringsA();
    	System.out.println(ans.search(list));
	}

}
