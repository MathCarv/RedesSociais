package redessociais;

public class Twitter extends RedeSocial implements Compartilhamento{
    //Compartilhamento das redes
      @Override
    public void postarFoto() {
        System.out.println("Postou Foto no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou Vídeo no Twitter");

    }

    @Override
    public void postarComentario() {
        System.out.println("Postou Comentário no Twitter");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu Publicação no Twitter");
    }
    
         @Override
    public void compartilhar() {
        System.out.println("Compartilhou no Twitter");
    }
}
