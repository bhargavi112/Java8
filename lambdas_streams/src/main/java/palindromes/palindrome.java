package palindromes;
import java.util.*;
import java.util.List;
import java.util.function.Predicate;
public class palindrome {
	public static boolean isPalin(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<=j) {
			if(str.charAt(i)!=str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
    	int n = s.nextInt();
    	Predicate<String> predicate = palindrome::isPalin;
    	List<String> finalList = new ArrayList<String>();
    	for(int i=0;i<n;i++) {
    		String str = s.next();
    		boolean res = predicate.test(str);
    		if(res==true) {
    			finalList.add(str);
    		}
    	}
		System.out.println((finalList));
	}
}
