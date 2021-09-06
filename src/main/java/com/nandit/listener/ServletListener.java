package com.nandit.listener;


import javax.servlet.annotation.WebListener;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.nandit.module.ServletGuiceModule;


@WebListener
public class ServletListener extends GuiceServletContextListener {

	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new ServletGuiceModule());
	}

}

