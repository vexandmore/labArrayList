/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPkg.casting;
import java.util.*;
/**
 *
 * @author Marc-Scattolin
 */
public class Casting {

    public static void main(String[] args) {  
		ArrayList<Object> list = new ArrayList<>();
		list.add(new Circle(2.5));
		list.add(new Date());
		list.add("Hello");
		list.add(new Rectangle(2.0,3.2));
		
		for (Object obj: list) {
			if (obj instanceof Circle) {
				Circle circle = (Circle) obj;
				System.out.println("Radius: " + circle.getRadius());
			} else if (obj instanceof Date) {
				Date date = (Date) obj;
				System.out.println("Date: " + date.toString());
			} else if (obj instanceof Rectangle) {
				Rectangle rectangle = (Rectangle) obj;
				System.out.println("Height: " + rectangle.getHeight());
			} else if (obj instanceof String) {
				String str = (String) obj;
				System.out.println(str);
			}
		}
    }
}