
public class MansEntry {

	public static void main(String[] args) {
		String name;
		int age;
		Man M = null;
		name = args[0];
		age = Integer.parseInt(args[1]);
		try{
			M = new Man(name,age);
		}catch(PubEntryException e) {
			System.err.println(e.getMessage());
		}if (M != null)
			System.out.println("Hie!!!!!Welcome to the Pub");
	}

}
