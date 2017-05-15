package com.unico.persistence;

import java.util.List;

import org.hibernate.Session;

import com.unico.common.Request;

public class RequestUtil {

	public static void saveOrUpdate(Request request) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		session.saveOrUpdate(request);
		session.getTransaction().commit();

	}

	public static void delete(Request request) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		session.delete(request);
		session.getTransaction().commit();

	}

	public static List<Request> getAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();

		return session.createCriteria(Request.class).list();

	}

	public static Request getOldestUnprocessedRequest() {
		Session session = HibernateUtil.getSessionFactory().openSession();

		return (Request) session.createCriteria(Request.class).list().get(0);
	}

}
