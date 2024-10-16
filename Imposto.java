package projetolabprogramação;

public class Imposto {
    
    double salarioMensal;
    double rendaAnual;
    double imposto;
    double prestServico;
    double capital;
    double gastoMedico;
    double gastoEducacional;
    double deducao;
    double maxDeducao;
    double gastoTotal;
    
    public double calculoImposto(double salarioMensal, double rendaAnual){
        if (salarioMensal < 3000.0){
            imposto = 0.0;
        } else if (salarioMensal > 3000.0 && salarioMensal < 5000.0){
            imposto = (rendaAnual / 100) * 10;
        } else if (salarioMensal >= 5000.0){
            imposto = (rendaAnual / 100) * 20;
        }
        
    return imposto; }
    
    public double prestacaoServico(double prestServico){
        imposto = (prestServico / 100) * 15;
        
    return imposto; }
    
    public double ganhoCapital(double capital){
        imposto = (capital / 100) * 20;
        
    return imposto; }
    
    public double calculaMaxDeducao(double gastoMedico, double gastoEducacional, double salarioMensal, double rendaAnual, double prestServico, double capital){
         maxDeducao = ((this.calculoImposto(salarioMensal, rendaAnual) + this.prestacaoServico(prestServico) + this.ganhoCapital(capital)) / 100) * 30;
 
         return maxDeducao; }
    
    public double deducaoImposto(double gastoMedico, double gastoEducacional, double salarioMensal, double rendaAnual, double prestServico, double capital) {
        gastoTotal = gastoMedico + gastoEducacional;
        maxDeducao = this.calculaMaxDeducao(gastoMedico, gastoEducacional, salarioMensal, rendaAnual, prestServico, capital);
        
        if (gastoTotal < maxDeducao){
            deducao = gastoTotal;
        } else {
            deducao = maxDeducao;
        }
    return deducao; }
    
}
