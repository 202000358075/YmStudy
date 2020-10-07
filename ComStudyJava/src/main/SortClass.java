package main;

import java.util.Arrays;

public class SortClass {
	
	
	public void sort(int arr[] ) {
		int i,j,k;
				int n=arr.length;
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1])
				{
					k=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=k;
				}
			}
		}
    	
		System.out.println("ÅÅĞò½á¹ûÊÇ£º");
		for (int t=0;t<arr.length ;t++) {
			System.out.print(" "+arr[t]);
		}
	
		
	
	}

}
