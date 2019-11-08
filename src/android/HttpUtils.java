package android;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtils {

	public static void sendHttpRequest(final String address,String type, final HttpCallbackListener listener) {
		new Thread() {
			private HttpURLConnection connection;
			private String httpType;
			public void run() {
				try {
					if("get".equalsIgnoreCase(type)) {
						httpType = type.toUpperCase();
					}else if("post".equalsIgnoreCase(type)) {
						httpType = type.toUpperCase();
					}else {
						System.out.println("不是规范的请求方式");
						return;
					}
						
					
					URL url = new URL(address);
					connection = (HttpURLConnection) url.openConnection();
					connection.setRequestMethod("GET");
					connection.setConnectTimeout(8000);
					connection.setReadTimeout(8000);
					connection.setDoInput(true);
					connection.setDoOutput(true);

					InputStream in = connection.getInputStream();
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(in));
					StringBuilder builder = new StringBuilder();// 创建一个StringBuilder对象
					String line;
					while ((line = reader.readLine()) != null) {
						builder.append(line);// 一行行的读取内容并追加到builder中去
					}
					if (listener != null) {
						// 回调onFinish()方法
						listener.onSuccess(builder.toString());
					}
				} catch (Exception e) {
					e.printStackTrace();
					// 回调onError()方法
					listener.onError(e);
				} finally {
					if (connection != null) {
						connection.disconnect();// 连接不为空就关闭连接
						
						Runtime.getRuntime().gc();
					}
				}
			};
		}.start();
	}
}

interface HttpCallbackListener {
	public void onSuccess(String response);
	public void onError(Exception e);
}
