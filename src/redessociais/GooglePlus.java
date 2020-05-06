package redessociais;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{
      @Override
    public void postarFoto() {
        System.out.println("Postou Foto no GooglePlus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou Vídeo no GooglePlus");

    }

    @Override
    public void postarComentario() {
        System.out.println("Postou Comentário no GooglePlus");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu Publicação no GooglePlus");
    }
    
     @Override
    public void compartilhar() {
        System.out.println("Compartilhou no GooglePlus");
    }
    
    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma Transmissão no GooglePlus");
    }
}
