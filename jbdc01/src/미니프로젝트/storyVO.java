package 미니프로젝트;

import java.sql.Date;

public class storyVO {
	private int no;
	private String title;
	private String photo;
	private String conctent;
	private Date writeDate;
	private String userID;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getConctent() {
		return conctent;
	}
	public void setConctent(String conctent) {
		this.conctent = conctent;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	
}
