package padraoDecorator_e_Facade;

public class Cliente {
    public static void main(String[] args) {
        Acaiteria umAcai = new Acai();
        System.out.println(umAcai.getNome()+"("+umAcai.getPeso()+"g)"+"="+umAcai.getPreco());
        umAcai = new Banana(umAcai);
        umAcai = new Morango(umAcai);
        umAcai = new Leite_Condensado(umAcai);
        System.out.println(umAcai.getNome()+"("+umAcai.getPeso()+"g)"+" = "+umAcai.getPreco());

     AcaiFacade facade = new AcaiFacade();

     facade.montarAcaiBomba();
     facade.montarAcaiSergipano();
     facade.montarAcaiBaiano();
     facade.montarAcaiParaense();
     facade.montarAcai();

    }
}
