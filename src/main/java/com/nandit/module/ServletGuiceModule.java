package com.nandit.module;

import com.google.inject.servlet.ServletModule;
import com.nandit.servlet.Servlet1;
import com.nandit.servlet.Servlet2;

public class ServletGuiceModule extends ServletModule {
	@Override
	protected void configureServlets() {
		// TODO Auto-generated method stub
		serve("/").with(Servlet1.class);
//		serve("index.html").with(Servlet2.class);
		
	}
}
