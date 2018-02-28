package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zmq on 2018/1/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryImpl;

    @Test
    public void findOne() throws Exception {
        ProductCategory productCategory = categoryImpl.findOne(1);
        Assert.assertNotNull(productCategory);
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> categories = categoryImpl.findAll();
        Assert.assertNotEquals(0,categories.size());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {

    }

    @Test
    public void save() throws Exception {
        ProductCategory productCategory = new ProductCategory("女生最爱",1);
        ProductCategory result = categoryImpl.save(productCategory);
        Assert.assertNotNull(result);
    }

}