import javax.swing.*;
public class EriFoR {
    public static void main(String[] args) {
        
        int numeroEntrada = 0, factorial = 1, opcion = 0; 
        
        for (int i= 1; i<=10; i++) {
            
          opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija la opción que desea realizar: 1. Calcular factorial 2. Determinar si es par 3. Salir"));

            if (opcion == 3) {
                break;
            }
            switch (opcion) {
                case 1:
                numeroEntrada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número al que le desea calcular el Factorial"));
                for (int a = 1; a <= numeroEntrada; a++) {
                    factorial *= a;
                }
                JOptionPane.showMessageDialog(null, factorial + " es el factorial de " + numeroEntrada); factorial=1;
                    break;

                case 2:
                    numeroEntrada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número que quiere verificar si es par"));
                   
                    if ((numeroEntrada % 2) == 0) {
                        JOptionPane.showMessageDialog(null,numeroEntrada + " es par");
                    } else {
                        JOptionPane.showMessageDialog(null,numeroEntrada + " es impar");
                    }
                    break;

                default:
                JOptionPane.showMessageDialog(null,"Opción no válida");
                    break;
            }
        }
        
    }
}
