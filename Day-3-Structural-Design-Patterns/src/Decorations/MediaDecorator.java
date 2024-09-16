package Decorations;

import medias.Media;

/**
 * Decorator Design Pattern
 */
public abstract class MediaDecorator implements Media {

    protected Media decoratorMedia;

    public MediaDecorator(Media decoratorMedia){
        this.decoratorMedia = decoratorMedia;
    }

    public void play(){
        this.decoratorMedia.play();
    }
}
