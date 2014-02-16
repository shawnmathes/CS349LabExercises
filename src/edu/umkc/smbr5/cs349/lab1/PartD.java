package edu.umkc.smbr5.cs349.lab1;
import java.util.ArrayList;

public class PartD {
	
	public static void main(String[] arguments) {
		String[] input = new String[] {"aa", "b", "abcd"};
		String[] filtered = FilterByLength(input, 1);
		
		System.out.print("Input:    ");
		System.out.println(StringJoin(input, " "));
		
		System.out.print("Filtered: ");
		System.out.println(StringJoin(filtered, " "));
	}

	static String [] FilterByLength(String s[], int i) {
		ArrayList<String> list = new ArrayList<String>();
		for (int j = 0; j < s.length; j++) {
			if (s[j].length() != i) {
				list.add(s[j]);
			}
		}
		
		return list.toArray(new String[list.size()]);
	}
	
	static String StringJoin(String[] a, String seperator) {
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < a.length; i++) {
	        if (i > 0) {
	            sb.append(seperator);
	        }
	            
	        sb.append(a[i]);
	    }
	    
	    return sb.toString();
	}
}
