
package com.mycompany.loggersigleton;

public class LoggerSigleton 
{
    public static void main(String[] args) 
    {
        Logger log = Logger.getInstance();
        log.log("The War Statrts");
        
        Logger log1 = Logger.getInstance();
        log1.log("India wins");
        
        System.out.println("Logger hascode : "+ log.hashCode());
        System.out.println("Logger hascode : " + log1.hashCode() );
    }
}
