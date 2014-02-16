/*
Part C

Add the following class definition to a Java project/program:

abstract class PersistentStorage implements Serializable {
    private String secret;

    public PersistentStorage(String secret) {
        this.secret = secret;
    }

    public String getInstanceSecret() {
        return secret;
    }
    
    public abstract String getComputedSecret();
}

Download the following serialized object into the current directory for your Java program/project:

http://sce.umkc.edu/BIT/burrise/cs349/assignments/Lab3Object.ser

Read the serialized object into your program, cast it to the type PersistentStorage and then call 
and print the results of methods getInstanceSecret() and getComputedSecret(). 

 */



import java.io.Serializable;

@SuppressWarnings("serial")
class PersistentStorage implements Serializable {
    private String secret;

    public PersistentStorage(String secret) {
        this.secret = secret;
    }

    public String getInstanceSecret() {
        return secret;
    }
    
    public String getComputedSecret() {
        return System.getProperty("user.dir");
    }
}
