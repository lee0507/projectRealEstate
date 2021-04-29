package projectRealEstate;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class finaltest1 {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		extracted();
		
		}

	private static void extracted() throws FileNotFoundException, IOException {
		ArrayList<String> rEstate = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader("D:\\7777\\소상공인시장진흥공단_전국 전통시장 현황_20151231.csv"));
		String line;
		int cnt = 0;
		while((line = reader.readLine()) != null) {
			if (cnt >= 1) {
				rEstate.add(line);
			}
			cnt++;
		}
		
		String[][] rEst = new String[rEstate.size()][];
		
		for (int i = 0; i<rEstate.size(); i++) {
			rEst[i] = rEstate.get(i).split(",");
		}
		int[] lee = new int[17];
		
		int kwcnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("강원도")) {
					lee[1] = kwcnt++;
					
				}
			}
		}
		int kkcnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("경기도")) {
					lee[2] = kkcnt++;
				}
			}
		}
		int kncnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("경상남도")) {
					lee[3] = kncnt++;
				}
			}
		}
		int kbcnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("경상북도")) {
					lee[4] = kbcnt++;
				}
			}
		}
		int kjcnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("광주광역시")) {
					lee[5] = kjcnt++;
				}
			}
		}
		int tkcnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("대구광역시")) {
					lee[6] = tkcnt++;
				}
			}
		}
		int djcnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("대전광역시")) {
					lee[7] = djcnt++;
				}
			}
		}
		int pkcnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("부산광역시")) {
					lee[8] = pkcnt++;
				}
			}
		}
		int sucnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("서울특별시")) {
					lee[9] = sucnt++;
				}
			}
		}
		int sjcnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("세종특별시")) {
					lee[10] = sjcnt++;
				}
			}
		}
		int uscnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("울산광역시")) {
					lee[11] = uscnt++;
				}
			}
		}
		int iccnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("인천광역시")) {
					lee[12] = iccnt++;
				}
			}
		}
		int jncnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("전라남도")) {
					lee[13] = jncnt++;
				}
			}
		}
		int jbcnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("전라북도")) {
					lee[14] = jbcnt++;
				}
			}
		}
		int jjcnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("제주도")) {
					lee[15] = jjcnt++;
				}
			}
		}
		int cncnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("충청남도")) {
					lee[16] = cncnt++;
				}
			}
		}
		int cbcnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("충청북도")) {
					lee[0] = cbcnt++;
				}
			}
		}
		int sum = 0;
		for(int i = 0; i < rEst.length; i++) {
			sum = sum + Integer.parseInt(rEst[i][5]);
			}

		int min = lee[0];
		int max = lee[0];
		for(int i = 1; i < lee.length; i++) {
			if(min < lee[i]) {
				min = lee[i];
			}
		}
		
		for(int i = 1; i < lee.length; i++) {
			if(max > lee[i]) {
				max = lee[i];
			}
		}
		System.out.println("전국 전통시장 전체 점포수 " + sum + "개");
		System.out.println("전국 전통시장 시도별 평균 점포수 " + sum / 17 + "개");
		System.out.println("시도별 시장 점포가 가장 많은 곳의 시장갯수 " + min + "개");
		System.out.println("시도별 시장 점포가 가장 적은 곳의 시장갯수 " + max + "개");

	}
}

