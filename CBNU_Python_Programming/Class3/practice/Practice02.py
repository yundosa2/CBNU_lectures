"""
실습 2) 이름 정렬하기

사용자로부터 콤마(,)로 구분하여 이름을 입력 받으면 이를 오름차순으로 정렬하여 출력하는 프로그램을 작성하여라.

이름 입력: 전우치,임꺽정,홍길동,이순신,김철수
결과: 김철수,이순신,임꺽정,전우치,홍길동
"""

a = input("이름 입력 : ")
b = sorted(a.split(','))
print("결과 : " + ','.join(b))