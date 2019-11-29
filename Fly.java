public interface Fly {

    void takeOff();

    int ascend(int meters);

    int descend(int meters);

    void land();

    default void glide() // Default eintragen
    {
      System.out.printf( "glides into the air" );
    }
}
