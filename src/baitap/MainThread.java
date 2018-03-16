/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import com.google.gson.Gson;

/**
 *
 * @author Admin
 */
public class MainThread {   
     public static void main(String[] args) {
         
        Gson gson = new Gson();

        ApiData apiData = new ApiData();

        VideoData  data = new VideoData();

        VideoAtribute attribute = new VideoAtribute();

        apiData.setData(data);

        data.setType("Video");
        data.setVideoAtribute(attribute);

        attribute.setYoutubeId("d7WXqnxmJvw");
        attribute.setName("Time After Time");
        attribute.setDescription("Live version in studio Instagram : @abbywardmusic Spotify: Abby Ward");
        attribute.setKeywords("music, live");
        attribute.setPlaylistId(1507685706206l);
        attribute.setThumbnail("http://avatar.nct.nixcdn.com/playlist/2013/12/02/1/1/1/0/1386001565745_500.jpg");

        System.out.println(gson.toJson(apiData));

    }
     }
       

