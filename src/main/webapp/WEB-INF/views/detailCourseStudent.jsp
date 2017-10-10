<%--
  Created by IntelliJ IDEA.
  User: xiaojianyu
  Date: 2017/10/4
  Time: 9:28
  To change this template use File | Settings | File Templates.
--%>
<%@page language="java" contentType="text/html;UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <meta charset="utf-8">
    <title>选课的同学</title>
    <link rel="stylesheet" href="../static/plugins/layui/css/layui.css" media="all">
</head>
<body>

<%--表格start--%>
<fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
    <legend>选课学生信息   </legend>
    <table id="courseStudentInfoTable" class="layui-table"  lay-filter="courseStudentInfoTable" ></table>
</fieldset>
<%--表格end--%>

<script type="text/html" id="gradeTpl">
    {{#  if(d.grade > 100){ }}
            {{d.grade/10}}
    {{#  } else { }}
            {{d.grade}}
    {{#  } }}
</script>

<script src="../static/plugins/layui/layui.js"></script>
    <script>
        layui.use(['jquery','layer','form','table'], function(){
            var $ = layui.$;
            var layer=layui.layer;
            var table=layui.table;
            var form=layui.form;

            //            表格start
            var tabb=table.render({
                id:'courseStudentInfoTable',
                elem: '#courseStudentInfoTable',
                url: '/courseStudentInfoTable',
                where: {courseNum:'${courseNum}'},
                cols:  [[
                        {checkbox: true, LAY_CHECKED: false}
                        ,{field: 'grade',edit:'text',title: '分数',width: 150,align:'center',templet:'#gradeTpl'}
                        ,{field: 'majorName',align:'center', title: '所属专业', width: 150}
                        ,{field: 'studentName', align:'center',title: '学生姓名', width: 150}
                        ,{field: 'studentNum', align:'center',title: '学生学号', width: 150}
                        ,{field: 'studentSex', align:'center',title: '学生性别', width: 150}
                        ,{field: 'studentPhoneNum', align:'center',title: '学生联系方式', width: 150}
                ]],
                page:true,
                limits: [10,20,30],
                limit:10,
                height:800,
            });

            table.on('edit(courseStudentInfoTable)', function(obj){
                console.log(obj.value); //得到修改后的值
                console.log(obj.field); //当前编辑的字段名
                console.log(obj.data); //所在行的所有相关数据
                console.log(obj.data['grade']);
                obj.data[obj.field]=obj.value;
                console.log(obj.data['stuCourseID']);
                $.ajax({
                    url: '/editStudentGrade',
                    type: 'post',
                    data: {"grade":obj.data['grade']*10,"stuCourseID":obj.data['stuCourseID']},
                    dataType: 'json',
                    success: function (result) {

                    }
                });
            });

        });
    </script>
</body>
</html>
