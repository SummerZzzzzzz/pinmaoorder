package com.softtron.pinmaoorder.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.softtron.pinmaoorder.domains.TOrder;
import com.softtron.pinmaoorder.services.OrderService;
import com.softtron.pinmaoserver.utils.MessageUtil;
import com.softtron.pinmaoserver.utils.ResultUtil;

@RestController
public class RouterController extends CommonController{
	@Autowired
	OrderService orderService;
	@RequestMapping(path="index")
    public Map index(String phone) {
//		Map map = resultUtil.getMap();
//		Map map = new HashMap();
//		TOrder order = new TOrder();
//		order.setOrderNum(UUID.randomUUID().toString());
//		map.put("order", order);
		//orderService.insert();
		//resultMap.put("state", "sending");
		MessageUtil.addMessage(phone);
    	return resultMap;
    }
}
