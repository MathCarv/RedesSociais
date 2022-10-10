package redessociais;

public class Instagram extends RedeSocial{
    //Instagram implements
      @Override
    public void postarFoto() {
        System.out.println("Postou Foto no Instagram");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou Vídeo no Instagram");

    }

    @Override
    public void postarComentario() {
        System.out.println("Postou Comentário no Instagram");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu Publicação no Instagram");
    }
}
