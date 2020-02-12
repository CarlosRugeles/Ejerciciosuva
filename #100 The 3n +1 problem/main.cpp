#include <bits/stdc++.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
using namespace std;

int main() {
    int x = 0, y = 0;
    while (scanf("%d %d", &x, &y) != EOF) {
        int maximo = 0, temporal = 1, tx = x, ty = y;
        if (x > y) swap(x, y);
        while (x <= y) {
            int z = x;
            while (z != 1) {
                if (z % 2 != 0)z = (3 * z) + 1;
                else z = z >> 1;

                temporal++;
            }
            if (temporal > maximo) maximo = temporal;
            temporal = 1;
            x++;
        }
        cout << tx << " " << ty << " " << maximo << endl;
    }
    return 0;
}

