package com.softtron.pinmaoserver.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;


public class ResultUtil {
	private Map<String, String> map;
	public Map<String, String> getMap() {
		map = new HashMap<>();
		map.put("message", "操作成功");
		map.put("code", "200");
		return map;
	}

}
