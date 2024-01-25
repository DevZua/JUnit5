# JUnit5

## 좋은 단위 테스트 특징

### 1. 회귀 방지
    회귀 버그 : 기존에 제대로 동작하던 소프트웨어 기능에 문제가 생기는 것을 의미(신규 기능 추가 또는 기존 기능 수정)
   * 코드 베이스가 커질수록 잠재적인 버그에 더 많이 노출됨
   * 이를 방지하기 위해 테스트가 가능한 많은 코드를 실행하는 것이 중요함


### 2. 리팩토링 내성
     작성해 둔 테스트가 실패되지 않으면서 소프트웨어 코드를 리팩토링 할 수 있는가? 에 대한 척도

   * **거짓 양성** : 리팩토링 후 기존 기능이 정상적으로 동작하지만 테스트 코드가 실패하는 상황을 거짓 양성이라고 함.
   * 거짓 양성의 장점
     * 테스트를 통해 기존 기능에 대한 재확인을 할 수 있도록 유도(조기 경고)
     * 코드의 변경으로 인해 회귀 버그가 발생하지 않을 것에 대한 확신
   * 거짓 양성의 단점
     * 타당한 이유 없이 실패한다면 테스트를 고치는 것, 기존 코드를 고치는 것에 대해 무감각해짐
     * “깨진 유리창 이론"
   * 구현 세부사항보다 최종 결과를 테스트
     * 테스트 코드에서 검증해야 하는 부분은 “입력"이 들어왔을 때, 기대하는 “출력"으로 결과값이 나오는지 보면 됨

### 3. 빠른 피드백
* 테스트 속도가 빠를 수록 더 많은 테스트를 수행할 수 있고, 더 자주 실행할 수 있음
  * 테스트가 실패되었을 때 버그를 빠르게 수정할 수 있음
    
### 4. 높은 유지 보수성
  * 테스트 코드가 이해하기 쉬운가?
  * 테스트를 실행하기 쉬운가?(테스트를 수행하기 위해 외부 의존성이 필요한가?)

