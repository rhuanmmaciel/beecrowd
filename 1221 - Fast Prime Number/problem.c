#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

bool isPrime(int n) {

    if (n <= 1) return false;

    for (int i = 2; i * i <= n; i++)
        if (n % i == 0) return false;

    return true;
}

int main() {

    int values[] = {0, 2, 4, 6, 8, 5};

    int n;
    scanf("%d", &n);

    for (int j = 0; j < n; j++) {

        char number[11]; 
        scanf("%s", number);

        int last_digit = '0' - number[strlen(number) - 1];

        bool found = false;

        for (int i = 0; i < 6; i++)
            if (values[i] == last_digit) {

                found = true;
                break;

            }

        if (found) printf("Not ");
        else {

            int digitsSum = 0;
            for (int i = 0; i < strlen(number); i++)
                digitsSum += '0' - number[i];

            if (digitsSum % 3 == 0 || !isPrime(atoi(number))) printf("Not ");

        }
        
        printf("Prime\n");
    }

    return 0;
}
