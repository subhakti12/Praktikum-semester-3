import java.util.Scanner;

class Hewan {
    protected String jenisSuara;

    public Hewan(String jenisSuara) {
        this.jenisSuara = jenisSuara;
    }

    public void bersuara() {
        System.out.println("Suara hewan ini: " + jenisSuara);
    }

    public boolean isMamalia() {
        return false;
    }
}

class Kucing extends Hewan {
    public Kucing() {
        super("Meong");
    }

    @Override
    public boolean isMamalia() {
        return true;
    }
}

class Anjing extends Hewan {
    public Anjing() {
        super("Guk Guk");
    }

    @Override
    public boolean isMamalia() {
        return true;
    }
}