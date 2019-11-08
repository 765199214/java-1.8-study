package android;

public class AndroidUrl {
	public static void main(String[] args) {
		
		HttpUtils.sendHttpRequest("http://www.baidu.com","get", new HttpCallbackListener() {
			@Override
			public void onSuccess(String response) {
				System.out.println(response);
			}
			@Override
			public void onError(Exception e) {
				e.printStackTrace();
			}
		});
	}
}
