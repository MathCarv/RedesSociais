package redessociais;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {

    @Override
    public void postarFoto() {
        System.out.println("Postou Foto no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou Vídeo no Facebook");

    }

    @Override
    public void postarComentario() {
        System.out.println("Postou Comentário no Facebook");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu Publicação no Facebook");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no Facebook");
    }
    
    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma Transmissão no Facebook");
    }
    

}
