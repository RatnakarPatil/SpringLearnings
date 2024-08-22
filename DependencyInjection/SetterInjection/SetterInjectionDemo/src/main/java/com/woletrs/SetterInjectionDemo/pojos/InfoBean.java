package com.woletrs.SetterInjectionDemo.pojos;

import java.util.*;

public class InfoBean {

	private String name;
	private String msg;
	private Map<String, String> frameWorks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, String> getFrameWorks() {
		return frameWorks;
	}

	public void setFrameWorks(Map<String, String> frameWorks) {
		this.frameWorks = frameWorks;
	}

	public void display() {
		System.out.println("Hi " + name + ", " + msg);
		System.out.println("Framework Names: Description");
		for (Map.Entry<String, String> entry : frameWorks.entrySet())
			System.out.println(entry.getKey() + ": " + entry.getValue());
	}
}

