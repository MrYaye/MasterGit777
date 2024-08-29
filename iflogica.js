var salarioSinAjuste, porcentajeAumento, SalarioConAjuste;
    
    salarioSinAjuste=parseFloat(prompt("Ingrese su salario sin ajuste"));
    porcentajeAumento=parseFloat(prompt("Ingrese el porcentaje del aumento"));
    

    if (salarioSinAjuste<1300606) {
        SalarioConAjuste = salarioSinAjuste + (salarioSinAjuste*porcentajeAumento);
    } else {
        SalarioConAjuste = salarioSinAjuste;
    }

    alert("Su salario con ajuste es: " + SalarioConAjuste);
