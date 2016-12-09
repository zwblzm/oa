package cn.aurora.oa.base;

import java.lang.reflect.ParameterizedType;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BaseAction<T> extends ActionSupport implements ModelDriven<T>{
	
	protected T model;
	
	public BaseAction() {
		
		
		ParameterizedType type1 = (ParameterizedType) this.getClass().getGenericSuperclass();
		Class<T> clazz = (Class<T>) type1.getActualTypeArguments()[0];
		try {
			model=clazz.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public T getModel() {
		// TODO Auto-generated method stub
		return model;
	}
	
	
	public void setValueStack(String name, Object obj) {
		ActionContext.getContext().getValueStack().set(name, obj);
		
		
	}
	
	
	

}
