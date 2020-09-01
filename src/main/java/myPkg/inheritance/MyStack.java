/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPkg.inheritance;

import java.util.ArrayList;

/**
 *
 * @author Marc
 */
public class MyStack<E> extends ArrayList<E> {

	public boolean isEmpty() {
		return size() == 0;
	}

	public int getSize() {
		return size();
	}

	public E peek() {
		return get(size() - 1);
	}

	public E pop() {
		return remove(size() - 1);
	}

	public void push(E element) {
		add(element);
	}
}


