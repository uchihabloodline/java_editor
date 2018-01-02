/**
 * @name        Simple Java NotePad
 * @package     ph.notepad
 * @file        UI.java
 * @email       geetapandey595@gmail.com
 * @link        https://github.com/uchihabloodline/java_editor
 * @license     Apache (http://www.apache.org/licenses/LICENSE-2.0)
 * @create      2012-08-12
 * @update      2016-12-10
 *
 *
 * @modifiedby  shivam pandey
 * @modweb      https://github.com/uchihabloodline/java_editor
 * @modemail    geetapandey595@gmail.com
 */

package simplejavatexteditor;

import javax.swing.JTextPane;

public class SimpleJavaTextEditor extends JTextPane {

    private static final long serialVersionUID = 1L;
    public final static String AUTHOR_EMAIL = "geetapandey595@gmail.com";
    public final static String NAME = "PHNotePad";
        public final static String EDITOR_EMAIL = "geetapandey595@gmail.com";
    public final static double VERSION = 3.0;

    /**
     * @param args
     */
    public static void main(String[] args) {
        new UI().setVisible(true);
    }

}