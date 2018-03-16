/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

/**
 *
 * @author Admin
 */
public class VideoAtribute {
    private String youtubeId;
    private String name;
    private String description;
    private String keywork;
    private long playlistld;

    @Override
    public String toString() {
        return "VideoAtribute{" + "youtubeId=" + youtubeId + ", name=" + name + ", description=" + description + ", keywork=" + keywork + ", playlistld=" + playlistld + ", Thumbnai=" + Thumbnai + '}';
    }
    private String Thumbnai;

    public String getYoutubeId() {
        return youtubeId;
    }

    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeywork() {
        return keywork;
    }

    public void setKeywork(String keywork) {
        this.keywork = keywork;
    }

    public long getPlaylistld() {
        return playlistld;
    }

    public void setPlaylistld(long playlistld) {
        this.playlistld = playlistld;
    }

    public String getThumbnai() {
        return Thumbnai;
    }

    public void setThumbnai(String Thumbnai) {
        this.Thumbnai = Thumbnai;
    }

    void setKeywords(String music_live) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setPlaylistId(long l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setThumbnail(String httpavatarnctnixcdncomplaylist20131202111) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
