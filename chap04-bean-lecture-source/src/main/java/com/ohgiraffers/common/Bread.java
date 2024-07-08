package com.ohgiraffers.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)
public class Bread extends Product {
    private LocalDate bakedDate;  // 생산시간

    // 부모 클래스까지 초기화하는 생성자
    public Bread(String name, int price, LocalDate bakedDate) {
        super(name, price);
        this.bakedDate = bakedDate;
    }


//    @Override
//    public String toString() {
//        return "Bread{" +
//                super.toString() +
//                "bakedDate=" + bakedDate +
//                '}';
//    }
}
