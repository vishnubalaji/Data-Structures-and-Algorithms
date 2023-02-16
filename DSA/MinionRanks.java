public class MinionRanks{
    public static void main(String args[]){
        int number = 206412;    //Highest number until which all the prime numbers have to be concatenated
        int index = 0;
        //until 10000+5 have to be found 

        final boolean[] prime = new boolean[number + 1];
        for (int i = 0; i <= number; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i <= number; i++) {

            if (prime[i]) {

                for (int j = i * i; j <= number; j += i) {
                    prime[j] = false;
                }
            }
        }

        final StringBuilder primes = new StringBuilder();
        for (int i = 2; i <= number; i++) {

            if (prime[i]) {
                primes.append(i);
            }
        }
        // primes = primes.toString();
        System.out.println(primes.substring(index,index+5));
    }
}