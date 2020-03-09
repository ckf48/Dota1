package model;

import lombok.Data;

import java.sql.Date;

@Data
public class Student {
    private Long id;

    private String name;

    private Date createTime;

    private Date updateTime;

}
