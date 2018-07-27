package IHUI_colocation;

import java.util.Vector;

public class Transaction {/*表示一条事务*/
	
	private int ID;
	private Vector<Integer> item;
	private int TWUtil;
	
	public Transaction(){
		// TODO Auto-generated constructor stub
	}
	
	
	public void setID(int ID) {
		this.ID = ID;
	}//设置事务的编号
	public void setItem(int[] item1,int size) {
		for (int i = 0; i < size; i++) {
			this.item.add(item1[i]);
		}
	}//设置事务中所有项目
	public void setItem(Vector<Integer> it,int size) {
		for (int i = 0; i < size; i++) {
			this.item.add(it.get(i));
		}
	}//设置事务中所有项目
	public void setTWUtil(int TWUtil) {
		this.TWUtil = TWUtil;
	}//设置事务效用
	
	
	/*获取各项数据*/
	public int getID() {		
		return this.ID;		
	}//获取事务的ID
	public Item getItem() {
		return this.item;
	}
	public int getTWUtil() {
		return this.TWUtil;
	}	
}
