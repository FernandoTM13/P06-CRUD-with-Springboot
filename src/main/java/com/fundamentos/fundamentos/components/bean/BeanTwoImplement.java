package com.fundamentos.fundamentos.components.bean;

public class BeanTwoImplement implements beanDependency{

	@Override
	public void print() {
		System.out.println("Saludo desde el segundo Bean");
	}

}
