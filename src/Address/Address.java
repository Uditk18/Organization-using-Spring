package Address;

public class Address {
	
private String line1;
private String line2;
private String city;
private String state;
private int pin;
private String country;
public Address(String line1, String line2, String city, String state, int pin, String country) {
	super();
	this.line1 = line1;
	this.line2 = line2;
	this.city = city;
	this.state = state;
	this.pin = pin;
	this.country = country;
}
public String getLine1() {
	return line1;
}
public void setLine1(String line1) {
	this.line1 = line1;
}
public String getLine2() {
	return line2;
}
public void setLine2(String line2) {
	this.line2 = line2;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "Address [line1=" + line1 + ", line2=" + line2 + ", city=" + city + ", state=" + state + ", pin=" + pin
			+ ", country=" + country + "]";
}



}