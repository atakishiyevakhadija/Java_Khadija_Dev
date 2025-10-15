package Poliformizm;

public class Instruments {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Instrument inst = new Instrument();
        Piano piano = new Piano();
        Drum drum = new Drum();
        inst.playSound();
        guitar.playSound();
        piano.playSound();
        drum.playSound();
    }
}
class Instrument{
    void playSound(){
        System.out.println("Instrument makes a sound");
    }
}
class Guitar extends Instrument{
    @Override
    void playSound(){
        System.out.println("Guitar makes a sound");
    }
}
class Piano extends Instrument{
    @Override
    void playSound(){
        System.out.println("piano makes a sound");
    }
}
class Drum extends Instrument{
    @Override
    void playSound(){
        System.out.println("piano makes a sound");
    }
}