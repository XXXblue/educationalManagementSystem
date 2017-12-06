<%--
  Created by IntelliJ IDEA.
  User: xiaojianyu
  Date: 2017/9/14
  Time: 17:52
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

<%--操作模块start--%>
<fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
    <legend>操作管理</legend>
    <blockquote class="layui-elem-quote">
        <a href="javascript:;" class="layui-btn layui-btn-small" id="add">
            <i class="layui-icon">&#xe608;</i>添加教师
        </a>
        <a href="#" class="layui-btn layui-btn-small" id="edit">
            <i class="layui-icon">&#xe642;</i> 修改教师信息
        </a>
        <a href="javascript:;" class="layui-btn layui-btn-small" id="delete" >
            <i class="layui-icon">&#xe640;</i> 删除教师信息
        </a>
    </blockquote>
</fieldset>
<%--操作模块end--%>


<%--查询模块start--%>
<fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
    <legend>查询管理</legend>
    <blockquote class="layui-elem-quote">
        <a href="javascript:;" class="layui-btn layui-btn-small" id="search" >
            <i class="layui-icon">&#xe615;</i> 查询教师信息
        </a>
    </blockquote>
</fieldset>
<%--查询模块end--%>

<%--表格start--%>
<fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
    <legend>教师信息</legend>
    <table id="teacherInfoTable" class="layui-table"  lay-filter="teacherInfoTable" ></table>
</fieldset>
<%--表格end--%>

<%--教师表单start--%>
<form id="form" class="layui-form" action="" lay-filter="form" style="display: none;padding-left: 25px;padding-top: 25px">
    <fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
        <legend id="change"></legend>
        <div  class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">教师工号:</label>
            <div class="layui-input-block">
                <input name="teachernum" id="teachernum" lay-verify="required" autocomplete="off" placeholder="请输入教师工号" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">所属学院:</label>
            <div class="layui-input-block">
                <select  id="deptnum" name="deptnum" lay-verify="required" lay-filter="select">
                </select>
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">教师姓名:</label>
            <div class="layui-input-block">
                <input name="teachername" id="teachername" lay-verify="required" autocomplete="off" placeholder="请输入教师姓名" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">教师性别:</label>
            <div class="layui-input-block">
                <input id="nan" type="radio" name="teachersex" value="男" title="男" checked>
                <input id="nv" type="radio" name="teachersex" value="女" title="女" >
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">教师生日:</label>
            <div class="layui-input-block">
                <input name="teacherbirthday" id="teacherbirthday" lay-verify="required" autocomplete="off" placeholder="请输入教师生日" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">教师教学领域:</label>
            <div class="layui-input-block">
                <input name="teachertitle" id="teachertitle" lay-verify="studentphonenum" autocomplete="off" placeholder="请输入教师教学领域" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">登录密码:</label>
            <div class="layui-input-block">
                <input name="teacherpassword" id="teacherpassword" lay-verify="required" autocomplete="off" placeholder="请输入登录密码" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">教师联系手机:</label>
            <div class="layui-input-block">
                <input name="teacherphone" id="teacherphone" lay-verify="studentphonenum" autocomplete="off" placeholder="请输入手机联系方式" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit="" lay-filter="submit">提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
        </div>
    </fieldset>
</form>
<%--教师表单end--%>

<script src="../static/plugins/layui/layui.js"></script>
<script>
    layui.use(['jquery','layer','form','table','laydate'], function(){
        var $ = layui.$;
        var layer=layui.layer;
        var table=layui.table;
        var form=layui.form;
        var laydate = layui.laydate;


        //        日历start
        laydate.render({
            elem: '#teacherbirthday'
        });
//        日历end

        //        初始化表单start
        function initform() {
            $('#teachernum').val("");
            $('#teachername').val("");
            $('#teacherbirthday').val("");
            $('#teacherpassword').val("");
            $('#teachertitle').val("");
            $('#teacherphone').val("");
            $('#deptnum').val("");
            $('#teachersex').prop("checked",true);
            form.render();
        }
//        初始化表单end

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
                        $('#deptnum').append('<option value='+ deptnum+'>'+deptname+'</option>');
                        form.render();
                    }
                } });
        }
        selajax();
        form.render();
