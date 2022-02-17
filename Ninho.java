package padraoDecorator_e_Facade;

public class Ninho extends AcaiDecorator{
    public Ninho(Acaiteria umAcai) {
        super(umAcai);
        this.nome="Ninho";
        this.peso=50;
        this.preco=1;
    }
}
