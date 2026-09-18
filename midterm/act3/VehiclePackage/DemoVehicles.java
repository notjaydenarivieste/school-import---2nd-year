import com.vehicleswesell.vehicle.Vehicle;
import com.vehicleswesell.vehicle.Sailboat;
import com.vehicleswesell.vehicle.Bicycle;

import javax.swing.*;
public class DemoVehicles{
   public static void main(String[] args){
      Sailboat aBoat = new Sailboat();
      Bicycle aBike = new Bicycle();
      
      JOptionPane.showMessageDialog
         (null,"Vehicle Descriptions:\n" + aBoat.toString() + "\n" + aBike.toString());
   }
}