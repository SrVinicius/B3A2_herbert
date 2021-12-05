import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Quest3{
    FileInputStream folder = new FileInputStream("C:\Users\usuario\Desktop\inp\texiste.txt");
    InputStreamReader input = new InputStreamReader(folder);
    private int placa;
	private String modelo;
	private int horaentrada;
	private int horasaida;

     
    public int getPlaca() {
		return (placa);
	}

	public void setPlaca(int Placa) {
		this.placa = Placa;
	}


    public int gethorasaida() {
		return (horasaida);
	}

	public void sethorasaida(int Saida) {
		this.horaSaida = Saida;
	}

    public String getModelo() {
		return (modelo);
	}

	public void setModelo(String Modelo) {
		this.modelo = Modelo;
	}
    
    public int gethoraentrada() {
		return (horaentrada);
	}

	public void sethoraentrada(int Entrada) {
		this.horaentrada = Entrada;
	}
    
	public void Imprimir() {
		System.out.println(this.placa);
		System.out.println(this.modelo);
		System.out.println(this.horaentrada);
		System.out.println(this.horasaida);
	}

	public float Valorfinal() {
		return ((horasaida - horaentrada) * 1.50);
	}
}
