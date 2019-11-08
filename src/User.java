class Humen{
	public void speak(){
		System.out.println("humen   speak");
	}
}
public class User extends Humen{
	public static void main(String[] args) {
		Humen h = new User();
		h.speak();
	}
}
