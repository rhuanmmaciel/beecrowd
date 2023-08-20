#include <stdio.h>

int main() {

    int i;

    scanf(" %d", &i);

    int maximum = i;

    for(; i > 0; i--){

        if(i != maximum)
            printf("\n");

        int base;
        scanf("%d", &base);

        int amount;
        scanf("%d", &amount);

        int numbers[amount];

        for(int k = 0; k < amount; k++)
            scanf("%d", &numbers[k]);

        for(int j = 0; j < base; j++) {

            printf("%d -> ", j);

            for(int k = 0; k < amount; k++)
                if(numbers[k] % base == j) printf("%d -> ", numbers[k]);

            printf("\\\n");

        }

    }

}
