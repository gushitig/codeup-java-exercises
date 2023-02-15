public class ServerNameGenerator {

    private static String[] adj = new String[]{"fluffy", "slimy", "bouncy", "green", "soft", "silky", "prickly", "blue", "short", "round" };
    //public vs private
    //public is if youre going to need to access these outside of this particular class
    private static String[] noun = new String[]{"Karen", "Neptune", "Nova", "cat", "fish", "badger", "dolphin", "muskrat", "zebra", "kiwi" };

    public static String randomString() {
        int randomAdj = (int)Math.floor(Math.random() * 10);
        int randomNoun = (int)Math.floor(Math.random() * 10);


        System.out.println(randomAdj);
        System.out.println(randomNoun);

        return ("Your server name is: " +
                adj[randomAdj] + "-" + noun[randomNoun]);

    }

    public static void main(String[] args) {

        System.out.println(randomString());



    }



}
