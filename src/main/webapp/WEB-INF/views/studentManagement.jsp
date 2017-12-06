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

<%--操作模块start--%>
<fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
    <legend>操作管理</legend>
    <blockquote class="layui-elem-quote">
        <a href="javascript:;" class="layui-btn layui-btn-small" id="add">
            <i class="layui-icon">&#xe608;</i>添加学生
        </a>
        <a href="javascript:;" class="layui-btn layui-btn-small" id="addMuch">
            <i class="layui-icon">&#xe608;</i>批量添加学生
        </a>
        <a href="#" class="layui-btn layui-btn-small" id="edit">
            <i class="layui-icon">&#xe642;</i> 修改学生信息
        </a>
        <a href="javascript:;" class="layui-btn layui-btn-small" id="delete" >
            <i class="layui-icon">&#xe640;</i> 删除学生信息
        </a>
    </blockquote>
</fieldset>
<%--操作模块end--%>


<%--查询模块start--%>
<fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
    <legend>查询学生信息</legend>
    <blockquote class="layui-elem-quote">
        <form class="layui-form layui-form-pane " action="">
            <div class="layui-inline">
                <div class="layui-form-item" style="width: 300px">
                    <label class="layui-form-label">学号</label>
                    <div class="layui-input-block">
                        <input type="text" name="studentnum"    placeholder="请输入学号" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item" style="width: 300px">
                    <label class="layui-form-label">班级</label>
                    <div class="layui-input-block">
                        <input type="text" name="studentorganization" placeholder="请输入班级" autocomplete="off" class="layui-input">
                    </div>
                </div>
            </div>
            <div class="layui-inline">
                <div class="layui-form-item" style="width: 300px">
                    <label class="layui-form-label">入学年份</label>
                    <div class="layui-input-block">
                        <input type="text" name="studentcomeyear"  placeholder="请输入入学年份" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item" style="width: 300px">
                    <label class="layui-form-label">专业</label>
                    <div class="layui-input-block">
                        <select  id="selmajornum" name="majornum"  lay-filter="select">
                        </select>
                    </div>
                </div>
            </div>

            <div class="layui-inline">
                <div class="layui-form-item " style="width: 300px">
                    <div class="layui-input-block">
                        <button id="search" class="layui-btn" style="width: 200px"  lay-submit lay-filter="search"><i class="layui-icon">&#xe615;</i>查询</button>
                    </div>
                </div>
            </div>
        </form>
    </blockquote>
</fieldset>
<%--查询模块end--%>


<%--表格start--%>
<fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
    <legend>学生信息</legend>
    <table id="studentInfoTable" class="layui-table"  lay-filter="studentInfoTable" ></table>
</fieldset>
<%--表格end--%>

<%--学生单独添加模块start--%>
<form id="addform" class="layui-form" action="" lay-filter="addform" style="display: none;padding-left: 25px;padding-top: 25px">
    <fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
        <legend id="change">新增学员</legend>
        <div  class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">学生编号:</label>
            <div class="layui-input-block">
                <input name="studentnum" id="studentnum" lay-verify="required" autocomplete="off" placeholder="请输入学生编号" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">专业名称:</label>
            <div class="layui-input-block">
                <select  id="majornum" name="majornum" lay-verify="required" lay-filter="select">
                </select>
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">入学年份:</label>
            <div class="layui-input-block">
                <input name="studentcomeyear" id="studentcomeyear" lay-verify="required" autocomplete="off" placeholder="请输入学生姓名" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">班级:</label>
            <div class="layui-input-block">
                <input name="studentorganization" id="studentorganization" lay-verify="required" autocomplete="off" placeholder="请输入学生班级" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">学生姓名:</label>
            <div class="layui-input-block">
                <input name="studentname" id="studentname" lay-verify="required" autocomplete="off" placeholder="请输入学生姓名" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item" style="width: 400px" hidden>
            <label class="layui-form-label">学生权限:</label>
            <div class="layui-input-block">
                <input name="studentrole"  id= "studentrole" autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">学生性别:</label>
            <div class="layui-input-block">
                <input id="nan" type="radio" name="studentsex" value="男" title="男" checked>
                <input id="nv" type="radio" name="studentsex" value="女" title="女" >
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">学生生日:</label>
            <div class="layui-input-block">
                <input name="studentbirthday" id="studentbirthday" lay-verify="required" autocomplete="off" placeholder="请输入学生生日" class="layui-input">
            </div>
        </div>
        <div id="denglumima" class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">登录密码:</label>
            <div class="layui-input-block">
                <input name="studentpassword" id="studentpassword" lay-verify="required" autocomplete="off" placeholder="请输入登录密码" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">学生联系手机:</label>
            <div class="layui-input-block">
                <input name="studentphonenum" id="studentphonenum" lay-verify="studentphonenum" autocomplete="off" placeholder="请输入学生手机联系方式" class="layui-input">
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
<%--学生单独添加模块end--%>

