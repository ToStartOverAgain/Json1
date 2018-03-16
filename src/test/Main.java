/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.google.gson.Gson;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        ApiYoutube apiDataYoutube = new ApiYoutube();

        Data  data = new Data();

        Attributes attributes = new Attributes();

        apiDataYoutube.setData(data);

        data.setType("Video");
        data.setAttributes(attributes);

        attributes.setYoutubeId("d7WXqnxmJvw");
        attributes.setName("Time After Time");
        attributes.setDescription("Live version in studio Instagram : @abbywardmusic Spotify: Abby Ward");
        attributes.setKeywords("music, live");
        attributes.setPlaylistId(1507685706206l);
        attributes.setThumbnail("http://avatar.nct.nixcdn.com/playlist/2013/12/02/1/1/1/0/1386001565745_500.jpg");

        System.out.println(gson.toJson(apiDataYoutube));

    }
    
}
