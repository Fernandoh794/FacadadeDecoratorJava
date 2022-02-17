package padraoDecorator_e_Facade;

public class Leite_Condensado extends AcaiDecorator{
    public Leite_Condensado(Acaiteria umAcai) {
        super(umAcai);
        this.nome="Leite_Condensado";
        this.peso=100;
        this.preco=0.50;
    }
}
