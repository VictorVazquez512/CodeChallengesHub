// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
#include <cstdio>
using namespace std;

int main() {
	freopen("lostcow.in", "r", stdin);
	freopen("lostcow.out", "w", stdout);
	long long x, y, old_pos, original_pos, total_distance = 0, next_walk = 1;
	cin >> x >> y;

	original_pos = x;
	old_pos = x;
	while (true) {
		x = original_pos;
		x += next_walk;
		next_walk *= -2;

		if ((original_pos >= y && x <= y) || (original_pos <= y && x >= y)) {
			total_distance += abs(old_pos - y);
			break;
		} else {
			total_distance += abs(x - old_pos);
		}

		old_pos = x;

	}

	cout << total_distance;

	return 0;

}
