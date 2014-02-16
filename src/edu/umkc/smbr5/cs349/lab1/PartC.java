package edu.umkc.smbr5.cs349.lab1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PartC {
	public static void main(String[] args) throws IOException  {		
		int grid = getNumber();
		printGrid(grid);
	}
	
	static int getNumber() throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        String number = br.readLine();
        return Integer.parseInt(number);
	}
	
	static void printGrid(int grid) {
		if (grid < 1) {
			return;
		}
		
		for (int i = 0; i < grid; i++) {
			printHorizontalBar(grid);
			printHorizontalCells(grid);
		}
		
		printHorizontalBar(grid);
	}
	
	static void printHorizontalBar(int grid) {
		printHorizontal(grid, "+", "--");
	}
	
	static void printHorizontalCells(int grid) {
		printHorizontal(grid, "|", "  ");
	}
	
	static void printHorizontal(int grid, String node, String edge) {
		for (int i = 0; i < grid; i++) {
			System.out.print(node + edge);
		}
		
		System.out.println(node);
	}

}
