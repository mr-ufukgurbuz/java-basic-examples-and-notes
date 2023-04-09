package org.example.Exceptions.TryWithResources;

class Temp implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Closing!");
        throw new Exception("oh no!");
    }
}

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        /*
            Temp temp = new Temp();
            try {
                temp.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        */

        try(Temp temp = new Temp()){

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
