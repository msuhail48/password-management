package com.jsp.pms.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.pms.entity.AppUserDetails;

@Repository
public class AppUserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public AppUserDAO() {
		System.out.println(this.getClass().getSimpleName() + " created");
	}

	public void saveUserData(AppUserDetails appUserDetails) {
		Session session = sessionFactory.openSession();
		try {
			Transaction transaction = session.beginTransaction();
			session.save(appUserDetails);
			transaction.commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
	}

	public List<AppUserDetails> getAppdetailsByUserId(Long id) {
		Session session = sessionFactory.openSession();
		String hql = " from AppUserDetails where register.id=:i";
		Query query = session.createQuery(hql);
		query.setParameter("i", id);
		List<AppUserDetails> list = query.list();
		return list;
	}

}
