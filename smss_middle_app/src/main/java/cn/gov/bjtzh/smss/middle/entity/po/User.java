package cn.gov.bjtzh.smss.middle.entity.po;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;

    //@TableField(fill = FieldFill.INSERT_UPDATE)

//    private Date update_time;
    //@TableField(fill= FieldFill.INSERT)
  //  private Date create_time;
}
