package org.commons.ejb;

import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class ExecutionPlan {
 
    @Param({ "50000"})
    public int iterations;
    
    public int[] array;
    
    public Integer[] arrayInteger;
 
    @Setup(Level.Invocation)
    public void setUp() {
    	array = new int[iterations]; 
    	arrayInteger = new Integer[iterations];
    	for(int i = 0; i < iterations; i++) {
    		array[i] = i;
    		arrayInteger[i] = i; 
    	}
    }
}