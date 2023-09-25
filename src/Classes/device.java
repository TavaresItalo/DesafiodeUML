package Classes;

import Interfaces.aparelhotelefonico;
import Interfaces.navegador;
import Interfaces.tocadorMusica;

public class device implements aparelhotelefonico, navegador, tocadorMusica {
    public void ligar() {
        System.out.println("LIGANDO");
    }
    public void atender() {
        System.out.println("ATENDENDO");
    }

    public void IniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    public void ExibirPagina() {
        System.out.println("EXIBINDO PÁGINA");
    }

    public void AtualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }

    public void AdicionarAba() {
        System.out.println("ADICIONANDO ABA");
    }

    public void TocarMusica() {
        System.out.println("TOCANDO MÚSICA");
    }

    public void Pausar() {
        System.out.println("PAUSANDO");
    }

    public void SelecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA");
    }
    
}
