package com.tony.tranditioanlAlgorithms;

public class RamdomArray {

	public static int[] getArray(){
		int [] array = null;
		
		int length = (int)(Math.random()*20+1);
		
		array = new int[length];
		
		for(int i = 0; i<array.length;i++){
			
			array[i] = (int)(Math.random()*500 +1);
			
		}
		
		
		return array;
	}
	
	public static void swap(int [] array, int first, int second){
		
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
		
	}
	
	
	
}
