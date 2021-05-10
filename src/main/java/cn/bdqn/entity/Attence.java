package cn.bdqn.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Attence {

  private Integer id;
  private String empname;
  private String dept;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date chkdate;
  private Integer status;
  private String statusName;

  public String getStatusName() {
    if (status==1){
      return "正常";
    }else if (status==2){
      return "迟到";
    }else if (status==3){
      return "早退";
    }else if (status==4){
      return "休假";
    }else{
      return "外出";
    }
  }

  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }
}
