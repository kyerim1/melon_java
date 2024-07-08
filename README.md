# melon_java

이클립스 압축해제 후  JAVA 설정

1. 메뉴 window -> preferences ->   왼쪽항목에서  JAVA 를 펼치고 ->  Installed JREs 에서  오른쪽의 Add 버튼 클릭
2.  창 뜨면 next ->   Directory 버튼 클릭하여  c:/programFiles/java/jdk-11  폴더 선택
3.  finish 버튼 클릭  -> 새로 추가된  jdk 체크 -> apply
4. 왼쪽 java 항목에서 Compiler 선택하여 11로 변경

5. 새프로젝트 생성할때 jdk11 선택하여 만들기


git  연결 방법
window 메뉴에서  -> show view -> other  ->  창에서 git 펼치고 -> git repositories 선택 -> open



데이터베이스 설치

MySql 8.0.37
다운로드 주소
https://downloads.mysql.com/archives/get/p/25/file/mysql-installer-community-8.0.37.0.msi 

설치
1. 다운로드 파일 실행
2. custom 선택 next
3. Mysql Server , Mysql Workbench, Samples Adn Examples  추가
4. next 후에 installation 전에 항목이 있으면 관련 프로그램 설치 이기 때문에 반드시 설치 후 next
5. excute 클릭후 next 하여 port 번호 확인 next
6.  Use Legacy Authentication.... 선택 후 next
7.  비밀번호 설정 후  next
8.  서비스이름은 그냥 해도 되고 MySql 해도 되고 next
9.  next
10.  excute
11.  finish -> next -> (userName root  있는 화면 나요면 비번 입력하고 chck 후 next ->next->finish
