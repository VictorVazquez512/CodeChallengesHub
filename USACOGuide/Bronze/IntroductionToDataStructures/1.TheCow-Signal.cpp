// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
#include <cstdio>
using namespace std;

int main() {
	// freopen("cowsignal.in", "r", stdin);
	// freopen("cowsignal.out", "w", stdout);
	int m, n, k;
	cin >> m >> n >> k;

	string arr[15];
	string ans;
	string temp;

	for (int i = 0; i < m; i++) {
		cin >> arr[i];
	}

	for (int i = 0; i < m; i++) {
		temp = "";
		for(int j = 0; j < n; j++) {
			for (int ii = 0; ii < k; ii++){
				temp += arr[i][j];
			}
		}
		for (int j = 0; j < k; j++) {
			cout << temp << endl;
		}

	}


}
