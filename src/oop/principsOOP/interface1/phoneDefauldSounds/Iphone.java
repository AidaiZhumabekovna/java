package oop.principsOOP.interface1.phoneDefauldSounds;

public interface Iphone extends Phone{
    @Override
    default String callSound(){
        return "Iphone call sound";
    }

    @Override
    default String background(){
        return "imageByDefault";
    }
}
