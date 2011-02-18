package lab1;

class Primes {

    /**
     * Find all prime numbers up to a limit.
     * 
     * @param n
     *            Largest number to search
     * @param printPrimes
     *            If true, print the primes found to output.
     * 
     * @return number of primes <= n
     * @effects If printPrimes is true, prints all primes <= n to output.
     */
    static int findPrimes(int n, boolean printPrimes) {
        boolean isPrime = true;
        int numPrimes = 0;

        for (int i = 2; i <= n; i++) {
            isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                ++numPrimes;
                if (printPrimes) {
                    System.out.println(i);
                }
            }
        }
        return numPrimes;
    }

    static int findPrimesFaster(int n, boolean printPrimes) {
        int numPrimes = 0;

        for (int i = 2; i <= n; i++) {
            int j = 2;
            while (i%j != 0 && j*j<=i) {
            	if (i%j!= 0){
            		j++;
            		continue;
            	}
            }
//            
//            for (int j = 2; j*j <= i; j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }

            if (i%j!=0 || i==2) {
                ++numPrimes;
                if (printPrimes) {
                    System.out.println(i);
                }
            }
        }
        return numPrimes;
    }

    static int findPrimesEvenFaster(int n, boolean printPrimes) {
        int numPrimes = 0;
        int[] prime = new int[10000];
        boolean isprime = true;
        for (int i = 2; i<=n; i++){
        	isprime = true;
        	for(int j=0;prime[j]*prime[j]<=i && j<numPrimes; j++){
        		if (i%prime[j] == 0) {
        			isprime = false;
        			break;
        		}
        	}
        	if (isprime) {
        		prime[numPrimes] = i;
        		++numPrimes;
                if (printPrimes) {
                    System.out.println(prime[numPrimes-1]);
                }        		
        	}
        }   
        return numPrimes;
    }

    public static void main(String[] args) {
        int numPrimes;

        // Find and print all primes between 0 and 50.

        System.out.println("Running method findPrimes:");
        numPrimes = findPrimes(50, true);
        System.out.println(numPrimes + " primes <= 50");

        System.out.println("\nRunning method findPrimesFaster:");
        numPrimes = findPrimesFaster(50, true);
        System.out.println(numPrimes + " primes <= 50");

        System.out.println("\nRunning method findPrimesEvenFaster:");
        numPrimes = findPrimesEvenFaster(50, true);
        System.out.println(numPrimes + " primes <= 50");

        // Time how long it takes to find primes.

        long startTime = 0;
        long endTime = 0;

        System.out.print("\n\nTiming method findPrimes:");
        startTime = System.currentTimeMillis();
        numPrimes = findPrimes(40000, false);
        endTime = System.currentTimeMillis();
        System.out.println("  " + (endTime - startTime) + " milliseconds");
        System.out.println(numPrimes + " primes <= 40000");

        System.out.print("\nTiming method findPrimesFaster:");
        startTime = System.currentTimeMillis();
        numPrimes = findPrimesFaster(40000, false);
        endTime = System.currentTimeMillis();
        System.out.println("  " + (endTime - startTime) + " milliseconds");
        System.out.println(numPrimes + " primes <= 40000");

        System.out.print("\nTiming method findPrimesEvenFaster:");
        startTime = System.currentTimeMillis();
        numPrimes = findPrimesEvenFaster(40000, false);
        endTime = System.currentTimeMillis();
        System.out.println("  " + (endTime - startTime) + " milliseconds");
        System.out.println(numPrimes + " primes <= 40000");

        System.out.print("\n\nTiming method findPrimes:");
        startTime = System.currentTimeMillis();
        numPrimes = findPrimes(80000, false);
        endTime = System.currentTimeMillis();
        System.out.println("  " + (endTime - startTime) + " milliseconds");
        System.out.println(numPrimes + " primes <= 80000");

        System.out.print("\nTiming method findPrimesFaster:");
        startTime = System.currentTimeMillis();
        numPrimes = findPrimesFaster(80000, false);
        endTime = System.currentTimeMillis();
        System.out.println("  " + (endTime - startTime) + " milliseconds");
        System.out.println(numPrimes + " primes <= 80000");

        System.out.print("\nTiming method findPrimesEvenFaster:");
        startTime = System.currentTimeMillis();
        numPrimes = findPrimesEvenFaster(80000, false);
        endTime = System.currentTimeMillis();
        System.out.println("  " + (endTime - startTime) + " milliseconds");
        System.out.println(numPrimes + " primes <= 80000");
    }

}
