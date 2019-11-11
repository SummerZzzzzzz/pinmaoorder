package com.softtron.pinmaoorder.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softtron.pinmaoorder.daos.OrderDao;
@Service
public class OrderService {
	@Autowired
    OrderDao orderDao;
//	@Transactional
    public void insert() {
    	Map map1 = new HashMap<>();
		map1.put("orderNum", "888");
		orderDao.insert(map1);
		int i = 1/0;
		Map map2 = new HashMap<>();
		map2.put("orderNum", "999");
		orderDao.insert(map2);
    }
}
