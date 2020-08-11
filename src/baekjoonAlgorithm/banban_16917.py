# 문제
# 현진 치킨에서 판매하는 치킨은 양념 치킨, 후라이드 치킨, 반반 치킨으로 총 세 종류이다. 반반 치킨은 절반은 양념 치킨,
# 절반은 후라이드 치킨으로 이루어져있다. 양념 치킨 한 마리의 가격은 A원, 후라이드 치킨 한 마리의 가격은 B원, 반반 치킨 한 마리의 가격은 C원이다.

# 상도는 오늘 파티를 위해 양념 치킨 최소 X마리, 후라이드 치킨 최소 Y마리를 구매하려고 한다. 반반 치킨을 두 마리 구입해
# 양념 치킨 하나와 후라이드 치킨 하나를 만드는 방법도 가능하다. 상도가 치킨을 구매하는 금액의 최솟값을 구해보자.

# 입력
# 첫째 줄에 다섯 정수 A, B, C, X, Y가 주어진다.

# 출력
# 양념 치킨 최소 X마리, 후라이드 치킨 최소 Y마리를 구매하는 비용의 최솟값을 출력한다.

# 제한
# 1 ≤ A, B, C ≤ 5,000
# 1 ≤ X, Y ≤ 100,000

# 예제 입력 1                       예제 출력 1 
# 1500 2000 1600 3 2              7900
# 반반 치킨 4마리를 구매해서, 양념 치킨 2마리와 후라이드 치킨 2마리를 만들고, 양념 치킨 1마리를 구매하는 것이 최소이다.

# 예제 입력 2                       예제 출력 2 
# 1500 2000 1900 3 2              8500
# 예제 입력 3                       예제 출력 3 
# 1500 2000 500 90000 100000      100000000

a = input()
li = a.split()
source = int(li[0])
fried = int(li[1])
half = int(li[2])
numSource = int(li[3])
numFried = int(li[4])

if numSource >= numFried:
    minNum = numFried
else:
    minNum = numSource

if minNum == numFried:
    price = source
else:
    price = fried

if 2 * half <= source + fried:
    ret = (2 * half) * minNum
    if 2 * half <= price:
        ret += (2 * half) * abs(numFried - numSource)
    else:
        ret += price * abs(numFried - numSource)
else:
    ret = source * numSource + fried * numFried
print(ret)


