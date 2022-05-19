package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> arrayDeNumeros;

	//Constructor
	public Counter() {
		super();
		this.arrayDeNumeros = new ArrayList<Integer>();
	}
	
	//Getters y Setters
	public ArrayList<Integer> getArrayDeNumeros() {
		return arrayDeNumeros;
	}

	public void setArrayDeNumeros(ArrayList<Integer> arrayDeNumeros) {
		this.arrayDeNumeros = arrayDeNumeros;
	}
	
	public int cantidadDePares() {
		int cantPares = 0;
		for (int numero:arrayDeNumeros) {
			if(esPar(numero)) {
				cantPares++;
			}
		}
	return cantPares;
	}

	private boolean esPar(int numero) {
		return (numero % 2 == 0);
	}
	
	public int cantidadDeImpares() {
		int cantImpares = 0;
		for (int numero:arrayDeNumeros) {
			if (!esPar(numero)) {
				cantImpares++;
			}
		}
	return cantImpares;
	}
	
	public int cantidadDeMultiploDe(int unNumero) {
		int cantMultiplos = 0;
		for (int numero:arrayDeNumeros) {
			if (esMultiplo(numero, unNumero)) {
				cantMultiplos++;
			}
		}
	return cantMultiplos;
	}

	private boolean esMultiplo(int numero, int unNumero) {
		return (unNumero % numero == 0);
	}
	
	public void addNumber(int numero) {
		this.arrayDeNumeros.add(numero);
	}
}
