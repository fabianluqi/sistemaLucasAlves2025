/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Util {

    public static void habilitar(boolean valor, JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);
        }

    }

    public static void limpar(JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            if (componentes[i] instanceof JTextField) {
                ((JTextField) componentes[i]).setText("");
            }
            if (componentes[i] instanceof JComboBox) {
                ((JComboBox) componentes[i]).setSelectedIndex(-1);
            }
        }
    }

    public static void mensagem(String cad) {
        JOptionPane.showMessageDialog(null, cad);
    }

    public static boolean perguntar(String cad) {
        JOptionPane.showConfirmDialog(null, cad);
        return true;
    }

    public static int strToint(String num) {
        return Integer.parseInt(num);
    }

    public static int intToStr(String num) {
        return Integer.parseInt(num);
    }

    public static int strToDouble(String num) {
        return 0;
    }

    public static int doubleToStr(String num) {
        return Integer.parseInt(num);
    }

    public static Date strToDate(String data) {
        return null;
    }

    public static Date dateToStr(String data) {
        return null;
    }

}

// usar o limpar quando quando cancelar apos incluir 
//YES_NO_OPTION


// primeiro commit: Pacotes tools e view. Util.java finalizado.
// segundo commit: tela principal e tela dos cadastros finalizados. 
// segundo commit: Tela de cadastros usando o util.java