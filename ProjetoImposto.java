package projetolabprogramação;
import java.util.Scanner;

public class ProjetoLabProgramação {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Imposto imposto = new Imposto();
        double rendaSalario;
        double salarioMensal;
        double rendaPrestServico;
        double rendaGanhoCapital;
        double gastoMedico;
        double gastoEducacional;
        double impostoSalario;
        double impostoPrestServico;
        double impostoGanhoCapital;
        double deducao;
        double dedutivel;
        double maxDeducao;
        double impostoBruto;
        double impostoTotal;
        
        System.out.println("Digite sua renda anual com salário: ");
        rendaSalario = input.nextDouble();
        System.out.println("Digite sua renda anual com Prestação de serviços: ");
        rendaPrestServico = input.nextDouble();
        System.out.println("Digite sua renda anual com ganho de capital: ");
        rendaGanhoCapital = input.nextDouble();
        System.out.println("Digite seus gastos médicos: ");
        gastoMedico = input.nextDouble();
        System.out.println("Digite seus gastos educacionais: ");
        gastoEducacional = input.nextDouble();
        
        
        salarioMensal = (rendaSalario / 12) + (rendaSalario % 12);
        impostoSalario = imposto.calculoImposto(salarioMensal, rendaSalario);
        impostoPrestServico = imposto.prestacaoServico(rendaPrestServico);
        impostoGanhoCapital = imposto.ganhoCapital(rendaGanhoCapital);
        maxDeducao = imposto.calculaMaxDeducao(gastoMedico, gastoEducacional, salarioMensal, rendaSalario, rendaPrestServico, rendaGanhoCapital);
        dedutivel = gastoEducacional + gastoMedico;
        deducao = imposto.deducaoImposto(gastoMedico, gastoEducacional, salarioMensal, rendaSalario, rendaPrestServico, rendaGanhoCapital);
        impostoBruto = impostoSalario + impostoPrestServico + impostoGanhoCapital;
        impostoTotal = impostoBruto - deducao;
        
        System.out.println("### RELATÓRIO DE IMPOSTO DE RENDA ###");
        System.out.println("");
        System.out.println("");
        System.out.println("* CONSOLIDADO DE RENDA:");
        System.out.println("Imposto sobre o salário: " + impostoSalario);
        System.out.println("Imposto sobre serviços: " + impostoPrestServico);
        System.out.println("Imposto sobre ganho de capital: " + impostoGanhoCapital);
        System.out.println("");
        System.out.println("");
        System.out.println("* DEDUÇÕES: ");
        System.out.println("Máximo dedutível: " + maxDeducao);
        System.out.println("Gastos Dedutíveis: " + dedutivel);
        System.out.println("");
        System.out.println("");
        System.out.println("* RESUMOS:");
        System.out.println("Imposto bruto total: " + impostoBruto);
        System.out.println("Abatimento: " + deducao);
        System.out.println("Imposto devido: " + impostoTotal);
    }
}
