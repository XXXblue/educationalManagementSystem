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
        <a href="javascript:;" class="layui-btn layui-btn-sm" id="add">
            <i class="layui-icon">&#xe608;</i> 添加学院信息
        </a>
        <a href="#" class="layui-btn layui-btn-sm" id="edit">
            <i class="layui-icon">&#xe642;</i> 修改学院信息
        </a>
        <a href="javascript:;" class="layui-btn layui-btn-sm" id="delete" >
            <i class="layui-icon">&#xe640;</i> 删除学院信息
        </a>
    </blockquote>
</fieldset>

<%--表格start--%>
<fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
    <legend>学院信息</legend>
    <table id="deptInfoTable" class="layui-table"  lay-filter="deptInfoTable" ></table>
</fieldset>
<%--表格end--%>

<%--表单添加模块start--%>
<form id="form" class="layui-form" action="" lay-filter="form" style="display: none;padding-left: 25px;padding-top: 25px">
    <fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
        <legend id="change"></legend>
        <div  class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">学院编号:</label>
            <div class="layui-input-block">
                <input name="deptCustom.deptnum" id="deptnum" lay-verify="required" autocomplete="off" placeholder="请输入专业编号" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">学院名称:</label>
            <div class="layui-input-block">
                <input name="deptCustom.deptname" id="deptname" lay-verify="required" autocomplete="off" placeholder="请输入系院编号" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">学院主任:</label>
            <div class="layui-input-block">
                <input name="deptCustom.deptchairman" id="deptchairman" lay-verify="required" autocomplete="off" placeholder="请输入专业名称" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">学院主任联系方式:</label>
            <div class="layui-input-block">
                <input name="deptCustom.depttel" id="depttel" lay-verify="required" autocomplete="off" placeholder="请输入辅导员名称" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">学院描述:</label>
            <div class="layui-input-block">
                <textarea  name="deptCustom.deptdesc" id="deptdesc" lay-verify="required" autocomplete="off" placeholder="请输入内容" class="layui-textarea"></textarea>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit="" lay-filter="addsubmit">提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
        </div>
    </fieldset>
</form>
<%--表单添加模块end--%>

<%--表单添加模块start--%>
<form id="descform" class="layui-form" action="" style="display: none;padding-left: 25px;padding-top: 25px">
    <fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
        <legend >学院简介</legend>
        <div class="layui-form-item" style="width: 400px">
            <div class="layui-input-block">
                <textarea  id="deptdescreadonly" lay-verify="required" autocomplete="off"  class="layui-textarea" disabled ></textarea>
            </div>
        </div>
    </fieldset>
</form>
<%--表单添加模块end--%>

