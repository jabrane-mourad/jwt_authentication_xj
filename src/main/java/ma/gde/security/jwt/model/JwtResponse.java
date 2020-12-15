package ma.gde.security.jwt.model;

import java.io.Serializable;

public class JwtResponse implements Serializable {
	private final String jwttoken;
	private String id;

	public JwtResponse(String jwttoken, String username) {
		this.jwttoken = jwttoken;
		this.id = username;
	}

	public String getJwttoken() {
		return jwttoken;
	}

	public String getUsername() {
		return id;
	}

	public void setUsername(String username) {
		this.id = username;
	}
	
}