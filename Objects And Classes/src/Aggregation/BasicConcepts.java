package Aggregation;
//If a class an entity reference,it's known as Aggregation.Aggregation represents HAS-A relationship
//Consider a situation,Employee object contains many information such as id,name,emailid etc.it contains
//one more object named address,which contains it's own information such as city,state,country,zipcode etc.as given below
class Employee{
	int id;
	String name;
	Address address;//Address is a class
}
public class BasicConcepts {

}
//in such case ,Employee has an entity reference address ,so relationship is Employee HAS-A address
//Why use Aggregation
//..For code reusability
