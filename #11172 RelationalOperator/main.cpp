/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: rugeles
 *
 * Created on 13 de marzo de 2017, 10:40 AM
 */

#include <bits/stdc++.h>

using namespace std;

/*
 * 
 */
int main() {

    int n;
    cin>>n;
    for(int i=1; i<=n; i++){
        int a,b;
        cin>>a>>b;
        if(a>b)cout<<">"<<endl;
        if(a<b)cout<<"<"<<endl;
        if(a==b)cout<<"="<<endl;
    }
    return 0;
}

