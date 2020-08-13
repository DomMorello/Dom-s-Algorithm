# 문제
# 8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.

# 입력
# 첫째 줄에 8진수가 주어진다. 주어지는 수의 길이는 333,334을 넘지 않는다.

# 출력
# 첫째 줄에 주어진 수를 2진수로 변환하여 출력한다. 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다.

# 예제 입력 1         예제 출력 1 
# 314               11001100

def getBinary(a):
    bi = []
    while a >= 2:
        remainder = a % 2
        portion = int(a / 2)
        if remainder != 0:
            bi.append("1")
        else:
            bi.append("0")
        a = portion
    if a == 1:
        bi.append("1")
    else:
        bi.append("0")
    bi.reverse()
    print(bi)
    return bi
    
octal = input()
length = len(octal)
ret = ""
for i in range(0,length):
    digit = int(octal[i])
    ret += ''.join(getBinary(digit))
print(ret)


