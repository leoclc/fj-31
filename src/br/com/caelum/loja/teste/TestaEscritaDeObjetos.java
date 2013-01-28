package br.com.caelum.loja.teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import br.com.caelum.loja.serializacao.Livro;

public class TestaEscritaDeObjetos {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("livros.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Livro l1 = new Livro();
		l1.setNome("Pais e filhos");
		l1.setPreço(100.0);
		
		Livro l2 = new Livro();
		l2.setNome("Noites brancas");
		l2.setPreço(200.0);
		
		ArrayList<Livro> livros = new ArrayList<Livro>();
		livros.add(l1);
		livros.add(l2);
		
		oos.writeObject(livros);
		oos.close();
	}
}
