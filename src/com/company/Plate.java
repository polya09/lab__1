package com.company;

public class Plate {

    String performer; //исполнитель
    String genre; // жанр
    String album; // название альбома
    int edition; // тираж

    public Plate(String performer, String genre, String album, int edition ) {
        this.performer = performer;
        this.genre = genre;
        this.album = album;
        this.edition = edition;
    }

    public String toString() {
        return "Plate:"
                + performer + " " + genre + " " + album + " " + edition;
    }

    public String getPerformer() {
        return performer;
    }

    public String getGenre() {
        return genre;
    }

    public String getAlbum() {
        return album;
    }

    public int getEdition() {
        return edition;
    }
}