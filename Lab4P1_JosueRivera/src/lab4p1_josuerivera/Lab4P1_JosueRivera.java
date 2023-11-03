/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_josuerivera;
import java.util.Scanner;
/**
 *
 * @author josue
 */
public class Lab4P1_JosueRivera {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Scanner input = new Scanner (System.in);
        System.out.println("elija una opcion:");
        System.out.println("1.Inversion especial");
        System.out.println("2. balanza de cadenas");
        System.out.println("3.");
        System.out.println("introduzca una opcion");
        int opcion = Sc.nextInt();
        while ( opcion > 0 && opcion <=3){
            switch (opcion){
                case 1:{
                    String cad;
                    System.out.println("introduzca una frase");
                    
                    cad = input.nextLine();
                    while (cad.length()< 5){
                        System.out.println("debe introducir"
                                + " una cadena mas larga");
                        cad = input.nextLine();
                        
                    }
                    String str = "";
                    String esp = " ";
                    for (int i = 0; cad.length() -1 >= i; i++){
                        esp += cad.charAt(i);
                        if ((int)cad.charAt(i)== 32 || i == cad.length() - 1){
                            for(int p = esp.length() -1; p >= 0; p--){
                                str += esp.charAt(p);
                            }
                            str+= " ";
                            esp = " ";
                        }
                    }
                    System.out.println("cade invertida:"+ str);
                    System.out.println("ok1");
                    break;
                }
                case 2:{
                    String cad1, cad2, cad3;
                    int num1 =0;
                    int num2 = 0;
                    int num3 =0;
                    System.out.println("introduzca cad 1");
                    cad1 = input.nextLine();
                    System.out.println("introduzca cad 2");
                    cad2 = input.nextLine();
                    System.out.println("introduzca cad 3");
                    cad3 = input.nextLine();
                    for (int i = 0; i <= cad1.length()-1;i++){
                        char char1 = cad1.charAt(i);
                        num1 += (int)char1;
                    }
                    System.out.println("peso de cadena 1:"+num1);
                    for (int p = 0; p <= cad2.length()-1;p++){
                        char char2 = cad2.charAt(p);
                        num2 += (int)char2;
                    }
                    System.out.println("peso de la cadena 2:"+ num2);
                    for (int j = 0; j <= cad3.length()-1; j++){
                        char char3 = cad3.charAt(j);
                        num3 += (int)char3;
                    }
                    System.out.println("peso de la cadena 3:"+num3);
                    if (num1 > num2 && num1 > num3){
                        System.out.println("la cadena 1 es la mas pesada");
                    }
                    else if(num2 > num1 && num2> num3){
                        System.out.println("la cadena 2 es la mas pesada");
                    }
                    else if ( num3 > num1 && num3 > num2){
                        System.out.println("la cadena 3 es la mas pesada");
                    }
                        
                    System.out.println(" ok2");
                    break;
                }
                case 3:{
                    String cad;
                    String palabra = "";
                    int num = 0;
                    System.out.println("Introduzca la cadena:");
                    cad = input.nextLine();
                    while ("".equals(cad)){
                        System.out.println("Introduzca una cadena");
                        cad = input.nextLine();
                    }
                    for (int i = 0; i <= cad.length()-1;i++){
                        char num1 = cad.charAt(i);
                        num = (num1 +2);
                        char val = (char)num;
                        palabra += val;
                    }
                    System.out.println(palabra);
                    System.out.println("ok3");
                    break;
                }
            }
            System.out.println("elija una opcion:");
            System.out.println("1.Inversion especial");
            System.out.println("2.balanza de cadenas");
            System.out.println("3.");
            System.out.println("introduzca una opcion");
            opcion = Sc.nextInt();
        }
        System.out.println("ok");
        // TODO code application logic here
    }
    
}
