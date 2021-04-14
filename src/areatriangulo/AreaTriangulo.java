package areatriangulo;

/**
 * @author RafaelRodrigues1
 */
public class AreaTriangulo {

    public static void main(String[] args) {
        
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();
        t1.insereLados();              
        t2.insereLados();
        System.out.print("Os lados do t1 são: "); 
        t1.mostraLados();
        System.out.print("Os lados do t2 são: ");       
        t2.mostraLados();
        double areaT1 = t1.calculaArea();
        double areaT2 = t2.calculaArea();
        System.out.printf("A área do triângulo t1 é: %.3f\n", areaT1);
        System.out.printf("A área do triângulo t2 é: %.3f\n", areaT2);
        if(areaT1 > areaT2){
            System.out.println("Triângulo com maior área: t1");
        }else if(areaT1 < areaT2){
            System.out.println("Triângulo com maior área: t2");
        }else if(areaT1 == areaT2){
            System.out.println("As áreas dos triângulos t1 e t2 são iguais.");
        }
               
    }
    
}
