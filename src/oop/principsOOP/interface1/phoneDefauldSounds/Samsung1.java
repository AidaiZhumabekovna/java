package oop.principsOOP.interface1.phoneDefauldSounds;

public abstract class Samsung1 implements Samsung{
    public Samsung1(String version, String color, String memory) {
        this.version = version;
        this.color = color;
        this.memory = memory;
    }

    String version;
    String color;
    private String memory;

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Samsung1{" +
                "version='" + version + '\'' +
                ", color='" + color + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }
}
