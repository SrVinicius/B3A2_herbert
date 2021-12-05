import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Quest2 {
	FileInputStream folder = new FileInputStream("C:\Users\usuario\Desktop\inp\texiste.txt");
    InputStreamReader input = new InputStreamReader(folder);
	private int capacidade;
    private int andar = 0;
	private int andaresTO;
    private int passageiros = 0;
	
	

    public int getandar() {
		return (andar);
	}

	public void setandar(int Andar) {
		this.andar = Andar;
	}

    public int getandaresTO() {
		return (andaresTO);
	}

    public void setandaresTO(int Andares) {
		this.andaresTO = Andares;
	}

    public int getCapacidade() {
		return (capacidade);
	}

    public void setCapacidade(int Capacidade) {
		this.capacidade = Capacidade;
	}

	public void Inicializa(int Capacidade, int Andares) {
		this.setCapacidade(Capacidade);
		this.setandaresTO(Andares);
	}

    public int getpassageiros() {
		return (passageiros);
	}


    public void setpassageiros(int Pessoas) {
		this.passageiros = Pessoas;
	}

    public void Subir() {
		if(andar < andaresTO) {
			andar = andar + 1;
		} else {
			System.out.println("Chegamos ao limite, ultimo andar!");
		}
	}

	public void Descer() {
		if(andar > 0){
			AndarAtual = AndarAtual - 1;
		} else {
			System.out.println("Chegamos ao limite, terreo!");
		}
	}
}

	public void Entrar() {
		if (passageiros < capacidade) {
			passageiros = passageiros + 1;
		} else {
			System.out.println("Infelizmente o elevador se encontra com lotação máxima.");
		}
	}

	public void Sair() {
		if (passageiros > 0) {
			PessoasNoElevador = PessoasNoElevador - 1;
		} else {
			System.out.println("Opa! o elevador está vazio!");
		}
	}

