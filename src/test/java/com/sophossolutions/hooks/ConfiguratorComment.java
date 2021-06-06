package com.sophossolutions.hooks;

import java.util.Map;

import com.sophosolutions.models.Comment;

import io.cucumber.java.DataTableType;

public class ConfiguratorComment {

	@DataTableType
	public Comment transformToComment(Map<String, String> entry) {
		return new Comment(Integer.parseInt(entry.get("post_id")), entry.get("name"), entry.get("email"),
				entry.get("body"));
	}
}
