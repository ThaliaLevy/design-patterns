package br.com.hcode.bridge;

import br.com.hcode.bridge.platforms.Facebook;
import br.com.hcode.bridge.platforms.IPlatform;
import br.com.hcode.bridge.platforms.TwitchTV;
import br.com.hcode.bridge.platforms.YouTube;
import br.com.hcode.bridge.transmissions.AdvancedLive;
import br.com.hcode.bridge.transmissions.Live;

public class Main {

    public static void main(String[] args) {
        startLive(new YouTube());
        startLive(new TwitchTV());
        startLive(new Facebook());
    }

    public static void startLive(IPlatform platform){
       /* System.out.println("...Aguarde!");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();

        */
        System.out.println("Transmissão avançada...aguarde");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();

    }
}
