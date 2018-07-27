package IHUI_colocation;

public class Item {
    private int itemNo = 0;
    private int itemProfit = 0;
    private long ITWUtil = 0;
    
    public Item() {
		// TODO Auto-generated constructor stub
	}
    
    public void setItemNo(int ItemNo) {
		this.itemNo = ItemNo;
	}    
    public void setItemProfit(int ItemProfit) {
		this.itemProfit = ItemProfit;
	}    
    public void setITWUtil(long ITWUtil) {
		this.ITWUtil = ITWUtil;
	}/*设置item项的No、Profit和ITWUtil*/
    
    
    public int getItemNo() {
		return this.itemNo;
	}
    public int getItemProfit() {
		return this.itemProfit;
	}
    public long getITWUtil() {
		return this.ITWUtil;
	}/*获取item项的No、Profit和ITWUtil*/
    
    public boolean operator(Item i) {//
		if (getITWUtil() == i.getITWUtil()){
			return getItemNo() < i.getItemNo();
		}else {
			return getITWUtil() < i.getITWUtil();
		}
	}
}
