#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"Enter the size of an array: "<<endl;
    cin>>n;
    int arr[n];
    cout<<"Enter the elements of an array:"<<endl;
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int largest=INT_MIN;
    for(int i=0;i<n;i++){
    largest=max(arr[i], largest);
    }
    cout<<"Largest element in the array is:"<<endl;
    cout<<largest<<endl;
    return 0;
}

