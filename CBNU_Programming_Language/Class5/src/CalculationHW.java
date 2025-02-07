
public class CalculationHW {
	public static void main(String[] args) {
		
		// 경영정보학과 2016024017 윤상준
		
		// 파일을 실행하여 결과값을 확인하기 전에 먼저 각 항의 구동원리와 결과값을 예측하여 주석으로 표시함.
		
		// 변수 i, j, h 의 값을 임의로 설정함.
		
		int i = 50;
		int j = 2;
		int h = 32;
		
		
		System.out.println("=== 산술 연산자 ===");					
		System.out.println("덧셈 : " + (i + j));					// 52
		System.out.println("뺄셈 : " + (i - j));					// 48
		System.out.println("곱셈 : " + (i * j));					// 100
		System.out.println("나눗셈 : " + (i / j));				// 25
		System.out.println("나머지 : " + (i % j));				// 0
		
		System.out.print("\n");										// 가독성을 위해 각 파트별로 줄바꿈 실행.
		
		System.out.println("=== 자동증감 연산자 ===");
		i++;																			// i 값을 먼저 사용한 후 +1
		System.out.println("증가1 : " + i);							// 51 (기존 i값인 50이 나오지 않는 이유는 22항에서 이미 ++까지 실행되었기 때문에 +1이 되었음. 만일 22항과 23항 자리를 바꿔 실행한다면 기존 i값인 50이 출력됨.)
		j--;																			// j 값을 먼저 사용한 후 -1
		System.out.println("감소1 : " + j);							// 1 (기존 j값인 1이 나오지 않은 이뉴는 23항에서의 설명과 같음.)
		++i;																			// i 값을 먼저 +1한 후 사용.
		System.out.println("증가2 : " + i);							// 52 (23항의 연산 과정에서 이미 +1 되어 51이 되었고, 26항의 연산에서 또 +1이 되었으므로 52가 출력됨.)
		--j;																			// j 값을 먼저 -1한 후 사용.
		System.out.println("감소2 : " + j);						// 0 (0이 나오는 이유는 27항에서의 설명과 같음.)

		System.out.print("\n");
				
		System.out.println("=== 동등비교, 관계 연산자 ===");			// i = 52, j = 0
		System.out.println("i == j >> " + (i == j));								// False
		System.out.println("i |= j >> " + (i != j));								// True
		System.out.println("i > j >> " + (i > j));									// True
		System.out.println("i < j >> " + (i < j));									// False	
		
		System.out.print("\n");
		
		System.out.println("=== 논리 연산자 ===");							// i = 52, j = 0
		System.out.println("&& (AND) >> " + (i > j && i > h));			// True
		System.out.println("&& (AND) >> " + (i > j && i < h));			// False
		System.out.println("|| (OR) >> " + (i > j || i < h));					// True
		System.out.println("|| (OR) >> " + (i > j || i > h));					// True
		
		System.out.print("\n");
		
		System.out.println("=== 할당 연산자 ===");
		System.out.println("h = " + h);												// 기존의 정한 h값인 32 출력.
		h = i;																							// h 변수에 새로운 값 (i = 52)을 입력했으므로 기존의 h값인 32는 제거되고 새로이 52가 입력됨.
		System.out.println("h = " + h);												// 52

		System.out.print("\n");
				
		System.out.println("=== 줄여 쓰는 연산자 ===");
		i = i + 100;																				// 기존의 i 값인 52에 100을 더한 값인 152를 변수 i에 저장했으므로, 기존의 i값인 52 대신 새로이 152가 입력됨.
		System.out.println("i = " + i);												// 152
		i = 11;																						// 57항에서 저장된 i값인 152 대신에 11을 저장했으므로, 기존의 i값인 152 대신에 새로이 11이 입력됨.
		System.out.println("i = " + i);												// 11
		i += 100;																					// 풀어쓰면 i = i + 100 이 되므로, 위에서 설명한 원리에 따라 기존의 i값인 11 + 100의 결과인 111이 새로이 i값으로 입력됨.
		System.out.println("i = " + i);												// 111
		
	}

}
