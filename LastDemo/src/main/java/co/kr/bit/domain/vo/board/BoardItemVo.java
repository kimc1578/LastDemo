package co.kr.bit.domain.vo.board;

import java.sql.Date;

public class BoardItemVo {
	String bidx,title,userid,hitcnt;
	Date writedate;
	public String getBidx() {
		return bidx;
	}
	public void setBidx(String bidx) {
		this.bidx = bidx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getHitcnt() {
		return hitcnt;
	}
	public void setHitcnt(String hitcnt) {
		this.hitcnt = hitcnt;
	}
	public Date getWritedate() {
		return writedate;
	}
	public void setWritedate(Date writedate) {
		this.writedate = writedate;
	}
	@Override
	public String toString() {
		return "BoardItemVo [bidx=" + bidx + ", title=" + title + ", userid=" + userid + ", hitcnt=" + hitcnt
				+ ", writedate=" + writedate + "]";
	}
	
	
}
