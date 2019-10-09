import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		LeitorArquivo la = new LeitorArquivo("bd.txt");
		String a = null;
		while( (a = la.proximaLinha()) !=  null) {
			System.out.println(a);
		}
	}

}
