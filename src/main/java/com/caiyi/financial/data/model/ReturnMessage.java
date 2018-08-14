package com.caiyi.financial.data.model;


public class ReturnMessage {
	private String message;
	private String topic;
	private String isSuccess;
	private String status;
	
	public ReturnMessage() {
		super();
	}
	public ReturnMessage(String message, String topic, String isSuccess, String status) {
		super();
		this.message = message;
		this.topic = topic;
		this.isSuccess = isSuccess;
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getIsSuccess() {
		return isSuccess;
	}
	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
