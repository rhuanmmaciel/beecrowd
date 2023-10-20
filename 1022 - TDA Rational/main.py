import math

n = int(input())

for i in range(n):
    expression = input().split(" ")
    n1 = int(expression[0])
    d1 = int(expression[2])
    n2 = int(expression[4])
    d2 = int(expression[6])
    operator = expression[3]

    if operator == "+":
        result_n = n1 * d2 + n2 * d1
        result_d = d1 * d2
    elif operator == "-":
        result_n = n1 * d2 - n2 * d1
        result_d = d1 * d2
    elif operator == "*":
        result_n = n1 * n2
        result_d = d1 * d2
    else:
        result_n = n1 * d2
        result_d = n2 * d1

    print(f"{result_n}/{result_d} = ", end="")
    common_divisor = math.gcd(result_n, result_d)
    result_n //= common_divisor
    result_d //= common_divisor

    print(f"{result_n}/{result_d}")

