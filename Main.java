package lenshu3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1. 조건문을 활용해서 입력한 수만큼 값을 반복해서 출력할 것
 * 2. 어떤 수를 3, 4, 5, 8로 나누었을 때 
 *    나누어 떨어지는 수에 특정한 동물의 이름 부여
 * 3. 동시에 나누어 떨어지는 숫자가 있다면 동물이름이 연속해서
 *    나열 되도록 할 것
 * 4. 하단에 출력된 동물의 이름을 count 해서 횟수를 나열하기
 * 
 * + 구조화 시킬것
 * 
 * -> 1, 2 는 넘어가고 3,4,5에 동물 이름 부여
 * -> 8은 두 개의 동물 이름을 출력
 * 
 * -> 매개변수를 입력값으로 받고 return은 void인 메서드
 * */

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Method m = new Method();
		int a = Integer.parseInt(br.readLine());
		m.method(a);

	}

}
