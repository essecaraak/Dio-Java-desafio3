//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AparelhoTelefonico at = new Iphone();
        NavegadorInternet ni = new Iphone();
        ReprodutorMusical rm = new Iphone();
        at.ligar("847328734");
        at.atender();
        at.iniciarCorreioVoz();
        ni.adicionarNovaAba();
        ni.atualizarPagina();
        ni.exibirPagina("google");
        rm.selecionarMusica("fly me to the moon");
        rm.tocar();
        rm.pausar();
    }
}