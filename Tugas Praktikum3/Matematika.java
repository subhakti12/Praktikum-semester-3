class Matematika {
    public int tambah(int a, int b) {
        return a + b;
    }

    public int kurang(int a, int b) {
        return a - b;
    }

    public int kali(int a, int b) {
        return a * b;
    }

    public double bagi(int a, int b) {
        if (b == 0) {
            return Double.NaN;
        }
        return (double) a / b;
    }
}

class Matematika2 extends Matematika {
    public int modulus(int a, int b) {
        return a % b;
    }
}