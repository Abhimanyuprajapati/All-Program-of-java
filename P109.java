/*
Natsu is fighting with a dragon that has A Health and B attack power and Natsu has C health and D attack power. The fight goes in turns first Natsu will attack the Dragon then Dragon will attack Natsu and this goes on. The fight will stop when either the dragon's or Natsu's health drops zero or below. Your task is to check whether Natsu will able to slay the Dragon or not.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function DragonSlayer() that takes integers A, B, C, and D as arguments.

Constraints:-
1 <= A, B, C, D <= 1000
Output
Return 0 if Dragon wins else return 1.
Example
Sample Input:-
8 2 5 3

Sample Output:-
1

Explanation:-
Natsu's attack:- A = 5, B = 2, C = 5, D = 3
Dragon's attack:- A = 5, B = 2, C = 3, D =3
Natsu's attack:- A = 2, B =2, C = 3, D=3
Dragon's attack:- A = 2, B =2, C = 1, D=3
Natsu's attack:- A = -1, B =2, C = 1, D=3
Natsu's win
*/

class  P109{
static int DragonSlayer(int A, int B, int C,int D)
{
//Enter your code here
int fN=0;
int fD=0;

if(A%D==0)
fN=A/D;
else
fN=A/D+1;


if(C%B==0)
fD=C/B;
else
fD=C/B+1;

if(fN<=fD)
{
    return 1;
}else
{
    return 0;
}
}
}