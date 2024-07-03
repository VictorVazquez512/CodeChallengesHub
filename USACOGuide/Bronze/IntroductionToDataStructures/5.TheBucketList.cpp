// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
#include <cstdio>
using namespace std;

int main() {
	freopen("blist.in", "r", stdin);
	freopen("blist.out", "w", stdout);
	
	int N;
    cin >> N;

    // Array to keep track of bucket usage at each time point
    int time_line[1001] = {0};

    // Read input and update time usage
    for (int i = 0; i < N; ++i) {
        int s, t, b;
        cin >> s >> t >> b;

        // Update bucket usage for the time interval [s, t]
        for (int j = s; j <= t; ++j) {
            time_line[j] += b;
        }
    }

    // Find the maximum bucket usage at any time point
    int max_buckets = *max_element(time_line, time_line + 1001);

    // Output the result
    cout << max_buckets << endl;

	return 0;

}
