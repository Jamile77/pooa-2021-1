package br.com.mariojp.colecoes.usuarios.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Usuario {
	
	// Usuario[] usuarios = new Usuario[100];
	// Map<String,Usuario> usuarios = new HashMap<String,Usuario>();
	private static List<Usuario> usuarios = new ArrayList<Usuario>();
	
	private String nome;
	private String email; // index
	private String senha;
	private String perfil; //?
	
	/**
	 * 
	 * @param nome
	 * @param email
	 * @param senha
	 * @param perfil
	 */
	public Usuario(String nome, String email, String senha, String perfil) {
		super();
		this.nome = nome;
		this.email = email;
		//TODO FIX SENHA DEVE SER CRIPTOGRAFADA
		this.senha = senha;
		this.perfil = perfil;
	}

	/**
	 * Cria usuario com o Perfil de USUARIO
	 * @param nome
	 * @param email
	 * @param senha
	 */
	public Usuario(String nome, String email, String senha) {
		this(nome,email,senha,"USUARIO");
	}




	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
	public void salvar() {
		usuarios.add(this);
		
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}

	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [nome=");
		builder.append(nome);
		builder.append(", email=");
		builder.append(email);
		builder.append(", senha=");
		builder.append(senha);
		builder.append(", perfil=");
		builder.append(perfil);
		builder.append("]");
		return builder.toString();
	}
	
//	public static void adicionaUsuario(Usuario usuario) {
//		usuarios.add(usuario);
//	}
	
	
	
}
