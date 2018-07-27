package IHUI_colocation;

import java.util.Vector;

public class Itemset {/*表示一个项集*/
	
	private Vector<Integer> item;//项集所包含的项目
	private long U;//项集效用
	private long TWU;//项集高事务加权效用
	
	public Itemset() {
		// TODO Auto-generated constructor stub
	}
	
	public void setItem(int[] item1,int size) {
		for (int i = 0; i < size; i++) {
			this.item.add(item1[i]);
		}
	}
	public void setU(long U) {
		this.U = U;
	}
	public void setTWU(long TWU) {
		this.TWU = TWU;
	}/*设置项集各项指标*/
		
	public Vector<Integer> getItem() {
		return this.item;
	}
	public long getU() {
		return this.U;
	}
	public long getTWU() {
		return this.TWU;
	}/*获取项集各项指标*/

}

