package beans;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class NavigationBean {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	/**
	 * @see <h:commandButton action="..."
	 * @return text
	 */
	public String login() {
		return message;
	}
	
}
