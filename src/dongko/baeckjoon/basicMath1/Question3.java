package dongko.baeckjoon.basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *�̿� ���� ������ �м����� 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> �� 
 *�� ���� ������� ������ ���ʴ�� 1��, 2��, 3��, 4��, 5��, �� �м���� ����.
 *X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ� */
public class Question3 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
//			int n = Integer.parseInt(br.readLine());
			
			int pointer = 1;
//			for(int row = 1; row< 100; row++) {
//				
//				for(int col= 1; col< 100; col++) {
//					System.out.print(row + "/" + col + " ");
//				}
//				System.out.println();
//			}
			int cnt = 1;
			int row = 1, col = 2;
			int rowP = 1, colP = 1;
			boolean asc = false;
			while(cnt < 100) {
				System.out.println();
				System.out.println("row : " + row);
				System.out.println("col : " + col);
				rowP = row;
				colP = col;
//				if(col == 1) {
//					
//					//�������� �ϴ� ��� 
//					if(rowP == 1) {
//						colP = col;
//						row++;
//						col--;
//						asc = false;
//					//�����ΰ��� �ϴ� ���
//					} else {
//						row--;
//						col++;
//					}
//				}
//				
//				if(row == 1) {
//					
//					//�������� �ϴ� ���
//					if(colP > col) {
//						rowP = row;
//						row++;
//					//�밢�� �ö󰡾� �ϴ� ���
//					} else {
//						rowP = row;
//						colP = col;
//						row--;
//						col++;
//						asc = true;
//					}
//					
//				}
				
				
				if((row != 1) && (col != 1)) {
					if(asc) {
						row--;
						col++;
					} else {
						row++;
						col--;
					}
				} else {
					if(col == 1) {
						
						//�������� �ϴ� ��� 
						if(rowP == 1) {
							colP = col;
							row++;
							col--;
							asc = false;
						//�����ΰ��� �ϴ� ���
						} else {
							row--;
							col++;
						}
					}
					
					if(row == 1) {
						
						//�������� �ϴ� ���
						if(colP > col) {
							rowP = row;
							row++;
						//�밢�� �ö󰡾� �ϴ� ���
						} else {
							rowP = row;
							colP = col;
							row--;
							col++;
							asc = true;
						}
						
					}
				}
				cnt++;
				System.out.print(row + "/" + col + " " + cnt);
				if(col == 99) System.out.println();
			}
			
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
