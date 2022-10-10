package redessociais;

import java.util.ArrayList;

public class RedesSociais {

    public static void main(String[] args) {

        ArrayList<RedeSocial> redesSociais = new ArrayList<>();

        Facebook facebook = new Facebook();
        facebook.setSenha("512315");
        facebook.setNumAmigos(1523);
        redesSociais.add(facebook);

        Instagram instagram = new Instagram();
        instagram.setSenha("6123123");
        instagram.setNumAmigos(123);
        redesSociais.add(instagram);

        Usuario usuario = new Usuario(redesSociais);
        usuario.setNome("Matheus Camara Carvalho");
        usuario.setEmail("matheus.camara@gec.inatel.br");
        usuario.mostraInfo();

        for (int i = 0; i < usuario.usa.size(); i++) {
            if (usuario.usa.get(i) instanceof Facebook) {
                Facebook fb = (Facebook) usuario.usa.get(i);
                System.out.println("---------Facebook---------");
                System.out.println("Numero de Amigos:" + fb.getNumAmigos());
                System.out.println("Senha:" + fb.getSenha());
                fb.compartilhar();
                fb.fazStreaming();
                fb.curtirPublicacao();
                System.out.println("\n");
            } else if (usuario.usa.get(i) instanceof Instagram) {
                Instagram ig = (Instagram) usuario.usa.get(i);
                System.out.println("---------Instagram---------");
                System.out.println("Numero de Amigos:" + ig.getNumAmigos());
                System.out.println("Senha:" + ig.getSenha());
                ig.postarComentario();
                ig.postarVideo();
                ig.postarFoto();
                System.out.println("\n");
            } else if (usuario.usa.get(i) instanceof Twitter) {
                Twitter tw = (Twitter) usuario.usa.get(i);
                System.out.println("---------Twitter---------");
                System.out.println("Numero de Amigos:" + tw.getNumAmigos());
                System.out.println("Senha:" + tw.getSenha());
                tw.postarComentario();
                tw.postarVideo();
                tw.postarFoto();
                System.out.println("\n");
            } else {
                GooglePlus gp = (GooglePlus) usuario.usa.get(i);
                System.out.println("---------Instagram---------");
                System.out.println("Numero de Amigos:" + gp.getNumAmigos());
                System.out.println("Senha:" + gp.getSenha());
                gp.postarComentario();
                gp.postarVideo();
                gp.postarFoto();
                System.out.println("\n");
            }
        }

    }
}
