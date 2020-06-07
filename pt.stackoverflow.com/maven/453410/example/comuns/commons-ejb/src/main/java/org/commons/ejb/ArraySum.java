package org.commons.ejb;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Warmup;

public class ArraySum {

	@Benchmark
	@Fork(value = 3, warmups = 0)
	@OutputTimeUnit(TimeUnit.MILLISECONDS)
	@BenchmarkMode(Mode.AverageTime)
	@Warmup(iterations = 5, time = 10)
	@Measurement(iterations = 5, time = 10)
	public void doTest(ExecutionPlan plan) throws InterruptedException {
		sum(plan.array);
	}
	
	public static void sum(int[] valores) throws InterruptedException {
		int sum = 0;
		for(int i = 0; i < valores.length; i++) {
			sum += valores[i];
		}
	}
	
}
