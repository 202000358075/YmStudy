package main;

public class RegionClass {
	int l=0;
	int m=0;
	int n=0;

	public void region(int[] list) {
		for(int i=0;i<list.length;i++) {
			if(list[i]>0&&list[i]<20) {
				l+=1;
			}
			if(list[i]>=20&&list[i]<40) {
				m+=1;
			}
			else {
				n+=1;
			}
		}
		System.out.println("0-20有"+l+"个；20-40有"+m+"个；大于40有"+n+"个；");
		
	}
}
