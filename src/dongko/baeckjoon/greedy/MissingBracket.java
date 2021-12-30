package dongko.baeckjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @title 잃어버린 괄호
 * @author dhkim
 * @date 2021. 12. 30.
 * @link https://www.acmicpc.net/problem/1541
 */
public class MissingBracket {

	// 두번째 풀이
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String f = br.readLine();
			String[] arr = f.split("-");
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				String[] pArr = arr[i].split("\\+");
				int tmpSum = 0;
				for (int j = 0; j < pArr.length; j++) {
					if (i == 0)
						tmpSum += Integer.parseInt(pArr[j]);
					else
						tmpSum -= Integer.parseInt(pArr[j]);
				}
				sum += tmpSum;
			}

			System.out.println(sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 첫번째 풀이
	public static void mains(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String f = br.readLine();
			String newF = "";
			if (f.contains("-")) {
				boolean bFlag = false;
				for (int i = 0; i < f.length(); i++) {
					char c = f.charAt(i);
					if (c == 45) {

						if (bFlag == false) {
							newF += c;
							newF += "(";
							bFlag = true;
						} else {
							newF += ")";
							newF += c;
							newF += "(";
							bFlag = true;
						}
					} else {
						newF += c;
					}

					if (i == f.length() - 1 && bFlag == true)
						newF += ")";
				}

			} else {
				newF = f;
			}
			int sum = 0;
			if (newF.contains("-")) {
				for (String str : newF.split("-")) {
					if (str.contains("(")) {
						str = str.replaceAll("\\(", "").replaceAll("\\)", "");
						if (str.contains("+")) {
							for (String n : str.split("\\+")) {
								sum -= Integer.parseInt(n);
							}
						} else {
							sum -= Integer.parseInt(str);
						}
					} else {
						for (String n : str.split("\\+")) {
							sum += Integer.parseInt(n);
						}
					}
				}
			} else {
				for (String str : newF.split("\\+")) {
					sum += Integer.parseInt(str);
				}
			}

			System.out.println(sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
