#include <iostream>

using namespace std;

int arr[101][100001];
int n,k,w,v;

int main() {
	
	cin>>n>>k;
	
	for(int  i=1; i<=n; i++){
		cin>>w>>v;
		for(int j=0; j<=k; j++){
			if(j<w){
				arr[i][j]=arr[i-1][j];
			}
			else{
				arr[i][j]=max(arr[i-1][j],arr[i-1][j-w]+v);
			}
		}
	}
	cout<<arr[n][k];
}
