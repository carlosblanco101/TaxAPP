/* DialogBox snippet
   This application will prompt the user for the item they are buying, 
   and calculate the final price, including tax.
   your name here
*/

//***** 1. import the JOptionPane class
import javax.swing.JOptionPane;
//***** 2. import the NumberFormat class
import java.text.NumberFormat;

public class DialogBoxSnippet
{
  public static void main( String [] args )
  {
    final double TAX_RATE = .06;
    
    //***** 3. generate a NumberFormat object for currency 
    NumberFormat money = NumberFormat.getCurrencyInstance();
 
    //***** 4. using a dialog box, 
    //     prompt the user for the item they are buying
    String inputItem = JOptionPane.showInputDialog(null, "What item are you buying?");
  
    //***** 5. using a dialog box, 
    //     prompt the user for the price of the item
    //     and convert the String to a double 
    
    String inputPrice = JOptionPane.showInputDialog(null, "How much does" + inputItem + "cost?");
    double price = Double.parseDouble( inputPrice);
    
    //***** 6. calculate the price with tax
    double priceWithTax = price + price * TAX_RATE;
    
  
    //***** 7. pop up a dialog box with the item and the price
    //   including tax (use the TAX_RATE constant). 
    //   Format the output as money using the NumberFormat object.
    JOptionPane.showMessageDialog(null, "the price with tax is " + money.format ( priceWithTax) );
 
 }
}