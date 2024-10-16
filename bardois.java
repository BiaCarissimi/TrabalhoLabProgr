package ProjetoLabProgramação2;
import java.util.Scanner;

public class bardois{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char sexo;
        double quantCerveja;
        double quantRefri;
        double quantEspetinho;
        double custoIngresso;
        double custoCerveja;
        double custoRefri;
        double custoEspetinho;
        double consumo;
        double couvert;
        double valorTotal;
        Bar bar = new Bar();
    
        System.out.println("Sexo (F ou M):");
        sexo = input.nextLine().charAt(0);
        while (sexo != 'F' && sexo != 'M'){
            System.out.println("Resposta inválida. Tente novamente.");
            System.out.println("Sexo (F ou M):");
        sexo = input.nextLine().charAt(0);
        }
        System.out.println("Quantidade de cervejas:");
        quantCerveja = input.nextDouble();
        System.out.println("Quantidade de refrigerantes:");
        quantRefri = input.nextDouble();
        System.out.println("Quantidade de espetinhos:");
        quantEspetinho = input.nextDouble();
        
        custoCerveja = bar.calculoCerveja(quantCerveja);
        custoRefri = bar.calculoRefri(quantRefri);
        custoEspetinho = bar.calculoEspetinho(quantEspetinho);
        custoIngresso = bar.calculoIngressos(sexo);
        couvert = bar.custoCouvert(custoEspetinho, custoRefri, custoCerveja, quantCerveja, quantEspetinho, quantRefri);
        consumo = bar.calculoConsumo(custoEspetinho, custoRefri, custoCerveja, quantCerveja, quantEspetinho, quantRefri);
        valorTotal = bar.custoTotal(custoEspetinho, custoRefri, custoCerveja, quantCerveja, quantEspetinho, quantRefri, sexo);
        
        System.out.println("RELATÓRIO:");
        System.out.println("Consumo = R$"+consumo);
        if (couvert == 0){
            System.out.println("Isento de Couvert");
        }else{
            System.out.println("Couvert = R$"+couvert);
        }
        System.out.println("Ingresso = R$"+custoIngresso);
        System.out.println("");
        System.out.println("Valor a pagar = R$"+valorTotal);
    
    }
}