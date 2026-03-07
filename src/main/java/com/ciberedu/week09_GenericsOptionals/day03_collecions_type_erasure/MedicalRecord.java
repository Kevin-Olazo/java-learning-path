package com.ciberedu.week09_GenericsOptionals.day03_collecions_type_erasure;

public class MedicalRecord<T> {
    private T recordData;

    public MedicalRecord(T recordData) {
        this.recordData = recordData;
        //T[] array = new T[10]; // This will cause a compile-time error because we cannot create an array of a generic type
    }

    public T getRecordData() {
        return recordData;
    }


}