//        动态生成select end

        //            表格start
        var tabb=table.render({
            id:'teacherInfoTable',
            elem: '#teacherInfoTable',
            url: '/teacherInfoTable',
            cols:  [[ //标题栏
                {checkbox: true, LAY_CHECKED: false}
                ,{field: 'teachernum', align:'center',title: '教师编号', width: 150}
                ,{field: 'deptname', align:'center',title: '所属学院', width: 150}
                ,{field: 'teachername',align:'center', title: '教师姓名', width: 150}
                ,{field: 'teachersex', align:'center',title: '教师性别', width: 150}
                ,{field: 'teacherbirthday',align:'center', title: '教师生日', width: 150}
                ,{field: 'teachertitle',align:'center', title: '教师教学领域', width: 150}
                ,{field: 'teacherphone',align:'center', title: '教师联系手机', width: 150}
            ]],
            page:true,
            limits: [10,20,30],
            limit:10,
            height:800,
        });
//            表格end

        //        添加教师模块start
        $('#add').on('click',function () {
            $('#change').html("新增教师");
            $('#teachernum').attr("disabled", false);
            layer.open({
                title: "新增教师",
                area: ['600px', '700px'],
                skin: 'layui-anim-upbit',
                type: 1,
                content: $('#form'),
                success:function () {
                    form.on('submit(submit)', function(data) {
                        $.ajax({
                            url: '/addteacherinfo',
                            type: 'post',
                            data: data.field,
                            dataType: 'json',
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
                                    initform();

                                    table.reload('teacherInfoTable', {});
                                    layer.closeAll('page');
                                }
                            }
                        });
                        return false;
                    });
                }
            });
        });
        //        添加教师模块end

//        修改教师信息模块start
        $('#edit').on('click',function () {
            $('#change').html("修改教师信息");
            $('#teachernum').attr("disabled",true);
            var checkStatus = table.checkStatus('teacherInfoTable'); //test即为基础参数id对应的值
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
                layer.open({
                    title: "修改教师信息",
                    area: ['600px', '700px'],
                    skin: 'layui-anim-upbit',
                    type: 1,
                    content: $('#form'),
                    success:function () {
                        $('#teachernum').val((checkStatus.data)[0]['teachernum']);
                        $('#teachername').val((checkStatus.data)[0]['teachername']);
                        $('#teacherbirthday').val((checkStatus.data)[0]['teacherbirthday']);
                        $('#teachertitle').val((checkStatus.data)[0]['teachertitle']);
                        $('#teacherpassword').val((checkStatus.data)[0]['teacherpassword']);
                        $('#teacherphone').val((checkStatus.data)[0]['teacherphone']);
                        $('#deptname').val((checkStatus.data)[0]['deptname']);
//                        radio的渲染start
                        if(typeof ((checkStatus.data)[0].teachersex)!='undefined'){
                            if(((checkStatus.data)[0].teachersex).replace(/["“”]/g,"")==='男'){
                                $('#nan').prop("checked",true);
                            }else{
                                $('#nv').prop("checked",true);
                            }
                        }else{
                            $('#nan').prop("checked",true);
                        }
//                        radio的渲染end
//
//                        select的渲染start
                        var optionsel=(checkStatus.data)[0]['deptname'];
                        $("#deptnum").find('option').each(function(){
                            if($(this).html()===optionsel){
                                $(this).prop("selected",true);
                            }else {
                                $(this).prop("selected",false);
                            }
                        });
//                        select的渲染end
                        form.render();
                        form.on('submit(submit)', function(data){
//                        layer.msg(JSON.stringify(data.field));
                            $.ajax({
                                url: '/editTeacherInfo',
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
                                        initform();
                                        table.reload('teacherInfoTable', {
                                        });
                                        layer.closeAll('page');
                                    }
                                }
                            });
                            return false;
                        });

                    },
                    cancel:function () {
                        initform();
                    }
                });
            }
        });
//        修改教师信息模块end


//        删除教师信息模块start
        $('#delete').on('click',function () {
            var checkStatus = table.checkStatus('teacherInfoTable');
            if(checkStatus.data.length==0){
                layer.msg("请选中再删除", {
                    time: 2000, //2s后自动关闭
                });
                return ;
            }
            var nums=[];
            for(var i=0;i<checkStatus.data.length;i++){
                nums.push((checkStatus.data)[i]['teachernum']);
            }
            $.ajax({
                traditional: true,//传输组专用
                url: '/delTeacherInfo',
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
                    table.reload('teacherInfoTable', {
                    });
                }
            });
        })
//        删除教师信息模块end

    });
    </script>
</body>
</html>
