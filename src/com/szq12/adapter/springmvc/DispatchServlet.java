package com.szq12.adapter.springmvc;

import java.util.ArrayList;
import java.util.List;

public class DispatchServlet {
	
	public static List<HandlerAdapter> list = new ArrayList<>();
	
	public DispatchServlet() {
		list.add(new AnnotationHandlerAdapter());
		list.add(new HttpHandlerAdapter());
		list.add(new SimpleHandlerAdapter());
	}
	public void doDispatch() {
		
		//AnnotationController controller = new AnnotationController();
		//SimpleController controller = new SimpleController();
		HttpController controller = new HttpController();
		
		HandlerAdapter handlerAdapter = getHandler(controller);
		handlerAdapter.handle(controller);
		
	}
	public HandlerAdapter getHandler(Controller controller) {
		for (HandlerAdapter handlerAdapter : list) {
			if (handlerAdapter.supports(controller)) {
				return handlerAdapter;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		
		new DispatchServlet().doDispatch();
	}
}
