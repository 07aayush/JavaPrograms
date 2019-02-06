package com.bl.Annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//marker Annotation
//Single value Annotation
//multi valued annotation

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone
{
	String os()default "Symbian";
	int version() default 1;
}
	
@SmartPhone (os="Android",version =8)
class NokiaASeries
{
	String model;
	int size;
	public NokiaASeries(String model, int size) {
		this.model = model;
		this.size = size;
	}
}

public class AnnotationsDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		NokiaASeries obj = new NokiaASeries("fire", 5);
		
		@SuppressWarnings("rawtypes")
		Class c = obj.getClass();
		Annotation an = c.getAnnotation(SmartPhone.class);
		SmartPhone s = (SmartPhone)an;
		System.out.println(s.os() +" "+ s.version());
		
		
	}

}
