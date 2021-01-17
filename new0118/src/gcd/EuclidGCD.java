package gcd;
import java.util.Scanner;

public class EuclidGCD {

	static int gcd(int x, int y) {
		if(y==0) return x;
		else return gcd(y,x%y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("두 정수의 최대공약수를 구합니다.");
		
		System.out.print("plz input x : ");
		int x=sc.nextInt();
		System.out.print("plz input y : ");
		int y=sc.nextInt();
		
		System.out.println("gcd is "+gcd(x,y));
		
	}

}
