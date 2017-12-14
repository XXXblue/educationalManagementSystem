<%--
  Created by IntelliJ IDEA.
  User: xiaojianyu
  Date: 2017/8/29
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@page language="java" contentType="text/html;UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>学生端</title>
    <link rel="stylesheet" href="../static/plugins/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="../static/plugins/font-awesome/css/font-awesome.min.css" media="all">
    <link rel="stylesheet" href="../static/css/app.css" media="all">
</head>

<body>
<div class="layui-layout layui-layout-admin kit-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">教务管理系统（学生端）</div>
        <ul class="layui-nav layui-layout-right kit-nav">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img id="pic" src="${activerole.pic}" class="layui-nav-img">${activerole.username}
                </a>
                <dl class="layui-nav-child">
                    <dd><a id="a1" href="javascript:;">基本资料</a></dd>
                    <dd><a href="javascript:;">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a id="reset" href="javascript:;"><i class="fa fa-sign-out" aria-hidden="true"></i>注销</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black kit-side">
        <div class="layui-side-scroll">
            <div class="kit-side-fold"><i class="fa fa-navicon" aria-hidden="true"></i></div>
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree" lay-filter="kitNavbar" kit-navbar>
                <li class="layui-nav-item layui-nav-itemed">
                    <a href="javascript:;"><i class="fa fa-send" aria-hidden="true"></i><span> 个人信息</span></a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" kit-target data-options="{url:'studentSelfInfo',icon:'&#xe658;',title:'个人信息查看',id:'1'}"><i class="layui-icon">&#xe658;</i><span> 个人信息查看</span></a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a class="" href="javascript:;"><i class="fa fa-cubes" aria-hidden="true"></i><span> 课表信息</span></a>
                    <dl class="layui-nav-child">
                        <dd>
                            <a href="javascript:;" data-url="studentschooltimetable" data-icon="fa-users" data-title="个人课表" kit-target data-id='2'><i class="fa fa-users" aria-hidden="true"></i><span> 上课课表</span></a>
                        </dd>
                    </dl>
                    <dl class="layui-nav-child">
                        <dd>
                            <a href="javascript:;" data-url="studentSelCourse" data-icon="fa fa-cubes" data-title="选择课程" kit-target data-id='3'><i class="fa fa-cubes" aria-hidden="true"></i><span> 选择课程</span></a>
                        </dd>
                    </dl>
                </li>

            </ul>
        </div>

    </div>

    <div class="layui-body" id="container">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">主体内容加载中,请稍等...</div>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        2017 &copy;
        <a href="http://www.baidu.com">百度担保。。。</a> MIT license

    </div>
</div>
<script src="../static/plugins/layui/layui.js"></script>
<script>
    var message;
    layui.config({
        base: '/js/'
    }).use(['app', 'message','jquery','tab'], function() {
        var app = layui.app;
        //将message设置为全局以便子页面调用
        message = layui.message;
        //主入口
        app.set({
            type: 'iframe'
        }).init();
        var $=layui.$;
        var tab=layui.tab;

        $('#reset').on('click',function () {
            $.ajax({
                type: "POST",
                url:"/logout",
                success: function(data) {
                    window.location.href="login"
                }
            });
        })
    });
</script>
</body>

</html>
