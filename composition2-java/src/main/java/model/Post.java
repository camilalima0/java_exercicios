package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	//cria lista de comentarios pois um post pode ter varios comentarios;
	private List<Comment> comments = new ArrayList<>();
	//construtor padrão
	public Post() {
	}
	//construtor com argumentos SEM A LISTA;
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}
	//Como comment é lista, não devo usar SET
	//usar metodos add e remove;
	public void addComment(Comment comment) {
		comments.add(comment);
	}

	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	//metodo que imprime todas as informações do post
	//se eu montar uma string apenas concatenando com + consome muita memoria e o programa fica lento,
	//a classe string builder é util quando quero montar um string grande a partir de varios pequenos
	//a função append acrescenta no final da string
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		//simple date format declarado na classe como private static para poder ser passado como parametro para stringbuilder;;
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		//for (tipo_de_dado item : lista)
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		//converte e retorna stringbuilder para string
		return sb.toString();
	}
}
