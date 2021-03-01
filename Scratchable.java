public interface Scratchable {

    public void scratch();

    default void hunt(){
        System.out.println("I am a hunter");

    }
}
