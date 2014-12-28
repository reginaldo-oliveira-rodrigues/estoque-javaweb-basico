package br.com.rnglnd.estoquewebagrichile.tests;

import java.io.File;
import java.io.IOException;

public class MainTeste {
	
	// teste so pra ver a raiz da aplicação de onde ler ou escrever arquivos ou pastas
	public static void main(String dados[]){
		File arq = new File("arquivoteste.txt");
		try {
			arq.createNewFile();
			System.out.println("arquivo criado");
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
	
}
