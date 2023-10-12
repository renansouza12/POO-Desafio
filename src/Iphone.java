public class Iphone {
    public static void main(String[] args) {

        ligar();
        desligar();

        ReprodutorMusical musicas = new funcionalidades();
            musicas.tocarMusica();
            musicas.pausarMusica();
            musicas.aumentarVolume();
            musicas.diminuirVolume();

            AparelhoTelefonico celular = new telefone();
            celular.fazerLigacao();
            celular.responderLigacao();

            NavegarInternet navegar = new internet();
            navegar.pesquisarSite();
            navegar.abrirSite();
            navegar.fecharSite();
    }

      
    private String sistemaOperacional;
    private int armazenamento;

    public void  iphone(String sistemaOperacional, int armazenamento){
        this.sistemaOperacional = sistemaOperacional;
        this.armazenamento = armazenamento;
    }

    public static void ligar(){
        System.out.println("ligar Iphone");
    }
    public static void desligar(){
        System.out.println("Desligar Iphone");
    }
    
   
}
 
interface  ReprodutorMusical{
    void tocarMusica();
    void pausarMusica();
    void aumentarVolume();
    void diminuirVolume();
}
class funcionalidades implements ReprodutorMusical{
  
    @Override
    public void pausarMusica() {
       System.out.println("Pausar música");
    }

    @Override
    public void aumentarVolume() {
         System.out.println("Aumentar o volume da música");
    }

    @Override
    public void diminuirVolume() {
         System.out.println("Diminuiro volume da música");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Pausar música");
    }
}

interface AparelhoTelefonico{
    void fazerLigacao();
    void responderLigacao();
}

class telefone implements AparelhoTelefonico{

    @Override
    public void fazerLigacao(){
        System.out.println("Fazendo Ligação");
    }
     @Override
    public void responderLigacao(){
        System.out.println("Atedendo Ligação");
    }
}


interface NavegarInternet{
    void abrirSite();
    void fecharSite();
    void pesquisarSite();
}

class  internet implements NavegarInternet{

    @Override
    public void abrirSite(){
        System.out.println("abrir site");
    }
    @Override
    public void pesquisarSite(){
        System.out.println("Pesquisar site");
    }
      @Override
    public void fecharSite(){
        System.out.println("fechar site");
    }

}