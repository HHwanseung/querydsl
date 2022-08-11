package study.querydsl.dto;

import lombok.Data;

@Data
public class UserDto {

    private String name;
    private int age;
    private String teamName;
    public UserDto() {
    }

    public UserDto(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
