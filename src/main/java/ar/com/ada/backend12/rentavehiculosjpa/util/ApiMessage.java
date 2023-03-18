package ar.com.ada.backend12.rentavehiculosjpa.util;

public class ApiMessage implements ApiReturnable {

	private String message;

	public ApiMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApiMessage(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
