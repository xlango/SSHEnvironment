package com.jkx.liqian.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jkx.liqian.entity.User;

public class TestCase {

	ApplicationContext ctx;
	{
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
	}
	@Test
	public void testSession() {
		SessionFactory sessionFactory=(SessionFactory)ctx.getBean("sessionFactory");
		Session session =sessionFactory.openSession();
		Transaction tx=session.beginTransaction();//¿ªÆôÊÂÎñ
		session.save(new User("121","121","121","121","121"));
		tx.commit();
		session.close();
	}
}
