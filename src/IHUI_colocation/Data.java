package IHUI_colocation;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import javax.swing.text.Position;


public class Data {
	
	public Data() throws FileNotFoundException {
		// TODO Auto-generated constructor stub
	}
	int cenurrt = 0;
	ArrayList<ArrayList<String>> maximalclique_data = Creatneighbor.creatneighbor();
	public Transaction getNext() {
		Transaction t = new Transaction();
		
		return t;
	}
	
	public void initPro() {
		
	}
	
	private Transaction getNextAsFlat() {
		Vector<Integer> list;
		int c;
		for(ArrayList<String> b:maximalclique_data){
			int item = 0;int pos = 0;
			while((b>='0') && (b<='9')){}
		}
	}

}
