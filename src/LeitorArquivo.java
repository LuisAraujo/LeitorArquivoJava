/*
Autor: Luis Araujo
Disciplinas: Pesquisa, Ordenação e Tec de Arm. - UNIFACS
Semestre: 2018.2
*/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*** 
 * Classe responsável por ler arquivos.
 * @author Luis Araujo
 * */
public class LeitorArquivo {
	FileReader fileReader;
	BufferedReader bufferedReader;
	
	/**
	 * Construtor da classe. Responsável por inicializar
	 * e chamar o método abrir.
	 * @param nome e caminho do arquivo a ser aberto 
	 */
	LeitorArquivo(String file){
		abrir(file);
	}
	/**
	 * Responsável por abrir o arquivo.
	 * @param nome e caminho do arquivo a ser aberto 
	 */
	public void abrir(String file){
		//colocar o arquivo na raiz do projeto
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bufferedReader = new BufferedReader(fileReader);  	
	}
	
	/**
	 * Responsável por obter a próxima linha do arquivo. 
	 */
	public String proximaLinha() {	
		String linha;
		try {
			linha = bufferedReader.readLine();
			return linha;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	/**
	 * Responsável por fechar o arquivo.
	 */
	public void fechar() {
		try {
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	}
}
