package com.forms;
import javax.servlet.http.HttpServletRequest;
public class ConnectionForm {
	private String resultat;
   public void verifyIdentifiers(HttpServletRequest request)
   {
	   String login = request.getParameter("login");
	   String pass = request.getParameter("pass");
	   if (pass.equals(login+"123"))
	          {resultat ="correct connection";}
	   else   {resultat ="connection incorrect";}
   }
	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}
	

}
