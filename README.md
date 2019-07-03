# Deliverable-3
*Completed Solo*


**Overview**
---
For this deliverable, I created 28 unit tests for the [assignment web page](https://cs1632summer2019.herokuapp.com/ "webapp"). All tests pass, and there is at least one test per requirement.

In the beginning, I had trouble getting Selenium configured since Netbeans is my IDE of choice. After those starting issues were resolved, the process of creating the unit tests was relatively simple.

I went requirement by requirement to ensure that there was a test for each one, accounting for possible edge and corner cases along the way. My only worry here was having too many tests; thankfully, it worked out in the end.

**Tracability Matrix**
---
```
1: displayWelcomeTest, displayInfoTest
2: navigationHomepageTest, navigationFibonacciTest, navigationHelloTest, navigationCathedralTest, navigationFactorialTest
3: factorialBaseCaseTest, factorialLowEdgeCaseTest, factorialHighEdgeCaseTest
4: fibonacciBaseCaseTest, fibonacciLowEdgeCaseTest, fibonacciHighEdgeCaseTest
5: factorialInvalidLowEdgeCaseTest, factorialInvalidHighEdgeCaseTest, factorialInvalidLowTest, factorialInvalidHighTest, fibonacciInvalidLowEdgeCaseTest, fibonacciInvalidHighEdgeCaseTest, fibonacciInvalidLowTest, fibonacciInvalidHighTest
6: displayDefaultHelloTest
7: displayTrailingValueJazzyTest, displayTrailingValueSingleLetterTest, displayTrailingValueNumberTest
8: displayOrderedListTest, displayImgNumTest, displayImgNamesTest
```
