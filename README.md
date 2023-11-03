# Brilloconnetz Java Developer Test

Create a console-based program that allows the shopkeeper to make pancakes, and the 3 users
can eat the pancakes simultaneously. A single user can eat maximum 5 pancakes within 30 seconds.
Also, the shopkeeper can make a maximum of 12 pancakes every 30 seconds. The system should
decide the number of pancakes that each of the 3 users want to eat in the 30 second’s period; but
cannot exceed the maximum 5 pancakes rule (A simple way to decide the numbers of pancakes is to
generate them randomly). The code could output the following.
* starting time of the 30 seconds slots,
* the ending time of the 30 seconds slots
* number of pancakes made by the shopkeeper, number of pancakes eaten by the 3 users
* whether the shopkeeper was able to meet the needs of the 3 users or not
* how many pancakes got wasted if any.
* If the shopkeeper was not able to meet the needs of all the customers, how many pancake
orders were not met..
#### NB: This runs in a non-concurrent manner