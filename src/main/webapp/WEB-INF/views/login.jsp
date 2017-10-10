<%@page language="java" contentType="text/html;UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>管理员</title>
    <link rel="stylesheet" href="../static/plugins/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="../static/plugins/font-awesome/css/font-awesome.min.css" media="all">
    <link rel="stylesheet" href="../static/css/app.css" media="all">
</head>

<body background="/static/images/22.jpg" style="background-repeat: no-repeat;background-size:100% 100%; background-attachment: fixed;">
<%--表单添加模块start--%>
<div style="width:600px;margin-left: 600px;margin-top: 300px">
<fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
    <legend id="change"><strong>用户登录</strong></legend>
<form id="form" class="layui-form" action="" lay-filter="form" style="padding-left: 25px;padding-top: 25px">
        <div  class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">用户编号:</label>
            <div class="layui-input-block">
                <input name="username" id="username" lay-verify="required" autocomplete="off" placeholder="请输入用户编号" class="layui-input">
            </div>
        </div>
        <div  class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">用户密码:</label>
            <div class="layui-input-block">
                <input name="password"  type="password" id="password" lay-verify="required" autocomplete="off" placeholder="请输入用户密码" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">用户身份:</label>
            <div class="layui-input-block">
                <input id="manager" type="radio" name="userIdentity" value="manager" title="管理员" checked>
                <input id="teacher" type="radio" name="userIdentity" value="teacher" title="教师" >
                <input id="student" type="radio" name="userIdentity" value="student" title="学生" >
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit="" lay-filter="submit" style="width: 290px">登录</button>
            </div>
        </div>

</form>
</fieldset>
</div>
<script src="../static/plugins/layui/layui.js"></script>
<script>
    layui.use(['jquery','layer','form'], function() {
        var $ = layui.$;
        var layer = layui.layer;
        var form = layui.form;
        form.on('submit(submit)', function(data){
            if(data.field['userIdentity']==="manager"){
//                            layer.msg(JSON.stringify(data.field));
                $.ajax({
//               async: false,//这个能把ajax变同步
                    type: "POST",
                    url:"/loginsubmit",
                    data:data.field,// 序列化表单值
                    async: false,
                    success: function(data) {
                        var data=eval("("+data+")");
                        if(data['status']===1){
                            layer.msg("用户名不存在");
                        }
                        if(data['status']===2){
                            layer.msg("密码错误");
                        }
                        if(data.status===3){
                            window.location.href="/index"
                        }
                    }
                });
            }
            if(data.field['userIdentity']==="teacher"){
                $.ajax({
               async: false,//这个能把ajax变同步
                    type: "POST",
                    url:"/loginteachersubmit",
                    data:data.field,// 序列化表单值
                    async: false,
                    success: function(data) {
                        var data=eval("("+data+")");
                        if(data['status']===1){
                            layer.msg("用户名不存在");
                        }
                        if(data['status']===2){
                            layer.msg("密码错误");
                        }
                        if(data.status===3){
                            window.location.href="/teacher/index2"
                        }
                    }
                });
            }
            if(data.field['userIdentity']==="student"){
                $.ajax({
//               async: false,//这个能把ajax变同步
                    type: "POST",
                    url:"/loginstudentsubmit",
                    data:data.field,// 序列化表单值
                    async: false,
                    success: function(data) {
                        var data=eval("("+data+")");
                        if(data['status']===1){
                            layer.msg("用户名不存在");
                        }
                        if(data['status']===2){
                            layer.msg("密码错误");
                        }
                        if(data.status===3){
                            window.location.href="/student/index3"
                        }
                    }
                });
            }
//            layer.msg(JSON.stringify(data.field));
            return false;
        });
    });
</script>
</body>
</html>
