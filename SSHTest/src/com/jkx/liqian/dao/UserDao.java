package com.jkx.liqian.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jkx.liqian.entity.User;

public class UserDao {
	private Session session;
	SessionFactory sessionFactory;
	Transaction tx;	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}

 public boolean Login(User user) {
        try {
        	session =sessionFactory.openSession();
            String hql = "select username,password from User where username=?and password=?";
            Query query = session.createQuery(hql);
            query.setParameter(0, user.getUsername());
            query.setParameter(1, user.getPassword());
            List list = query.list();
            tx=session.beginTransaction();
            if (!list.isEmpty())
                return true;
            else
                return false;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }
	public void saveUser(User user) {
		
		session=sessionFactory.openSession();
		tx=session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
	}
	public List<User> listUsers(){
		session =sessionFactory.openSession();
		List<User> users=session.createQuery("from User").list();
		session.close();
		return users;
	}


	
}
