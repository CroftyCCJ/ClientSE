import java.awt.*;

public class GetLocation {
    public GetLocation() {
    }

    public  void getLocation(){

        String mouseUnParsed;

        String[] mpoints;

        String x;
        String y;


        while(true){

       //System.out.println(MouseInfo.getPointerInfo().getLocation());}

            mouseUnParsed = MouseInfo.getPointerInfo().getLocation().toString();
        mpoints = mouseUnParsed.split(",");

        x = mpoints[0].replaceAll("[^0-9]","");
            y = mpoints[1].replaceAll("[^0-9]" ,"");


            System.out.println("x: " +x+ "\ny:  " + y);


   }


}}
