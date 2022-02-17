package padraoDecorator_e_Facade;

public class Banana extends AcaiDecorator{

    public Banana(Acaiteria umAcai) {
        super(umAcai);
        this.nome = "Banana";
        this.peso = 80;
        this.preco = 0.70;
    }
}
