
package loginext;

import javax.swing.JOptionPane;

/**
 *
 * @author Anthony
 */
public class Security {
    String res;
    public void validUser(String users[], String user, String pwd, int tries){
        boolean find= false;
        
        for(int i = 0; i < users.length; i++){
            if((users[i].equalsIgnoreCase(user) && users[i+1].equals(pwd))){
                res= "Welcome" + user;
                find=true;
                JOptionPane.showMessageDialog(null, res, "Sign in", JOptionPane.INFORMATION_MESSAGE);
                tries=0;
                break;
            }
        
        }//fin del for
if(find=false){
    res= "Wrong user or password," + tries + "wrong tries";
     JOptionPane.showMessageDialog(null, res, "Sign in", JOptionPane.ERROR_MESSAGE);
}
 if(tries>2){
      JOptionPane.showMessageDialog(null, "3 wrong tries, this will be closed", "Sign in", JOptionPane.ERROR_MESSAGE);
      System.exit(0);
 }     

    }
    
    
}
