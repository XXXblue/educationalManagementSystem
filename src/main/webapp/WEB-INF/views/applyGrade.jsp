<%--
  Created by IntelliJ IDEA.
  User: xiaojianyu
  Date: 2017/12/6
  Time: 18:06
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
            <i class="layui-icon">&#xe615;</i> 查询审批
        </a>
    </blockquote>
    <%--表格start--%>
    <fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
        <legend>成绩提交审批信息</legend>
        <table id="applygradeTable" class="layui-table"  lay-filter="applygradeTable" ></table>
    </fieldset>
    <%--表格end--%>
</fieldset>
<script src="../static/plugins/layui/layui.js"></script>
<script type="text/html" id="selbar">
    {{#  if(d.ifpass==0){ }}
    <a class="layui-btn layui-btn-mini" lay-event="agree">同意</a>
    <a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="disagree">否决</a>
    {{#  } }}
    {{#  if(d.ifpass==1){ }}
            已批准
    {{#  } }}
    {{#  if(d.ifpass==2){ }}
            已否决
    {{#  } }}
</script>
<script>
    layui.use(['jquery','layer','form','table','laydate'], function() {
            var $ = layui.$;
            var layer = layui.layer;
            var table = layui.table;
        //            表格start
           table.render({
                id:'applygradeTable',
                elem: '#applygradeTable',
                url: '/applygradeTable',
                cols:  [[ //标题栏
                    {checkbox: true, LAY_CHECKED: false}
                    ,{field: 'id', align:'center',title: '编号', width: 150}
                    ,{field: 'coursenum', align:'center',title: '课程编号', width: 350}
                    ,{field: 'createtime', align:'center',title: '创建时间', width: 150,}
                    ,{field: 'updatetime',align:'center', title: '更新时间', width: 150,}
                    ,{field: 'ifpass', align:'center',title: '是否审批', width: 200,templet: '#selbar'}
                ]],
                page:true,
                limits: [10,20,30],
                limit:10,
                height:800,
            });
            table.on('tool(applygradeTable)', function(obj) {
                var data = obj.data; //获得当前行数据
                var layEvent = obj.event; //获得 lay-event 对应的值
                if (layEvent === 'agree') {
                    layer.confirm('确定同意', {icon: 3, title:'提示'}, function(index){
                        if(index){
                            $.ajax({
                                traditional: true,//传输组专用
                                url: '/ifAgreeSubmitGrade'+'/1',
                                type: 'POST',
                                dataType: 'json',
                                contentType: 'application/json',
                                data:JSON.stringify(data),
                                success: function (result) {
                                    if (result.status === 1) {
                                        layer.msg(result.msg, {
                                            time: 2000, //2s后自动关闭
                                        });
                                    }
                                    if (result.status === 2) {
                                        layer.msg(result.msg, {
                                            time: 2000, //2s后自动关闭
                                        });
                                    }
                                    if (result.status === 3) {
                                        layer.msg(result.msg, {
                                            time: 2000, //2s后自动关闭
                                        });
                                    }
                                    table.reload('applygradeTable', {});
                                }
                            });
                        }
                        layer.close(index);
                    });
                }

                if (layEvent === 'disagree') {
                    layer.confirm('确定否决', {icon: 3, title:'提示'}, function(index){
                        if(index){
                            $.ajax({
                                traditional: true,//传输组专用
                                url: '/ifAgreeSubmitGrade'+'/2',
                                type: 'POST',
                                dataType: 'json',
                                contentType: 'application/json',
                                data:JSON.stringify(data),
                                success: function (result) {
                                    if (result.status === 1) {
                                        layer.msg(result.msg, {
                                            time: 2000, //2s后自动关闭
                                        });
                                    }
                                    if (result.status === 2) {
                                        layer.msg(result.msg, {
                                            time: 2000, //2s后自动关闭
                                        });
                                    }
                                    if (result.status === 3) {
                                        layer.msg(result.msg, {
                                            time: 2000, //2s后自动关闭
                                        });
                                    }
                                    table.reload('applygradeTable', {});
                                }
                            });
                        }
                        layer.close(index);
                    });
                }
            })
        });
</script>
</body>
</html>
