package com.javatutorialspot;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "pc_helloWorld", eager = true)
@ViewScoped
public class HelloWorld {

	private static final long serialVersionUID = 1L;
	private String bio;
	
	public String getBio() {	
		return bio;
	}
	
	public void setBio(String bio) {
		this.bio = bio;
	}
}
