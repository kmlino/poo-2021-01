package br.edu.facthus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class Main {

	public static void ex01() {
		FileWriter fileWriter = null;
		BufferedWriter bWriter = null;

		try {
			fileWriter = new FileWriter("teste.txt");
			bWriter = new BufferedWriter(fileWriter);

			bWriter.write("abc\n");
			bWriter.write("def\n");
			bWriter.write("ghi\n");

			System.out.println("Ok!");
		} catch (IOException e) {
			System.out.println("Erro abrindo arquivo.");
		} finally {
			try {
				bWriter.close();
			} catch (IOException e) {
				// Ok, o writer está fechado
			}
		}
	}

	public static void ex02() {
		FileReader fileReader = null;
		BufferedReader bReader = null;

		try {
			fileReader = new FileReader("teste.txt");
			bReader = new BufferedReader(fileReader);

			while (bReader.ready())
				System.out.println(bReader.readLine());
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
		} catch (IOException e) {
			System.out.println("Erro lendo arquivo.");
		} finally {
			try {
				bReader.close();
			} catch (IOException e) {
				// OK
			}
		}
	}

	public static void ex03() {
		try {
			System.out.println("Testando exceções...");
			// throw new RuntimeException("Exceção de teste");
			System.out.println("Ok!");
			return;
		} catch (RuntimeException e) {
			System.out.println("RuntimeException atingida!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Mensagem impressa no finally");
		}
	}

	// Acrescenta um produto no arquivo CSV
	public static void ex04() {
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto(1, "Caneta", true));
		produtos.add(new Produto(2, "Caderno", false));
		produtos.add(new Produto(3, "Lapiseira", true));

		FileWriter fw = null;
		CSVPrinter printer = null;
		try {
			fw = new FileWriter("produtos.csv", false);
			printer = new CSVPrinter(fw, CSVFormat.DEFAULT);
			
			for (Produto p : produtos)
				printer.printRecord(p.getId(), 
						p.getDescricao(), 
						p.getAtivo());
			System.out.println("Produto inserido com sucesso!");
		} catch (IOException ex) {
			System.out.println("Não foi possível abrir o arquivo.");
		} finally {
			try {
				if (fw != null)
					fw.close();
				if (printer != null)
					printer.close();
			} catch (IOException e) {
				// Ignorar
			}
		}

	}

	// Carrega os produtos do arquivo CSV
	public static void ex05() {
		List<Produto> produtos = new ArrayList<>();
        FileReader fr = null;
        try {
            fr = new FileReader("produtos.csv");
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(fr);
    
            for (CSVRecord record : records) {
                Integer id = Integer.parseInt(record.get(0));
                String descricao = record.get(1);
                Boolean ativo = Boolean.parseBoolean(record.get(2));
                
                produtos.add(new Produto(id, descricao, ativo));
            }
            
            for (Produto p : produtos)
            	p.imprime();
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo CSV não encontrado.");
        } catch (IOException ex) {
            System.out.println("Erro lendo arquivo CSV.");
        } finally {
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                // Ignorar...
            }
        }
		
	}
			
	public static void main(String[] args) {
		// ex01();
		// ex02();
		// ex03();
		// ex04();
		ex05();
	}

}
