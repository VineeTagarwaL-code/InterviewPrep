/*
 * time complexity - time complexity != time taken (1)
 * time complexity - it is a function that tells us how time is gonna grow as
 * number is growing ! , relationship about how the time will grow
 * as the input grows
 * 
 * In time complexity always think about big numbers , we dont care much
 * about small numbers (2)
 * 
 * o(1) < o(log(n)) < o(n)
 * 
 * constant are ignored , cause we only care about how the line of graph is
 * being
 * creatd , thats why constants is ignored
 * 
 * every time take large amount of data into consideration , less significance
 * will be ignored
 * example - o(n^3 + log n)
 * 
 * n = 1 Million
 * 
 * o(1m^3 + log(1m))
 * o(1m^3 + 6s) , 6s doesnt hold any relevancy when compared to 1m^3 thats why
 * its ignored
 * 
 */

/*
 * BIG O'h NOTATION ( UPPER BOUND )
 * 
 * O(N^3) - basically this means that is the upper bound , means the
 * problem can be solved in lower time complexity but for sure it wont exceed
 * o(n^3)
 * 
 */

/*
 * BIG OMEGA NOTATION ( LOWER BOUND )
 * 
 * Ω(n^3) - it will take atleast this time complexity , not less than that
 * meaning that our algo can have upper time complexity but not less than n^3
 * 
 * actually the exact opposite of big o'h notation
 * 
 */

/*
 * BIG THETA NOTATION
 *
 * combining both upper and lower bound notation
 * 
 */

 /*
  * LITTLE O'H notation 
  *
  * This is also giving upper bound which is not fixed ( loose upper bound ) , means 
  * Big O 
  * f=g(x)
  * f <= g
  *
  *Little 0
   f < g (Strictly lower )

  */









/*
 * SPACE COMPLEXITY
 * 
 * AUXILARY SPACE - It is the extra space or temporary space used by an algo
 * 
 * space complexity of an algo is total space taken by the algo with respect to the input
 * size . Space complexity includes both auxilary space and space used by input
 * 
 * for example if we want to compare standard sorting algorithims on the basis of 
 * space , then auxillary space would be a better criteria than space complexity . Merge
 * sort uses o(n) auxillary space insert sort and heap sort use o(1) auxillary space
 * 
 * space complexity of all these sorting algo is o(n) though 
 * 
 * 
 * space complexity = original space  + auxiliary space 
 * 
 * recursion program dont have constant space complexity !!! (1)
 * 
 * 1. only calls interlinked with each other will be in the stack at the same
 * time
 * 
 * 2. space complexity = height of the tree path o(n)
 * 
 * 
 */

/*
 * 
 * AKRA BAZZI 
 * 
 * done in copy - used for solving time complexity of recursive q
 * 
 * when p < g(x) , answer is g(x)
 */