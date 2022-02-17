package padraoDecorator_e_Facade;

public class Amendoim extends AcaiDecorator{
    public Amendoim(Acaiteria umAcai) {
        super(umAcai);
        this.nome ="Amendoim";
        this.peso=200;
        this.preco = 0.85;
    }
}
