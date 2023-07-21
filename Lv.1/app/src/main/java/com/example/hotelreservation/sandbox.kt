package com.example.hotelreservation

import java.text.SimpleDateFormat
import java.util.Date


//1. 사용자가 호텔 예약을 할 수 있는 메뉴를 표시하세요. (번호는 1~6번까지 만들어봐요.)
//2. 메뉴에서 4번을 누르면 호텔 예약 프로그램을 종료할 수 있어요
//3. 예약 플로우는 성함을 입력받고 방 번호를 입력받고 체크인 날짜를 입력받고 체크아웃 날짜를 입력받아요
//4. 1번을 눌러 방 예약을 받을 수 있도록 구현해 봐요
//5. 방 번호는 100~999호실까지 존재해요
//6. 체크인 날짜는 지금 날짜와 비교해서 이전날짜는 입력받을 수 없고 체크아웃 날짜는 체크인 날짜보다 이전이거나 같을 수는 없어요
//7. 입력이 완료되면 임의의 금액을 지급해 주고 랜덤으로 호텔 예약비로 빠져나가도록 구현해 봐요

fun main() {

    println("호텔예약 프로그램 입니다")
    println("[메뉴]")
    println("1. 예약, 2. 예약목록 출력, 3. 예약목록 정렬출력, 4. 시스템 종료, 5. 입출금 내역 목록 출력, 6. 예약 변경 및 취소")
    val num1=readLine()!!.toInt()
    when (num1){
        1 -> println(oper())
        2 ->println("개발중인 사항입니다")
        3 ->println("개발중인 사항입니다")
        4 ->println("시스템을 종료합니다")
        5 ->println("개발중인 사항입니다")
        6 ->println("개발중인 사항입니다")
        else->println("개발중인 사항입니다(처음으로 돌아가기)")
        //입력부로 돌아가는 코드 필요
    }

}
fun oper() {
    println("성함을 입력하여 주십시오")
    var name = readLine()!!.toString()
    println("예약하실 방 번호를 입력하여 주십시오.  100~999")
    var num = readLine()!!.toInt()
    if (num<100)
        println("올바른 번호를 입력하여 주십시오.  100~999")
    //입력부로 돌아가는 코드 필요
    else if (num>999)
        println("올바른 번호를 입력하여 주십시오.  100~999")
    //입력부로 돌아가는 코드 필요
    else println("체크인 날짜를 입력해 주세요.  표기방식 YYYYMMDD")
    var checkin = readLine()!!.toInt()
    val dateFormat = "yyyyMMdd"
    val date = Date(System.currentTimeMillis())
    val simpleDateFormat = SimpleDateFormat(dateFormat)
    val simpleDate = simpleDateFormat.format(date).toInt()
    //입력날짜는 checkin으로 입력, 오늘 날짜는 simpleDate로 입력
    if (checkin<=simpleDate)
        println("체크인 일자는 오늘 혹은 이전일로 지정할 수 없습니다")

    else
        println("체크아웃 날짜를 입력해 주세요.  표기방식 YYYYMMDD")
    var checkout = readLine()!!.toInt()
    if(checkout<=checkin)
        println("체크아웃 일자는 체크인 당일 혹은 이전일로 지정할 수 없습니다")
    else
        println("${name}고객님.  ${checkin}일 체크인, ${checkout}일 체크아웃으로 예약이 완료되었습니다.  감사합니다")
}
