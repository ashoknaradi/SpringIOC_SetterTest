package Pojos;

public class Answer {
	private int id;
	private String answer;
	private String postedDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(String postedDate) {
		this.postedDate = postedDate;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", postedDate=" + postedDate + "]";
	}
}
