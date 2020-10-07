package main;

public class FindNumber {
	int sum=0;
	float average=0;
	int max=0;
	int min=0;
	int cur=0;
	float sup=0;
	float jige=0;
	
	public float ave(int a[]) 
	{ 
		for(int i=0;i<a.length;i++)
			sum+=a[i];
	    average=sum/a.length;
		return average;
		
	}
	public int max_num(int a[]) 
	{ 
	   // a.sore();
	    max=a[a.length-1];
		return max;
		
	}
	public int min_num(int a[]) 
	{ 
		min=a[0];
		return min;
		
	}
	public float max(int a[]) 
	{ 
		//获取排序后的数组
		int b=a.length/2;
		if(a.length%2==0)
		{
			cur=(a[b]+a[b+1])/2;
		}else {
		    cur=a[b];
		}
		
		return cur;
		
	}
	public float ji_number(int a[]) 
	{ 
		//获取排序后的数组
		int ji_sum=0;
	   for(int i=0;i<a.length;i++) {
		  if(a[i]<60) {
			  ji_sum+=a[i];  
		  }
	  }
	   jige=ji_sum/a.length;
		
		return jige;
	}	
		public float sup_num(int a[]) 
		{ 
			//获取排序后的数组
		  int sup_sum=0;
		  for(int i=0;i<a.length;i++) {
			  if(a[i]>+90) {
				  sup_sum+=a[i];  
			  }
		  }
			sup=sup_sum/a.length;
			return sup;
		}		
}
