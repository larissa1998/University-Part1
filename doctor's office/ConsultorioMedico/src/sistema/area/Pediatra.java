/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.area;

import javax.swing.JOptionPane;
import sistema.classes.Medico;

/**
 *
 * @author Larissa Fogaça Mendes
 */
public class Pediatra extends Medico{
    @Override
    public void operar(){
        JOptionPane.showMessageDialog(null, "Atendeu uma criança");
    }
}
