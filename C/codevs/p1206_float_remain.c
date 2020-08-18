#include<iostream>
#include<iomanip>
using namespace std;
int main() {
	double a;
	cin >> a;
	int temp;
	temp = (int)(a * 1000) % 10;
	if (temp >= 5) {
		cout << setiosflags(ios::fixed) << setprecision(2) << a-0.005 << endl;
	}
	else {
		cout << setiosflags(ios::fixed) << setprecision(2) << a << endl;
	}
	return 0;
}