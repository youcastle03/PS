#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int N, C;
    cin >> N >> C;
    
    vector<int> w(N);
    for (int i = 0; i < N; i++) {
        cin >> w[i];
        
        if (w[i] == C) {
            cout << 1 << endl;
            return 0;
        }
    }
    
    sort(w.begin(), w.end());
    int left = 0;
    int right = N - 1;
    int weight;
    
    while (left < right) {
        weight = w[left] + w[right];
        if (weight > C) {
            right--;
        } else if (weight == C) {
            cout << 1 << endl;
            return 0;
        } else {
            if (find(w.begin() + left + 1, w.begin() + right, C - weight) != w.begin() + right) {
                cout << 1 << endl;
                return 0;
            }
            left++;
        }
    }
    
    cout << 0 << endl;
    return 0;
}
