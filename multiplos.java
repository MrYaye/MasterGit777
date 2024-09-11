import javax.swing.JOptionPane;

public class multiplos {
    public static void main(String[] args) {
        
        //Se le piden los numeros al usuario
        String multiplo1 = JOptionPane.showInputDialog("Ingrese el primer número (entero positivo):");
        String multiplo2 = JOptionPane.showInputDialog("Ingrese el segundo número (entero positivo):");
        
        try {
            //Crear variables, tipo de dato entero
            int numero1 = Integer.parseInt(multiplo1);
            int numero2 = Integer.parseInt(multiplo2);

            // FASE 1: Sentencia IF. Se emplea para verificar que los numeros sean positivos
            if (numero1 <= 0 || numero2 <= 0) {
                JOptionPane.showMessageDialog(null, "Los números deben ser enteros positivos.");
                return;
            }

            // FASE 2: Determinar si son múltiplos con otra Sentencia IF
            String result;
            if (numero1 % numero2 == 0) {
                result = numero1 + " es múltiplo de " + numero2;
            } else if (numero2 % numero1 == 0) {
                result = numero2 + " es múltiplo de " + numero1;
            } else {
                result = "Ninguno de los dos números es múltiplo del otro";
            }

            // FASE 3: Mostrar el resultado en pantalla
            JOptionPane.showMessageDialog(null, result);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese números enteros válidos.");
        }
    }
}