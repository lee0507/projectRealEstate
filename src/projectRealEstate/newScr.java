package projectRealEstate;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class newScr {
	public static Scanner scan = new Scanner(System.in);
	public static newScr n = new newScr();
	public static getStat s = new getStat();
	
	public String[][] getChoices(String[][] aBuy) {
		
		HashSet<String> address = new HashSet<String>(); 
	    
		for(int i = 0; i < aBuy.length; i++) {
		    address.add(aBuy[i][0].replace(" ", "$") + "$" + aBuy[i][1] + "$" + aBuy[i][2]);
		}
		
		ArrayList<String> choices = new ArrayList<>(address);
		String[][] choice = new String[address.size()][];
		      
		for (int i = 0; i < address.size(); i++) {
			choice[i] = choices.get(i).split("\\$");
		}
		
		return choice;
	}
	
	public ArrayList<String> getCity(String[][] choice) {
		//�� �� �̸�
		HashSet<String> City = new HashSet<String>();
		
		for(int i = 0; i < choice.length; i++) {
			City.add(choice[i][0]);
		}
		
		 ArrayList<String> city = new ArrayList<String>(City); // change to ArrayList
		 Collections.sort(city);
		 return city;
	}
	
	public ArrayList<String> getDist(String str1, String[][] choice) {
		//�� �̸�
		HashSet<String> District = new HashSet<String>();
		
		for(int i =0; i < choice.length; i++) {
			if (choice[i][0].contains(str1)) {
				District.add(choice[i][1]);
			}
		}
		
		
		ArrayList<String> district = new ArrayList<String>(District); //change to ArrayList
		Collections.sort(district);
		return district;
	}
	
	public ArrayList<String> getTown(String[][] choice, String str1, String str2) {
		//�� �̸�
		HashSet<String> Town = new HashSet<String>();
		
		
		for(int i =0; i < choice.length; i++) {
			if (choice[i][0].contains(str1) && choice[i][1].contains(str2)) {
				Town.add(choice[i][2]);
			}
		}

		ArrayList<String> town = new ArrayList<String>(Town); //change to ArrayList
		Collections.sort(town);
		return town;
	}
	
	public ArrayList<String> getComp(String[][] choice, String str1, String str2, String str3) {
		//����
		HashSet<String> comp = new HashSet<String>();
		
		for(int i =0; i < choice.length; i++) {
			if (choice[i][0].contains(str1) && choice[i][1].contains(str2) && choice[i][2].contains(str3)) {
				comp.add(choice[i][3]);
			}
		}
		
		ArrayList<String> complex = new ArrayList<String>(comp); // change to ArrayList
		Collections.sort(complex);
		
		return complex;
	}
	
	public ArrayList<String> getArea(String[][] choice, String str1, String str2, String str3, String str4) {
		//�������
		HashSet<String> Area = new HashSet<String>();

		for(int i =0; i < choice.length; i++) {
			if (choice[i][0].contains(str1) && choice[i][1].contains(str2) && choice[i][2].contains(str3) && choice[i][3].contains(str4)) {
				Area.add(choice[i][4]);
			}
		}
		
		ArrayList<String> area = new ArrayList<String>(Area); // change to ArrayList
		Collections.sort(area);
		return area;
	}
	
	public int selectFunc() {
		System.out.println("====메뉴====");
		System.out.println("1. 아파트 매매");
		System.out.println("2. 오피스텔 매매");
		System.out.println("3. 아파트 전월세");
		System.out.println("4. 오피스텔 전월세");	
		
		return scan.nextInt();
	}
	
	public void select(String[][] choice, ArrayList<String> AptBuyAL) throws ParseException {
		
		ArrayList<String> city = n.getCity(choice);
		int c2 = n.selectCity(city);
		String str1 = n.yourCity(c2, city);
		
		ArrayList<String> district = n.getDist(str1, choice);
		int c3 = n.selectDist(district);
		String str2 = n.yourDist(c3, district);
		
		ArrayList<String> town = n.getTown(choice, str1, str2);
		int c4 = n.selectTown(town);
		String str3 = n.yourTown(c4, town);
		
		ArrayList<String> comp = n.getComp(choice, str1, str2, str3);
		int c5 = n.selectComp(comp);
		String str4 = n.yourComp(c5, comp);
		
		ArrayList<String> area = n.getArea(choice, str1, str2, str3, str4);
		int c6 = n.selectArea(area);
		String str5 = n.yourArea(c6, area);

		s.listUp(str1, str2, str3, str4, str5, AptBuyAL);
		s.getAvg(str1, str2, str3, str4, str5, AptBuyAL);
		s.getMin(str1, str2, str3, str4, str5, AptBuyAL);
		s.getMax(str1, str2, str3, str4, str5, AptBuyAL);
		s.getRiserate(str1, str2, str3, str4, str5, AptBuyAL);
	}
	
	public int selectCity(ArrayList<String> city) {
		System.out.println(0 + ". 뒤로가기");
		System.out.println("시/도를 선택하세요.");
		for (int i = 0; i < city.size(); i++) {
			System.out.println((i + 1) + ". " + city.get(i));
		}
		return scan.nextInt();
	}
	
	public String yourCity(int n, ArrayList<String> city) {
		String choice = city.get(n-1);
		
		return choice;
	}
	
	public int selectDist(ArrayList<String> district) {
		
		System.out.println(0 + ". 뒤로가기");
		System.out.println("시군구를 선택하세요");
		for(int i = 0; i < district.size(); i++) {
			System.out.println((i + 1) + ". " + district.get(i));
		}
		
	return scan.nextInt();
	}
	
	public String yourDist(int n, ArrayList<String> dist) {
		String choice = dist.get(n-1);
		
		return choice;
	}

	public int selectTown(ArrayList<String> town) {
		System.out.println(0 + ". 뒤로가기");
		System.out.println("동읍면을 선택하세요.");
		
		int i =0;
		while ( i < town.size()) {
			System.out.println((i+1) + "." + town.get(i));	
		i++;
		}
		
	    return scan.nextInt();
	}
	
	public String yourTown(int n, ArrayList<String> town) {
		String choice = town.get(n-1);
		
		return choice;
		
	}
	
	public int selectComp(ArrayList<String> comp) {
		System.out.println(0 + ". 뒤로가기");
		System.out.println("단지를 선택하세요.");

		for(int i = 0; i < comp.size(); i++) {
			System.out.println((i + 1) + ". " + comp.get(i));
		}
		
	    return scan.nextInt();
	}
	
	public String yourComp(int n, ArrayList<String> comp) {
		String choice = comp.get(n-1);
		
		return choice;
	}
	
	public int selectArea(ArrayList<String> area) {
		System.out.println(0 + ". 뒤로가기");
		System.out.println("전용면적을 선택하세요.");

		for(int i = 0; i < area.size(); i++) {
			System.out.println((i + 1) + ". " + area.get(i));
		}
		
	    return scan.nextInt();
	}
	
	public String yourArea(int n, ArrayList<String> area) {
		String choice = area.get(n-1);
		
		return choice;
	}
	
	
}
