package com.softtron.pinmaoserver.utils;

import java.util.Date;
import java.util.concurrent.LinkedBlockingQueue;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class MessageUtil {
	private static final LinkedBlockingQueue<String> messageQueue = new LinkedBlockingQueue<>();

	/**
	 * 将注册的手机号放入队列中
	 * 
	 * @param phone
	 */
	public static void addMessage(String phone) {
		messageQueue.add(phone);
	}
	@Scheduled(fixedRate=1000)
	public void sendCode() {
		for (int i = 0; i < 100000; i++) {
			String phone = messageQueue.poll();
			if (phone != null) {
				sendCode(phone);//异步执行短信发送...
			} else {
				break;
			}
		}
	}
	@Async
	public void sendCode(String phone) {
		System.out.println("发送短信..." + phone + " " + new Date());
	}

}
