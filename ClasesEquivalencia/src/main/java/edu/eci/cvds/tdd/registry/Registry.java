package edu.eci.cvds.tdd.registry;
import java.util.TreeMap; 

public class Registry {
	/**
	 * TreeMap with registered users.
	 */
	
	TreeMap<Integer, Person> register = new TreeMap<Integer,Person>();
		
	public RegisterResult registerVoter(Person p) {
    	
    	RegisterResult result = null;
    	
    	if ((Integer)(p.getAge()) == null || p.getAge()<0  ) { 
    		result =  RegisterResult.INVALID_AGE;
    	}
    	else if (p.getAge()<18 && p.getAge()>0 ) {
    		result = RegisterResult.UNDERAGE;
    	}
    	
    	else if (register.containsKey( (Integer)(p.getId())) ) {
    		result = RegisterResult.DUPLICATED;
    	} 
    	else if (!p.isAlive()) {
    		result = RegisterResult.DEAD;
    	}
    	
    	else if (p.getAge()>=18 && p.isAlive()) {
    		result = RegisterResult.VALID;
    		register.put((Integer)(p.getId()), p);
    	}
    	
    	return result;
    	
    }
}