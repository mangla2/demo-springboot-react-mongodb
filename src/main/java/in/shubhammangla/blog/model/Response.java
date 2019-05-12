package in.shubhammangla.blog.model;

public class Response {

	private boolean status;
	private Object respObj;
	private ErrorInfo error;
	
	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	/**
	 * @return the respObj
	 */
	public Object getRespObj() {
		return respObj;
	}
	/**
	 * @param respObj the respObj to set
	 */
	public void setRespObj(Object respObj) {
		this.respObj = respObj;
	}
	/**
	 * @return the error
	 */
	public ErrorInfo getError() {
		return error;
	}
	/**
	 * @param error the error to set
	 */
	public void setError(ErrorInfo error) {
		this.error = error;
	}
	
}
