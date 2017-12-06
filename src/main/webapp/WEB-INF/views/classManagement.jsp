<%--
  Created by IntelliJ IDEA.
  User: xiaojianyu
  Date: 2017/9/16
  Time: 17:15
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
            <i class="layui-icon">&#xe608;</i>添加教室
        </a>
        <a href="#" class="layui-btn layui-btn-small" id="edit">
            <i class="layui-icon">&#xe642;</i> 修改教室信息
        </a>
        <a href="javascript:;" class="layui-btn layui-btn-small" id="delete" >
            <i class="layui-icon">&#xe640;</i> 删除教室
        </a>
    </blockquote>
</fieldset>
<%--操作模块end--%>



<%--表格start--%>
<fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
    <legend>教室信息</legend>
    <table id="classInfoTable" class="layui-table"  lay-filter="classInfoTable" ></table>
</fieldset>
<%--表格end--%>

<%--表单添加模块start--%>
<form id="form" class="layui-form" action="" lay-filter="form" style="display: none;padding-left: 25px;padding-top: 25px">
    <fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
        <legend id="change"></legend>
        <div  class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">教室编号:</label>
            <div class="layui-input-block">
                <input name="classnum" id="classnum" lay-verify="required" autocomplete="off" placeholder="请输入教室编号" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">教室负责人:</label>
            <div class="layui-input-block">
                <input name="classman" id="classman" lay-verify="required" autocomplete="off" placeholder="请输入教室负责人姓名" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">教室负责人联系方式:</label>
            <div class="layui-input-block">
                <input name="classmantel" id="classmantel" lay-verify="required" autocomplete="off" placeholder="请输入联系方式" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">教室人数限制:</label>
            <div class="layui-input-block">
                <input name="limitnum" id="limitnum" lay-verify="required" autocomplete="off" placeholder="请输入教室人数限制" class="layui-input">
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

<script src="../static/plugins/layui/layui.js"></script>
<script>
    layui.use(['jquery','layer','form','table','laydate'], function(){
        var $ = layui.$;
        var layer=layui.layer;
        var table=layui.table;
        var form=layui.form;
        var laydate = layui.laydate;


        function init() {
            $('#classnum').val("");
            $('#classman').val("");
            $('#classmantel').val("");
            $('#limitnum').val("");
            form.render();
        }

        //        添加start
        $('#add').on('click',function () {
            $('#change').html("新增教室");
            $('#classnum').attr("disabled",false);
            layer.open({
                title:"新增教室",
                area:['600px','500px'],
                skin:'layui-anim-upbit',
                type: 1,
                content: $('#form'),
                success:function () {
                    form.on('submit(submit)', function(data){
                        $.ajax({
                            url: '/addClassInfo',
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
                                    table.reload('classInfoTable', {
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


//表格展示模块start
        var tabb=table.render({
            id:'classInfoTable',
            elem: '#classInfoTable',
            url: '/classInfoTable',
            cols:  [[ //标题栏
                {checkbox: true, LAY_CHECKED: false}
                ,{field: 'classnum', align:'center',title: '教室编号', width: 150}
                ,{field: 'classman', align:'center',title: '教室负责人', width: 150}
                ,{field: 'classmantel',align:'center', title: '教室负责人联系方式', width: 250}
                ,{field: 'limitnum', align:'center',title: '教室人数限制', width: 150}
            ]],
            page:true,
            limits: [10,20,30],
            limit:10,
            height:800,
        });

//表格展示模块end

        //        修改start
        $('#edit').on('click',function () {
            $('#change').html("修改学院");
            $('#classnum').attr("disabled",true);
            var checkStatus = table.checkStatus('classInfoTable'); //test即为基础参数id对应的值
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
                $('#classnum').val((checkStatus.data)[0]['classnum']);
                $('#classman').val((checkStatus.data)[0]['classman']);
                $('#classmantel').val((checkStatus.data)[0]['classmantel']);
                $('#limitnum').val((checkStatus.data)[0]['limitnum']);
                layer.open({
                    title:"修改课室",
                    area:['600px','500px'],
                    skin:'layui-anim-upbit',
                    type: 1,
                    content: $('#form'),
                    success:function () {
                        form.on('submit(submit)', function(data){
                            $.ajax({
                                url: '/editClassInfo',
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
                                        table.reload('classInfoTable', {
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

        $('#delete').on('click',function () {
            var checkStatus = table.checkStatus('classInfoTable');
            if(checkStatus.data.length==0){
                layer.msg("请选中再删除", {
                    time: 2000, //2s后自动关闭
                });
            }else{
                var nums=[];
                for(var i=0;i<checkStatus.data.length;i++){
                    nums.push((checkStatus.data)[i]['classnum']);
                }
                $.ajax({
                    traditional: true,//传输组专用
                    url: '/delClassInfo',
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
                        table.reload('classInfoTable', {
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
