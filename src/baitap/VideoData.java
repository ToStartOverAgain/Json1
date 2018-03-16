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
public class VideoData {
   private String type;
   private VideoAtribute attributes;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VideoAtribute getAttributes() {
        return attributes;
    }

    public void setAttributes(VideoAtribute attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "VideoData{" + "type=" + type + ", attributes=" + attributes + '}';
    }

   

   
    
}
