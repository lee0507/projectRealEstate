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
		BufferedReader reader = new BufferedReader(new FileReader("D:\\7777\\�һ���ν����������_���� ������� ��Ȳ_20151231.csv"));
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
				if(rEst[i][j].contains("������")) {
					lee[1] = kwcnt++;
					
				}
			}
		}
		int kkcnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("��⵵")) {
					lee[2] = kkcnt++;
				}
			}
		}
		int kncnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("��󳲵�")) {
					lee[3] = kncnt++;
				}
			}
		}
		int kbcnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("���ϵ�")) {
					lee[4] = kbcnt++;
				}
			}
		}
		int kjcnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("���ֱ�����")) {
					lee[5] = kjcnt++;
				}
			}
		}
		int tkcnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("�뱸������")) {
					lee[6] = tkcnt++;
				}
			}
		}
		int djcnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("����������")) {
					lee[7] = djcnt++;
				}
			}
		}
		int pkcnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("�λ걤����")) {
					lee[8] = pkcnt++;
				}
			}
		}
		int sucnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("����Ư����")) {
					lee[9] = sucnt++;
				}
			}
		}
		int sjcnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("����Ư����")) {
					lee[10] = sjcnt++;
				}
			}
		}
		int uscnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("��걤����")) {
					lee[11] = uscnt++;
				}
			}
		}
		int iccnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("��õ������")) {
					lee[12] = iccnt++;
				}
			}
		}
		int jncnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("���󳲵�")) {
					lee[13] = jncnt++;
				}
			}
		}
		int jbcnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("����ϵ�")) {
					lee[14] = jbcnt++;
				}
			}
		}
		int jjcnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("���ֵ�")) {
					lee[15] = jjcnt++;
				}
			}
		}
		int cncnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("��û����")) {
					lee[16] = cncnt++;
				}
			}
		}
		int cbcnt = 0;
		for(int i = 0; i < rEst.length; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				if(rEst[i][j].contains("��û�ϵ�")) {
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
		System.out.println("���� ������� ��ü ������ " + sum + "��");
		System.out.println("���� ������� �õ��� ��� ������ " + sum / 17 + "��");
		System.out.println("�õ��� ���� ������ ���� ���� ���� ���尹�� " + min + "��");
		System.out.println("�õ��� ���� ������ ���� ���� ���� ���尹�� " + max + "��");

	}
}

