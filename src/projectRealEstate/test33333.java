package projectRealEstate;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class test33333 {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Calendar cal1 = Calendar.getInstance();
		Calendar cal5 = Calendar.getInstance();
		cal1.setTime(new Date());
		cal5.setTime(new Date());
		DateFormat df = new SimpleDateFormat("yyyy");
		cal1.add(Calendar.YEAR, -1);
		cal5.add(Calendar. YEAR, -5);
		String s = df.format(cal1.getTime());
		String k = df.format(cal5.getTime());
		int inputDate1 = Integer.parseInt(s);
		int inputDate5 = Integer.parseInt(k);
		System.out.println(cal1);
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		int[] B = new int[5];
		A.add(201201);
		A.add(202006);
		A.add(201605);
		A.add(201906);
		A.add(201712);
		
		System.out.println(A.get(0) / 100);
		System.out.println(A.get(1) / 100);
		System.out.println(A.get(2) / 100);
		System.out.println(A.get(3) / 100);


		}
}