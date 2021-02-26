package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the numbers of shapes: ");
		int numShape = input.nextInt();
		List<Shape> list = new ArrayList<>();

		for (int i = 1; i <= numShape; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.println("Retangle or Circle (r/c)? ");
			char retangleOurCircle = input.next().charAt(0);
			System.out.println("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(input.next());

			if (retangleOurCircle == 'r') {
				System.out.print("Whidth: ");
				double whidth = input.nextDouble();

				System.out.print("Height: ");
				double height = input.nextDouble();

				Shape shape = new Rectangle(color, whidth, height);
				list.add(shape);

			}else {
				System.out.print("Radios: ");
				double radios = input.nextDouble();
				Shape shape = new Circle(color, radios);
				list.add(shape);
			}

		}
		
		System.out.println("SHAPE AREAS: ");
		for(Shape x:list) {
			System.out.println(String.format("%.2f",x.area()));
			
		}

	}

}
