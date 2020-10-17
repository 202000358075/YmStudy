package main;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

	//读取文件并按成绩排序
public class Read_Sort implements Read_Sort_Interface  {
		Sort_Interface si;
		
	public void set_Sort_Interface(Sort_Interface si) {
			this.si=si;
			
		}
	@Override
	public int[] readsort (ArrayList<Person> list) {
		// TODO Auto-generated method stub
		int[] array=read(list);
		return sort(array);
	}
	
	public int[] read(ArrayList<Person> p) {
		int []num=new int[p.size()];
		// TODO Auto-generated method stub
		for(int i=0;i<p.size();i++) {
		   num[i]=p.get(i).getMath()+p.get(i).getChinese()+p.get(i).getEnglish();
		  }
		return num;
	}


	public int[] sort(int[] array) {
		// TODO Auto-generated method stub
		return si.sort(array);
		
		
		
	
	}

}

	

