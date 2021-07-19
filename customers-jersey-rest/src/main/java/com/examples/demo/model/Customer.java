package com.examples.demo.model;

public class Customer {
private int customerId;
private String customerName;
private long phoneNumber;
public Customer(int customerId, String customerName, long phoneNumber) {
super();
this.customerId = customerId;
this.customerName = customerName;
this.phoneNumber = phoneNumber;
}
public Customer() {
super();
// TODO Auto-generated constructor stub
}
public int getCustomerId() {
return customerId;
}
public void setCustomerId(int customerId) {
this.customerId = customerId;
}
public String getCustomerName() {
return customerName;
}
public void setCustomerName(String customerName) {
this.customerName = customerName;
}
public long getPhoneNumber() {
return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
this.phoneNumber = phoneNumber;
}
@Override
public String toString() {
return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", phoneNumber=" + phoneNumber
+ "]";
}

}