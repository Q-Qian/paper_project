package IHUI_colocation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Map<Integer, Double> testitemmapMap = initPro("src/IHUI_colocation/typefile.txt");
		System.out.println(testitemmapMap);
	}
	
	public static Map<Integer, Double> initPro(String typefile) throws IOException {
		Map<Integer,Double> itemMap = new HashMap<Integer,Double>();
		
		File file = new File(typefile);
		FileInputStream typein = new FileInputStream(file);
		int temptype;
		while ((temptype = typein.read()) != -1) {
			System.out.println("请输入类型"+temptype+"的效用值：");
			Scanner unityinput = new Scanner(System.in);
			double tempunity = unityinput.nextDouble();
			itemMap.put(temptype, tempunity);		
			
		}		
		
		return itemMap;
 	}

}
