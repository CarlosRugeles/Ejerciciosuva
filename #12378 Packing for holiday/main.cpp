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
    cin>>n;
    int l, w, h;
    while (n--) {
        cin >> l >> w>>h;
        if (l <= 20 && w <= 20 && h <= 20) {
            cout << "Case " << i << ": good" << endl;
        } else {
            cout << "Case " << i << ": bad" << endl;
        }
        i++;
    }


    return 0;
}

