package listas.arreglos;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArreglosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArreglosApplication.class, args);
		// //ArrayList ejemplo
		// long inicio1 = System.currentTimeMillis();
		// List<Integer> lista1 = new ArrayList();
		// for(int i=0; i<1000000;i++){
		// 	lista1.add(i);
		// }
		// long fin1 = System.currentTimeMillis();
		// System.out.println(fin1 - inicio1);
	
		// //Ejemplo optimizado
		// long inicio2 = System.currentTimeMillis();
		// List<Integer> lista2 = new ArrayList(1000000);
		// for(int i=0;i<1000000;i++){
		// 	lista2.add(i);
		// }
		// long fin2 = System.currentTimeMillis();
		// System.out.println(fin2 - inicio2);


		//Ejemplo de LinkedList para ver cuál tiene mejor rendimiento
		ArrayList arrayList = new ArrayList();
		LinkedList linkedList = new LinkedList();

		//ArrayList add
		long inicio = System.currentTimeMillis();
		for(int i=0; i<100000;i++){
			arrayList.add(i);
		}
		long fin = System.currentTimeMillis();
		long duracion = fin - inicio;	
		System.out.println("ArrayList add: " + duracion);

		//LinkedList add
		inicio =System.currentTimeMillis();
		for(int i=0; i<100000;i++){
			linkedList.add(i);
		}
		fin = System.currentTimeMillis();
		duracion = fin - inicio;
		System.out.println("LinkedList add: " + duracion);

		//ArrayList get
		inicio = System.currentTimeMillis();
		for(int i=0; i<100000;i++){
			arrayList.get(i);
		}
		fin = System.currentTimeMillis();
		duracion = fin - inicio;
		System.out.println("ArrayList get: " + duracion);

		//LinkedList get
		inicio = System.currentTimeMillis();
		for(int i=0; i<100000;i++){
			linkedList.get(i);
		}
		fin = System.currentTimeMillis();
		duracion = fin - inicio;
		System.out.println("LinkedList get: " + duracion);

		//ArrayList remove
		inicio = System.currentTimeMillis();
		for(int i=99999; i>=0;i--){
			arrayList.remove(i);
		}
		fin = System.currentTimeMillis();
		duracion = fin - inicio;
		System.out.println("ArrayList remove: " + duracion);

		//LinkedList remove
		inicio = System.currentTimeMillis();
		for(int i=99999; i>=0;i--){
			linkedList.remove(i);
		}
		fin = System.currentTimeMillis();
		duracion = fin - inicio;
		System.out.println("LinkedList remove: " + duracion);

		//Conclusion de rendimiento
		//ArrayList es mucho mejor para obtener datos (get)
		//LinkedList es mucho mejor para agregar y eliminar (add/remove)


	}

	

}
