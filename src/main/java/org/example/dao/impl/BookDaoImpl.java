package org.example.dao.impl;

import org.example.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private int connectionNum;
    private String databaseName;

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    @Override
    public void save() {
        System.out.println("book dao save ..." + databaseName + ", " + connectionNum);
    }

    public void init() {
        System.out.println("init ...");
    }

    public void destroy() {
        System.out.println("destroy ...");
    }
}
