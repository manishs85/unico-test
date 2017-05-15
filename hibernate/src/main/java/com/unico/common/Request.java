package com.unico.common;


public class Request {

	private int id;
	private int num1;
	private int num2;
	private boolean success;
	//private Boolean processed;
	private static final String successMessage = "Successfully pushed: %s, %s!";
	private static final String failureMessage = "Failed to push: %s, %s!";

	public static final String plainKey = "unicotest@123";

	public Request(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public Request() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Boolean isSuccess() {
		return success;
	}

	public String getStatusMessage() {
		String message;
		if (success) {
			message = successMessage;
		} else {
			message = failureMessage;
		}

		return String.format(message, num1, num2);
	}

/*	public boolean isProcessed() {
		return processed;
	}

	public void setProcessed(boolean processed) {
		this.processed = processed;
	}*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + num1;
		result = prime * result + num2;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Request other = (Request) obj;
		if (id != other.id)
			return false;
		if (num1 != other.num1)
			return false;
		if (num2 != other.num2)
			return false;
		return true;
	}
}
