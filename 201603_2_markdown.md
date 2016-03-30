
**002. DashBoard! :-)**
===
01. Hi
-

안녕하세요 **지윤**입니다<i class="icon-heart"></i> 제가 돌아왔어요. 
오늘은 **Java Spring Mvc 002 **과제를 설명해 드릴거에요. 이번 과제는 시간이 좀 많이 걸렸어요.  

02. 목표
-
이번 과제의 목표는 4가지가 있었어요
1. MVC 모델을 이해하고
2. RESTful 을 이해하고
3. Spring 프레임 워크의 존재.사용 이유를 이해하고
4. Javadoc을 이해한다
위 네가지를 응용하는 거에요. 하나씩 설명을 해 볼게요



03. 설명
-
 **1. MVC모델 이란?**
> 
MVC는 Model View Controller의 약자로 소프트웨어 공학에서 어플리케이션을 구성하는 패던 중 하나입니다. 데이터, 화면, 데이터-화면을 연결하는 중간자 세가지로 특징을 나눠 놓은 패턴이에요 
>
Model : 응용 프로글매에서 데이터를 처리하는 부분을 가리킵니다. 데이터베이스에 연결하고 데이터를 추출하거나 저장, 삭제, 업데이트, 변환 등의 작업을 수행하는 역할을 합니다.
>
View  : View는 화면에 표시되는 부분입니다. 추출한 데이터나 일반적인 텍스트 데이터를 표시 하거나 입력폼 또는 사용자와의 상호작용을 위한 화면을 표시하는 영역이에요
>
Controller : 어플리케이션에서 각 요소들의 연결관계를 설정하고 데이터와 시각적인 부분의 연결을 관리합니다. 어떤 데이터와 뷰를 연결할지를 제어해요.


**2. RESTful  API**
REST API는 HTTP URI를 통해 Resource를 명시하고, HTTP Method(Post, Get, Put, Delete)를 통해 해당 Resource에 대한 CRUD Operation을 적용합니다. 즉, REST는 ROA(Resource Oriented Architecture) 설계의 중심에 Resource가 있고 HTTP Method를 통해 Resource를 처리하도록 설계된 아키텍쳐를 의미합니다.

 정의는 너무나 어려운데 하나의 클라이언트를 위한 서버를 구성하는 것이 비 효율적인 일이기 때문에 하나의 서버로 여러대의 클라이언트를 대응하도록 할때 필요한 것이 RESTful 한 방식입니다.

HTTP Method와 CRUD Operation은 대표적으로 4가지로 맵핑 됩니다.
 |  Method  |  CRUD    |
 |----------|----------| 
 | POST     |  Create  |
 |  GET     |  Read    |
 |  PUT     |  Update  |
 |  DELETE  |  Delete  |
 
 REST은 HTTP의존적이고, 표준이 없고 CRUD로 표현하기 모호한 작업을 처리하기에는 애매 하다는 단점이 잇지만,  멀티플랫폼 지원과 연동이 용이하고. 원하는 타입의 데이터로 주고받을 수 있다는 점. 웹 캐시 서버로도 이용 가능 하다는 장점이 있습니다.


>**TIP**
>참고로 API 테스트를 위해서 Chrome Extension중 다음 사이트를 이용 했습니다
>chrome-extension://cokgbflfommojglbmbpenpphppikmonn/index.html#response

**3. Javadoc **
자바 클래스를 Javadoc을 사용해서 문서화 합니다. Javadoc은 JDK에 포함되어있는 툴입니다. 양식에 맞춰 클래스 설명, 메소드 설명을 쓰는데 효과도 줄수 있고 여러개의 옵션이 있어 문서화하기에 아주 편합니다. 


 1. 메뉴에서 <kbd>file</kbd>-><kbd>Export..</kbd>를 선택한 다움 <kbd>java</kbd> -> <kbd>javadoc</kbd>을 클릭한 다음 <kbd>Next</kbd> 버튼을 누릅니다.
 2. javadoc 명령의 겅로, javadoc의 생성 대상 및 그 가시성을 선택한 후 <kbd>Next</kbd>를 누릅니다.  
 3. 필요에 따라 문서 제목을 입력한 후<kbd>Next</kbd>를 누릅니다
순서대로 따라하면 간단히 doc문서가 생성 됩니다.
인코딩이 깨질 수가 있는데,  VM potions (prefixed with '-J', e.g. -J-Xmx180m for larger heap space): 항목에서 인코딩 옵션을 설정(예. -locale ko_KR -encoding UTF-8 -charset UTF-8 -docencoding UTF-8)후 <kbd>Finish</kbd>를 눌러줍니다

위 방식대로 문서 만들면 보기에도 깔끔하고 꽤나 있어보이는 문서가 만들어져요











이론 몇번 읽는거보다 실습한번 해보는게 더 좋은 것 같아요~ 지금까지 실습했던 소스는 gitHub에 올리도록 하겠습니다 그럼 이만 안녕~~~ ^^*




|이름         | 메일주소        |
| :---------- | ----------:   | 
| 황지윤  | gyoonh90@gmail.com | 


