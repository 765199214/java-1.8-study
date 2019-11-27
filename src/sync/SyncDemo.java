package sync;

public class SyncDemo {
	private static final int sleepSecond = 5000;
	
	public static synchronized void syncStaticMethod() {
		System.out.println("syncStaticMethod");
		try {
			Thread.sleep(sleepSecond);
		} catch (InterruptedException e) {
		}
	}
 
	public static void syncStaticClass() {
		synchronized (SyncDemo.class) {
			System.out.println("syncStaticClass");
			try {
				Thread.sleep(sleepSecond);
			} catch (InterruptedException e) {
			}
		}
	}
 
	public synchronized void syncMethod() {
		System.out.println("syncMethod");
		try {
			Thread.sleep(sleepSecond);
		} catch (InterruptedException e) {
		}
	}
 
	public void syncClass() {
		synchronized (this) {
			System.out.println("syncClass");
			try {
				Thread.sleep(sleepSecond);
			} catch (InterruptedException e) {
			}
		}
	}
 
	public static void main(String[] args) {
		final SyncDemo t1 = new SyncDemo();
		new Thread(new Runnable() {
 
			@Override
			public void run() {
				t1.syncClass();
			}
		}).start();
 
		new Thread(new Runnable() {
 
			@Override
			public void run() {
				t1.syncMethod();
			}
		}).start();
		
		new Thread(new Runnable() {
			 
			@Override
			public void run() {
				SyncDemo.syncStaticMethod();
			}
		}).start();
 
		new Thread(new Runnable() {
 
			@Override
			public void run() {
				SyncDemo.syncStaticClass();
			}
		}).start();
	}
}
