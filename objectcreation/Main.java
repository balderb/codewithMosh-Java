package objectcreation;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Main {
    public static void main (String[] args){
        
        // let's create a new "instance" of the textbox class like this:
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.print(textBox1.text);
    }
}

// in java variables have a static type which means that, once we set the type of a variable, we cannot change it anymore.

