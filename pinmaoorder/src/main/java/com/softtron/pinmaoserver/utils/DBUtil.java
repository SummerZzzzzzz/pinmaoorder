package com.softtron.pinmaoserver.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Email;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import com.softtron.pinmaoorder.domains.TOrder;

@Component
@Validated
//@ConfigurationProperties(prefix="mysql")
//@Conditional(value={WindowsConditional.class})
@ConditionalOnClass(name= {"com.softtron.pinmaoorder.domains.TOrder2"})
public class DBUtil {
	@Value("${mybatis.a}")
	private String userName;
	//@Value("#{10*10}")
	private int count;
//	@Value("${mysql.password}")
	private String password;
//	@Value("${mysql.urls}")
	private String[] urls;
//	@Value("${mysql.list}")
	private List<Object> list;
	private Map<String,Object> map;
	

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String[] getUrls() {
		return urls;
	}

	public void setUrls(String[] urls) {
		this.urls = urls;
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "DBUtil [userName=" + userName + ", count=" + count + ", password=" + password + ", urls="
				+ Arrays.toString(urls) + ", list=" + list + ", map=" + map + "]";
	}

}
