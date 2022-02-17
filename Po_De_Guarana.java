package padraoDecorator_e_Facade;

public class Po_De_Guarana extends AcaiDecorator{
    public Po_De_Guarana(Acaiteria umAcai) {
        super(umAcai);
        this.nome="Pó_De_guaraná";
        this.peso=100;
        this.preco=3.00;
    }
}
