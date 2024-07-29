package mediaplayer;



public class Main {

    public static void main(String[] args) {

        Music musica1 = new Music("THANK GOD", "TRAVIS SCOTT", "UTOPIA", "2023", 340);
        Music musica2 = new Music("FE!N", "TRAVIS SCOTT", "UTOPIA", "2023", 340);
        musica1.printMusic();

        Playlist play1 = new Playlist();
        play1.addMusic(musica1);
        play1.addMusic(musica2);
        play1.addMusic(musica2);

        play1.printPlaylist();

        Player p = new Player();

       
        p.addMusic(musica2);
        p.addMusic(musica1);
        p.play();
        p.printPlayer();
        p.removeMusic(musica2);
        p.printPlayer();

        play1.printPlaylist();

    }

}
