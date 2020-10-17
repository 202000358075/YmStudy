package main;

import java.util.ArrayList;
import java.util.List;

public class Ave_Max implements Ave_Max_Interface{

	@Override
	public  float[] getAve(ArrayList<Person> stus) {
		// TODO Auto-generated method stub
		
		float sum1=0,sum2=0,sum3=0;
		int i;
		for(i=0;i<stus.size();i++) {
			sum1+=stus.get(i).getMath();
			sum2+=stus.get(i).getChinese();
			sum3+=stus.get(i).getEnglish();
		}
		float[] list= new float[3];
		list[0]=sum1/stus.size();
		list[1]=sum2/stus.size();
		list[2]=sum3/stus.size();
		
		System.out.println("数学的平均分是："+sum1/stus.size());
		System.out.println("语文的平均分是："+sum2/stus.size());
		System.out.println("英语的平均分是："+sum3/stus.size());
		return list;
		
	}

	@Override
	public float[] getMax(ArrayList<Person> stus) {
		// TODO Auto-generated method stub
		
		float max_Math=0,max_Chinese=0,max_English=0;
		int i;
		for(i=0;i<stus.size();i++) {
			if(max_Math<stus.get(i).getMath())
				max_Math=stus.get(i).getMath();
			if(max_Chinese<stus.get(i).getChinese())
				max_Chinese=stus.get(i).getChinese();
			if(max_English<stus.get(i).getEnglish())
				max_English=stus.get(i).getEnglish();
			
		}
			
		System.out.println("数学的最高分是："+max_Math);
		System.out.println("语文的最高分是："+max_Chinese);
		System.out.println("英语的最高分是："+max_English);
		float[] f= new float[3];
		f[0]=max_Math;
		f[1]=max_Chinese;
		f[2]=max_English;
		return f;
	}
	
	

}
