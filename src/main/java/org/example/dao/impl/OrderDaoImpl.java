package org.example.dao.impl;

import org.example.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {
    @Override
    public void save() {
        System.out.println("Order dao saving ...");
    }
}
