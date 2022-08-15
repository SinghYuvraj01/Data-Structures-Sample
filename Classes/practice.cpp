#include<iostream>
usisng namespace as std;

int main()
{
    int num1;
    cout<<"Enter any 5 digit number"; 
    cin>>num1;

    while(num1!=0)
    {
        int last = num1 % 10;
        cout<<last;

        num1 = num1 /10;
    }

    return 0;
}