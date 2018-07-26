package IHUI_colocation;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class Creatneighbor {

	
	public static void main(String[] args) throws Throwable {
		
		long time0 = System.currentTimeMillis();// 起始时间
		creatneighbor();
		long time1 = System.currentTimeMillis();
		long time = (time1 - time0) / 1000;
		System.out.println("共用时" + time + "秒");// 计时功能
	}// 主程序

	
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
	
	public static <E> ArrayList<ArrayList<String>> creatneighbor()
			throws FileNotFoundException {

		ArrayList<String> data = importdata();// 原来引入并整理好的数据
		ArrayList<ArrayList<String>> neighbortype = new ArrayList<ArrayList<String>>(); // 存储每个点对应的临近点信息
		double distancethreshold = 0.1;// 距离最大值
		int i = 0;

		try {
			//String ab = data.get(2) 用来更改for循环语句中的取值

			for (String pointdata : data) {// 遍历原始数据中每个点
				i++;
				ArrayList<String> temp = new ArrayList<String>();// 新建一个temp数组，存储每个点的邻居组合
				ArrayList<String> idandtype = new ArrayList<String>();
				temp.add(pointdata);
				idandtype.add(pointdata.split(" ")[1]);
				
				for (String pointdata1 : data) {// 遍历原数据中每个点与第一遍循环中的对应点求距离
					int pointdataid = Integer.parseInt(pointdata.split(" ")[0]);
					int pointdata1id = Integer.parseInt(pointdata1.split(" ")[0]);

                 if (pointdataid<pointdata1id && isneighbor(pointdata1,temp,distancethreshold)==true) {
                	 temp.add(pointdata1);
                	 idandtype.add(pointdata1.split(" ")[1]);
				}
				}
				// System.out.println(temp);
				if (temp.size()>1) {
					System.out.println(temp);
					neighbortype.add(idandtype);
				}// 把某个点的二项近邻放入neighbor数组中（没有近邻的点不用放）
				// System.out
			}
			System.out.println(neighbortype);
			System.out.println("neighbor的长度为：" + neighbortype.size());
			
			File file = new File("E:\\co-location Data\\Maximal Clique.txt");//将极大团写入文件
			FileOutputStream output = new FileOutputStream(file);
			for(ArrayList<String> b:neighbortype){
				output.write(b.toString().getBytes());
				output.write("\r\n".getBytes());
			}
			output.close();
			
			System.out.print("共计" + i + "个数据点" + "\t\t");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return neighbortype;
	}
	
	
	public static boolean isneighbor(String rowdata,List<String> temp,double distancethreshold) {// 判断传入的两个点是否满足近邻关系
		boolean label = true;//默认两点是相邻的
		float x = Float.parseFloat(rowdata.split(" ")[2]);// rowdata的经度
		float y = Float.parseFloat(rowdata.split(" ")[3]);// rowdata的纬度
		
		for(String tempvalue : temp){
			float x1 = Float.parseFloat(tempvalue.split(" ")[2]);
			float y1 = Float.parseFloat(tempvalue.split(" ")[3]);
			
			if(Math.sqrt(Math.pow(x - x1, 2)+ Math.pow(y - y1, 2))>=distancethreshold) label = false;//两点不相邻的话返回
		}
		return label;
	}

}
