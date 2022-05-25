package ar.edu.unq.po2.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Agenda {
	private List<Persona> personas;
	
public boolean algunoEmpiezaCon(String inicio) {
		Stream<Persona> stream = this.personas.stream();
		return stream.anyMatch(p -> p.empiezaCon(inicio));
	};
	
	public List<Persona> nombresQueEmpiezanCon(String inicio){
		List<Persona> nombreEmpiezaCon = this.personas.
		stream().
		filter(p -> p.empiezaCon(inicio)).
		collect(Collectors.toList());
		return nombreEmpiezaCon;
	};
	
	public List<String> nombresParaImprimir(){
		List<String> nParaImprimir = this.personas.
				stream().
				map(p -> p.getNombre()).
				collect(Collectors.toList());
		return nParaImprimir;
	}
	
	public int sumaDeEdades() {
		int resultado = this.personas.
				stream().
				mapToInt(p -> p.getEdad()).
				reduce(0, (acumulado, nuevo) -> acumulado+nuevo);
		return resultado;
	};
	
	public Stream<Persona> ordenar(){
		Stream<Persona> stream = this.personas.stream().sorted(null);
		return null;
	};
}

