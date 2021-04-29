package projectRealEstate;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main extends Thread {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws IOException, ParseException {
		GetData g = new GetData();
		newScr n = new newScr();
		getStat s = new getStat();
//		Main thread = new Main();

	    while(true) {
	    	int c1 = n.selectFunc();

	    	if (c1 == 1) {
	    		System.out.println("로딩중입니다. 잠시 기다려주세요!");
//	    		thread.start();
	    		
	    		ArrayList<String> AptBuyAL= g.getFilesBuyAL("아파트", "매매");
	    		String[][] AptBuy= g.getFilesBuy("아파트", "매매");
	    		String[][] choice = n.getChoices(AptBuy);
	    	
	    		n.select(choice, AptBuyAL);
	    		
	    		
	    	} else if (c1 == 2) {
	    		ArrayList<String> OTBuyAL = g.getFilesBuyAL("오피스텔", "매매");
	    		String[][] OTBuy= g.getFilesBuy("오피스텔", "매매");
	    		String[][] choice = n.getChoices(OTBuy);
	    		
	    		n.select(choice, OTBuyAL);
	    		
	    	} else if (c1 == 3) {
	    		ArrayList<String> AptRent= g.getFilesBuyAL("아파트", "전월세");
	    		
	    	} else if (c1 == 4) {
	    		ArrayList<String> OTRent= g.getFilesBuyAL("오피스텔", "전월세");
	    		
	    	}
	    }
	}
//	
//	public void run() {
//		int cnt = 0;
//		while (true) {
//			if(cnt == 20) {
//				break;
//			}
//			System.out.print("");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//			}
//			cnt++;
//		}
//		System.out.println();
//	}
	
}