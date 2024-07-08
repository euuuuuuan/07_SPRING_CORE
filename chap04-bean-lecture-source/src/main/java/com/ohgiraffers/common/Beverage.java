package com.ohgiraffers.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
// callSuper: 부모 클래스의 ToString도 포함해서 출력한다. (default = false)
@ToString(callSuper = true)
public class Beverage extends Product {
    private int capacity;  // 용량

    public Beverage(String name, int price, int capacity) {
        super(name, price);
        this.capacity = capacity;
    }
}
