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
    int altura_pozo = 0, desliza = 0, dias = 0, ini = -1;
    float salto = 0, recorrido = 0, factor_fatiga = 0, des = 0;
    cin >> altura_pozo >> salto >> desliza>>factor_fatiga;

    while (altura_pozo != 0) {
        des = salto * (factor_fatiga / 100);
        ini = -1;
        while (recorrido > 0 || ini == -1 && recorrido <= altura_pozo) {
            
            if (!dias == 0) {
                salto -= des;
            }
            if (salto > 0) {
                recorrido += salto;
            } else {
                salto = 0;
            }

            if (recorrido > altura_pozo) {
                dias++;
                break;
            } else {
                recorrido -= desliza;
            }
            if(recorrido==0){
                ini=-1;
            }else{
                ini=0;
            }
            dias++;

        }

        if (altura_pozo <= recorrido) {
            cout << "success on day " << dias << endl;
        } else {
            cout << "failure on day " << dias << endl;
        }
        salto = recorrido = factor_fatiga = altura_pozo = desliza = dias = 0;

        cin >> altura_pozo >> salto >> desliza>>factor_fatiga;
    }


    return 0;
}


