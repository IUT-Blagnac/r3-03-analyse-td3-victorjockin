package com.iutblagnac.r303trace ;

public class Main
{
    public static void main(String[] args)
    {
        // appel de la méthode hello()
        System.out.println(hello()) ;

        // appel de la méthode hello(String)
        System.out.println(hello("betapolis")) ;
    }

    /**
     * Retourne la chaîne de caractères "Hello World!".
     * @return "Hello World!"
     */
    public static String hello()
    {
        return "Hello World!" ;
    }

    /**
     * Retourne la chaîne de caractères {string}.
     * @param   string    La chaîne de caractères à retourner
     * @return  {string}
     */
    public static String hello(String string)
    {
        return string ;
    }
}