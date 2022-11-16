#include <iostream>

using namespace std;

void A(int a1, int a2, unsigned int numer, unsigned int max)
{
    if (numer > max)
    {
        return;
    }

    cout<<"A"<<numer<<" "<<a1<<"x"<<a2<< "mm\n";

    int temp = a1;
    a1 = a2;
    a2 = temp;

    A(a1 / 2, a2, numer + 1, max);
}
void B(int b1, int b2, unsigned int numer, unsigned int max)
{
    if (numer > max)
    {
        return;
    }

    cout<<"B"<<numer<<" "<<b1<<"x"<<b2<< "mm\n";

    int temp = b1;
    b1 = b2;
    b2 = temp;

    B(b1 / 2, b2, numer + 1, max);
}
int main()
{
    A(841, 1188, 0, 10);

    cout<<endl;

    B(1000, 1414, 0, 10);

    return 0;
}
