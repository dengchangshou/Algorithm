#include<iostream>
#include<limits.h>
using namespace std;
int main() {
	long long N, temp, min = INT_MAX, max = INT_MIN;
	cin >> N;
	while (N > 0) {
		N--;
		cin >> temp;
		if(temp < min) min = temp;
		if(temp > max) max = temp;
	}
	cout << min << " " << max << endl;
	return 0;
}