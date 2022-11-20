package laboratorio_pruebas;

import java.util.Scanner;

public class Laboratorio_pruebas {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        float[] categorias = new float[3];
        categorias[0] = 12000;
        categorias[1] = 17000;
        categorias[2] = 22000;
        
        int op;
        double horas,salario,categoria = 0;
        
        System.out.println("Ingrese las horas laboradas: ");
        horas = teclado.nextInt();
        System.out.println("Seleccione la categoria: ");
        System.out.println("1. categoria 1");
        System.out.println("2. categoria 2");
        System.out.println("3. categoria 3");
        op = teclado.nextInt();
        
        switch (op) {
            case 1 -> categoria = categorias[0];
            case 2 -> categoria = categorias[1];
            case 3 -> categoria = categorias[2];
            default -> System.out.println("La categoria seleccionada no existe");
        }
        
        if(horas > 40) {
            salario = ((horas * 1.25) * categoria);
        } else {
            salario = horas * categoria;
        }
        
        System.out.println(salario);
    }
    
}