<script src="../static/plugins/layui/layui.js"></script>
<script>
    layui.use(['jquery','layer','form','table','laydate'], function(){
        var $ = layui.$;
        var layer=layui.layer;
        var table=layui.table;
        var form=layui.form;
        var laydate = layui.laydate;

//        初始化表单start
        function initform() {
            $('#studentnum').val("");
            $('#majornum').val("");
            $('#studentname').val("");
            $('#studentbirthday').val("");
            $('#studentpassword').val("");
            $('#studentphonenum').val("");
            $('#studentrole').val("");
            $('#studentcomeyear').val("");
            $('#studentorganization').val("");
            $('#nan').prop("checked",true);
            $("#majornum").find('option').each(function(index){

                if(index===0){
                    $(this).prop("selected",true);
                }else {
                    $(this).prop("selected",false);
                }
            });
            form.render();
        }
//        初始化表单end

        //            表格start
        var tabb=table.render({
            id:'studentInfoTable',
            elem: '#studentInfoTable',
            url: '/studentInfoListAll',
            cols:  [[ //标题栏
                {checkbox: true, LAY_CHECKED: false}
                ,{field: 'studentnum', align:'center',title: '学生编号', width: 150}
                ,{field: 'studentorganization', align:'center',title: '所属班级', width: 150}
                ,{field: 'majornum', align:'center',title: '专业名称', width: 150}
                ,{field: 'studentname',align:'center', title: '学生姓名', width: 150}
                ,{field: 'studentsex', align:'center',title: '学生性别', width: 150}
                ,{field: 'studentcomeyear', align:'center',title: '入学年份', width: 150}
                ,{field: 'studentbirthday', title: '学生生日', width: 150}
                ,{field: 'studentphonenum', title: '学生手机', width: 150}
            ]],
            page:true,
            limits: [10,20,30],
            limit:10,
            height:800,
        });

//            表格end

//        动态生成select start
        function selajax() {
            $.ajax({
                url: '/listmajorinfoselect',
                type: 'post',
                dataType: 'json',
                success: function (result) {
//                alert(JSON.stringify(result));
                    $('#selmajornum').append('<option value="">全部</option>');
                    for(var i=0;i<result.length;i++){
                        var majorname=result[i]['majorname'];
                        var majornum=result[i]['majornum'];
                        $('#majornum').append('<option value='+ majornum+'>'+majorname+'</option>');
                        $('#selmajornum').append('<option value='+ majornum+'>'+majorname+'</option>');
                        form.render();
                    }
                } });
        }
//        动态生成select end


//        日历start
        laydate.render({
            elem: '#studentbirthday'
        });
//        日历end

//        form.on('select(select)', function(data){
//            console.log(data.elem); //得到slect原始DOM对象
//           console.log(data.value); //得到被选中的值
//           console.log(data.othis); //得到美化后的DOM对象
//        });

        selajax();
//        单独添加学生模块start
        $('#add').on('click',function () {
            $('#change').html("新增学员");
            $('#studentnum').attr("disabled",false);
            layer.open({
                title:"新增学员",
                area:['600px','700px'],
                skin:'layui-anim-upbit',
                type: 1,
                offset: [ //为了演示，随机坐标
                ($(window).height()-1000)
                ,($(window).width()-1290)
            ],
            content: $('#addform'),
                success:function () {
                    form.on('submit(addsubmit)', function(data){
                        layer.msg(JSON.stringify(data.field));
                        $.ajax({
                            url: '/addstudentinfo',
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

                                    table.reload('studentInfoTable', {
                                    });
                                    layer.closeAll('page');
                                }
                            }
                        });
                        return false;
                    });
                }
            });
        });
