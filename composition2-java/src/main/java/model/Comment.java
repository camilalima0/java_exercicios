package model;

public class Comment {

	private String text;
	 //sempre cria um construtor vazio e um com argumentos
	public Comment() {
	}

	public Comment(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
