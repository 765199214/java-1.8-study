package thread.第五天同步的生产者与消费者等待与唤醒机制;


public class TestDemo {
	public static void main(String[] args) {
		Data data = new Data();
		new Thread(new DataProvider(data)).start();
		new Thread(new DataCustomer(data)).start();
	}

}
