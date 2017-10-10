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


<%--查询模块start--%>
<fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
    <legend>查询课表</legend>
    <blockquote class="layui-elem-quote">
        <form class="layui-form layui-form-pane " action="">
            <div class="layui-inline">
                <div class="layui-form-item" style="width: 300px">
                    <label class="layui-form-label">学年</label>
                    <div class="layui-input-block">
                        <input type="text" name="termyear" id="termyear" required  lay-verify="required" placeholder="请输入学年" autocomplete="off" class="layui-input">
                    </div>
                </div>
            </div>
            <div class="layui-inline">
                <div class="layui-form-item" style="width: 300px">
                    <label class="layui-form-label">学期</label>
                    <div class="layui-input-block">
                        <input type="text" name="termtime" required  lay-verify="termtime" placeholder="请输入学期" autocomplete="off" class="layui-input">
                    </div>
                </div>
            </div>
            <div class="layui-inline">
                <div class="layui-form-item" style="width: 300px">
                    <label class="layui-form-label">当前周</label>
                    <div class="layui-input-block">
                        <input type="text" name="week" required  lay-verify="week" placeholder="请输入周数" autocomplete="off" class="layui-input">
                    </div>
                </div>
            </div>
            <div class="layui-inline">
                <div class="layui-form-item " style="width: 300px">
                    <div class="layui-input-block">
                        <button id="search" class="layui-btn" style="width: 200px"  lay-submit lay-filter="submit"><i class="layui-icon">&#xe615;</i>查询</button>
                    </div>
                </div>
            </div>
        </form>
    </blockquote>
</fieldset>
<%--查询模块end--%>

<%--课表展示模块start--%>
<table id="_table" class="layui-table" style="height:700px;width:1680px;margin-right: 10px;margin-left: 10px;margin-top: 10px;" lay-size="lg">
    <thead>
    <tr>
        <th align="center">星期</th>
        <th style="width: 150px">周一</th>
        <th style="width: 150px">周二</th>
        <th style="width: 150px">周三</th>
        <th style="width: 150px">周四</th>
        <th style="width: 150px">周五</th>
        <th style="width: 150px">周六</th>
        <th style="width: 150px">周日</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>上午第一节</td>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>

    </tr>
    <tr>
        <td>上午第二节</td>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>

    </tr>
    <tr>
        <td>下午第一节</td>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>

    </tr>
    <tr>
        <td>下午第二节</td>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>

    </tr>
    <tr>
        <td>晚上第一节</td>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>

    </tr>
    </tbody>
</table>
<%--课表展示模块start--%>


<script src="../static/plugins/layui/layui.js"></script>
<script>
    layui.use(['jquery','table','form'], function(){
        var $ = layui.$;
        var form=layui.form;


//初始化表格start
        function inittable(){
            $("#_table tr:gt(0)").each(function(i){
//                       行
                $(this).children().each(function(i){
                    if(i>0){
//                      列
                        $(this).text("");
                    }
                });
            });
        }
//初始化表格end


//                渲染表格start
        function loadclass(x,y,data) {
            $("#_table tr:gt(0)").each(function(i){
//                       列
                if(x==i){

                    $(this).children().each(function(i){

                        if(y==i){
//                      行
                            $(this).text(data['courseName']);
                            $(this).append("<br/>")
                            $(this).append(data['classNum']);
                            $(this).append("<br/>")
                            $(this).append(data['teacherName']);
                        }
                    });
                }
            });
        }
//                渲染表格end

        $('#search').on('click',function () {
            form.on('submit(submit)', function(data){
                layer.alert(JSON.stringify(data.field), {
                    title: '最终的提交信息'
                });
                $.ajax({
                    url: '/searchstudentcourseinfo',
                    type: 'post',
                    data: data.field,
                    dataType: 'json',
                    success: function (result) {
                        if (result.status === 1) {
                            inittable();
                            layer.msg(result.msg, {
                                time: 2000, //2s后自动关闭
                            });
                            var list=result.data;
                            for(var i=0;i<list.length;i++){
                                loadclass(list[i]['courseDayTime']-1,list[i]['courseDay'],list[i]);
                            }
                        }
                    }
                });
                return false;
            });

     });

    });
</script>
</body>
</html>

