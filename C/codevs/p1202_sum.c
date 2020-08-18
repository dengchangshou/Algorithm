#include<iostream>
using namespace std;
int main() {
	int N, m, sum = 0;
	cin >> N;
	while (N > 0) {
		cin >> m;
		sum += m;
		N--;
	}
	cout << sum << endl;
	return 0;
}