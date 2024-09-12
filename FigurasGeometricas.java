public class FigurasGeometricas {
    
float LadoCuadrado;
float BaseTriangulo;
float AlturaTriangulo;
float RadioCirculo;
int OptionFigura;


public FigurasGeometricas(float ladoCuadrado, float baseTriangulo, float alturaTriangulo, float radioCirculo,
        int optionFigura) {
    this.LadoCuadrado = ladoCuadrado;
    this.BaseTriangulo = baseTriangulo;
    this.AlturaTriangulo = alturaTriangulo;
    this.RadioCirculo = radioCirculo;
    this.OptionFigura = optionFigura;
}

public void calcularArea(){
    switch (OptionFigura) {

        case 1: 

            float areaCuadrado = LadoCuadrado*LadoCuadrado;
            System.out.println("El area del cuadrado es:"+ areaCuadrado);
             break;
        case 2:

            float areaTriangulo = BaseTriangulo*BaseTriangulo/2;
            System.out.println("El area del cuadrado es:"+ areaTriangulo);
             break;
        case 3:

            double areaCirculo = (Math.PI) * RadioCirculo*RadioCirculo;
            System.out.println("El area del cuadrado es:"+ areaCirculo);
             break;  

     default:
         break;
}
}




}
