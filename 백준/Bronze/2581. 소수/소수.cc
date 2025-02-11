#include <iostream>

using namespace std;

 

int main()

{
	int n,m;
	int sum=0;
	int much=0;
	int min,real;
	real=0;
	cin>>m>>n;
	min=n;	
	for(int i=m; i<=n; i++){
		for(int j=1; j<=i; j++){
			if(i%j==0){
				much++;
			}
		}
		if(much==2){
			sum+=i;
			real=1;
			if(i<min){
				min=i;
			}
		}
		much=0;
	}
	if(real){
		cout<<sum<<endl;
		cout<<min;	
	}
	else{
		cout<<-1;
	}
	
			
}
