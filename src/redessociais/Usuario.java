package redessociais;

import java.util.ArrayList;

public class Usuario {
    //Atributos do usuario
    private String nome;
    private String email;
    ArrayList<RedeSocial> usa = new ArrayList<>();

    public Usuario(ArrayList<RedeSocial> redesSociais) {
        this.usa = redesSociais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void mostraInfo(){
        System.out.println("Nome:" + this.getNome());
        System.out.println("Email:" + this.getEmail());
        System.out.println("\n");
        
    }
}
