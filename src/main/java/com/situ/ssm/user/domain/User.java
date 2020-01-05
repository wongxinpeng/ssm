package com.situ.ssm.user.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

@Alias("User")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long rowId; // ROW_ID
	private String userName;//USER_NAME
	private Integer userAge;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date userBirthday;//USER_BIRTHDAY
	public Long getRowId() {
		return rowId;
	}
	public void setRowId(Long rowId) {
		this.rowId = rowId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public Date getUserBirthday() {
		return userBirthday;
	}
	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}
}
