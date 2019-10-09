/*
Autor: Luis Araujo
Disciplinas: Pesquisa, Ordena��o e Tec de Arm. - UNIFACS
Semestre: 2018.2
*/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*** 
 * Classe respons�vel por ler arquivos.
 * @author Luis Araujo
 * */
public class LeitorArquivo {
	FileReader fileReader;
	BufferedReader bufferedReader;
	
	/**
	 * Construtor da classe. Respons�vel por inicializar
	 * e chamar o m�todo abrir.
	 * @param nome e caminho do arquivo a ser aberto 
	 */
	LeitorArquivo(String file){
		abrir(file);
	}
	/**
	 * Respons�vel por abrir o arquivo.
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
	 * Respons�vel por obter a pr�xima linha do arquivo. 
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
	 * Respons�vel por fechar o arquivo.
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
