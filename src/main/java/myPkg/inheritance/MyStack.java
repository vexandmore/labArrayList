/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPkg.inheritance;

import java.util.ArrayList;

/**
 *
 * @author Marc-Scattolin
 */
public class MyStack extends ArrayList {
	//returns true if the stack is empty
	public boolean isEmpty() {
		return size() == 0;
	}
	
	//get the number of elements in the stack
	public int getSize() {
		return size();
	}
	
	//Get the object at the top of the stack without removing it
	public Object peek() {
		return get(size() - 1);
	}
	
	//remove and returns the element at the top of the stack
	public Object pop() {
		return remove(size() - 1);
	}
	
	//add an element to the stack and return it
	public Object push(Object element) {
		add(element);
		return element;
	}
}


