package model;

import lombok.Data;

import java.sql.Date;

@Data
public class Homework {
    private Long id;

    private String title;

    private String content;

    private Date createTime;

    private Date updateTime;
}
