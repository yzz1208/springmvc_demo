package com.yyz.service.impl;

import com.yyz.controller.Code;
import com.yyz.dao.BookDao;
import com.yyz.domain.Book;
import com.yyz.exception.BusinessException;
import com.yyz.exception.SystemException;
import com.yyz.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {

        return bookDao.save(book)>0;
    }

    @Override
    public boolean update(Book book) {

        return bookDao.update(book)>0;
    }

    @Override
    public boolean delete(Integer id) {

        return bookDao.delete(id)>0;
    }

    @Override
    public List<Book> getAll() {

        return bookDao.getAll();
    }

    @Override
    public Book getById(Integer id) {

        if(id==520){
            throw new BusinessException(Code.BUSINESS_ERR,"妈了个巴子");
        }
        //将可能出现的异常进行包装，转为自定义异常
//        try{
//            int i=1/0;
//        }catch (ArithmeticException e){
//            throw  new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器超时",e);
//        }
        return bookDao.getById(id);
    }
}
