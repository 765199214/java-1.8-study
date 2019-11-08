package thread.第五天不同步的生产者与消费者;
//编写数据的生产者
public class DataProvider implements Runnable{
	private  Data data;
	public DataProvider(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		//run方法中进行生产
		for (int i = 0; i < 50; i++) {
			if(i % 2 ==0) {
				//偶数
				this.data.setTitle("老李");
				//只有  线程  暂停  才能看出问题
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				this.data.setNote("魔乐科技");
			}else {
				this.data.setTitle("香蕉不拿拿");
				//只有  线程  暂停  才能看出问题
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				this.data.setNote("爱吃香蕉");
			}
		}
	}
	
}
