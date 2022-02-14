package Interface;
//What's marker or tagged interface?
//An interface which has no member is known as a marker or tagged interface,for example,SerialZable,Cloneable,
//Remote,etc.They are used to provide some essential information to the JVM so that JVM may perform some
//useful operation
//how Serialization Interface is written?

public class MarkerInterface {

}
//Mested Interface in java
//Note:an interface can have another interface which is known as a nested interface.
//We will learn it in detail in the nested classes chapter,For Example
interface printable{
	void print();
	interface MessagePrinatble{
		void msg();
	}
}
