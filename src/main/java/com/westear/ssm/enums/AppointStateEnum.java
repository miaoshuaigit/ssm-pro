package com.westear.ssm.enums;

public enum AppointStateEnum {
	
	//所有实例必须在枚举类的第一行显式列出
	SUCCESS(1, "预约成功"), NO_NUMBER(0, "库存不足"), REPEAT_APPOINT(-1, "重复预约"), INNER_ERROR(-2, "系统异常");

	private int state;

	private String stateInfo;

	//枚举类的构造器只能使用private访问控制符
	private AppointStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public static AppointStateEnum stateOf(int index) {
		for (AppointStateEnum state : values()) {	//values()可以遍历所有枚举值
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}
}
