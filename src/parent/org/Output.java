package parent.org;

public class Output extends Parent1 {

	@Override
	public void message() {
System.out.println("This is first subclass");		
	}
public static void main(String[] args) {
	Output o = new Output();
	o.message();
}

}



