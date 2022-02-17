package padraoDecorator_e_Facade;

public abstract class AcaiDecorator extends Acaiteria{
    Acaiteria acaiteria;
    public AcaiDecorator(Acaiteria umAcai){
        acaiteria  = umAcai;
    }

    @Override
    public String getNome() {
        return acaiteria.getNome()+"("+acaiteria.getPeso()+"g)"+" + "+nome;
    }


    @Override
    public double getPreco() {
        return acaiteria.getPreco()+ preco;
    }
}
