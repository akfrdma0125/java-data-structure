package hanoi;

import java.util.Scanner;

public class Hanoi {

	static void move(int no, int x, int y) {
		if(no>1) move(no-1,x,6-x-y);
		
		System.out.println("¿ø¹Ý["+no+"]À» "+x+"±âµÕ¿¡¼­ "+y+"±âµÕÀ¸·Î ¿Å±è");
		
		if(no>1) move(no-1,6-x-y,y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("hanoi");
		
		System.out.print("plate number : ");
		int PN=sc.nextInt();
		
		move(PN,1,3);
	}

}
