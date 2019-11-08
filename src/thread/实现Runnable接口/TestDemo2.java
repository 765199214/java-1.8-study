package thread.实现Runnable接口;

public class TestDemo2 {

	public static void main(String[] args) {
		/*new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("6666");
			}
		}).start();*/
		
		new Thread(() -> System.out.println("666666")).start();
	}

}
