package com.fundamentos.fundamentos.components.bean;

public class BeanOneImplement implements beanDependency {

	@Override
	public void print() {
		System.out.println("Print desde el bean n1");
	}

}
