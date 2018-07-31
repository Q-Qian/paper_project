package IHUI_colocation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import javax.swing.text.Position;


public class Data {
	
	public Data() throws FileNotFoundException {
		// TODO Auto-generated constructor stub
	}
	int cenurrt = 0;
	ArrayList<ArrayList<String>> maximalclique_data = Creatneighbor.creatneighbor();
	
	public Map<String, Integer> initPro(String typefile) throws FileNotFoundException {
		Map<String,Integer> itemMap = new HashMap<String,Integer>();
		int key = 0;
		int value = 0;
		int flag = 0;
		
		File file = new File(typefile);
		FileInputStream typein = new FileInputStream(file);
		
		
		
		return itemMap;
 	}
	
	public Transaction getNext() {
		
		
		return new Transaction();
	}
	
	private Transaction getNextAsFlat() {
		Vector<Integer> list;
		int c;
		for(ArrayList<String> b:maximalclique_data){
			int item = 0;int pos = 0;
			while(b>=0) && (b<='9')){}
		}
	}

}
