package lenshu3;

public class Method {
	void method(int a){
		int x = 0;
		int y = 0;
		int z = 0;
		int m = 0;
		for(int i = 1; i <= a; i++) {
			System.out.print(i+".");
			
			if(i%8 == 0) {
				System.out.print("(8)호랑이");
				x++;
			}if(i%5 == 0) {
				System.out.print("(5)사자");
				y++;
			}if(i%4 == 0) {
				System.out.print("(4)강아지");
				z++;
			}if(i%3 == 0) {
				System.out.print("(3)원숭이");
				m++;
			} 
			System.out.println();
		}
		System.out.println("호랑이 출력수: "+x);
		System.out.println("사자 출력수: "+y);
		System.out.println("강아지 출력수: "+z);
		System.out.println("원숭이 출력수: "+m);
	}
	

}
