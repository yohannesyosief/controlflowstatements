package Aggregation;
//Understanding meaningful example of Aggregation
//in this example,Employee has an object of Address,address object contains it's own information such as city,state,country etc.
//In such case relationship is Employee HAS-A address
 public class Address{
	String city,state,country;
	public Address(String city,String state,String country) {
		this.city=city;
		this.state=state;
		this.country=country;
	}
}


