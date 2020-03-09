package model;

import lombok.Data;

import java.sql.Date;

@Data
public class StudentHomework {
    private Long id;

    private Long studentId;

    private Long homeworkId;

    private String homeworkTitle;

    private String homeworkContent;

    private Date createTime;

    private Date updateTime;
}
