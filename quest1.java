import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Quest1 {
    FileInputStream folder = new FileInputStream("C:\Users\usuario\Desktop\inp\texiste.txt");
    InputStreamReader input = new InputStreamReader(folder);
    private String nome;
    private int anonascimento;
	private Float altura;

    public String getNome() {
		return (nome);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    public Float getAltura() {
		return (altura);
	}

    public void setAltura(Float altura) {
		this.altura = altura;
	}

    public int getanonascimento() {
		return (anonascimento);
	}

	public void setanonascimento(int nascimento) {
		this.anonascimento = anonascimento;
	}

    public int CalcularIdade() {
		return (2021 - this.anonascimento);
	}
}

	public void Imprimir() {
		System.out.println(this.nome);
		System.out.println(Float.toString(this.altura));
		System.out.println(String.valueOf(this.anonascimento));
	}






