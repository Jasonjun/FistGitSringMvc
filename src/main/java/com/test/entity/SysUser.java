package com.test.entity;

import java.io.Serializable;

public class SysUser implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 6007786483679018371L;


	private Integer id;

	private String userName;

	//@Column(name = "pass_word")
	private String passWord;
	
	private String salt;
	
	private Integer userEnable;

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}



	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return user_name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return pass_word
	 */
	public String getPassWord() {
		return passWord;
	}

	/**
	 * @param passWord
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	/**
	 * 获取是否启用
	 * 
	 * @return user_enable - 是否启用
	 */
	public Integer getUserEnable() {
		return userEnable;
	}

	/**
	 * 设置是否启用
	 * 
	 * @param userEnable
	 *            是否启用
	 */
	public void setUserEnable(Integer userEnable) {
		this.userEnable = userEnable;
	}
}
