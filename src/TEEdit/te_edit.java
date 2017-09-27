package TEEdit;

import static editor.TextEditor_GUI.*;
import java.awt.Color;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

public class te_edit {

    static String usertext;
    static int start, end, wordlen;
    //static Color hl_col = new Color(0, 153, 255);
    static Highlighter.HighlightPainter hl = new DefaultHighlighter.DefaultHighlightPainter(hl_color);

    public static void get_text_index(String word) {
        usertext = usertextarea.getText();
        start = usertext.indexOf(word);
        wordlen = word.length();
    }

    public static void find_all_text(String word) {
        
        while (start >= 0) {
            try {
                end = start + wordlen;
                usertextarea.getHighlighter().addHighlight(start, end, (Highlighter.HighlightPainter) hl);
                //usertextarea.setSelectedTextColor(Color.white);
                start = usertext.indexOf(word, start + 1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void replace_all_text(String word, String replace_word) {

        while (start >= 0) {
            end = start + wordlen;
            usertextarea.replaceRange(replace_word, start, end);
            start = usertext.indexOf(word, start + 1);
        }
    }
}
