import java.util.Stack;
import javax.swing.JOptionPane;

public class metodos {
    public void LlenarPila() {
        Stack<Vehiculo> pila = new Stack<>();
        boolean continuar = true;
        String agregar = "";
        while (continuar) {
            Vehiculo o = new Vehiculo();
            o.setMarca(JOptionPane.showInputDialog("Ingrese La marca"));
            o.setColor(JOptionPane.showInputDialog("Ingrese La Color"));
            o.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio")));
            pila.push(o);
            agregar = JOptionPane.showInputDialog("Desea agregar mas Registros S/N");
            if (agregar.equalsIgnoreCase("N")) {
                continuar = false;
            }

        }
        MostrarPila(pila);
        int opt = Integer.parseInt(JOptionPane.showInputDialog("ingrese 1: consultar, 2: eliminar ,3 modificar, 4 salir del programa "));
        
        if (opt != 4) {
            do {
            
                pila = AccionesRegistro(pila, opt);
                MostrarPila(pila);

                opt = Integer.parseInt(JOptionPane.showInputDialog("ingrese 1: consultar, 2: eliminar ,3 modificar, 4 salir del programa "));
    
            }
            while(opt != 4);
        }

        System.out.println("Programa finalizado");
        MostrarPila(pila);
        
    }

    public void MostrarPila(Stack<Vehiculo> pila) {
        for (Vehiculo o : pila) {
            System.out.println("Marca: " + o.getMarca());
            System.out.println("Color: " + o.getColor());
            System.out.println("Precio " + o.getPrecio());
            System.out.println();
        }
    }

    public Stack<Vehiculo> AccionesRegistro(Stack<Vehiculo> pila, int opt) {
        String dato = "";
        if (opt == 1) {
            dato = JOptionPane.showInputDialog("Ingrese el registro a consultar");
        } else if (opt == 2) {
            dato = JOptionPane.showInputDialog("Ingrese el registro al que desea eliminar");
        } else {
            dato = JOptionPane.showInputDialog("Ingrese el registro al que desea Modificar");
        }
        for (Vehiculo vehiculo : pila) {
            if (vehiculo.getMarca().equalsIgnoreCase(dato)) {
                if (opt == 1) {
                    System.out.println(
                            "el registro se encuentras y es: " + vehiculo.getMarca() + " " + vehiculo.getPrecio());
                } else if (opt == 2) {
                    pila.remove(vehiculo);
                } else {
                    vehiculo.setMarca(JOptionPane.showInputDialog("Ingrese La marca"));

                }
            }
        }

        return pila;

    }
}
