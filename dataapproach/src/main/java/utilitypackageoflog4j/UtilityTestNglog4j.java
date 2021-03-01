package utilitypackageoflog4j;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;



public class UtilityTestNglog4j {
	
	//create an logger object for a class which we want to log 
//private static Logger log=	LogManager.getLogger(UtilityTestNglog4j.class.getName());
private static Logger log=	Logger.getLogger(UtilityTestNglog4j.class);
	public static void main(String []args)
	{
		//create Layout Reference
		
		//simpleLayout is an class that extends Layout class
		//Layout class is ab abstract class
		//it gives the idea to the logger object what is the pattern of print
		//Layout layout=new SimpleLayout();
		//create appender +link layout
		//console appender is class that implements Appenders Interface
		//Appender is an interface
		//it give knowlege to the logger object Where to print
		
		//Appender app=new ConsoleAppender(layout);
		//lonk appender with logger
		//log.addAppender(app);
		log.debug("from debug");
		log.info("from info");
		log.warn("from warn");
		log.error("from error");
		
		
		
	}

}
