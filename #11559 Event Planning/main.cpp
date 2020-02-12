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

#include <iostream>

using namespace std;

/*
 * 
 */
int main() {

    int participantes, hoteles, semanas;
    double presupuesto;
    cin >> participantes >> presupuesto >> hoteles>>semanas;
    while (participantes > 0 && presupuesto > 0 && hoteles > 0 && semanas > 0) {
        double hotel[hoteles][semanas + 1];
        for (int i = 0; i < hoteles; i++) {
            int costo;
            cin>>costo;
            hotel[i][0] = costo;
            for (int j = 1; j <= semanas; j++) {
                cin >> hotel[i][j];
            }
        }
        bool cumple = false;
        double menor = 0;
        for (int i = 0; i < hoteles; i++) {
            if ((hotel[i][0] * participantes) <= presupuesto) {
                for (int j = 1; j <= semanas; j++) {
                    if (hotel[i][j] >= participantes) {
                        cumple = true;
                    } else {
                        cumple = false;
                        break;
                    }
                }
                if (cumple) {
                    if (menor == 0) {
                        menor = hotel[i][0];
                    }
                    if (hotel[i][0] < menor) {
                        menor = hotel[i][0];
                    }
                }
            }
        }
        if (menor == 0) {
            cout << "stay home"<<endl;
        } else {
            cout << menor*participantes<<endl;
        }
        cin >> participantes >> presupuesto >> hoteles>>semanas;
    }


    return 0;
}


