package com.mycompany.cxf;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Album {

    private String albumArtist;
    private String albumName;
    private int albumDate;

    public String getAlbumName() {
        return albumName;
    }

    @XmlElement
    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getAlbumDate() {
        return albumDate;
    }

    @XmlElement
    public void setAlbumDate(int albumDate) {
        this.albumDate = albumDate;
    }

    public String getAlbumArtist() {
        return albumArtist;
    }

    @XmlElement
    public void setAlbumArtist(String albumArtist) {
        this.albumArtist = albumArtist;
    }
}
