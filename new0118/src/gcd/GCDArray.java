package gcd;

import java.util.Scanner;

public class GCDArray {

	static int gcd(int x, int y) {
		if(y==0) return x;
		else return gcd(y,x%y);
	}
	
	static int gcdArray(int[] a) {
		int val=gcd(a[0],a[1]);
		int tmp=0;
		int len=a.length;
		for(int i=2;i<len;i++) {
			tmp=val;
			val=gcd(tmp,a[i]);
		}
		return val;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int[] gcdA= {4,8,12,40,2};
		
		System.out.println(gcdArray(gcdA));
	}

}
