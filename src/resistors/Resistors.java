/*
 *Sean Luo 27/09/2018
 *Resistor.java
 *This is progrem calculates the resistor.
 */

package resistors;

import javax.swing.JOptionPane;

/**
 *
 * @author toluo7449
 */
public class Resistors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String Colourcode = JOptionPane.showInputDialog("What is your resistors"
               + "colour code?\n"+"Separate each colour by hypens\n"+"Ex:Red-Or"
               + "ange-Black");
       //Colourcode represent the colour that the pepole entre.
       String firstcode = Colourcode.substring(0,Colourcode.indexOf("-"));
       //firstcode represent the colour that appear in the Colourcode at first
       String secondcode = Colourcode.substring(Colourcode.indexOf("-")+1,
               Colourcode.lastIndexOf("-"));
       //secondcode represent the colour it's the second coulour in the Colourcode
       String thirdcode = Colourcode.substring(Colourcode.lastIndexOf("-")+1);
       //thirdcode represent the colour it's the third coulour in hte Colourcode
       System.out.println("You entered " + Colourcode);
       int res1 = 0,res2 = 0,res3 = 0;
        String colours[] = new String[10];
        colours[0] = "black";
        colours[1] = "brown";
        colours[2] = "red";
        colours[3] = "orange";
        colours[4] = "yellow";
        colours[5] = "green";
        colours[6] = "blue";
        colours[7] = "violet";
        colours[8] = "grey";
        colours[9] = "white";
        for (int i = 0; i < 10; i++) {
            if(firstcode.equalsIgnoreCase(colours[i])){
                res1 = i;
            }
            if(secondcode.equalsIgnoreCase(colours[i])){
                res2 = i;
            }
            if(thirdcode.equalsIgnoreCase(colours[i])){
                res3 = i;
            }     
        }
            int resistor = (int) (((res1 * 10) + res2) * Math.pow(10, res3));
            System.out.println("The value of the resistor is "+resistor+" ohms")
                    ;
    }
}



    
