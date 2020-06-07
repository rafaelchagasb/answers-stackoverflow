package org.commons.ejb;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Warmup;

public class TestStreamReduce {

	@Benchmark
	@Fork(value = 3, warmups = 0)
	@OutputTimeUnit(TimeUnit.MILLISECONDS)
	@BenchmarkMode(Mode.AverageTime)
	@Warmup(iterations = 5, time = 10)
	@Measurement(iterations = 5, time = 10)
	public void doTest(ExecutionPlan plan) {
		reduce(plan.arrayInteger);
	}

	public static void reduce(Integer[] valores) {
		List<Integer> integers = Arrays.asList(1,2,3);
		Integer sum = integers.stream()
				.reduce(0, Integer::sum);
	}

}
