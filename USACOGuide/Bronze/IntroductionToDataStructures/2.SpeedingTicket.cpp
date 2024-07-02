// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
#include <cstdio>
using namespace std;

int main() {
	freopen("speeding.in", "r", stdin);
	freopen("speeding.out", "w", stdout);
	int n, m, segment_length, segment_speed, max_diff = 0, current_diff;
	int road_unit = 1;
	int speed_limits[100];
	int beesies_speeds[100];

	cin >> n >> m;
	
	for (int i = 0; i < n; i++) {
		cin >> segment_length >> segment_speed;
		while(segment_length--){
			speed_limits[road_unit-1] = segment_speed;
			road_unit++;
		}
	}

	road_unit = 1;
	for (int i = 0; i < m; i++) {
		cin >> segment_length >> segment_speed;
		while(segment_length--){
			beesies_speeds[road_unit-1] = segment_speed;
			road_unit++;
		}
	}

	for (int i = 0; i < 100; i++) {
		current_diff = beesies_speeds[i] - speed_limits[i];
		if (current_diff > max_diff) {
			max_diff = current_diff;
		}
	}

	cout << max_diff;
	return 0;

}
