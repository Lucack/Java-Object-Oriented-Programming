package mediaplayer;

public class Music {
    private String title;
    private String artist;
    private String album;
    private String releaseDate;
    private int time; // seconds

    public Music(String title, String artirst, String album, String releaseDate, int time) {
        this.title = title;
        this.artist = artirst;
        this.album = album;
        this.releaseDate = releaseDate;
        this.time = time;
    }

    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }

    public void printMusic() {
        System.out.println("Title: " + this.title);
        System.out.println("Artist: " + this.artist);
        System.out.println("Album: " + this.album);
        System.out.println("Release Date: " + this.releaseDate);
        System.out.println("Time: " + timeToString());
    }

    private String timeToString() {

        int hour;
        int min;
        int sec = this.time;

        min = sec/60;
        sec = sec%60;
        hour = min/60;
        min = min%60;

        return hour+":"+min+":"+sec;

    }
}
