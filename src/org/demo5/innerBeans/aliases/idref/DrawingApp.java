package org.demo5.innerBeans.aliases.idref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String [] args) {
		
		/*Inner beans concept
		 * Suppose any bean is specific for a object, and not to be used somewhere else
		 * then we can define that bean as an inner bean
		 * say, pointB_demo5 and pointC_demo5 are required only one for one object.
		 * and not going to be used anywhere else. No separate definition required.
		 * */
		
		
		/*Alias is a way to give different names to a same bean
		 * 
		 * */
		
		/* ref can point to name,id or alias.if you want to restrict to refer only id's use idref 
			idref is used to pass the name (identifier) of a bean (that is, a String).
			<idref bean="pointA"> is exactly the same as just the string value pointA,
		 	except that Spring will complain if such a bean is not defined-
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		//Triangle triangle = (Triangle)context.getBean("triangle_demo5");
		Triangle triangle = (Triangle)context.getBean("triangle_demo5_alias");
		
		triangle.draw();
		
	}
}
