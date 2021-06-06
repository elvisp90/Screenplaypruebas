package com.sophossolutions.enums;

public class MessageLog {
	
	// MSG_INFO_PRICE("precio ----------------------::::: %s");
	
	private static String msg;
	private MessageLog(String msg) {
		MessageLog.msg = msg;
	}

	public static String getMsg() {
		return msg;
	}
}
