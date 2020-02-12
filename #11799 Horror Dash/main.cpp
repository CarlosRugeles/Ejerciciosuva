/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: rugeles
 *
 * Created on 26 de marzo de 2017, 03:20 PM
6 */

#include <bits/stdc++.h>

using namespace std;

/*
 * 
 */
int main() {
    int t=0;
    int number_students=0;
    int major=0;
    int temp=0;
    cin>>t;
    for(int i=0; i<t; i++){
        cin>>number_students;
        major=temp=0;
        for(int j=0; j<number_students; j++){
            cin>>temp;
            if(temp>major){
                major=temp;
            }
        }
        cout<<"Case "<<i+1<<": "<<major<<endl;
    }
    
    
    return 0;
}


