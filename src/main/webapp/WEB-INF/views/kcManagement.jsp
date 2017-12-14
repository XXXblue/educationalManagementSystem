<%--
  Created by IntelliJ IDEA.
  User: xiaojianyu
  Date: 2017/9/14
  Time: 17:55
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
<fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
    <legend>操作管理</legend>
    <blockquote class="layui-elem-quote">
        <a href="javascript:;" class="layui-btn layui-btn-small" id="add">
            <i class="layui-icon">&#xe608;</i> 添加新课程
        </a>
        <a href="#" class="layui-btn layui-btn-small" id="edit">
            <i class="layui-icon">&#xe642;</i> 修改课程
        </a>
        <a href="javascript:;" class="layui-btn layui-btn-small" id="delete" >
            <i class="layui-icon">&#xe640;</i> 删除课程信息
        </a>
    </blockquote>
</fieldset>

</body>
</html>
