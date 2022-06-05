package com.fundamentos.fundamentos.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fundamentos.fundamentos.components.bean.BeanDependencyDependency;
import com.fundamentos.fundamentos.components.bean.BeanDependencyDependencyD;
import com.fundamentos.fundamentos.components.bean.BeanTwoImplement;
import com.fundamentos.fundamentos.components.bean.beanDependency;
import com.fundamentos.fundamentos.components.bean.beanDependency2;
import com.fundamentos.fundamentos.components.bean.beanOperationImplement;

@Configuration
public class configurationBean {
	
	@Bean
	public beanDependency beanOperation() {
		return new BeanTwoImplement();
	}
	
	@Bean
	public beanDependency2 beanOperation2() {
		return new beanOperationImplement();
	}

	@Bean
	public BeanDependencyDependencyD beanOperationDependenciesssss(beanDependency2 beanDependency2) {
		return new BeanDependencyDependency(beanDependency2);
	}
	
	
}
