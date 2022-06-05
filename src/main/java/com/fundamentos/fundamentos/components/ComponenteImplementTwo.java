package com.fundamentos.fundamentos.components;

import org.springframework.stereotype.Component;

@Component
public class ComponenteImplementTwo implements ComponenteDependency{

	@Override
	public void saludar() {
		System.out.println("Hola desde el segundo componente");
	}
	
	
}
