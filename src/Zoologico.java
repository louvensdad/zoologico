// Classe abstrata representando um animal
abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    // Método abstrato que será implementado pelas subclasses
    public abstract void emitirSom();
}

// Subclasse Leão
class Leao extends Animal {
    public Leao() {
        super("Leão");
    }

    public void emitirSom() {
        System.out.println(nome + ": Rooooar!");
    }
}

// Subclasse Macaco
class Macaco extends Animal {
    public Macaco() {
        super("Macaco");
    }

    public void emitirSom() {
        System.out.println(nome + ": Uh uh ah ah!");
    }
}

// Subclasse Elefante
class Elefante extends Animal {
    public Elefante() {
        super("Elefante");
    }

    public void emitirSom() {
        System.out.println(nome + ": Prrrhh!");
    }
}