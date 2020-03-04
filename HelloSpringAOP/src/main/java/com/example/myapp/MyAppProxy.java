package com.example.myapp;

import org.springframework.stereotype.Component;

//an application is a combination of method calls so we 
//are mocking the methods here

@Component("appProxy")
public class MyAppProxy {

	public int drawCartoon() {
		System.out.println("--- drawing a cartoon! 0_0 ---");
		return 3;
	}
	
	public void drawNature() {
		System.out.println("--- drawing some nature! :) ---");
	}
	
	public void sculptPottery() {
		System.out.println("--- pot sculpting! XD ---");
	}
	
	public int drawMiniCartoon(int a) {
		System.out.println("--- drawing mini cartoons! (╯°Д°）╯︵/ ---");
		return 4;
	}
	
}
