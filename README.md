# Open-university-java-homework4-part4
in this assignment we were asked to write a Boolean recursive static function with one parameter n integer, we need to check if this number is a speical number Recursively, the definition of special number will be in the readme file.


the definition of special number is: the user enters array of integers of positive numbers and on each reursive call of the fucntion we will delete the x(the number of calls of the function + +1) number in this series of numbers until the end of the series, for example lets say the user enter the next series of numbers:

1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20...

in the first function call we will delete every second number from the orgional series and we will be left with:

1,3,5,7,9,11,13,15,17,19...

after the seconf function call we will delete every third number of the left series and we will have those number left:

1,3,7,9,13,15,19...

and so on until we can no longer delete members, the remaining members are called special numbers for the example above those are the speical numbers:

1,3,7,19...
