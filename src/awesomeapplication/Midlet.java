
package awesomeapplication;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class Midlet extends MIDlet implements CommandListener {
    
    Display display;
    Form form;
    Form form2;
    Command exit;
    List list;
    StringItem si;
    StringItem si2;
    Command back;
    
    public Midlet(){
        display = Display.getDisplay(this);
        
        exit = new Command("Exit",Command.EXIT,1);
        
        list = new List("Lyrics", List.IMPLICIT);
        
        list.append("Never Gonna Give You Up", null);
        
        list.addCommand(exit);
        
        list.setCommandListener(this);
        
        form = new Form("Never Gonna Give You Up");
        form2 = new Form("Hardware Store");
        
        si = new StringItem("Rick Astley","Lyrics goes here");
        
        si2 = new StringItem("Weird Al Yankovic","Insert lyrics here");
        
        form.append(si);
        
        back = new Command("Back",Command.BACK,1);
        form.addCommand(back);
        form.setCommandListener(this);
    }

    public void startApp() {
        display.setCurrent(list);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
    
    public void commandAction(Command c, Displayable d){
        if(c == exit){
            destroyApp(false);
            notifyDestroyed();
        }
        
        else if (c == back){
            display.setCurrent(list);
        }
        
        else{
            List selected = (List)display.getCurrent();
            
            switch(selected.getSelectedIndex()){
                case 0:
                    display.setCurrent(form);
            }
        }
    }
    
}
