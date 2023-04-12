package test1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {

		// 로또~
		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			int luckyNum = (int) (Math.random() * 9) + 1;
			arr[i] = luckyNum;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}

		}
		for (int i = 0; i < 3; i++) {
			System.out.print(arr[i]);
		}

		Scanner input = new Scanner(System.in);
		String ball = new String();
		System.out.print("숫자를 입력하세요 : ");
		ball = input.next();

		//ball = ball.split();

		input.close(); // 리소스, 메모리 관리를 위해 해줘야 함.

	}
}
