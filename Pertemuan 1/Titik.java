public class Titik {
    double absis, ordinat;
    static int counterTitik = 0;

    Titik() {
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    double getAbsis() {
        return this.absis;
    };

    double getOrdinat() {
        return this.ordinat;
    }

    void setAbsis(double absis) {
        this.absis = absis;
    };

    void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    };

    void geser(double absis, double ordinat) {
        this.absis += absis;
        this.ordinat += ordinat;
    }

    void printTitik() {
        System.out.println("Titik (" + this.absis + ", " + this.ordinat + ")");
    }

    static int getCounterTitik() {
        return counterTitik;
    }

    public Titik newTitikPlus() {
        return new Titik(this.absis + 1.0, this.ordinat + 1.0);
    }
}

class MTitik {
    public static void main(String[] args) {
        Titik titik1 = new Titik();
        Titik titik2 = new Titik();
        titik1.setAbsis(5);
        titik1.setOrdinat(7);
        titik1.printTitik();

        System.out.println("gaojkagmlm: " + Titik.getCounterTitik());
    }
}