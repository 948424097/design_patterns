package com.banyexitou.homework.another;


/**
 * 建造者模式的测试
 */
public class InitVariableDtoBuilder {

    /**
     * todo这种叫什么鬼东西，编译时不报错？？？？？
     */
    private InitVariableDto initVariableDto /*= new InitVariableDto()*/;

    public void setName(String name){initVariableDto.setName(name);}
}
