package com.unico.persistence;

import java.util.List;

import org.hibernate.Session;

import com.unico.common.Gcd;

public class GcdUtil {

	public static void save(Gcd gcd) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		try {
			session.beginTransaction();
			session.save(gcd);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
		}
	}

	public static List<Gcd> getAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();

		return session.createCriteria(Gcd.class).list();
	}

}
