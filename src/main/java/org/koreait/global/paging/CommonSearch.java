package org.koreait.global.paging;

import lombok.Data;

@Data
public class CommonSearch {

    private int page = 1;//페이지번호
    private int limit = 20;//페이지당 출력개수

    private String sopt;// 검색 옵션
    private String skey;//검색키워드
}
