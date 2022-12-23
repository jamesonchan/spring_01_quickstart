package org.example;

import org.example.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceUser {
    public static void main(String[] args) {
//        UserDaoFactory userDaoFactory = new UserDaoFactory();
//        UserDao userDao = userDaoFactory.getUserDao();
//        userDao.save();
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) ctx.getBean("userDaoBean");
        userDao.save();
    }
}
