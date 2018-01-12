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
        <a href="javascript:;" class="layui-btn  layui-btn-sm" id="add">
            <i class="layui-icon">&#xe608;</i> 添加新课程
        </a>
        <a href="#" class="layui-btn  layui-btn-sm" id="edit">
            <i class="layui-icon">&#xe642;</i> 修改课程
        </a>
        <a href="javascript:;" class="layui-btn  layui-btn-sm" id="delete" >
            <i class="layui-icon">&#xe640;</i> 删除课程信息
        </a>
    </blockquote>
</fieldset>
<%--数据网格start--%>
<fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
    <legend>课程库管理</legend>
    <table id="kcTable" class="layui-table"  lay-filter="kcTable" ></table>
</fieldset>
<%--数据网格end--%>

<%--表单添加模块start--%>
<form id="form" class="layui-form" action="" lay-filter="form" style="display: none;padding-left: 25px;padding-top: 25px">
    <fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
        <legend id="change"></legend>
        <div  class="layui-form-item" style="width: 400px" hidden>
            <label class="layui-form-label">课程编号:</label>
            <div class="layui-input-block">
                <input name="kcCustom.kcnum" id="kcnum"  autocomplete="off" placeholder="请输入课程编号" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">课程名称:</label>
            <div class="layui-input-block">
                <input name="kcCustom.kcmc" id="kcmc" lay-verify="required" autocomplete="off" placeholder="请输入课程名称" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">课程学分:</label>
            <div class="layui-input-block">
                <input name="kcCustom.kcxf" id="kcxf" lay-verify="required" autocomplete="off" placeholder="请输入课程学分" class="layui-input">
            </div>
        </div>
        <div  class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">课程类型:</label>
            <div class="layui-input-block">
                    <select  id="kclx" name="kcCustom.kclx" lay-verify="required" lay-filter="select">
                    <option value="必修课">必修课</option>
                    <option value="校级公选课">校级公选课</option>
                    <option value="学院选修课">学院选修课</option>
                    <option value="实验课">实验课</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item" style="width: 300px">
            <label class="layui-form-label">所属学院</label>
            <div class="layui-input-block">
                <select  id="seldept" name="kcCustom.deptnum"  lay-filter="select">
                </select>
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">课程学时:</label>
            <div class="layui-input-block">
                <input name="kcCustom.kcxs" id="kcxs" lay-verify="required" autocomplete="off" placeholder="请输入课程学时" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">课程简介:</label>
            <div class="layui-input-block">
                <textarea  name="kcCustom.kcjj" id="kcjj" lay-verify="required" autocomplete="off" placeholder="请输入课程简介" class="layui-textarea"></textarea>
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
<script src="../static/plugins/layui/layui.js"></script>
<script>
    layui.use(['jquery','layer','form','table','laydate'], function() {
        var $ = layui.$;
        var layer = layui.layer;
        var table = layui.table;
        var form = layui.form;
        function init() {
            $('#kcmc').val("");
            $('#kcxf').val("");
            $('#kcxs').val("");
            $('#kcjj').val("");
        }
//        动态生成select start
        function selajax() {
            $.ajax({
                url: '/listDeptinfoselect',
                type: 'post',
                dataType: 'json',
                success: function (result) {
                    for(var i=0;i<result.length;i++){
                        var deptname=result[i]['deptname'];
                        var deptnum=result[i]['deptnum'];
                        $('#seldept').append('<option value='+ deptnum+'>'+deptname+'</option>');
                        form.render();
                    }
                } });
        }
        selajax();
        form.render();
//        动态生成select end


        //            表格start
        var tabb=table.render({
            id:'kcTable',
            elem: '#kcTable',
            url: '/kcTable',
            cols:  [[ //标题栏
                {checkbox: true, LAY_CHECKED: false}
                ,{field: 'kcmc', align:'center',title: '课程名称', width: 250}
                ,{field: 'kclx', align:'center',title: '课程类型', width: 150}
                ,{field: 'kcxf',align:'center', title: '课程学分', width: 100}
                ,{field: 'kcxs', align:'center',title: '课程学时', width: 100}
                ,{field: 'kcjj', align:'center',title: '课程简介', width: 800}
                ,{field: 'deptName', align:'center',title: '所属学院', width: 150}
            ]],
            page:true,
            limits: [10,20,30],
            limit:10,
            height:800,
        });

        //        添加start
        $('#add').on('click',function () {
            $('#change').html("新增课程");
            $('#deptnum').attr("disabled",false);
            layer.open({
                title:"新增课程",
                area:['600px','600px'],
                skin:'layui-anim-upbit',
                type: 1,
                content: $('#form'),
                success:function () {
                    form.on('submit(addsubmit)', function(data){
                        $.ajax({
                            url: '/addNewKc',
                            type: 'post',
                            data: data.field,
                            dataType: 'json',
                            //                async: false,这个能把ajax变同步
                            success: function (result) {
                                if(result.status===400){
                                    layer.msg("课程名重复", {
                                        time: 2000, //2s后自动关闭
                                    });
                                }
                                if(result.status===200){
                                    layer.msg("新增課程成功", {
                                        time: 2000, //2s后自动关闭
                                    });
                                    init();
                                    table.reload('kcTable', {
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

//        修改start
        $('#edit').on('click',function () {
            $('#change').html("修改课程");
            $('#deptnum').attr("disabled",true);
            var checkStatus = table.checkStatus('kcTable'); //test即为基础参数id对应的值
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
                $('#kcmc').val((checkStatus.data)[0]['kcmc']);
                $('#kcxf').val((checkStatus.data)[0]['kcxf']);
                $('#kclx').val((checkStatus.data)[0]['kclx']);
                $('#kcxs').val((checkStatus.data)[0]['kcxs']);
                $('#kcjj').val((checkStatus.data)[0]['kcjj']);
                $('#kcnum').val((checkStatus.data)[0]['kcnum']);
 //                        select的渲染start
                var optionsel=(checkStatus.data)[0]['deptName'];
                $("#seldept").find('option').each(function(){
                    if($(this).html()===optionsel){
                        $(this).prop("selected",true);
                    }else {
                        $(this).prop("selected",false);
                    }
                });
                var sel=(checkStatus.data)[0]['kclx'];
                $("#kclx").find('option').each(function(){
                    if($(this).html()===sel){
                        $(this).prop("selected",true);
                    }else {
                        $(this).prop("selected",false);
                    }
                });
//          select的渲染end
                form.render();
                layer.open({
                    title:"修改课程",
                    area:['600px','600px'],
                    skin:'layui-anim-upbit',
                    type: 1,
                    content: $('#form'),
                    success:function () {
                        form.on('submit(addsubmit)', function(data){
                            $.ajax({
                                url: '/editKcInfo',
                                type: 'post',
                                data: data.field,
                                dataType: 'json',
                                //                async: false,这个能把ajax变同步
                                success: function (result) {
                                    if(result.status===400){
                                        layer.msg("课程重复", {
                                            time: 2000, //2s后自动关闭
                                        });
                                    }
                                    if(result.status===200){
                                        layer.msg("修改成功", {
                                            time: 2000, //2s后自动关闭
                                        });
                                        init();
                                        table.reload('kcTable', {
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
            var checkStatus = table.checkStatus('kcTable');
            if(checkStatus.data.length==0){
                layer.msg("请选中再删除", {
                    time: 2000, //2s后自动关闭
                });
            }else{
                var nums=[];
                for(var i=0;i<checkStatus.data.length;i++){
                    nums.push((checkStatus.data)[i]['kcnum']);
                }
                $.ajax({
                    traditional: true,//传输组专用
                    url: '/delKcInfo',
                    type: 'post',
                    data: {"nums":nums},
                    dataType: 'json',
                    //                async: false,这个能把ajax变同步
                    success: function (result) {
                        if (result.status === 200) {
                            layer.msg('删除成功', {
                                time: 2000, //2s后自动关闭
                            });
                        }
                        table.reload('kcTable', {
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
