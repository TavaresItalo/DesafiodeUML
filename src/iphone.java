import Classes.device;

public class iphone {
    public static void main(String[] args) throws Exception {
        device iphone = new device();

        // Funções de um aparelho telefônico comum
        iphone.ligar();
        iphone.atender();
        iphone.IniciarCorreioVoz();

        // Funções de um navegador.
        iphone.AdicionarAba();
        iphone.AtualizarPagina();
        iphone.ExibirPagina();

        // Funções de um ipod.
        iphone.TocarMusica();
        iphone.Pausar();
        iphone.SelecionarMusica();
    }
}
