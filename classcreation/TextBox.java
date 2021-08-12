package creating-classes;

// this "public" keyword we have here is an "access modifier" as we call it.
// It defines who can actually get access to this particular class
// 
public class TextBox {

    // let's add three members: (1) textfield, (2) , (3)
    
    // pay attention: return types should be with capital letters

    public String text; // field

    // now let's define methods
    // with void we do not return any values from this method

    public void setText(String text){
        this.text = text;
    }

    // clear the text of the textbox

    public void clear(){};

}

// technically, we don't use fields with the access modifier as "public" -> but we make it private and get access to the fields using getters and (possibly) setters

