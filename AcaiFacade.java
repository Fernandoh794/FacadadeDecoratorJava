package padraoDecorator_e_Facade;

import java.util.Scanner;

public class AcaiFacade  {
    private Acai acai;
    private Amendoim amendoim;
    private Banana banana;
    private Castanha castanha;
    private Cereja cereja;
    private Kiwi kiwi;
    private Leite_Condensado leite_condensado;
    private Morango morango;
    private Ninho ninho;
    private Pimenta pimenta;
    private Po_De_Guarana po_de_guarana;

    public AcaiFacade(Acaiteria umAcai){

        this.acai = new Acai();
        this.amendoim = new Amendoim(umAcai);
        this.banana = new Banana(umAcai);
        this.castanha = new Castanha(umAcai);
        this.cereja = new Cereja(umAcai);
        this.kiwi = new Kiwi(umAcai);
        this.leite_condensado = new Leite_Condensado(umAcai);
        this.morango = new Morango(umAcai);
        this.ninho = new Ninho(umAcai);
        this.pimenta = new Pimenta(umAcai);
        this.po_de_guarana = new Po_De_Guarana(umAcai);
    }

    public AcaiFacade() {

    }
    public void montarAcai(){
        Scanner ler = new Scanner(System.in);
        Acaiteria umAcai = new Acai();
        System.out.println("Qual a quantidade de Açai desejada em Gramas?");
        int qtd = ler.nextInt();
        umAcai.setPeso(qtd);
        umAcai.preco=40*qtd/1000;
        String resp;
        System.out.println("Deseja adicionar algum Adicional(SIM/NAO)?");
        resp = ler.next();

        while(resp.equalsIgnoreCase("SIM")) {
            int cod;

            System.out.println("Informe o numero do adicional desejado:"
                    +"\n1-Ninho"
                    +"\n2-Leite condensado"
                    +"\n3-Banana"
                    +"\n4-Cereja"
                    +"\n5-Kiwi"
                    +"\n6-Castanha"
                    +"\n7-Amendoim"
                    +"\n8-Morango"
                    +"\n9-Pó de Guaraná"
                    +"\n10-Pimenta");
            cod= ler.nextInt();
            switch (cod){
                case 1:
                    umAcai = new Ninho(umAcai);
                    break;
                case 2:
                    umAcai = new Leite_Condensado(umAcai);
                    break;
                case 3:
                    umAcai = new Banana(umAcai);
                    break;
                case 4:
                    umAcai = new Cereja(umAcai);
                    break;
                case 5:
                    umAcai = new Kiwi(umAcai);
                    break;
                case 6:
                    umAcai = new Castanha(umAcai);
                    break;
                case 7:
                    umAcai = new Amendoim(umAcai);
                    break;
                case 8:
                    umAcai = new Morango(umAcai);
                    break;
                case 9:
                    umAcai = new Po_De_Guarana(umAcai);
                    break;
                case 10:
                    umAcai = new Pimenta(umAcai);
                    break;
                default:
                    break;
            }
            System.out.println("Deseja adicionar mais algum Adicional?(SIM/NAO)?");
            resp = ler.next();

        }
        System.out.println("Açai Montado");
        System.out.println(umAcai.getNome()+"("+umAcai.getPeso()+"g)"+" valor:R$  "+umAcai.getPreco());

    }
    public void montarAcaiBaiano(){
        Acaiteria umAcai = new Acai();
        umAcai = new Ninho(umAcai);
        umAcai = new Pimenta(umAcai);
        System.out.print("Açai baiano:");
        System.out.println(umAcai.getNome()+"("+umAcai.getPeso()+"g)"+" = "+umAcai.getPreco());

    }
    public void montarAcaiBomba(){
        Acaiteria umAcai = new Acai();
        umAcai = new Amendoim(umAcai);
        umAcai = new Po_De_Guarana(umAcai);
        System.out.print("Açai Bomba:");
        System.out.println(umAcai.getNome()+"("+umAcai.getPeso()+"g)"+" = "+umAcai.getPreco());

    }
    public void montarAcaiSergipano(){
        Acaiteria umAcai = new Acai();
        umAcai = new Banana(umAcai);
        umAcai = new Amendoim(umAcai);
        umAcai = new Morango(umAcai);
        System.out.print("Açai Sergipano:");
        System.out.println(umAcai.getNome()+"("+umAcai.getPeso()+"g)"+" = "+umAcai.getPreco());

    }
    public void montarAcaiParaense(){
        Acaiteria umAcai = new Acai();
        umAcai = new Castanha(umAcai);
        System.out.print("Açai Paraense:");
        System.out.println(umAcai.getNome()+"("+umAcai.getPeso()+"g)"+" = "+umAcai.getPreco());

    }
}
