package com.bl.Annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Scanner;



@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface  VerifyNumber
{
	int size =10;
	String message() default "Must be greater than {value}";
}


public class PhoneNumberValidator implements VerifyNumber
{

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String message() {
		// TODO Auto-generated method stub
		return message();
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the valid number");
		String sa = sc.next();
	}
}
