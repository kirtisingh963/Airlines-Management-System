package common;

import javax.swing.JOptionPane;
import java.io.File;
import dcc.GarmentUtils;
import java.io.IOException;

public class openPdf {

    public static void openById(String id) {
        String filePath = GarmentUtils.billPath + id + ".pdf";
        try {
            if ((new File(filePath)).exists()) {
                Process p = Runtime.getRuntime().exec("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe " + filePath + "\"");
            } else {
                JOptionPane.showMessageDialog(null, "File is not exist");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
