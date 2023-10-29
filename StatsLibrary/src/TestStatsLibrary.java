import java.math.BigInteger;
import java.util.ArrayList;

public class TestStatsLibrary {
	
	public static void main(String[] args) {
		
		StatsLibrary test = new StatsLibrary();
		
		ArrayList<Double> userInputNumbers = new ArrayList<>();
		userInputNumbers.add(1.0);
		userInputNumbers.add(2.0);
		userInputNumbers.add(3.0);
		userInputNumbers.add(4.0);
		userInputNumbers.add(5.0);
		userInputNumbers.add(6.0);
		userInputNumbers.add(7.0);
		userInputNumbers.add(8.0);
		userInputNumbers.add(9.0);
		userInputNumbers.add(10.0);
		
		
		double meanResults = test.findMean(userInputNumbers);
		double medianResults = test.findMedian(userInputNumbers);
		double modeResults = test.findMode(userInputNumbers);
		double varianceResults = test.findVariance(userInputNumbers);
		double sdResults = test.findSD(userInputNumbers);
		BigInteger factorialResult = test.factorial(25);
		BigInteger permutationResults = test.findPermutation(6, 4);
		BigInteger combinationResults = test.findCombination(8, 3);
		double geometricResults = test.geometric(0.4, 0.6, 3);
		double binomialResults = test.binomial(5, 2, 0.4, 0.6);
		double hypergeometricResults = test.hypergeometric(6, 4, 20, 5);
		double negativeBinomialResults = test.negative_binomial(4, 2, 0.4, 0.6);
		double poissonResults = test.poisson(1, 0);
		
		System.out.println("This is the mean of userInputNumbers: " + meanResults);
		System.out.println("This is the median of userInputNumbers: " + medianResults);
		System.out.println("This is the mode of userInputNumbers: " + modeResults);
		System.out.println("This is the variance of userInputNumbers: " + varianceResults);
		System.out.println("This is the Standard Deviation of userInputNumbers: " + sdResults);
		System.out.println("BigInteger test of factorial: " + factorialResult);
		System.out.println("This is the Permutation: " +  permutationResults);
		System.out.println("This is the Combination: " +  combinationResults);
		System.out.println("This is the Geometric Distribution: " + geometricResults);
		System.out.println("This is the Binomial Distribution: " + binomialResults);
		System.out.println("This is the Hypergeometric Distribution: " + hypergeometricResults);
		System.out.println("This is the Negative Binomial Distribution: " + negativeBinomialResults);
		System.out.println("This is the Poisson Distribution: " + poissonResults);
		
	}
}
