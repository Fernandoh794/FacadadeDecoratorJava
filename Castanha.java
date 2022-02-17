package padraoDecorator_e_Facade;

public class Castanha extends AcaiDecorator{
    public Castanha(Acaiteria umAcai) {
        super(umAcai);
        this.nome="Castanha";
        this.peso=120;
        this.preco=7;
    }
}
