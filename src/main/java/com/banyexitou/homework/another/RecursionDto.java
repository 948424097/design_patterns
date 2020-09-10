package com.banyexitou.homework.another;

public class RecursionDto {
    private RecursionDto ggg;
    private byte[] capa = new byte[1024*1024];

    public byte[] getCapa() {
        return capa;
    }

    public void setCapa(byte[] capa) {
        this.capa = capa;
    }

    public RecursionDto getGgg() {
        return ggg;
    }

    public void setGgg(RecursionDto ggg) {
        this.ggg = ggg;
    }

    public static void main(String[] args) {
        RecursionDto recursionDto = new RecursionDto();
        recursionDto.setGgg(new RecursionDto());
        recursionDto.getGgg().setGgg(recursionDto);

    }
}
