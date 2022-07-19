package com.yyz.dao;

import com.yyz.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {

    //@Insert("insert into tbl_book values(null,#{type},#{name},#{description})")
    @Insert("insert into tbl_book(type,name,description) values(#{type},#{name},#{description})")
    public int save(Book book); //public 冗余

    @Update("update tbl_book set type=#{type},name=#{name},description=#{description} where id=#{id}")
     int update(Book book);

    @Delete("delete from tbl_book where id=#{id}")
     int delete(int id);

    @Select("select * from tbl_book")
     List<Book> getAll();

    @Select("select * from tbl_book where id=#{id}")
     Book getById(int id);
}
