package mediaplayer;
import java.util.ArrayList;

import javax.sound.midi.Soundbank;


public class Playlist {

    private ArrayList<Music> list = new ArrayList<>();
    
    void addMusic(Music musica){
        list.add(musica);
    }

    public void printPlaylist(){
        for (int i = 0 ; i<list.size() ; i++){
           list.get(i).getTitle();
        }
    }


}
