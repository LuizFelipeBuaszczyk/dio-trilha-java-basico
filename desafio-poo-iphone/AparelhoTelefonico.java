public abstract class AparelhoTelefonico {

    protected void ligar(String numero){
        System.out.println("Ligando para o número " + numero);
        atender();
    }

    protected  void atender(){
        System.out.println("Ligação atendida!");
    }

    protected void iniciarCorreioVoz(){
        System.out.println("PIII. O número que você está ligando está indisponível no momento, deseja deixar algum recado?");
    }


}
