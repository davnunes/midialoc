
package Util;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class GerenteDeJanelas {
    
    private static JDesktopPane jDP_Admin;
    
    public GerenteDeJanelas (JDesktopPane JDesktopPane){
        GerenteDeJanelas.jDP_Admin = JDesktopPane;
    }
    
    public void abrirJanela(JInternalFrame JInternalFrame){
        if(JInternalFrame.isVisible()){
           JInternalFrame.toFront();
           JInternalFrame.requestFocus();
        }else{
           jDP_Admin.add(JInternalFrame);
           JInternalFrame.setVisible(true);
        }
    }
    
}
