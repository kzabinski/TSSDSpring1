package com.kzabinski.hello;

public class Greeting {

	private final long id;
	private final String content;
	public String I_do_not_know;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
