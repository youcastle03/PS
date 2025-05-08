#include <iostream>


using namespace std;

 

int main()

{
	int n,a;
	string s;
	cin>>n;
	for(int i=0; i<n; i++){
		cin>>a>>s;
		for(int j=0; j<s.length(); j++){
			for(int k=0; k<a; k++){
				cout<<s[j];
			}
		}
		cout<<endl;
	}
}
