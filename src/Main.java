/*
@author HANIEL GOMES CAVALCANTE
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String conteudo="";

		System.out.printf("Informe o nome de arquivo texto:\n");
		String nome;
		//nome= scanner.nextLine();
		
		
		
		String nome2="";
		

		nome=JOptionPane.showInputDialog("Informe o caminho do arquivo texto a ser formatado:");
		
		
		
		
		System.out.printf("\nConteúdo do arquivo texto:\n");
		try {
			FileReader arq = new FileReader(nome);
			BufferedReader lerArq = new BufferedReader(arq);

			String linha = lerArq.readLine(); // lê a primeira linha
			// a variável "linha" recebe o valor "null" quando o processo
			// de repetição atingir o final do arquivo texto
			while (linha != null) {
				//System.out.printf("%s\n", linha);
				conteudo = conteudo+"\n"+linha;
				
				
				linha = lerArq.readLine(); // lê da segunda até a última linha
				
			}

			arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
		
		//previnindo a., a)
		conteudo  = conteudo.replace ("\na.", "\n\na.");
		conteudo  = conteudo.replace ("\nb.", "\n\nb.");
		conteudo  = conteudo.replace ("\nc.", "\n\nc.");
		conteudo  = conteudo.replace ("\nd.", "\n\nd.");
		conteudo  = conteudo.replace ("\ne.", "\n\ne.");
		conteudo  = conteudo.replace ("\nf.", "\n\nf.");
		conteudo  = conteudo.replace ("\ng.", "\n\ng.");
		conteudo  = conteudo.replace ("\nh.", "\n\nh.");
		conteudo  = conteudo.replace ("\ni.", "\n\ni.");
		conteudo  = conteudo.replace ("\nj.", "\n\nj.");
		conteudo  = conteudo.replace ("\nk.", "\n\nk.");
		conteudo  = conteudo.replace ("\nl.", "\n\nl.");
		conteudo  = conteudo.replace ("\nm.", "\n\nm.");
		conteudo  = conteudo.replace ("\nn.", "\n\nn.");
		conteudo  = conteudo.replace ("\no.", "\n\no.");
		conteudo  = conteudo.replace ("\np.", "\n\np.");
		conteudo  = conteudo.replace ("\nq.", "\n\nq.");
		conteudo  = conteudo.replace ("\nr.", "\n\nr.");
		conteudo  = conteudo.replace ("\ns.", "\n\ns.");
		conteudo  = conteudo.replace ("\nt.", "\n\nt.");
		conteudo  = conteudo.replace ("\nu.", "\n\nu.");
		conteudo  = conteudo.replace ("\nv.", "\n\nv.");
		conteudo  = conteudo.replace ("\nw.", "\n\nw.");
		conteudo  = conteudo.replace ("\nx.", "\n\nx.");
		conteudo  = conteudo.replace ("\ny.", "\n\ny.");
		conteudo  = conteudo.replace ("\nz.", "\n\nz.");
		
		
		
		conteudo  = conteudo.replace ("\na)", "\n\na)");
		conteudo  = conteudo.replace ("\nb)", "\n\nb)");
		conteudo  = conteudo.replace ("\nc)", "\n\nc)");
		conteudo  = conteudo.replace ("\nd)", "\n\nd)");
		conteudo  = conteudo.replace ("\ne)", "\n\ne)");
		conteudo  = conteudo.replace ("\nf)", "\n\nf)");
		conteudo  = conteudo.replace ("\ng)", "\n\ng)");
		conteudo  = conteudo.replace ("\nh)", "\n\nh)");
		conteudo  = conteudo.replace ("\ni)", "\n\ni)");
		conteudo  = conteudo.replace ("\nj)", "\n\nj)");
		conteudo  = conteudo.replace ("\nk)", "\n\nk)");
		conteudo  = conteudo.replace ("\nl)", "\n\nl)");
		conteudo  = conteudo.replace ("\nm)", "\n\nm)");
		conteudo  = conteudo.replace ("\nn)", "\n\nn)");
		conteudo  = conteudo.replace ("\no)", "\n\no)");
		conteudo  = conteudo.replace ("\np)", "\n\np)");
		conteudo  = conteudo.replace ("\nq)", "\n\nq)");
		conteudo  = conteudo.replace ("\nr)", "\n\nr)");
		conteudo  = conteudo.replace ("\ns)", "\n\ns)");
		conteudo  = conteudo.replace ("\nt)", "\n\nt)");
		conteudo  = conteudo.replace ("\nu)", "\n\nu)");
		conteudo  = conteudo.replace ("\nv)", "\n\nv)");
		conteudo  = conteudo.replace ("\nw)", "\n\nw)");
		conteudo  = conteudo.replace ("\nx)", "\n\nx)");
		conteudo  = conteudo.replace ("\ny)", "\n\ny)");
		conteudo  = conteudo.replace ("\nz)", "\n\nz)");
		
		
		

		//removendo a quebra de linha
		conteudo  = conteudo.replace ("\na", " a");
		conteudo  = conteudo.replace ("\nb", " b");
		conteudo  = conteudo.replace ("\nc", " c");
		conteudo  = conteudo.replace ("\nd", " d");
		conteudo  = conteudo.replace ("\ne", " e");
		conteudo  = conteudo.replace ("\nf", " f");
		conteudo  = conteudo.replace ("\ng", " g");
		conteudo  = conteudo.replace ("\nh", " h");
		conteudo  = conteudo.replace ("\ni", " i");
		conteudo  = conteudo.replace ("\nj", " j");
		conteudo  = conteudo.replace ("\nk", " k");
		conteudo  = conteudo.replace ("\nl", " l");
		conteudo  = conteudo.replace ("\nm", " m");
		conteudo  = conteudo.replace ("\nn", " n");
		conteudo  = conteudo.replace ("\no", " o");
		conteudo  = conteudo.replace ("\np", " p");
		conteudo  = conteudo.replace ("\nq", " q");
		conteudo  = conteudo.replace ("\nr", " r");
		conteudo  = conteudo.replace ("\ns", " s");
		conteudo  = conteudo.replace ("\nt", " t");
		conteudo  = conteudo.replace ("\nu", " u");
		conteudo  = conteudo.replace ("\nv", " v");
		conteudo  = conteudo.replace ("\nx", " x");
		conteudo  = conteudo.replace ("\ny", " y");
		conteudo  = conteudo.replace ("\nz", " z");
		
		conteudo  = conteudo.replace ("\né", " é");
		conteudo  = conteudo.replace ("\nó", " ó");
		conteudo  = conteudo.replace ("\nà", " à");
		conteudo  = conteudo.replace ("\ná", " á");
		conteudo  = conteudo.replace ("\nô", " ô");
		conteudo  = conteudo.replace ("\nú", " ú");
		
		
		System.out.println();
		
		System.out.println(conteudo);
		
		
		
		/*
		nome2=JOptionPane.showInputDialog("Informe o caminho do arquivo texto a ser criado:");
		
		//JOptionPane.showMessageDialog(null, conteudo);
		
		
		*/
		Scanner scan = new Scanner(conteudo);
		PrintStream ps = new PrintStream("saidaLeitura.txt");
		
		while(scan.hasNextLine()) {
			
		ps.println(scan.nextLine());	
			
		}
		
		
		JOptionPane.showMessageDialog(null, "Concluído com sucesso!", "Formatador de texto criado por Haniel G. Cavalcante",1 );
		
		/*
		FileWriter arq = new FileWriter(nome2);
	    PrintWriter gravarArq = new PrintWriter(arq);
	    
	    gravarArq.printf(conteudo);
	    
	    arq.close();
	    
	    System.out.printf("\ntextoformatado foi gravado com sucesso em"+nome2);
		*/
		
	}
}