package orientacaoobjetos;

// Classe pai
class Animal {
    public void fazerSom() {
        System.out.println("Som genérico de animal");
    }
}

// Subclasse 1
class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Latindo...");
    }
}

// Subclasse 2
class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Miando...");
    }
}

public class Polimorfismo {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro(); // Objeto Cachorro
        Animal animal2 = new Gato();     // Objeto Gato
        animal1.fazerSom(); // Saída: Latindo...
        animal2.fazerSom(); // Saída: Miando...
    }
}
