package com.yyz.service;

import com.yyz.domain.Book;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface BookService {

    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 更新
     * @param book
     * @return
     */
    public boolean update(Book book);


    /**
     * 根据id删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 查询所有
     * @return
     */
    public List<Book> getAll();

    /**
     * 根据id查询
     * @return
     */
    public Book getById(Integer id);
}
