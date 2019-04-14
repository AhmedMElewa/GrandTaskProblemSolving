# Java Proble Solving GrandTask
# Description
- In our application when two customers need to book at the same time , we create a nice
game if customer won he will book first,
The player has a positive integer 𝑛 and the player is able to do the
following operation as many times as the player want (possibly zero):
-choose a positive
integer 𝑥 that 𝑥<𝑛 and x is not a divisor of 𝑛 then subtract x from 𝑛
The goal of the player is to minimize the value of n in the end. one of our Customers
found the game trivial. 
- Just a simple console java application that take a single integer and return the answer of the game
- Input 
Single integer n , 1<=n<=1000000000
- Output
Output a single integer, the minimum value of 𝑛 the player can get.
- Examples :
Input  8
Output 1
Input  1
Output 1
- Note
In the first example, the player can choose
𝑥=3 in the first turn, then 𝑛 becomes 5.
He can then choose 𝑥=4 in the second turn to get 𝑛=1
as the result. There are other ways to get this minimum. However, for example, he
cannot choose 𝑥=2 in the first turn because 2 is a divisor of 8.
In the second example, since 𝑛=1
initially, the player can do nothing.

# Installation 
- can copy code to and java IDK and run it. 
# How to use
- Enter any valid number between 0 and 1000000000

