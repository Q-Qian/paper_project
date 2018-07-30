package IHUI_colocation;

import java.io.OutputStream;
import java.util.Set;
import java.util.Vector;

public class Init {
	public Init() {
		// TODO Auto-generated constructor stub
	}
	
	private Data data;
	private Data dataProData;
	private Vector<Integer> htwui;
	
	public void setItemProfit() {
		
	}
	
	public void inititemtranmap() {
		
	}
	
	public void initItemMap() {
		
	}
	
	public void initMinUtil(double minPoint) {
		
	}
	
	public void initHTWUItems() {
		
	}
	
	public void initBitMap() {/*初始化位图*/
		int[][] bitMap = new int[external.map_long][];
		for (int i = 0; i < bitMap.length; i++) {
			bitMap[i] = new int[external.map_wide];
		}//建立一个空数组
		
		for (int j = 0; j < bitMap.length; j++) {
			for (int k = 0; k < bitMap[j].length; k++) {
				bitMap[j][k] = 0;//数组每项置为0
			}
		}
		
		Set<String> itSet = itemMap
	}	

}
