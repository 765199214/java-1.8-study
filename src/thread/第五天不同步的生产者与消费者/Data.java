package thread.第五天不同步的生产者与消费者;
//数据保存类
public class Data {
	private String title;
	private String note;
	
	public String getTitle() {
		return title;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
