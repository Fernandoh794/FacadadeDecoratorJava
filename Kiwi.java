package padraoDecorator_e_Facade;

public class Kiwi extends AcaiDecorator{
    public Kiwi(Acaiteria umAcai) {
        super(umAcai);
        this.nome="Kiwi";
        this.peso=300;
        this.preco=2.00;
    }
}
