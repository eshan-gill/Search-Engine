package com.uwindsor.acc.searchengine.models;

public class SearchQuery {

	private String message;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SearchResults [message=" + message + "]";
	}

	public SearchQuery() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
