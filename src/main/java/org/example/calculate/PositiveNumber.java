package org.example.calculate;

public class PositiveNumber {

    private final int value;

    public PositiveNumber(int value) {
        valdate(value);
        this.value = value;
    }

    private void valdate(int value) {
        if(isNegativeNumber(value)){
            throw new IllegalArgumentException("0또는 음수는 전달할수가 없습니다.");
        }
    }

    private boolean isNegativeNumber(int value) {
        return value <= 0;
    }

    public int toInt(){
        return value;
    }
}
