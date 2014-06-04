package com.dataart.ks.javaschool;


import java.util.ArrayList;

/**
 * Структура заказа не очень сложна. Каждый заказ имеет уникальный номер, который используется для отслеживания,
 * а также информацию о клиенте, дату размещения, способ доставки (авиа или наземной службой) и состояние заказа.
 * Каждый заказ может содержать несколько позиций. На текущий момент мы ограничиваем количество позиций заказа
 * десятью.
 */
public class Order {

	//TODO add properties (except order positions)
    private ArrayList<OrderPosition> A = new ArrayList();

    public void aaa(){
        A.add(new OrderPosition(1, 0.5f, 1));
    }

}
