package common;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor{

	/***
	Step 1: implement BeanPostProcessor
	Step 2: define the bean in the configuration file. i.e. Bean has to be declared
	This will run after for all the beans
	*/
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("In after Bean initialization. Bean Name is:"+ beanName);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("In Before Bean initialization. Bean Name is:"+ beanName);
		return bean;
	}

}
