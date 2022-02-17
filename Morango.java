package padraoDecorator_e_Facade;

public class Morango extends AcaiDecorator{
    public Morango(Acaiteria umAcai) {
        super(umAcai);
        this.nome = "Morango";
        this.peso = 100;
        this.preco= 2.00;
    }
}
