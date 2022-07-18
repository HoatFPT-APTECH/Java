/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author hoatd
 */
public class clsTienich {
    public static void Hienthianh_Label(File image,JLabel LabelHienThi){
        try {
            Image img1= ImageIO.read(image);
 Image img2= img1.getScaledInstance(LabelHienThi.getWidth(),LabelHienThi.getHeight(),Image.SCALE_SMOOTH);
               ImageIcon icon= new ImageIcon(img2);
               LabelHienThi.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(clsTienich.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    };
}
