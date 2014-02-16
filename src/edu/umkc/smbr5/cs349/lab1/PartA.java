package edu.umkc.smbr5.cs349.lab1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PartA {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.print("What is your name?");
        String name = br.readLine();
        System.out.println("Hello " + name + "!");
	}        
}
