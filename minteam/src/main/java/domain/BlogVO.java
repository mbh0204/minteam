package domain;

import java.sql.Timestamp;

public class BlogVO {
	private int tbl_blog_bno;
	private String tbl_blog_title;
	private String tbl_blog_editer;
	private Timestamp tbl_blog_regdate;
	private int tbl_blog_viewcnt;
	private int tbl_blog_replycnt;
	private int tbl_blog_likeIt;
	
	public BlogVO(int tbl_blog_bno, String tbl_blog_title, String tbl_blog_editer, Timestamp tbl_blog_regdate,
			int tbl_blog_viewcnt, int tbl_blog_replycnt, int tbl_blog_likeIt) {
		super();
		this.tbl_blog_bno = tbl_blog_bno;
		this.tbl_blog_title = tbl_blog_title;
		this.tbl_blog_editer = tbl_blog_editer;
		this.tbl_blog_regdate = tbl_blog_regdate;
		this.tbl_blog_viewcnt = tbl_blog_viewcnt;
		this.tbl_blog_replycnt = tbl_blog_replycnt;
		this.tbl_blog_likeIt = tbl_blog_likeIt;
	}

	public int getTbl_blog_bno() {
		return tbl_blog_bno;
	}

	public void setTbl_blog_bno(int tbl_blog_bno) {
		this.tbl_blog_bno = tbl_blog_bno;
	}

	public String getTbl_blog_title() {
		return tbl_blog_title;
	}

	public void setTbl_blog_title(String tbl_blog_title) {
		this.tbl_blog_title = tbl_blog_title;
	}

	public String getTbl_blog_editer() {
		return tbl_blog_editer;
	}

	public void setTbl_blog_editer(String tbl_blog_editer) {
		this.tbl_blog_editer = tbl_blog_editer;
	}

	public Timestamp getTbl_blog_regdate() {
		return tbl_blog_regdate;
	}

	public void setTbl_blog_regdate(Timestamp tbl_blog_regdate) {
		this.tbl_blog_regdate = tbl_blog_regdate;
	}

	public int getTbl_blog_viewcnt() {
		return tbl_blog_viewcnt;
	}

	public void setTbl_blog_viewcnt(int tbl_blog_viewcnt) {
		this.tbl_blog_viewcnt = tbl_blog_viewcnt;
	}

	public int getTbl_blog_replycnt() {
		return tbl_blog_replycnt;
	}

	public void setTbl_blog_replycnt(int tbl_blog_replycnt) {
		this.tbl_blog_replycnt = tbl_blog_replycnt;
	}

	public int getTbl_blog_likeIt() {
		return tbl_blog_likeIt;
	}

	public void setTbl_blog_likeIt(int tbl_blog_likeIt) {
		this.tbl_blog_likeIt = tbl_blog_likeIt;
	}

	@Override
	public String toString() {
		return "BlogVO [tbl_blog_bno=" + tbl_blog_bno + ", tbl_blog_title=" + tbl_blog_title + ", tbl_blog_editer="
				+ tbl_blog_editer + ", tbl_blog_regdate=" + tbl_blog_regdate + ", tbl_blog_viewcnt=" + tbl_blog_viewcnt
				+ ", tbl_blog_replycnt=" + tbl_blog_replycnt + ", tbl_blog_likeIt=" + tbl_blog_likeIt + "]";
	}
	
}
