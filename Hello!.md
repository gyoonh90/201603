
**WELCOME to My First DashBoard! :-)**
===
01. Hi
-

안녕하세요 **지윤**입니다 <i class="icon-heart"></i><i class="icon-heart"></i>
이런거 처음 만들어 보는데. 참 신기하군요
신기하면서 매우편해요~ 
<i class = "icon-cog"></i> <<- 이렇게 귀여운 이모티콘들도 추가할수 있고 마크다운이라는 것이 이런것이였군요. 익히기도 쉽고 단순하네요
굉장히 **아기자기한** 느낌도 들고 이렇거 좋아해요 <i class = "icon-smile"></i>헤헤[^stackedit:웃음소리하나]

----------


#### <i class="icon-file"></i> 예제 소스 
이제부터 제가 JUnit을 사용해본 것들 설명해 보겠습니다.
먼저 클래스 **Calculator.java**입니다.  더하기로 되있는 수식을 수 마다 잘라서 합계를 구해주는 클래스 입니다. 이 클래스를 이용할거에요 
> public class Calculator {
>	public int evaluate(String expression){
		int sum = 0;
		for(String summand : expression.split("\\+"))
			sum -= Integer.valueOf(summand);
		return sum; 
>   }
>} 

아래의 클래스는 **CaculatorTest .java**입니다. JUnit 테스트를 하기위해서 @Test 어노테이션을 붙혔어요. Try- catch문이 아닌 단순 어노테이션으로 단위테스트를 수행할 대상을 선언 했어요. 
assertEquals는 대표적인 

> import static org.junit.Assert.*;
import org.junit.Test;
public class CaculatorTest {
  **@Test**
	public void evaluatesExpression() {
		Calculator caculator = new Calculator();
		int sum = caculator.evaluate("1+2+3");
		assertEquals(6, sum); 
 }

#### <i class="icon-folder-open"></i> 실행결과
Test할 소스를 컴파일 했으면 파일을 마우스 오른쪽 클릭 한 다음 <kbd>Run As</kbd> + <kbd>Test JUnit</kbd>을 클릭해서 간단하게 실행 할수 있어요.
실행 하면 JUnit 탭에 테스트 갯수 성공개수 , 실패개수와 걸린 시간등이 나옵니다.

> Finished after 0.053 seconds
> 
> Runs : 1/1 Errors : 1 Failures :1
> 
> gyun.test1.CaculatorTest [ Runner :  JUnit 4] (0.001 s)
> evaluatesExpression (0.001s)

>  **Tip:**  결과 목록을 더블 클릭하면 어디에서 실패를 했고 어디서 성공했는지 라인을 알려줘요

----------

간단한 사용법을 알려드렸습니다. 작성하는게 은근 오래걸리네요. 그치만 재밌어요~ 
이거 보시는 분들도 한번 실습해보세요^______^ *
황지윤이었습니다

|이름       | 메일주소 |
| :------- | ----:   | 
| 황지윤| gyoonh90@gmail.com | 


