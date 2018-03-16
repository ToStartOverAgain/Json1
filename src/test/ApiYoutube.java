/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Admin
 */
public class ApiYoutube {
    private Data Data;

    @Override
    public String toString() {
        return "ApiYoutube{" + "Data=" + Data + '}';
    }

    public Data getData() {
        return Data;
    }

    public void setData(Data Data) {
        this.Data = Data;
    }
}
