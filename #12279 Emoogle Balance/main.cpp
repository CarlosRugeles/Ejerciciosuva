/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: rugeles
 *
 * Created on 8 de mayo de 2017, 03:16 AM
 */

#include <bits/stdc++.h>

using namespace std;

/*
 * 
 */
int main() {
    int n = 0;
    int i = 1;
    while (cin >> n,n) {
        int resultado = 0;
        int t = 0;
        while (n--) {
            
            cin>>t;
            if (t >= 1 && t <= 99) {
                resultado++;
            } else {
                resultado--;
            }
        }
        cout << "Case " << i << ": " << resultado << endl;
        i++;
    }
    return 0;
}

