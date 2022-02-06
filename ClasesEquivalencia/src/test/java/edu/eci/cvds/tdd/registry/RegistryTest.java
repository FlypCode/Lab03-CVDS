package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryValid() {

        Person person = new Person("Person00", 0000, 43, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }

    // TODO: Complete with more test cases
    @Test
    public void validateRegistryDead(){
        Person person = new Person("Person01", 0001, 19, Gender.MALE, false);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);

    }

    @Test
    public void validateRegistryInvalidAge(){
        Person person = new Person("Person02", 0002, -5, Gender.FEMALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void validateRegistryUnderAge(){
        Person person = new Person("Person03", 0003, 20, Gender.UNIDENTIFIED, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void validateRegistryDuplicate(){
        Person person = new Person("Person04", 0004, 58, Gender.FEMALE, true);

        registry.registerVoter(person);
        RegisterResult result = registry.registerVoter(person);
        
        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }

    // Pruebas de Frontera
    @Test
    public void validateRegistryFronterAge(){
        Person person = new Person("Person05", 0005, 18, Gender.UNIDENTIFIED, true);

        registry.registerVoter(person);
        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validateRegistryFronterDead(){
        Person person = new Person("Person06", 0006, 15, Gender.MALE, false);
        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }
}