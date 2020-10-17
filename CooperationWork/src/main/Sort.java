package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort implements Sort_Interface {

	@Override
	public int[] sort(int[] array) {
		Arrays.sort(array);
		int[] arr=new int[array.length];
		for(int i=0;i<array.length;i++) {
			arr[i]=array[array.length-i-1];
			
		}
		return arr;
}
}