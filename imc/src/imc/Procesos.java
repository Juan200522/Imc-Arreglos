package imc;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos{

	int telefono;
	double talla,peso;
	ArrayList<String> resultadoPersona;
	ArrayList<String> nombresPersona;
	
	public void procesos () {
		
	}
	
	
	public void iniciar() {
		String menu;
		int opcValidar;
		do {
		menu = "INGRESE UNA OPCION\n";
		menu+= "1.Registrar Personas\n";
		menu+="2. Mostrar Lista\n";
		menu+="3. Eliminar\n";
		menu+= "4. Actualizar Nombre\n";
		menu+= "5. Salir\n";
		

		
		opcValidar = Integer.parseInt((JOptionPane.showInputDialog(menu)));
		
		switch (opcValidar) {
		case 1: {
			llenardatos();
			break;
		}case 2: {
			imprimirLista();
			break;
		}case 3: {
			eliminarNombre();
			break;
		}case 4: {
			actualizarNombre();
			
			
			
			break;
		}case 5: {
			System.out.println("Gracias por hacer uso de este programa");
			break;

		}
		default:
			System.out.println("Opcion incorrecta");
		}
		} while (opcValidar != 5);

	}
	
	
	public void llenardatos() {
		nombresPersona = new ArrayList<>();
		
		nombresPersona.add(JOptionPane.showInputDialog("Ingrese su nombre"));	
		
		telefono=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su telefono"));
		
		talla=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su talla"));
		
		peso=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso"));
		
		calcularImc();
	}
	
	
	public void calcularImc() {
		
		resultadoPersona = new ArrayList<>();
		String resul = "";
		double imc;
		
		imc= peso/(talla * talla);
		
		if (imc <18) {
			resul = "Anorexia";
		} else if (imc >= 18 && imc< 20) {
			resul = "Delgadez";
		} else if (imc >= 20 && imc< 27) {
			resul = "Normalidad";
		}else if (imc >= 27 && imc < 30) {
			resul = "Obesidad (grado1)";
		} else if (imc >= 30 && imc< 35) {
			resul = "Obesidad (grado2)";
		} else if (imc >= 30 && imc< 35) {
			resul = "Obesidad (grado3)";
		}else if (imc >= 40) {
			resul = "Obesidad morbida";
		}
		
		
		resultadoPersona.add(resul);
		
	}
	
	
	public void imprimirLista () {
		
		for (int i = 0; i < nombresPersona.size(); i++) {
			System.out.println(nombresPersona.get(i) + " El resultado es: " + resultadoPersona.get(i));	
		}
	}
	
	public void buscarNombre () {
	    String nombreBuscado = JOptionPane.showInputDialog("Ingrese el nombre que desea buscar");
	    boolean encontrado = false;
	    for (int i = 0; i < nombresPersona.size(); i++) {
	        if (nombresPersona.get(i).equals(nombreBuscado)) {
	            System.out.println(nombresPersona.get(i) + " El resultado es: " + resultadoPersona.get(i));
	            encontrado = true;
	            break;
	        }
	    }
	    if (!encontrado) {
	        System.out.println("El nombre buscado no se encuentra en la lista");
	    }
		
	}
	
	public void eliminarNombre () {
	    String nombreEliminar = JOptionPane.showInputDialog("Ingrese el nombre que desea eliminar");
	    boolean encontrado = false;
	    for (int i = 0; i < nombresPersona.size(); i++) {
	        if (nombresPersona.get(i).equals(nombreEliminar)) {
	            nombresPersona.remove(i);
	            resultadoPersona.remove(i);
	            System.out.println("El nombre ha sido eliminado de la lista");
	            encontrado = true;
	            break;
	        }
	    }
	    if (!encontrado) {
	        System.out.println("El nombre a eliminar no se encuentra en la lista");
	    }
		
	}
	
	public void actualizarNombre() {
	    String nombreActualizar = JOptionPane.showInputDialog("Ingrese el nombre que desea actualizar");
	    String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
	    boolean encontrado = false;
	    for (int i = 0; i < nombresPersona.size(); i++) {
	        if (nombresPersona.get(i).equals(nombreActualizar)) {
	            nombresPersona.set(i, nuevoNombre);
	            System.out.println("El nombre ha sido actualizado");
	            encontrado = true;
	            break;
	        }
	    }
	    if (!encontrado) {
	        System.out.println("El nombre a actualizar no se encuentra en la lista");
	    }
	}
	

		
}
