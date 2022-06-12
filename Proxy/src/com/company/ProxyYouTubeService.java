package com.company;

import java.util.Hashtable;
import java.util.Map;

public class ProxyYouTubeService implements IYouTubeService {

    // zapisane już videoId - ściągnięte wcześniej
    static Map<Integer, byte[]> _cache = new Hashtable() {
    };

    static {
        _cache.put(100, new byte[2143432]);
        _cache.put(101, new byte[54355654]);
    }


    //referencja do bazowego YouTubeService
    private YouTubeService youTubeService;


    public ProxyYouTubeService(YouTubeService youTubeService) {
        this.youTubeService = youTubeService;
    }

    @Override
    public byte[] getVideo(int viedeoId) {

        System.out.println("ProxyYouTubeService getting video: " + viedeoId);
        //będziemy musieli odnieść się do tego prawdziwego serwisu jakim jest YouTubeService

        byte[] cashedVideo;

        //sprawdzamy, czy to video już nie było pobierane
        var video = youTubeService.getVideo(viedeoId);
        return new byte[0];
    }
}
