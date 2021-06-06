package com.sophosolutions.models;

public class ResponseComment {

	private Integer code;
	private Object meta;
	private Comment data;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Object getMeta() {
		return meta;
	}

	public void setMeta(Object meta) {
		this.meta = meta;
	}

	public Comment getData() {
		return data;
	}

	public void setData(Comment data) {
		this.data = data;
	}

}
