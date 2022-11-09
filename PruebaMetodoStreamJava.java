package com.col.pruebadomthelanguage;

import java.util.List;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PruebaMetodoStreamJava {
	
	public static void main(String[] args) {

		List<Cursos> cursos = new ArrayList<>();
		
		cursos.add(new Cursos ("Matematicas", 500));
		cursos.add(new Cursos ("Matematica Pura", 800));
		cursos.add(new Cursos ("Matematica Abstracta", 140));
		cursos.add(new Cursos ("Matematica Compuesta", 100));
		
		
		//when we're executed a Stream normally this execute and create a new object so in this case we create a foreach into of the stream//
		cursos.stream().filter(x -> x.getHoras() > 300).forEach(x -> System.out.println(x));; //for middle of stream we can filter all the courses that is major of 300 hours//
		
		//MapToInt return a value of Int//
		int sum = cursos.stream().filter(x -> x.getHoras() > 300).mapToInt(x -> x.getHoras()).sum();
		System.out.println("the sum of all the curses > 300" + sum);
		
		//This can return a value that can return value max or not//
		OptionalInt max = cursos.stream().filter(x -> x.getHoras() > 300).mapToInt(x -> x.getHoras()).max();
		System.out.println("the sum of all the curses > 300" + max);
		
		boolean validarTdos = cursos.stream().allMatch(x -> x.getHoras() > 50);
		System.out.println("here is all curse > of 100 " + validarTdos);
		//Make a filter of Users per hours > 300 and find the first of all//
		Optional<Cursos> ThefirstElement = cursos.stream().filter(x -> x.getHoras() > 300).findFirst();
		System.out.println("the firstcurse is order ascendent" + ThefirstElement.get());
		
		//create a List of Cursos because the class Collectors recolect all and convert everything in List//
		List<Cursos> masCursos = cursos.stream().filter(x -> x.getHoras() > 300).collect(Collectors.toList());
		masCursos.forEach(x -> System.out.println(x)); //show for console each curso convert in to List//
		
		/*Stream that find the first element of list where a couse is > 600 and print for console if exist of the contrary
		not print nothing only create a class with that no existe papu */
		
		cursos.stream().filter(x -> x.getHoras() > 600).findFirst().ifPresent(System.out::println);
		
		Cursos curso = cursos.stream().filter(x -> x.getHoras() > 800).findFirst().orElse(new Cursos("No existe papu!!!", 0));
		System.out.println(curso);
		
		//it's very large but basically take cursos like List and convert to collect after only make a forEaach of the map//
		cursos.stream().filter(x -> x.getHoras() > 300).collect(Collectors.toMap(Cursos::getHoras, Cursos::getNombre))
		.forEach((llave,valor) -> System.out.println(valor));
	}
};
	class Cursos {
		
		private String nombre;
		private int horas;
		
		public String getNombre() {
			return nombre;
		}
		public int getHoras() {
			return horas;
		}
		
		public Cursos(String nombre, int horas) {
			this.nombre = nombre;
			this.horas = horas;
		
			}
		
		@Override //make a Method To String where concat this.nombre with this.horas//
		public String toString() {
			return this.nombre.concat(" - ").concat(String.valueOf(getHoras()));
		}
		}
	
	
	

