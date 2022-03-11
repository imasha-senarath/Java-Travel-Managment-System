
package travel.management.system;

/**
 *
 * @author User
 */
public class TravelManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Travel_Management_System().setVisible(true);
            }
        });
    }
    
}
