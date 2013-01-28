package br.com.caelum.loja.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import br.com.caelum.loja.serializacao.Livro;

public class TestaLeituraDeObjetos {
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		FileInputStream fis = new FileInputStream("livros.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		List<Livro> livros = (List<Livro>) ois.readObject();
		
		for (Livro l : livros) {
			System.out.println(l.getNome());
			System.out.println();
			
			System.out.println(l.getPreço());
			System.out.println("------------");
		}
		
	}
}
