package padraoDecorator_e_Facade;

public class Pimenta extends AcaiDecorator{
    public Pimenta(Acaiteria umAcai) {
        super(umAcai);
        this.nome="Pimenta";
        this.peso = 30;
        this.preco=1;
    }
}
