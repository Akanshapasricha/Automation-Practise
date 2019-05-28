package com.utailerProject.pages;

import org.openqa.selenium.support.PageFactory;

import com.utailerProject.baseClass.BaseLibs;

public class MenPages extends BaseLibs {
	public MenPages()
	{
		PageFactory.initElements(driver, this);
	}
	
}
