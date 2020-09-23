package module7f;

import java.util.*;

public class StringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<String>();
		String s1="JAVAJAVA";
		String s2="VA";
		
		ls.add(op1(s1, s2));
		ls.add(op2(s1, s2));
		ls.add(op3(s1, s2));
		ls.add(op4(s1, s2));
		ls.add(op5(s1, s2));
		
		System.out.print("{");
		for(String s:ls) {
			System.out.print("\""+s+"\",");
		}
		System.out.println("}");
	}
	
	public static String op1(String a, String b) {
		String result= "";
		for(int i=0;i<a.length();i++) {
			if(i%2==0) {
				result += b; 
			}
			else {
				result += a.charAt(i);
			}
		}
		
		return result;
	}
	
	public static String reverseString(String str){  
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    return sb.toString();  
	}  
	
	public static String op2(String a, String b) {
		String result = "";
		if(a.indexOf(b)==a.lastIndexOf(b)) {
			//count is 1
			result = a+b;
		}
		else {
			//count greater than 1
			
			for(int i=0;i<a.length();i++) {
				if(i==a.lastIndexOf(b)) {
					result += reverseString(b);
					i+=b.length();
				}
				else {
					result += a.charAt(i);
				}
			}
	
		}
		return result;
	}


	public static String op3(String a, String b) {
		String result = "";
		if(a.indexOf(b)==a.lastIndexOf(b)) {
			//count is 1
			result = a;
		}
		else {
			//count greater than 1
			
			for(int i=0;i<a.length();i++) {
				if(i==a.indexOf(b)) {
					result += "";
					i+=b.length()-1;
				}
				else {
					result += a.charAt(i);
				}
			}
	
		}
		return result;	
	}
	
	public static String op4(String a, String b) {
		String first = "";
		String last = "";
		String result = "";
		if(b.length()%2==0) {
			for(int i=0;i<b.length()/2;i++) {
				first += b.charAt(i);
			}
			for(int i=b.length()/2;i<b.length();i++) {
				last += b.charAt(i);
			}
		}else {
			for(int i=0;i<b.length()/2+1;i++) {
				first += b.charAt(i);
			}
			for(int i=b.length()/2+1;i<b.length();i++) {
				last += b.charAt(i);
			}
		}
		
		//System.out.println(first);
		//System.out.println(last);
		result += first;
		for(int i=0;i<a.length();i++) {
			result += a.charAt(i);
		}
		result += last;
		
		
		return result;
	}

	public static String op5(String a, String b) {
		String result = "";
		for(int i=0;i<a.length();i++) {
			if(b.indexOf(a.charAt(i)) != -1)
				result += "*";
			else
				result += a.charAt(i);
		}
	
	
		return result;
	}

}
