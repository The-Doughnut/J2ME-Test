
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
        
        si = new StringItem("Rick Astley","We're no strangers to love\n" +
"You know the rules and so do I\n" +
"A full commitment's what I'm thinking of\n" +
"You wouldn't get this from any other guy\n" +
"\n" +
"I just wanna tell you how I'm feeling\n" +
"Gotta make you understand\n" +
"\n" +
"Never gonna give you up\n" +
"Never gonna let you down\n" +
"Never gonna run around and desert you\n" +
"Never gonna make you cry\n" +
"Never gonna say goodbye\n" +
"Never gonna tell a lie and hurt you\n" +
"\n" +
"We've known each other for so long\n" +
"Your heart's been aching, but\n" +
"You're too shy to say it\n" +
"Inside, we both know what's been going on\n" +
"We know the game and we're gonna play it\n" +
"\n" +
"And if you ask me how I'm feeling\n" +
"Don't tell me you're too blind to see\n" +
"\n" +
"Never gonna give you up\n" +
"Never gonna let you down\n" +
"Never gonna run around and desert you\n" +
"Never gonna make you cry\n" +
"Never gonna say goodbye\n" +
"Never gonna tell a lie and hurt you\n" +
"\n" +
"Never gonna give you up\n" +
"Never gonna let you down\n" +
"Never gonna run around and desert you\n" +
"Never gonna make you cry\n" +
"Never gonna say goodbye\n" +
"Never gonna tell a lie and hurt you\n" +
"\n" +
"(Ooh, give you up)\n" +
"(Ooh, give you up)\n" +
"Never gonna give, never gonna give\n" +
"(Give you up)\n" +
"Never gonna give, never gonna give\n" +
"(Give you up)\n" +
"\n" +
"We've known each other for so long\n" +
"Your heart's been aching, but\n" +
"You're too shy to say it\n" +
"Inside, we both know what's been going on\n" +
"We know the game and we're gonna play it\n" +
"\n" +
"I just wanna tell you how I'm feeling\n" +
"Gotta make you understand\n" +
"\n" +
"Never gonna give you up\n" +
"Never gonna let you down\n" +
"Never gonna run around and desert you\n" +
"Never gonna make you cry\n" +
"Never gonna say goodbye\n" +
"Never gonna tell a lie and hurt you\n" +
"\n" +
"Never gonna give you up\n" +
"Never gonna let you down\n" +
"Never gonna run around and desert you\n" +
"Never gonna make you cry\n" +
"Never gonna say goodbye\n" +
"Never gonna tell a lie and hurt you\n" +
"\n" +
"Never gonna give you up\n" +
"Never gonna let you down\n" +
"Never gonna run around and desert you\n" +
"Never gonna make you cry\n" +
"Never gonna say goodbye\n" +
"Never gonna tell a lie and hurt you");
        
        si2 = new StringItem("Weird Al Yankovic","[Verse 1]\n" +
"Nothin' ever (ever) happens in this town\n" +
"Feelin' low down (down), not a lot to do around here\n" +
"I thought that I would go right out of my mind\n" +
"Until a friend told me the news\n" +
"He said, \"Hey, you know that vacant lot\n" +
"Right beside the gas station? Well, somebody bought it\n" +
"And on that spot they're gonna build a shop\n" +
"Where we can go buy bolts and screws\"\n" +
"Since then I've been walking on air (air)\n" +
"I can barely brush my teeth or comb my hair\n" +
"Cause I'm so excited and I really don't care\n" +
"I've been waiting since last June\n" +
"For this day to finally arrive\n" +
"I'm so happy (happy) now just to be alive\n" +
"Cause any minute now I'm gonna be inside\n" +
"Well, I hope they open soon\n" +
"\n" +
"[Hook]\n" +
"I can't wait, (no I) I can't wait (oh when)\n" +
"When are they gonna open up that door?\n" +
"I'm goin' (yes I'm) goin', I'm a-goin' to the\n" +
"Goin' to the (hard) ware I'm goin', really goin' to the\n" +
"Goin' (hard) I'm goin' to the (hard) oh yes, I'm goin' to the\n" +
"Hardware store\n" +
"[Verse 2]\n" +
"In my sleeping bag I camped out overnight\n" +
"Right in front of the store, then as soon as it was light out\n" +
"I pressed my nose right up against the glass\n" +
"You know, I had to be first in line\n" +
"Gonna get me a flashlight and a broom\n" +
"Want a pair of pliers for every single room of my house\n" +
"See those hacksaws? Very, very soon\n" +
"One of them will be all mine\n" +
"Guys with nametags walking down the aisles\n" +
"Rows of garden hoses that go on for miles and miles\n" +
"Brand new socket wrenches in a plethora of styles\n" +
"All arranged alphabetically\n" +
"And they're doing a promotional stunt\n" +
"There's a great big purple sign out front\n" +
"That says every 27th customer\n" +
"Will get a ball peen hammer free\n" +
"\n" +
"[Hook]\n" +
"I can't wait, (no I) I can't wait (oh when)\n" +
"When are they gonna open up that door?\n" +
"I'm goin' (yes I'm) goin', I'm a-goin' to the\n" +
"Goin' to the (hard) ware I'm goin', really goin' to the\n" +
"Goin' (hard) I'm goin' to the (hard) oh yes, I'm goin' to the\n" +
"Hardware store\n" +
"I'm goin' (yes I'm) goin', I'm a-goin' to the\n" +
"Goin' to the (hard) ware I'm goin', really goin' to the\n" +
"Goin' (hard) I'm goin' to the (hard) oh yes, I'm goin' to the\n" +
"Hardware store\n" +
"[Outro]\n" +
"Would you look at all that stuff ...\n" +
"They've got allen wrenches, gerbil feeders, toilet seats, electric heaters\n" +
"Trash compactors, juice extractors, shower rods and water meters\n" +
"Walkie-talkies, copper wires safety goggles, radial tires\n" +
"BB pellets, rubber mallets, fans and dehumidifiers\n" +
"Picture hangers, paper cutters, waffle irons, window shutters\n" +
"Paint removers, window louvers, masking tape and plastic gutters\n" +
"Kitchen faucets, folding tables, weather stripping, jumper cables\n" +
"Hooks and tackle, grout and spackle, power foggers, spoons and ladles\n" +
"Pesticides for fumigation, high-performance lubrication\n" +
"Metal roofing, waterproofing, multi-purpose insulation\n" +
"Air compressors, brass connectors, wrecking chisels, smoke detectors\n" +
"Tire gauges, hamster cages, thermostats and bug deflectors\n" +
"Trailer hitch demagnetizers, automatic circumcisers\n" +
"Tennis rackets, angle brackets, Duracells and Energizers\n" +
"Soffit panels, circuit breakers, vacuum cleaners, coffee makers\n" +
"Calculators, generators, matching salt and pepper shakers\n" +
"\n" +
"[Hook x 3]\n" +
"I can't wait, (no I) I can't wait (oh when)\n" +
"When are they gonna open up that door?\n" +
"I'm goin' (yes I'm) goin', I'm a-goin' to the\n" +
"Goin' to the (hard) ware I'm goin', really goin' to the\n" +
"Goin' (hard) I'm goin' to the (hard) oh yes, I'm goin' to the\n" +
"Hardware store\n" +
"I'm goin' (yes I'm) goin', I'm a-goin' to the\n" +
"Goin' to the (hard) ware I'm goin', really goin' to the\n" +
"Goin' (hard) I'm goin' to the (hard) oh yes, I'm goin' to the\n" +
"Hardware store\n" +
"\n" +
"I'm goin' (yes I'm) goin', I'm a-goin' to the\n" +
"Goin' to the (hard) ware I'm goin', really goin' to the\n" +
"Goin' (hard) I'm goin' to the (hard) oh yes, I'm goin' to the\n" +
"Hardware store");
        
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
