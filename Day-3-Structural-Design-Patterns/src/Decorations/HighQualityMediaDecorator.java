package Decorations;

import medias.Media;

public class HighQualityMediaDecorator extends MediaDecorator {

    public HighQualityMediaDecorator(Media decoratorMedia) {
        super(decoratorMedia);
    }

    public void play(){
        super.play();
        System.out.println("Enhancing playback quality");
    }
}
