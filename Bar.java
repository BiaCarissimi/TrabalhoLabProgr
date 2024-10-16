package ProjetoLabProgramação2;

public class Bar {
    double custoIngresso;
    double custoCerveja;
    double custoRefri;
    double custoEspetinho;
    double consumo;
    double couvert;
    double valorTotal;
    int quantCerveja;
    int quantRefri;
    int quantEspetinho;
    char sexo;

        public double calculoIngressos (char sexo){
            if (sexo == 'M'){
             custoIngresso = 10.0;
            } else if (sexo == 'F'){
              custoIngresso = 8.0;
            }
            return custoIngresso;
        }

    public double calculoCerveja (double quantCerveja){
        custoCerveja = 5*quantCerveja;
        return custoCerveja;
    }
    
    public double calculoRefri (double quantRefri){
        custoRefri = 3*quantRefri;
        return custoRefri;
    }

    public double calculoEspetinho (double quantEspetinho){
        custoEspetinho = 7*quantEspetinho;
        return custoEspetinho;
    }
    
    public double calculoConsumo (double custoEspetinho, double custoRefri, double custoCerveja, double quantCerveja, double quantEspetinho, double quantRefri){
        
        consumo = this.calculoCerveja(quantCerveja)+ this.calculoEspetinho(quantEspetinho)+ this.calculoRefri(quantRefri);
        return consumo;
    }
    
    public double custoCouvert (double custoEspetinho, double custoRefri, double custoCerveja, double quantCerveja, double quantEspetinho, double quantRefri){
        if (this.calculoConsumo(custoEspetinho, custoRefri, custoCerveja, quantCerveja, quantEspetinho, quantRefri) > 30.00){
            couvert = 0;
        }else{ 
            couvert = 4.00;
        }
        return couvert;
    }
    
    public double custoTotal (double custoEspetinho, double custoRefri, double custoCerveja, double quantCerveja, double quantEspetinho, double quantRefri, char sexo) {
        valorTotal = this.calculoConsumo(custoEspetinho, custoRefri, custoCerveja, quantCerveja, quantEspetinho, quantRefri) + this.custoCouvert(custoEspetinho, custoRefri, custoCerveja, quantCerveja, quantEspetinho, quantRefri) + this.calculoIngressos(sexo);
        return valorTotal;
    }
}