package main;

import java.util.ArrayList;

public class MainTask {
	
	//public static int a[]= {12,23,2,66,34,57,89,90,78,89,99,100};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[]= {12,23,2,66,34,57,89,90,78,89,99,100};
	
	//获取排序对象
	
	System.out.println("排序后："+a);
    FindNumber fn=new FindNumber();
    System.out.println("平均分："+fn.ave(a));
    System.out.println("最大值："+fn.max_num(a));
    System.out.println("最小值："+fn.min_num(a));
    System.out.println("中值:"+fn.max(a));
    System.out.println("及格率："+fn.ji_number(a));
    System.out.println("优秀率："+fn.sup_num(a));
    
    //获取区间对象
    RegionClass rc=new RegionClass();
    rc.region(a);
    
    
	}

}
