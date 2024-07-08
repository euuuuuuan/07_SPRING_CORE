package com.ohgiraffers.common;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    private String name;  // 상품명
    private int price;  // 상품가격
}
