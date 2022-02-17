package padraoDecorator_e_Facade;

public class Cereja extends AcaiDecorator{
    public Cereja(Acaiteria umAcai) {
        super(umAcai);
        this.nome="Cereja";
        this.peso=70;
        this.preco=2.00;
    }
}
