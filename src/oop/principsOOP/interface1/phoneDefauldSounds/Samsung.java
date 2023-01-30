package oop.principsOOP.interface1.phoneDefauldSounds;

public interface Samsung extends Phone{

    @Override
    default String callSound(){
        return "Samsung call soud";
    }

    @Override
    default String background(){
        return "imageByDefault";
    }
}
