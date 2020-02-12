#include <bits/stdc++.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
using namespace std;

int main() {
    int t = 0;
    cin >> t;
    int numeros[t][2];
    for (int i = 0; i < t; i++) {
        cin >> numeros[i][0] >> numeros[i][1];
    }
    for (int i = 0; i < t; i++) {
        int suma = 0;
        int diferencia = 0;
        int x = 0, y = 0;
        suma = numeros[i][0];
        diferencia = numeros[i][1];
        y = abs(suma - diferencia) / 2;
        x = suma - y;

        if ((x + y == suma)&&(abs(x - y) == diferencia)) {
            if (x > y) {
                cout << x << " " << y << endl;
            } else {
                cout << y << " " << x << endl;
            }
        } else {
            cout << "impossible" << endl;
        }


    }
    return 0;
}

