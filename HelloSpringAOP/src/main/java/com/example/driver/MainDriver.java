package com.example.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.myapp.MyAppProxy;

public class MainDriver {

	public static void main(String[] args) {

		ApplicationContext appCon = new ClassPathXmlApplicationContext("Josh.xml");
		MyAppProxy app = appCon.getBean("appProxy", MyAppProxy.class);
		
		app.drawCartoon();
		app.sculptPottery();
		app.drawNature();
		app.drawMiniCartoon(2);
	}

}