//        单独添加学生模块end

//      批量添加学生模块start

//      批量添加学生模块end

//        修改学生信息模块start
        $('#edit').on('click',function () {
            $('#change').html("修改学员");
            $('#studentnum').attr("disabled",true);
            var checkStatus = table.checkStatus('studentInfoTable'); //test即为基础参数id对应的值
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
                    title: "修改学员",
                    area: ['600px', '700px'],
                    skin: 'layui-anim-upbit',
                    type: 1,
                    content: $('#addform'),
                    offset: [ //为了演示，随机坐标
                        ($(window).height()-1000)
                        ,($(window).width()-1290)
                    ],
                    success:function () {
                        $('#studentnum').val((checkStatus.data)[0]['studentnum']);
                        $('#majornum').val((checkStatus.data)[0]['majornum']);
                        $('#studentname').val((checkStatus.data)[0]['studentname']);
                        $('#studentbirthday').val((checkStatus.data)[0]['studentbirthday']);
                        $('#studentpassword').val((checkStatus.data)[0]['studentpassword']);
                        $('#studentphonenum').val((checkStatus.data)[0]['studentphonenum']);
                        $('#studentorganization').val((checkStatus.data)[0]['studentorganization']);
                        $('#studentcomeyear').val((checkStatus.data)[0]['studentcomeyear']);
                        $('#studentrole').val((checkStatus.data)[0]['studentrole']);
//                        radio的渲染start
                        if(typeof ((checkStatus.data)[0].studentsex)!='undefined'){
                            if(((checkStatus.data)[0].studentsex).replace(/["“”]/g,"")==='男'){
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
                        var optionsel=(checkStatus.data)[0]['majornum'];
                        $("#majornum").find('option').each(function(){
                            if($(this).html()===optionsel){
                                $(this).prop("selected",true);
                            }else {
                                $(this).prop("selected",false);
                            }
                        });
//                        select的渲染end

                        form.render();
                        form.on('submit(addsubmit)', function(data){
                            $.ajax({
                                url: '/editstudentinfo',
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
                                        table.reload('studentInfoTable', {
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
//        修改学生信息模块end

//          删除学生信息模块start
        $('#delete').on('click',function () {
            var checkStatus = table.checkStatus('studentInfoTable');
            if(checkStatus.data.length==0){
                layer.msg("请选中再删除", {
                    time: 2000, //2s后自动关闭
                });
                return ;
            }
            var nums=[];
            for(var i=0;i<checkStatus.data.length;i++){
                nums.push((checkStatus.data)[i]['studentnum']);
            }
            $.ajax({
                traditional: true,//传输组专用
                url: '/delStudentInfo',
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
                    table.reload('studentInfoTable', {
                    });
                }
            });
        })
            
//        删除学生信息模块end

//        查询学生信息模块start
        $('#search').on('click',function () {
            form.on('submit(search)', function(data){
//                layer.alert(JSON.stringify(data.field), {
//                    title: '最终的提交信息'
//                })
                table.reload('studentInfoTable', {
                    url: '/searchStudentInfoByCondition'
                    ,where: data.field
                });
                return false;
            });
//        查询学生信息模块end
        });
    });
</script>
</body>
</html>
