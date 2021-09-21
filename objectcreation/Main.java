package objectcreation;

import realsoftwareclass.textbox;

public class Main {
    public static void main (String[] args){

        // let's create a new "instance" of the textbox class like this:
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.print(textBox1.text);

        // let's also create another textbox object

        var textBox2 = new textbox();
        textBox2.setText("Box 2");
    }
}

// in java variables have a static type which means that, 
// once we set the type of a variable, we cannot change it anymore during runtime of our program.

