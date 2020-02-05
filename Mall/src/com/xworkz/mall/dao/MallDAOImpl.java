package com.xworkz.mall.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.mall.entity.MallEntity;

public class MallDAOImpl implements MallDAO {

	public MallDAOImpl() {
		System.out.println("Created\t" + this.getClass().getSimpleName());
	}

	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		System.out.println("invoked session factory" + factory);
		this.factory = factory;
	}

	@Override
	public MallEntity save(MallEntity entity) {
		Session session = factory.openSession();
		try {
			System.out.println("Transaction started");
			session.beginTransaction();
			session.save(entity);
			System.out.println("Data is " + entity);
			session.getTransaction().commit();
			System.out.println("transaction commited");

		} catch (HibernateException she) {
			she.printStackTrace();
			System.out.println("Exception in save operation");
		} finally {
			// if(Objects.nonNull(session))
			session.close();
		}
		return null;
	}
}
