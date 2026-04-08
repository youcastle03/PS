#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
 
int main(void) {
	int n,min;
	cin>>n;
	min=0;
	vector<int> a(n);
	vector<int> b(n);
	for(int i=0; i<n; i++){
		cin>>a.at(i);
	}
	for(int i=0; i<n; i++){
		cin>>b.at(i);
	}
	sort(a.begin(),a.end(),greater<int>());
	sort(b.begin(),b.end(),less<int>());
	for(int i=0; i<n; i++){
		min+=(a.at(i)*b.at(i));
	}
	cout<<min;
}