package think.polymorphism.music3;

import think.polymorphism.music.Note;

import static net.mindview.util.Print.print;

public class WoodWind extends think.polymorphism.music3.Wind {
    void play(Note n){print("WoodWind.play()"+n);}
    void adjust(){print("Adjusting WoodWind");}
}
