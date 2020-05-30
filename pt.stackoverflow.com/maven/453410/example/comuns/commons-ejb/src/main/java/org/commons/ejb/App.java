package org.commons.ejb;

import org.apache.commons.lang3.StringUtils;
import org.commons.Utils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( Utils.upperCase("texto"));
        
        System.out.println(StringUtils.upperCase("texto"));
    }
}
