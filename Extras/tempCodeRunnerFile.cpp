#include<bits/stdc++.h>
using namespace std;
void printResult(vector<int>arr,int arr_size){
    unordered_map<int,int>mp;
    for(auto it:arr)
    mp[it]++;
    int mx=0;
    for(auto it:mp)
    mx=max(mx,it.second);
    cout<<mx;
}
int main(){
    vector<int>arr;
    int num;
    while(cin>>num){
        arr.push_back(num);
    }
    printResult(arr,arr.size());
}