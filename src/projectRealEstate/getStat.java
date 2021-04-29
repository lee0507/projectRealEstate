package projectRealEstate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class getStat {
	public static Scanner scan = new Scanner(System.in);
	public static GetData g = new GetData();
	public static newScr n = new newScr();
	public static getStat s = new getStat();
	
	public int getLeng(String str1, String str2, String str3, String str4, String str5, ArrayList<String> arr) {
		int cnt = 0;
		
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).contains(str1) && arr.get(i).contains(str2) && arr.get(i).contains(str3) && arr.get(i).contains(str4) && arr.get(i).contains(str5)) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public void getAvg(String str1, String str2, String str3, String str4, String str5, ArrayList<String> arr) throws ParseException {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		DateFormat df = new SimpleDateFormat("yyyyMM");
		cal.add(Calendar.YEAR, -1);
		String s = df.format(cal.getTime());
		int inputDate = Integer.parseInt(s);
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		int sum = 0;
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).contains(str1) && arr.get(i).contains(str2) && arr.get(i).contains(str3) && arr.get(i).contains(str4) && arr.get(i).contains(str5)) {
				A.add(Integer.parseInt(arr.get(i).split("\",\"")[6]));
				B.add(Integer.parseInt(arr.get(i).split("\",\"")[8].replace(",", "")));
			}
		}
		try {
			int cnt = 0;
			for (int i = 0; i < A.size(); i++) {
				if(A.get(i) > inputDate) {
					sum = sum + B.get(i);
					cnt++;
				}
			}	
			int avg = sum / cnt;
			System.out.println("�ֱ� 1�� ��� �ŸŰ�: " + (avg / 10000) + "�� " + (avg % 10000) + "��");
		} catch(Exception e) {
			System.out.println("�ֱ� 1�� �̳� �Ÿ� �̷��� �����ϴ�.");
		}
	}//getAvg close
	
	public void getMin(String str1, String str2, String str3, String str4, String str5, ArrayList<String> arr) throws ParseException {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		DateFormat df = new SimpleDateFormat("yyyyMM");
		cal.add(Calendar.YEAR, -3);
		String s = df.format(cal.getTime());
		int inputDate = Integer.parseInt(s);
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).contains(str1) && arr.get(i).contains(str2) && arr.get(i).contains(str3) && arr.get(i).contains(str4) && arr.get(i).contains(str5)) {
				A.add(Integer.parseInt(arr.get(i).split("\",\"")[6]));
				B.add(Integer.parseInt(arr.get(i).split("\",\"")[8].replace(",", "")));
			}
		}
		
		for (int i = 0; i < A.size(); i++) {
			if(A.get(i) > inputDate && min > B.get(i)) {
				min = B.get(i);
			} else if(min == Integer.MAX_VALUE) {
				min = 0;
			}
		}
		if(min == 0) {
			System.out.println("�ֱ� 3�� �̳� �Ÿ� �̷��� �����ϴ�.");
		} else {
			System.out.println("�ֱ� 3�� �ּ� �ŸŰ�: " + (min / 10000) + "�� " + (min % 10000) + "��");
		}
	}
	
	public void getMax(String str1, String str2, String str3, String str4, String str5, ArrayList<String> arr) throws ParseException {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		DateFormat df = new SimpleDateFormat("yyyyMM");
		cal.add(Calendar.YEAR, -3);
		String s = df.format(cal.getTime());
		int inputDate = Integer.parseInt(s);
		
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		int max = 0;
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).contains(str1) && arr.get(i).contains(str2) && arr.get(i).contains(str3) && arr.get(i).contains(str4) && arr.get(i).contains(str5)) {
				A.add(Integer.parseInt(arr.get(i).split("\",\"")[6]));
				B.add(Integer.parseInt(arr.get(i).split("\",\"")[8].replace(",", "")));
			}
		}
		
		for (int i = 0; i < A.size(); i++) {
			if(A.get(i) > inputDate && max < B.get(i)) {
				max = B.get(i);
			}
		}
		
		if(max == 0) {
			System.out.println("�ֱ� 3�� �̳� �Ÿ� �̷��� �����ϴ�.");
		} else {
			System.out.println("�ֱ� 3�� �ִ� �ŸŰ�: " + (max / 10000) + "�� " + (max % 10000) + "��");
		}

	}
	
	public void getRiserate(String str1, String str2, String str3, String str4, String str5, ArrayList<String> arr) throws ParseException {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		DateFormat df = new SimpleDateFormat("yyyyMM");
		cal.add(Calendar.YEAR, -3);
		String s = df.format(cal.getTime());
		int inputDate = Integer.parseInt(s);
		
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		int max = 0;
		int min = Integer.MAX_VALUE;
		double avg = 0;
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).contains(str1) && arr.get(i).contains(str2) && arr.get(i).contains(str3) && arr.get(i).contains(str4) && arr.get(i).contains(str5)) {
				A.add(Integer.parseInt(arr.get(i).split("\",\"")[6]));
				B.add(Integer.parseInt(arr.get(i).split("\",\"")[8].replace(",", "")));
			}
		}
		
		for (int i = 0; i < A.size(); i++) {
			if(A.get(i) > inputDate && max < B.get(i)) {
				max = B.get(i);
			}
		}

		for (int i = 0; i < A.size(); i++) {
			if(A.get(i) > inputDate && min > B.get(i)) {
				min = B.get(i);
			} else if(min == Integer.MAX_VALUE) {
				min = 0;
			}
		}
		avg = max / min;
		if(max == 0) {
			System.out.println("�ֱ� 3�� �̳� �Ÿ� �̷��� �����ϴ�.");
		} else if (min == 0){
			System.out.println("�ֱ� 3�� �̳� �Ÿ� �̷��� �����ϴ�.");
		} else {
			System.out.println("�ֱ� 3�� ���� ��·�: " + (avg * 100) + "% �Դϴ�." );
		}

	}//getAvg close

	public void listUp(String str1, String str2, String str3, String str4, String str5, ArrayList<String> arr) {
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).contains(str1) && arr.get(i).contains(str2) && arr.get(i).contains(str3) && arr.get(i).contains(str4) && arr.get(i).contains(str5)) {
					System.out.println(arr.get(i));
			}
		}
	}//listUp close
	
}//GetStat Class close
