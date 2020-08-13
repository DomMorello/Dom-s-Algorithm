# 문제
# 8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.

# 입력
# 첫째 줄에 8진수가 주어진다. 주어지는 수의 길이는 333,334을 넘지 않는다.

# 출력
# 첫째 줄에 주어진 수를 2진수로 변환하여 출력한다. 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다.

# 예제 입력 1         예제 출력 1 
# 314               11001100

# import math

# octal = input()
# digits = len(octal)
# decimal = 0
# for i in range(0, digits):
#     digits -= 1
#     decimal += (int(math.pow(8,digits)) * int(octal[i]))
# if decimal == 0:
#     print("0")
#     exit()
# ret = []
# while decimal != 0:
#     remainder = decimal % 2
#     portion = int(decimal / 2)
#     if remainder != 0:
#         ret.append("1")
#     else:
#         ret.append("0")
#     decimal = portion
# ret.reverse()
# ret = ''.join(ret)
# print(ret)
#   위와 같이 했을 때 런타임 에러가 뜬다. 일정 자릿수가 넘어가면 의도한대로 진수변환을 잘 해주지 못한다. 이유는 모르겠다. 

# import sys

# binaryinit = ["0", "1", "10", "11", "100", "101", "110", "111"]
# binary = ["000", "001", "010", "011", "100", "101", "110", "111"]

# N = str(sys.stdin.readline())
# ret = ''
# for i in range(len(N)):
#     if i == 0:
#         ret += binaryinit[int(N[i])]
#     else:
#         ret += binary[int(N[i])]
# print(ret)
#   이렇게 했을 때는 시간초과가 나온다. 도대체 시간 초과 나올만한 구석이 어디있나 싶다. 

print(bin(int(input(), 8))[2:])