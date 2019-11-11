package com.softtron.pinmaoserver.configs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.softtron.pinmaoorder.services.OrderService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { Init.class })
public class SpringbootTest {
//	@Autowired
//	DBUtil DBUtil;
//	@Autowired
//	String m;
//	@Autowired
//    OrderDao orderDao;
	@Autowired
	OrderService orderService;
	@Test
	public void test() {
//	     System.out.println(DBUtil);
//		Map map = new HashMap<>();
//		map.put("orderNum", "777");
//		orderDao.insert(map);
		orderService.insert();
	}

}
