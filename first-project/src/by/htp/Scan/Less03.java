package by.htp.Scan;

import java.util.Scanner;

public class Less03 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double sqr;
		double value1;
		double value2;
		double temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите a: ");
		while(!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Введите a: ");
		}
		
		a = sc.nextDouble();

		System.out.print("Введите b: ");
		while(!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Введите b: ");
		}
		
		b = sc.nextDouble();
		
		System.out.print("Введите c: ");
		while(!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Введите c: ");
		}
		
		c = sc.nextDouble();
		
		/////////////////////////////////////////////////
		
		if((2 * a) == 0) {
			System.out.print("Знаменатель равен нулю");   //   если знаменатель  равен нулю
			return;			
		}
		
		sqr = Math.pow(b, 2) + (4 * a * c);   //   вычитаем корень
		
		value1 = (b + Math.sqrt(sqr)) / (2 * a);   // считаем первое выражение
		
		value2 = (Math.pow(a, 3) * c) + b;   //   считаем второе выражение
		
		temp = value1 - value2;
		
		System.out.print("Ответ: " + temp);
	}

}
