package com.fundamentos.fundamentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fundamentos.fundamentos.components.ComponenteDependency;
import com.fundamentos.fundamentos.components.bean.BeanDependencyDependencyD;
import com.fundamentos.fundamentos.components.bean.beanDependency;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	ComponenteDependency componenteDependency;
	private beanDependency beanDependency;
	private BeanDependencyDependencyD beanDependencyDependencyD;
	
	
	public DemoApplication(@Qualifier("componenteImplementTwo") ComponenteDependency componenteDependency, 
	beanDependency beanDependency, BeanDependencyDependencyD beanDependencyDependencyD) {
		
		this.componenteDependency = componenteDependency;
		this.beanDependency = beanDependency;
		this.beanDependencyDependencyD = beanDependencyDependencyD;
		
	}
	
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



	@Override
	public void run(String... args)  {
		componenteDependency.saludar();		
		beanDependency.print();
		beanDependencyDependencyD.printDependency();
	}
	
	

}
