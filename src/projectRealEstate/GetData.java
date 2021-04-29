package projectRealEstate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GetData {
	public static Scanner scan = new Scanner(System.in);
	
	public String[][] getFilesBuy(String cond1, String cond2) throws IOException {
		int el = 7; // the things we need
		
		//Get Files from your computer
		ArrayList<String> rEstate = new ArrayList<String>();
		File dir = new File("D:\\3");
		File files[] = dir.listFiles();
		
		for (int i =0; i < files.length; i++) {
			if (files[i].getName().toString().contains(cond1) && files[i].getName().toString().contains(cond2)) {
				BufferedReader reader = new BufferedReader(new FileReader(files[i]));
				String line;
				int cnt = 0;
				while((line = reader.readLine()) != null) {
					if (cnt >= 16) {
						rEstate.add(line);
					}
					cnt++;
				}
			}
		}
		
		//Put the data into 2d Array
		String[][] rEst = new String[rEstate.size()][]; 
		
		for (int i = 0; i<rEstate.size(); i++) {
			rEst[i] = rEstate.get(i).split("\",\"");
		}
		
		String[][] fEst = new String[rEst.length][el];
		
		int i = 0;
		while (i < rEst.length) {
			fEst[i][0] = rEst[i][0]; //시군구
			fEst[i][1] = rEst[i][4]; //단지명
			fEst[i][2] = rEst[i][5]; //전용면적
			fEst[i][3] = rEst[i][6]; //계약년월
			fEst[i][4] = rEst[i][8]; //거래금액
			fEst[i][5] = rEst[i][9]; //층
			fEst[i][6] = rEst[i][10]; //건축년도
			i++;
		}
		
		for(int h = 0; h < fEst.length; h++) {
			for(int j = 0; j < fEst[h].length; j++) {
				fEst[h][j] = fEst[h][j].replace("\"","");			
			}
		}
		
		/*
		for (int j = 0; j < 5; j++) {
			for (int h = 0; h < fEst[j].length; h++) {
				System.out.print("[" + fEst[j][h] + "]");
			}
			System.out.println("");
		}
		*/
		
		return fEst;
	}
	
	public ArrayList<String> getFilesBuyAL(String cond1, String cond2) throws IOException{
		ArrayList<String> rEstate = new ArrayList<String>();
		File dir = new File("D:\\3");
		File files[] = dir.listFiles();
		
		for (int i =0; i < files.length; i++) {
			if (files[i].getName().toString().contains(cond1) && files[i].getName().toString().contains(cond2)) {
				BufferedReader reader = new BufferedReader(new FileReader(files[i]));
				String line;
				int cnt = 0;
				while((line = reader.readLine()) != null) {
					if (cnt >= 16) {
						rEstate.add(line);
					}
					cnt++;
				}
			}
		}
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i < rEstate.size(); i++) {
			list.add(rEstate.get(i).replace("\",\""," "));			
		}
		
		return rEstate;
	}
	
	
	public String[][] getFilesRent(String cond1, String cond2) throws IOException {
		int el = 9; // the things we need

		//Get Files from your computer
		ArrayList<String> rEstate = new ArrayList<String>();
		File dir = new File("D:\\3");
		File files[] = dir.listFiles();
		
		for (int i =0; i < files.length; i++) {
			if (files[i].getName().toString().contains(cond1) && files[i].getName().toString().contains(cond2)) {
				BufferedReader reader = new BufferedReader(new FileReader(files[i]));
				String line;
				int cnt = 0;
				while((line = reader.readLine()) != null) {
					if (cnt >= 16) {
						rEstate.add(line);
					}
					cnt++;
				}
			}
		}
		
		//Put the data into 2d Array
		String[][] rEst = new String[rEstate.size()][]; 
		
		for (int i = 0; i<rEstate.size(); i++) {
			rEst[i] = rEstate.get(i).split("\",\"");
		}
		
		String[][] fEst = new String[rEst.length][el];
		
		int i = 0;
		while (i < rEst.length) {
			fEst[i][0] = rEst[i][0]; //시군구
			fEst[i][1] = rEst[i][4]; //단지명
			fEst[i][2] = rEst[i][5]; //전월세구분
			fEst[i][3] = rEst[i][6]; //계약년월
			fEst[i][4] = rEst[i][7]; //보증금
			fEst[i][5] = rEst[i][9]; //월세
			fEst[i][6] = rEst[i][11]; //월세
			fEst[i][7] = rEst[i][12]; //층
			fEst[i][8] = rEst[i][13]; //건축년도
			i++;
		}
		
		
		for(int h = 0; h < fEst.length; h++) {
			for(int j = 0; j < fEst[h].length; j++) {
				fEst[h][j] = fEst[h][j].replace("\"","");			
			}
		}
		
		return fEst;
	}
}
	