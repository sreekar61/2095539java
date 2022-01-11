package BookingSystem;


class customerRegistration {
	 private String customerName;
	 private String customerId;
	 private String Address;
	 private long phoneNo;
	 private String emailId;
	 
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String toString()
    {
    	//to display details of customers....
    	return "CustomerDetails[customerName="+customerName+",customerId="+customerId+","
    			+ "Address="+Address+",phoneNo="+phoneNo+",emailId="+emailId+"]";
    }
	
}



