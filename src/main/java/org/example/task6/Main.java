package org.example.task6;

public class Main {

    public static void main(String[] args) {

        Iptv iptv = new Iptv();
        int[] numbers = {16, 17, 18};
        iptv.printChannels(numbers);

        Iptv iptv2 = new Iptv();
        String[] channels = {"Setanta1", "Setanta2", "Setanta3"};
        iptv2.printChannels(channels);


    }


}
