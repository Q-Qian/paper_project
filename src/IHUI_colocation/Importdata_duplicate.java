package IHUI_colocation;

import java.io.*;
import java.util.*;

public class Importdata_duplicate {

	public static void main(String[] args) throws FileNotFoundException {
		importdata();
	}//主程序
	

	public static ArrayList<String> importdata() throws FileNotFoundException {
		// 把txt文件中的数据转换成一个动态数组

		FileReader file = new FileReader("src/IHUI_colocation/co_locationData.txt");
		ArrayList<String> list = new ArrayList<String>();
		String temp;
		try {
			BufferedReader reader = new BufferedReader(file);
			while ((temp = reader.readLine()) != null) {
				// System.out.println(temp+"         "+"第"+i+"个"+'\n');//输出每行数据
				String[] a = temp.split("\t\t");// 分割数据各项
				String b = a[0] + " " + a[1] + " " + a[2] + " " + a[3];//每行数据中的四条属性记录组成一个字符串
				System.out.println(Integer.parseInt(a[0])+" "+Integer.parseInt(a[1])+" "+a[2]+" "+a[3]);
				list.add(b);// 把每行数据放到动态数组中
			}
			reader.close();// 关闭数据流
			// System.out.println(list);			

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;// 以数组形式返回所有的数据
	}

}
