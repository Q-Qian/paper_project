package IHUI_colocation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
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
	
	public static Map<Integer, Double> initPro(String typefile) throws IOException {
		Map<Integer,Double> itemMap = new HashMap<Integer,Double>();
		
		File file = new File(typefile);
		FileInputStream typein = new FileInputStream(file);
		int temptype;
		while ((temptype = typein.read()) != 0) {
			System.out.println("请输入类型"+temptype+"的效用值：");
			Scanner unityinput = new Scanner(System.in);
			double tempunity = unityinput.nextDouble();
			itemMap.put(temptype, tempunity);		
			
		}		
		
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
