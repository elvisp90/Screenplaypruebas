package com.sophosolutions.models;

public class Comment {

	private Integer id;
	private Integer post_id;
	private String name;
	private String email;
	private String body;
	private String updateAt;
	private String createAt;

	public Comment(Integer post_id, String name, String email, String body) {
		this.post_id = post_id;
		this.name = name;
		this.email = email;
		this.body = body;
	}

	@Override
	public String toString() {
		return "{" + "\"post_id\":" + post_id + "," + "\"name\":" + "\"" + name + "\"" + "," + "\"email\":" + "\""
				+ email + "\"" + "," + "\"body\":" + "\"" + body + "\"" + "}";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPostId() {
		return post_id;
	}

	public void setPostId(Integer postId) {
		this.post_id = postId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}

	public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}

}
