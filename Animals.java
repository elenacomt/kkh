public abstract class Animals implements Comparable<Animals> {

    private int age;
    private int speedRunning;
    private String breed;
    private String name;



    public Animals(int age, int speedRunning, String breed, String name) {
        this.age = age;
        this.speedRunning = speedRunning;
        this.breed = breed;
        this.name = name;
    }



    public int getAge() {
        return age;
    }


    public int getSpeedRunning() {
        return speedRunning;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public abstract void eat();

    public void run () {
        System.out.println("I am running " + speedRunning + "per hour");

    }



    public void myBreed () {
        System.out.println("My breed" + breed);
    }

    @Override
    public int compareTo(Animals o) {
        return Integer.compare(this.speedRunning , o.speedRunning);
    }

        @Override
    public String toString() {
        return "Animals{" +
                "age=" + age +
                ", speedRunning=" + speedRunning +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
