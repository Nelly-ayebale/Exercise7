package com.Animal;

public interface AnimalMove {
    default String move(){
        return this.getClass().getSimpleName()+ " moves ";
    }
}
