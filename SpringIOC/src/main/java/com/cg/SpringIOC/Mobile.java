package com.cg.SpringIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) 
	{
		/*Agenda-Spring IOC
		//1.We should not touch the source code
		//2.This Application should be configurable.
		//hard-coding*/
		/*//for Vi class methods
		Vi a=new Vi();
		a.calling();
		a.data();
		//for Jio class methods
		Jio a1=new Jio();
		a1.calling();
		a1.data();*/
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config loaded.......");
		/*//for vi class
		Vi v=(Vi)a.getBean("vi");
		v.calling();
		v.data();
		
		//for Jio class
		Jio j=(Jio)a.getBean("jio");
		j.calling();
		j.data();*/
		Sim s=a.getBean("sim",Sim.class);
		s.calling();
		s.data();
		
	}

}