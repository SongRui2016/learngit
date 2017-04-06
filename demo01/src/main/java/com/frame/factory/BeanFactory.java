package com.frame.factory;
/**
 * 产品工厂
 * 负责生产产品
 */
public class BeanFactory {
    
	public static Object getBean(String msg){
		Object obj = null;
		if(msg != null && !msg.equals("")){
			try {
				Class<?> cla = Class.forName(msg);
				obj = cla.newInstance();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return obj;
		
	}
}
