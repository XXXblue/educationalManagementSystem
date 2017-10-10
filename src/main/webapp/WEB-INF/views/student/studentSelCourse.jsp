<%--
  Created by IntelliJ IDEA.
  User: xiaojianyu
  Date: 2017/9/13
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@page language="java" contentType="text/html;UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <meta charset="utf-8">
    <title>table模块快速使用</title>
    <link rel="stylesheet" href="../static/plugins/layui/css/layui.css" media="all">
</head>
<body>


<%--表格start--%>
<fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
    <legend>可选课程信息</legend>
    <table id="stuselcourseInfoTable" class="layui-table"  lay-filter="stuselcourseInfoTable" ></table>
</fieldset>
<%--表格end--%>



<script src="../static/plugins/layui/layui.js"></script>
<script type="text/html" id="selbar">
    {{#  if(d.flag==1){ }}
    <a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="removecourse">退选</a>
    {{#  } else { }}
    <a class="layui-btn layui-btn-mini" lay-event="selcourse">选课</a>
    {{#  } }}
</script>
<script>
    layui.use(['jquery','table'], function(){
        var $ = layui.$;
        var table=layui.table;
        //            表格start
        var tabb=table.render({
            id:'stuselcourseInfoTable',
            elem: '#stuselcourseInfoTable',
            url: '/stuselcourseInfoTable',
            cols:  [[ //标题栏
                {checkbox: true, LAY_CHECKED: false}
                ,{field: 'courseName', align:'center',title: '课程名称', width: 150}
                ,{field: 'courseCredit', align:'center',title: '课程学分', width: 150}
                ,{field: 'classNum', align:'center',title: '课室编号', width: 150}
                ,{field: 'teacherName',align:'center', title: '教师名称', width: 150}
                ,{field: 'courseFree',align:'center', title: '人数剩余', width: 150}
                ,{field: 'majorName',align:'center', title: '所属专业', width: 150}
                ,{field: 'sCourseDay',align:'center', title: '上课周', width: 150}
                ,{field: 'sCourseDayTime',align:'center', title: '课程时间段', width: 150}
                ,{fixed: 'right',title: '操作', width:150, align:'center', toolbar: '#selbar'}
            ]],
            page:true,
            limits: [10,20,30],
            limit:10,
            height:800,
            done: function(res, curr, count){
                console.log(res.data);
                res.data[0]['classNum']="ccc";
                table.render({
                   data:res.data
                });
            }
        });



        table.on('tool(stuselcourseInfoTable)', function(obj){
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值

//            选课
            if(layEvent === 'selcourse'){
                $.ajax({
                    url: '/stuselcourse/'+data['courseNum'],
                    type: 'get',
                    dataType: 'json',
                    success:function (result) {
                        if(result.status===1){
                            layer.msg(result.msg, {
                                time: 2000, //2s后自动关闭
                            });
                        }
                        if(result.status===2){
                            layer.msg(result.msg, {
                                time: 2000, //2s后自动关闭
                            });
                        }
                        if(result.status===3){
                            layer.msg(result.msg, {
                                time: 2000, //2s后自动关闭
                            });
                        }
                        table.reload('stuselcourseInfoTable', {
                        });
                    }
                });
            } ;

//            退选
            if(layEvent === 'removecourse'){
//                alert(JSON.stringify(data));
                //                alert(JSON.stringify(data));
                $.ajax({
                    url: '/sturemovecourse/'+data['courseNum'],
                    type: 'get',
                    dataType: 'json',
                    success:function (result) {
                        if(result.status===1){
                            layer.msg(result.msg, {
                                time: 2000, //2s后自动关闭
                            });
                        }
                        if(result.status===2){
                            layer.msg(result.msg, {
                                time: 2000, //2s后自动关闭
                            });
                        }
                        table.reload('stuselcourseInfoTable', {
                        });
                    }
                });
            } ;
        });
//            表格end

    });
</script>
</body>
</html>