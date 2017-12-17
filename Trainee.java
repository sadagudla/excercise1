package com.htc.excercise1;

import java.io.Serializable;

public class Trainee extends Object implements Serializable{
	
	private int traineeId;
	private String traineeName;
	private String contactNo;
	private String email;
	private String gender;
	private int age;
	
	//Default constructor
	public Trainee() {
		traineeId = 0;
		traineeName = "";
		contactNo = "";
		email = "";
		gender = "";
		age = 0;
	}
	
	//Overload constructor
	public Trainee(int traineeId, String traineeName, String contactNo, String email, String gender, int age) {
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.contactNo = contactNo;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	//Setters and Getters
	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//hashCode method override
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + traineeId;
		return result;
	}
	
	//equals method override
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainee other = (Trainee) obj;
		if (traineeId != other.traineeId)
			return false;
		return true;
	}

	//toString method override
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", contactNo=" + contactNo
				+ ", email=" + email + ", gender=" + gender + ", age=" + age + "]";
	}
	
	

}
