package TEFiile;

import static editor.TextEditor_GUI.*;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class te_saveas {

    static FileWriter fw;
    static String temp_file_add;

    public static void te_write(String file_name) {
        try {
            File f = new File(file_name);
            if (f.exists() == true) {
                JOptionPane.showMessageDialog(jfc, file_name + " file exist!", "Confirm Save As..", JOptionPane.WARNING_MESSAGE);
            } else {
                fw = new FileWriter(file_name);
                String ch = usertextarea.getText();
                fw.write(ch);
                fw.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void te_write_formate() {
        try {
            File f = File.createTempFile("font", ".txt");
            fw = new FileWriter(f);
            temp_file_add = f.getAbsolutePath();
            String formate_type = String.valueOf(usertextarea.getFont() + " " + usertextarea.getBackground() + " " + usertextarea.getForeground());
            fw.write(formate_type);
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void register(String file_register) {
        try {
            fw = new FileWriter("Register/" + file_register);
            String add = temp_file_add;
            fw.write(add);
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
