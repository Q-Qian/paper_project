package IHUI_colocation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
/*用索引表方法挖掘co-location的算法代码*/

public class IHUI_colocation_Mining {
	
	protected long startTimestamp; //start time of last execution
	protected long endTimestamp; //end time of last execution
	
	/**定义全局变量*/
	private int[][] BitMap;//事务与项目之间的位图
	private int map_long;//位图第一维数组的长（即事务的个数）
	private int map_wide;//位图第二维数组的长
	private Map<Integer, Integer> ItemMap;//暂时存储项目和项目利润
	private Set<Item> HTWUItems;//高事务加权项目，按事务效用从低到高排列
	private int[] htwuitemarr;//高事务加权项目，按事务效用从低到高排列（数组形式）
	private double Min_util;//最小效用阈值
	private Vector<Integer> twu;//存储所有事务的加权效用
	private int t_count;//大体记录事务个数
	private Vector<Itemset> htwuis;//高事务加权效用项集
	private Vector<Itemset> huis;//高效用项集
	
	/*初始化表*/
	private int[][] itemtranmap;
	
	
	public void setItemProfit() {
		
	}
	
	public void inititemtranmap() {
		
	}
	
	public Map<String, Integer> initItemMap() {
		Map<String, Integer> ItemMap = new HashMap<String,Integer>();
		
		return ItemMap;
		
	}
	
	public double initMinUtil(double minPoint) {//初始化最小效用阈值
		long htwusum = 0;
		double ucheckutil = 0.0;
		for (int i = (external.twu.size()-1); i >0; htwusum += external.twu.indexOf(i--));
			ucheckutil = htwusum*minPoint;
			double min_util = ucheckutil;
			return min_util;
	}
	
	public void initHTWUItems() {//获得全体高效用事务项目
		int item_1 = initItemMap().size();
		long htu = 0;
		int i = 0;
		
		
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
		
	}	

	
	public static void main(String[] args) {
				
	}
	
}
