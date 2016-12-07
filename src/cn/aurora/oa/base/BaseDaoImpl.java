package cn.aurora.oa.base;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T>{
	private Class<T> clazz;
	public BaseDaoImpl() {
		
		ParameterizedType type1 = (ParameterizedType) this.getClass().getGenericSuperclass();
		clazz = (Class<T>) type1.getActualTypeArguments()[0];
		
		
		
	}
	
	@Resource(name="sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory) {
		
		this.setSessionFactory(sessionFactory);
		
	}
	
	
	

	@Override
	public void addModel(T model) {
		
		this.getHibernateTemplate().save(model);
	}

	@Override
	public void updateModel(T model) {
		
		this.getHibernateTemplate().update(model);
	}

	@Override
	public void deleteModel(T model) {
		
		this.getHibernateTemplate().delete(model);
	}

	@Override
	public T findById(String id) {
		
		return this.getHibernateTemplate().get(clazz, id);
	}

	@Override
	public List<T> findAll() {
		String hql="from "+clazz.getSimpleName();
		return this.getHibernateTemplate().find(hql);
	}

	@Override
	public List<T> findByIds(String[] ids) {
		String hql="from "+clazz.getSimpleName()+" where id in("+ids+")";
		return this.getHibernateTemplate().find(hql, ids);
	}

}
