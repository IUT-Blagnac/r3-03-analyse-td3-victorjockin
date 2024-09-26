package com.iutblagnac.r303trace ;

import junit.framework.Test ;
import junit.framework.TestCase ;
import junit.framework.TestSuite ;

public class MainTest extends TestCase
{
    /**
     * Crée un cas de test.
     * @param nomTest Le nom du cas de test à traiter
     */
    public MainTest(String nomTest)
    {
        super(nomTest) ;
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite(MainTest.class) ;
    }

    /**
     * Test the return with empty parameter
     */
    public void testHelloSansParametre()
    {
        assertEquals("Hello World!", Main.hello()) ;
    }

    /**
     * Test the return with a parameter
     */
    public void testHelloAvecParametre()
    {
        assertEquals("betapolis", Main.hello("betapolis!")) ;
    }
}