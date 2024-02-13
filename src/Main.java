public class NewClass {

    public static int getLargest(int arr[], int sz) {       // 1 step
        int iterate1 = 0;                                   // 1 step
        int iterate2 = 0;                                   // 1 step
        int largest = 0;                                    // 1 step
        while(iterate1 < sz - 1) {                          // n steps
            iterate2++;                                     // 1 step
            if(iterate2 == sz - 1){                         // 1 step
                iterate1++;                                 // 1 step
                iterate2 = iterate1;                        // 1 step
                continue;                                   // 1 step
            }
            int product = arr[iterate1] * arr[iterate2];    // 1 step
            if (product > largest)                          // 1 step
                largest = product;                          // 1 step
        }
        return largest;                                     // 1 step
    }
}

// 13c (n - 1)

// 13 constant steps and one n step
// The while loop is controlled by the input value of n (sz)
// Everything else for the most part doesn't have an impact on the time complexity of the alogrithm
// The most interesting part of the algorithm is the while loop
// The time complexity would be O(n) because as n increases the looping of the while loop increases linearly

// To find the Big O you should understand which steps are constant and which aren't
// Then find the fastest growing term or step
// In this case the fastest growing step/term would be n steps because n could be a very high number
// If n is one billion the rest of the constant steps don't make a difference