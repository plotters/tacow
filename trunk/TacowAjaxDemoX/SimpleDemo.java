// Generated by the WOLips Templateengine Plug-in at Apr 10, 2006 11:37:26 PM

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;

public class SimpleDemo extends WOComponent {

    public SimpleDemo(WOContext context) {
        super(context);
    }
	
	public String sayThis(String value) {
		NSLog.out.appendln("Gonna say: " + value);
		return "You told me to say: \"" + value + "\"";
	}

}