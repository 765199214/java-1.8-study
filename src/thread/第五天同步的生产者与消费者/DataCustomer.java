package thread.第五天同步的生产者与消费者;
//消费者类
public class DataCustomer implements Runnable{
	private Data data;

	public DataCustomer(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		//生产50个数据   就取走 50个数据
		for (int i = 0; i <50; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.data.get();
		}
	}
}
