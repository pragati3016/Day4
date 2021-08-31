package day4;

import java.util.Scanner;

public class CalcArea extends Shape{
	
	Scanner sc = new Scanner(System.in);
	
	void Area()
	{
		rectangleArea();
		squareArea();
		circleArea();
	}
	
	void rectangleArea() {
		
		int l,b;
		System.out.println("Enter the Length :");
		l = sc.nextInt();
		System.out.println("Enter the Breadth :");
		b = sc.nextInt();
		System.out.println("Area of Reactangle : "+(l*b));
	}
	
	void squareArea() 
	{
		int s;
		System.out.println("Enter the Length of side of Square :");
		s = sc.nextInt();
		System.out.println("Area of Square : " +(s*s));
	}
	
	void circleArea()
	{
		int r;
		System.out.println("Enter the Length of Radius :");
		r = sc.nextInt();
		System.out.println("Area of circle : " +(3.14*r*r));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			CalcArea ca=new CalcArea();
			ca.Area();
	}

}
