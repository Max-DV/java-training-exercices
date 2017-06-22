package io.robusta.java.classic;

import java.util.Arrays;

/**
 * Created by nicorama on 21/06/2017.
 */
public class ArrayApp {



	int[] buildArray(int a, int b, int c) { // avec a b et c //onrenvoituntableau

		int[] buildArray = new int[] { a, b, c };
		return buildArray;
	}

	public boolean equality(int[] array1, int[] array2){
		
//    	int[] Array1= new int[6];
//    	int[] Array2= new int[8];
    		if(Arrays.equals(array1, array2)){
    			return true;
    			//System.out.println("same");
    		}
    			//System.out.println("different");
    	return false;
	
	}

	
	String asString(int[] numbers) {

		String result="";
		for (int i=0 ; i< numbers.length; i++){
			result+= numbers[i]+":";
		}
		return result;
	}

	String asStringJoin(int[] numbers) {
		String result="";
		for (int i=0 ; i< numbers.length-1; i++){
			result+= numbers[i]+":";
		}result+= numbers[numbers.length-1]+"";
		return result;
	}
	
	String asString(String[] strings) {
		String result="";
		for (int i=0 ; i< strings.length-1; i++){
			result+= strings[i]+" ";
		}result+= strings[strings.length-1]+"";
		return result;
	}

//	String asString(Card[] cards) {
//		int value;
//		char color;
//		String result ="";
//		for(int i=0; i< cards.length; i++){
//			result += cards[i]+"";
//		}
//		return String.valueOf(this.value + this.color);
//	}
	
}
