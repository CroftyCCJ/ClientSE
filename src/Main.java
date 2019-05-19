public class Main {

    public static void main(String[] args){


        EchoClient echoClient = new EchoClient();


        // False for starting applications, True for controlling mouse
        echoClient.setMouseMove(true);

        echoClient.establish();


        //GetLocation getLocation = new GetLocation();

     //   getLocation.getLocation();
    }
}
