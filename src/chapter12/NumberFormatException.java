package chapter12;


import java.util.*;




public class NumberFormatException{
	public static void main(String[] args) {
		hex2Dec("@");
		System.out.println();
		
	
	}
	
	public static void hex2Dec(String hexString){
		try {
			if( hexString.matches("^[0-9a-fA-F]+$")) {
				int decimal=Integer.parseInt(hexString,16);  
				System.out.println(decimal);
		}}catch (Exception e) {
			System.out.println("Error!  String is not a hexa decimal string");
			
			
			
		}
	
	}}