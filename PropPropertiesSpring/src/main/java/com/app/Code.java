package com.app;

import java.util.Properties;

public class Code {
	private int cid;
	private String cname;
	private Properties cost;
	public Code() {
		super();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Properties getCost() {
		return cost;
	}
	public void setCost(Properties cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Code [cid=" + cid + ", cname=" + cname + ", cost=" + cost + "]";
	}

}
