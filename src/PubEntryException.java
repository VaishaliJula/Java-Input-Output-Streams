
public class PubEntryException extends Exception{
	int age;
//	public PubEntryException(int a){
//		age = a;
//	}
	public String getMessage() {
		return "You are too young to enter the pub";
	}
}
