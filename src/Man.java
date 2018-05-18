//if age < 18 throw the PubEntryException
public class Man {
	String name;
	int age;
	public Man(String n, int a) throws PubEntryException{
		if(a < 18) {
			throw new PubEntryException();
		}
		else if(a>120) {
			throw new PubEntryException();
		}
		else {
		name = n;
		age = a;
	}
}
}
