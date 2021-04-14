package areatriangulo;

import java.util.Scanner;

/**
 * @author RafaelRodrigues1
 */
public class Triangulo {
    
    Scanner in = new Scanner(System.in);
    public double ladoa;
    public double ladob;
    public double ladoc;
        
    private Double calculaP(){
        double p = (this.ladoa+this.ladob+this.ladoc)/2;
        return p;
    }
    
    public Double calculaArea(){
        double p = this.calculaP();
        double area = Math.sqrt(p*(p - this.ladoa)*(p - this.ladob)*(p - this.ladoc));
        return area;
    }
    
    public void insereLados(){
        System.out.print("Insira o valor do lado a: ");
        this.ladoa = in.nextDouble();
        System.out.print("Insira o valor do lado b: ");
        this.ladob = in.nextDouble();
        System.out.print("Insira o valor do lado c: ");
        this.ladoc = in.nextDouble();
    }
    
    public void mostraLados(){
        System.out.print(this.ladoa + " " + this.ladob + " " + this.ladoc + "\n");
    }   
}
