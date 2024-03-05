package orientacaoobjetos;

class Animal {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void Comer(){
        System.out.println("Comendo...");
    }
}

class Cachorro extends Animal {
    public void mostrar(){
        System.out.printf("Nome: %s",getNome());
    }
}

class Gato extends Animal {
    public void mostrar(){
        System.out.printf("Nome: %s",getNome());
    }
}

public class Pratica01 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Bob");
        cachorro.Comer();
        cachorro.mostrar();

        Gato gato = new Gato();
        gato.setNome("Toreto");
        gato.mostrar();
    }
}
