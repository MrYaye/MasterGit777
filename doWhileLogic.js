var numeroEntrada=0, factorial=1, opcion;

do {
    opcion= parseInt(prompt("Elija la opcion que desea realizar: 1. Calcular factorial 2. Determinar si es par"));
    switch (opcion) {
        case 1:
            numeroEntrada=parseInt(prompt("Ingrese el número al que le desea cálcular el Factorial"));
            for (let i = 1; i <=  numeroEntrada; i++) {
               factorial=factorial*i;
                
            }
            alert(factorial + "Es el factorial de " + numeroEntrada); 

            break;
        case 2:
            numeroEntrada=parseInt(prompt("Ingrese el número que quiere verificar si es par"));
            if ((numeroEntrada % 2)== 0) {
                alert(numeroEntrada+ ": Es par");                
            } else {
                alert(numeroEntrada+ ": Es impar");  
            }

            break;

        default:
            break;
    }

} while (opcion != 3);