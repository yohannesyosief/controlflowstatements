package TimBuchalka;
//Parsing is to read the value of one object to convert it to another type.For example

public class ParsingValuesFromAString {

	public static void main(String[] args) {
		String numberAsString="2018.125";
		//String numberAsString="2018.125a"; this will call an error during conversion to numbers, because of 'a'
		System.out.println("Number as String= "+numberAsString);
		
		//int number=Integer.parseInt(numberAsString);
		double number=Double.parseDouble(numberAsString);
		System.out.println("Number as String= "+numberAsString);
		System.out.println("number= "+number);
		numberAsString+=1;
		number+=1;
		System.out.println("Number as String="+numberAsString);
		System.out.println("number= "+number);

	
	}

}
