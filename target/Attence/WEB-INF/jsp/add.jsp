<%--
  Created by IntelliJ IDEA.
  User: msik
  Date: 2021/4/30
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="addatt" id="f">
    <table border="1">
        <tr>
            <td colspan="2">考勤信息记录表</td>
        </tr>
        <tr>
            <td>姓名:</td>
            <td><input type="text" name="empname" class="empname" id="empname"/></td>
        </tr>
        <tr>
            <td>部门:</td>
            <td><input type="text" name="dept" class="dept" id="dept"></td>
        </tr>
        <tr>
            <td>考勤日期:</td>
            <td><input type="date" name="chkdate" class="chkdate" id="dd"/>日期格式:(yyyy-MM-dd)</td>
        </tr>
        <tr>
            <td>考勤状态:</td>
            <td>
                <select name="status" id="status">
                    <option value="">请选择</option>
                    <option value="1">正常</option>
                    <option value="2">迟到</option>
                    <option value="3">早退</option>
                    <option value="4">休假</option>
                    <option value="5">外出</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="登记" id="aa"/>
                <a href="${pageContext.request.contextPath }/list" type="button">返回</a>
            </td>
        </tr>
    </table>
</form>
<script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.js"></script>
<script type="text/javascript">
        $("#f").submit(function () {
            var empname=$("#empname").val();
            var data=$("#dd").val();
            var dept=$("#dept").val();
            var status=$("#status").val();
            if (empname=="" || empname==null){
                alert("用户名不能为空！");
                return false;
            }
            if (data==""){
                alert("时间不能为空！");
                return false;
            }
            if (dept=="" || dept==null){
                alert("部门不能为空！");
                return false;
            }
            if (status=="" || status==0){
                alert("员工状态不能为空！");
                return false;
            }
            alert("登记成功！")
            return true;
        })
</script>
</body>
</html>
