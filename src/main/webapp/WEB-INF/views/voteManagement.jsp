<%--
  Created by IntelliJ IDEA.
  User: xiaojianyu
  Date: 2017/12/8
  Time: 14:40
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
            <i class="layui-icon">&#xe608;</i> 发起投票
        </a>
        <a href="javascript:;" class="layui-btn layui-btn-small" id="delete" >
            <i class="layui-icon">&#xe640;</i> 取消投票
        </a>
        <a href="javascript:;" class="layui-btn layui-btn-small" id="search">
            <i class="layui-icon">&#xe615;</i> 查询投票
        </a>
    </blockquote>
    <%--表格start--%>
    <fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
        <legend>投票信息管理</legend>
        <table id="applygradeTable" class="layui-table"  lay-filter="applygradeTable" ></table>
    </fieldset>
    <%--表格end--%>
</fieldset>
    <script src="../static/plugins/layui/layui.js"></script>
    <script>
        layui.use(['jquery','layer','form','table','laydate'], function() {
                var $ = layui.$;
                var layer = layui.layer;
                var table = layui.table;
            });
    </script>
</body>
</html>
