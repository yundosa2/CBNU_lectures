"""
실습 1
ax + c = 0의 근 구하기

입출력 예

ax + b = 0의 근을 구하려 합니다.
a를 입력하세요: 4
b를 입력하세요: 5
4x + 5 = 0의 근은 -1.25입니다.
"""

print("ax + b = 0의 근을 구하려 합니다.")
a = int(input("a를 입력하세요: "))
b = int(input("b를 입력하세요: "))
c = -(b / a)
# print(a, 'x + ', b, '의 근은 ', c, '입니다.')
print("{0}x + {1}의 근은 {2}입니다.".format(a,b,c))