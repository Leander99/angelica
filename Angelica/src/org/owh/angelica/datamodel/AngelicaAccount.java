/* Base class that will contains all information about a user account in angelica
 * 
 */
package org.owh.angelica.datamodel;

import com.scringo.Scringo;
import com.scringo.api.ScringoUser;

public class AngelicaAccount {
	private String userName;
	private String userPassword;
	private String userEmail;
	private String IMEI;
	private String scringoUserId;
	
	private AngelicaGender gender = AngelicaGender.UNKNOWN;	
	private ScringoUser scringoUser;
	
	public AngelicaAccount(String userName, String userPassword, String userEmail) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
	}
	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
		//Scringo scringo;		
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getIMEI() {
		return IMEI;
	}

	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}

	public String getScringoUserId() {
		return scringoUserId;
	}

	public void setScringoUserId(String scringoUserId) {
		this.scringoUserId = scringoUserId;
	}

	public AngelicaGender getGender() {
		return gender;
	}

	public void setGender(AngelicaGender gender) {
		this.gender = gender;
	}

	public ScringoUser getScringoUser() {
		return scringoUser;
	}

	public void setScringoUser(ScringoUser scringoUser) {
		this.scringoUser = scringoUser;
	}
}
