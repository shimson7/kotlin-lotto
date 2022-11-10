package lotto

/*
2주차 피드백
1. 변수 이름에 자료형, 자료 구조 사용 X
2. 함수 길이 15라인 넘어가지 않게, 넘어가면 분리
3. 핵심 기능에 가까운 부분부터 작게 테스트를 만들어 나간다.
4. else를 지양한다.

ex)
큰 단위의 테스트
숫자 야구 게임을 시작해서 사용자가 숫자를 입력하면, 컴퓨터 숫자와 비교하여 그 결과를 알려준다.

작은 단위의 테스트
사용자의 숫자가 컴퓨터의 숫자와 하나도 일치하지 않으면 낫싱을 출력한다.
사용자의 숫자가 컴퓨터의 숫자와 1개는 일치하고, 위치가 다르면 1볼을 출력한다.

*/

// Enum 클래스 적용해 프로그래밍을 구현한다.
enum class State(val message: String){
    Start("구입금액을 입력해 주세요."),
    Many("개를 구매했습니다."),
    enterLottoNumber("당첨 번호를 입력해 주세요."),
    enterBonusNumber("보너스 번호를 입력해 주세요."),
    end("당첨 통계");

    //함수 추가 가능함

}

fun main() {
    var start = State.Start
    var many = State.Many
    var enterLottoNumber = State.enterLottoNumber
    var enterBonusNumber = State.enterBonusNumber
    var end = State.end

    //시작
    println(start.message)

    //구매 개수
    println(many.message)

    //당첨 번호
    println(enterLottoNumber.message)

    //보너스 번호
    println(enterBonusNumber.message)

    //당첨 통계
    println(end.message)

}
