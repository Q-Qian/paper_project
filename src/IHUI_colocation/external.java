package IHUI_colocation;

import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class external {
	public static int[][] bitMap;//事务与项目之间的位图
	public static int map_long;//位图第一维数组的长（即事务的个数）
	public static int map_wide;//位图第二维数组的长
	public static Map<Integer, Integer> itemMap;//暂时存储项目和项目利润
	public static Set<Item> hTWUItems;//高事务加权项目，按事务效用从低到高排列
	public static int[] htwuitemarr;//高事务加权项目，按事务效用从低到高排列（数组形式）
	public double min_util;//最小效用阈值
	public static Vector<Integer> twu;//存储所有事务的加权效用
	public static int t_count;//大体记录事务个数
	public static Vector<Itemset> htwuis;//高事务加权效用项集
	public static Vector<Itemset> huis;//高效用项集

}
