package edu.umkc.smbr5.cs349.lab1;

public class PartB {

	public static void main(String[] args) {
        int[] a = {3,9,4,1};
        int[] r = reverse(a);
        
        System.out.print("Input:    ");
		System.out.println(stringJoin(a, " "));
		
		System.out.print("Reversed: ");
		System.out.println(stringJoin(r, " "));
	}
	
	static int[] reverse(int[] a) {
		int length = a.length;
		int[] r = new int[length];
		for (int i = length; i > 0; i--) {
			r[i - 1] = a[length - i];
		}
		
		return r;
	}
	
	static String stringJoin(int[] a, String seperator) {
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
