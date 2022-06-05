package com.fundamentos.fundamentos.components.bean;

public class BeanDependencyDependency implements BeanDependencyDependencyD{
	
	beanDependency2 beanDependency2;
	
	public BeanDependencyDependency(beanDependency2 beanDependency2) {
		this.beanDependency2 = beanDependency2;
	}

	@Override
	public void printDependency() {
		int num = 10;
		System.out.println(beanDependency2.suma(num));
		System.out.println("Eyes without a face");
		
	}
	

}
