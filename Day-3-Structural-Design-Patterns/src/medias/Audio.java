package medias;

public class Audio implements Media{

    private String fileName;

    public Audio(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing audio : "+this.fileName);
    }
}
