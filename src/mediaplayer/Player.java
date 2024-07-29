package mediaplayer;

import java.util.ArrayList;

public class Player {

    private ArrayList<Music> qeue;
    private Music current;
    private boolean isPlaying = false;

    public Player() {
        this.qeue = new ArrayList<Music>();

    }

    public void play() {
        if (!qeue.isEmpty()) {
            current = qeue.getFirst();
            this.isPlaying = true;
            System.out.println("Playing...");
            System.out.println(current.getArtist() + " - " + current.getTitle());
        } else {
            System.out.println("Nothing to play, please add some music.");
        }
    }

    public void printPlayer() {
        System.out.println(this.current.getTitle());
    }

    public void addMusic(Music music) {
        qeue.add(music);
    }

    public void nextMusic() {
        if (!qeue.isEmpty()) {
            qeue.remove(0);
            current = qeue.get(0);
        } else {
            System.out.println("Nothing to play, please add some music.");
        }
    }

    public void removeMusic(Music music) {
        if (qeue.contains(music)) {
            qeue.remove(music);
            System.out.println(music.getTitle() + " has been removed");
        } else {
            System.out.println("Music not found on this qeue");
        }
    }

}
