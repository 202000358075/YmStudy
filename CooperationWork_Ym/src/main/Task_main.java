package main;

public class Task_main {
	
	Ave_Max_Interface ami;
	Select_Interface sc;
	Sort_Interface si;
	
	public Ave_Max_Interface getAmi() {
		return ami;
	}
	public void setAmi(Ave_Max_Interface ami) {
		this.ami = ami;
	}
	public Select_Interface getSc() {
		return sc;
	}
	public void setSc(Select_Interface sc) {
		this.sc = sc;
	}
	public Sort_Interface getSi() {
		return si;
	}
	public void setSi(Sort_Interface si) {
		this.si = si;
	}
	public void excute() {
		String filePath = "E:/git/repository2/CooperationWork/src/data/data.txt";
	}
	public static void main(String[] args) {
		
		Task_main tm=new Task_main();
		
		/*
		 * Read_Sort rs=new Read_Sort(); Sort_Interface si=new Sort();
		 * rs.set_Sort_Interface(si);
		 * 
		 * mt.setRs(rs);
		 */
		
		tm.excute();
	}
}