<script src="../static/plugins/layui/layui.js"></script>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="detail">查看</a>
</script>
<script>
    layui.use(['jquery','layer','form','table','laydate'], function(){
        var $ = layui.$;
        var layer=layui.layer;
        var table=layui.table;
        var form=layui.form;
        function init() {
            $('#deptnum').val("");
            $('#deptname').val("");
            $('#deptchairman').val("");
            $('#depttel').val("");
            $('#deptdesc').val("");
            form.render();
        }

//        添加start
        $('#add').on('click',function () {
            $('#change').html("新增学院");
            $('#deptnum').attr("disabled",false);
            layer.open({
                title:"新增学院",
                area:['600px','600px'],
                skin:'layui-anim-upbit',
                type: 1,
                content: $('#form'),
                success:function () {
                    form.on('submit(addsubmit)', function(data){
                        $.ajax({
                            url: '/addDeptInfo',
                            type: 'post',
                            data: data.field,
                            dataType: 'json',
                            //                async: false,这个能把ajax变同步
                            success: function (result) {
                                if(result.status===400){
                                    layer.msg(result.msg, {
                                        time: 2000, //2s后自动关闭
                                    });
                                }
                                if(result.status===200){
                                    layer.msg(result.msg, {
                                        time: 2000, //2s后自动关闭
                                    });
                                     init();
                                    table.reload('deptInfoTable', {
                                    });
                                    layer.closeAll('page');
                                }
                            }
                        });
                        return false;
                    });
                }
            });
        })
//        添加end

//            表格start
        var tabb=table.render({
            id:'deptInfoTable',
            elem: '#deptInfoTable',
            url: '/deptInfoListAll',
            cols:  [[ //标题栏
                {checkbox: true, LAY_CHECKED: false}
                ,{field: 'deptnum', align:'center',title: '院系编号', width: 150}
                ,{field: 'deptname', align:'center',title: '院系名称', width: 150}
                ,{field: 'deptchairman',align:'center', title: '院系主任', width: 150}
                ,{field: 'depttel', align:'center',title: '院系主任电话', width: 150}
                ,{fixed: 'right',title: '院系描述', width:150, align:'center', toolbar: '#barDemo'}
            ]],
            page:true,
            limits: [10,20,30],
            limit:10,
            height:800,
        });
        table.on('tool(deptInfoTable)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值
            var tr = obj.tr; //获得当前行 tr 的DOM对象

            if(layEvent === 'detail'){ //查看
                $.ajax({
                    url: '/editDeptInfo/'+data['deptnum'],
                    type: 'get',
                    dataType: 'json',
                    success:function (result) {
                        $('#deptdescreadonly').html((result.data)['deptdesc']);
                        layer.open({
                            title:"学院简介",
                            area:['600px','400px'],
                            skin:'layui-anim-upbit',
                            type: 1,
                            content: $('#descform'),
                        });
                    }
                });
            } ;
        });
//            表格end

//        修改start
        $('#edit').on('click',function () {
            $('#change').html("修改学院");
            $('#deptnum').attr("disabled",true);
            var checkStatus = table.checkStatus('deptInfoTable'); //test即为基础参数id对应的值
            if(checkStatus.data.length==0){
                layer.msg("请选中一行进行编辑", {
                    time: 2000, //2s后自动关闭
                });
            }
            if(checkStatus.data.length>1){
                layer.msg("请不要多选", {
                    time: 2000, //2s后自动关闭
                });
            }
            if(checkStatus.data.length===1){
                        $('#deptnum').val((checkStatus.data)[0]['deptnum']);
                        $('#deptname').val((checkStatus.data)[0]['deptname']);
                        $('#deptchairman').val((checkStatus.data)[0]['deptchairman']);
                        $('#depttel').val((checkStatus.data)[0]['depttel']);
                        $.ajax({
                            url: '/editDeptInfo/'+(checkStatus.data)[0]['deptnum'],
                            type: 'get',
                            dataType: 'json',
                            success:function (result) {
                                $('#deptdesc').val((result.data)['deptdesc']);
                            }
                        });
                        layer.open({
                            title:"修改学院",
                            area:['600px','600px'],
                            skin:'layui-anim-upbit',
                            type: 1,
                            content: $('#form'),
                            success:function () {
                                form.on('submit(addsubmit)', function(data){
                                    $.ajax({
                                        url: '/editDeptInfo',
                                        type: 'post',
                                        data: data.field,
                                        dataType: 'json',
                                        //                async: false,这个能把ajax变同步
                                        success: function (result) {
                                            if(result.status===400){
                                                layer.msg(result.msg, {
                                                    time: 2000, //2s后自动关闭
                                                });
                                            }
                                            if(result.status===200){
                                                layer.msg(result.msg, {
                                                    time: 2000, //2s后自动关闭
                                                });
                                                init();
                                                table.reload('deptInfoTable', {
                                                });
                                                layer.closeAll('page');
                                            }
                                        }
                                    });
                                    return false;
                                });
                            },
                            cancel:function () {
                                init();
                            }

                        });
                    }

        })
//        修改end


//        删除start
        $('#delete').on('click',function () {
            var checkStatus = table.checkStatus('deptInfoTable');
            if(checkStatus.data.length==0){
                layer.msg("请选中再删除", {
                    time: 2000, //2s后自动关闭
                });
            }else{
                var nums=[];
                for(var i=0;i<checkStatus.data.length;i++){
                    nums.push((checkStatus.data)[i]['deptnum']);
                }
                $.ajax({
                    traditional: true,//传输组专用
                    url: '/delDeptInfo',
                    type: 'post',
                    data: {"nums":nums},
                    dataType: 'json',
                    //                async: false,这个能把ajax变同步
                    success: function (result) {
                        if (result.status === 400) {
                            layer.msg(result.msg, {
                                time: 2000, //2s后自动关闭
                            });
                        }
                        if (result.status === 200) {
                            layer.msg(result.msg, {
                                time: 2000, //2s后自动关闭
                            });
                            layer.closeAll('page');
                        }
                        table.reload('deptInfoTable', {
                        });
                    }
                });
            }
        })
//        删除end






    });
</script>

</body>
</html>
