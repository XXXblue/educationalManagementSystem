<%--
  Created by IntelliJ IDEA.
  User: xiaojianyu
  Date: 2017/9/16
  Time: 17:18
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
            <i class="layui-icon">&#xe608;</i>发布课程
        </a>
        <a href="#" class="layui-btn layui-btn-small" id="edit">
            <i class="layui-icon">&#xe642;</i> 修改课程信息
        </a>
        <a href="javascript:;" class="layui-btn layui-btn-small" id="delete" >
            <i class="layui-icon">&#xe640;</i> 删除课程
        </a>
    </blockquote>
</fieldset>
<%--操作模块end--%>


<%--查询模块start--%>
<fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
    <legend>查询课表</legend>
    <blockquote class="layui-elem-quote">
        <form class="layui-form layui-form-pane " action="">
            <div class="layui-inline">
                <div class="layui-form-item" style="width: 300px">
                    <label class="layui-form-label">学年</label>
                    <div class="layui-input-block">
                        <input type="text" name="termyear"   placeholder="请输入学年" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item" style="width: 300px">
                    <label class="layui-form-label">学期</label>
                    <div class="layui-input-block">
                        <input type="text" name="termtime" placeholder="请输入学期" autocomplete="off" class="layui-input">
                    </div>
                </div>
            </div>
            <div class="layui-inline">
                <div class="layui-form-item" style="width: 300px">
                    <label class="layui-form-label">学周</label>
                    <div class="layui-input-block">
                        <input type="text" name="week"  placeholder="请输入周数" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item" style="width: 400px">
                    <label class="layui-form-label">是否公布</label>
                    <div class="layui-input-block">
                        <input  type="radio" name="ifopen" value="1" title="是" checked>
                        <input  type="radio" name="ifopen" value="0" title="否" >
                        <input  type="radio" name="ifopen" value="" title="全部" >
                    </div>
                </div>
            </div>

            <div class="layui-inline">
                <div class="layui-form-item" style="width: 300px">
                    <label class="layui-form-label">所属专业</label>
                    <div class="layui-input-block">
                        <select  id="selmajornum" name="majornum"  lay-filter="select">
                        </select>
                    </div>
                </div>
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
    <legend>课程信息</legend>
    <table id="courseInfoTable" class="layui-table"  lay-filter="courseInfoTable" ></table>
</fieldset>
<%--表格end--%>


<%--表单添加模块start--%>
<form id="form" class="layui-form" action="" lay-filter="form" style="display: none;padding-left: 25px;padding-top: 25px">
    <fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
        <legend id="change"></legend>


        <%--不显示但必须带的模块start，解决修改数据填充的问题--%>
        <div class="layui-form-item" hidden>
            <label class="layui-form-label">课程编号:</label>
            <div class="layui-input-block">
                <input name="coursenum" id="coursenum" utocomplete="off" placeholder="请输入课程编号" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" hidden>
            <label class="layui-form-label">创建时间:</label>
            <div class="layui-input-block">
                <input name="createtime" id="createtime"autocomplete="off" placeholder="请输入课程编号" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" hidden>
            <label class="layui-form-label">人数剩余:</label>
            <div class="layui-input-block">
                <input name="coursefree" id="coursefree"  class="layui-input">
            </div>
        </div>
        <%--不显示但必须带的模块end--%>


        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">课程名称:</label>
                <div class="layui-input-block">
                    <input name="coursename" id="coursename" lay-verify="required" autocomplete="off" placeholder="请输入课程名" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">是否公布:</label>
                <div class="layui-input-block">
                    <input id="yes" type="radio" name="ifopen" value="1" title="是" checked>
                    <input id="no" type="radio" name="ifopen" value="0" title="否" >
                </div>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">学分:</label>
                <div class="layui-input-block">
                    <input name="coursecredit" id="coursecredit" lay-verify="required" autocomplete="off" placeholder="请输入学分" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">课室编号:</label>
                <div class="layui-input-block">
                    <input name="classnum" id="classnum" lay-verify="required" autocomplete="off" placeholder="请输入课室编号" class="layui-input">
                </div>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">上课日期:</label>
                <div class="layui-input-block">
                    <select id="courseday" name="courseday" >
                        <option value="1">星期一</option>
                        <option value="2">星期二</option>
                        <option value="3">星期三</option>
                        <option value="4">星期四</option>
                        <option value="5">星期五</option>
                        <option value="6">星期六</option>
                        <option value="7">星期日</option>
                    </select>
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">上课时间段:</label>
                <div class="layui-input-block">
                    <select id="coursedaytime" name="coursedaytime">
                        <option value="1">上午第一节课</option>
                        <option value="2">上午第二节课</option>
                        <option value="3">下午第一节课</option>
                        <option value="4">下午第二节课</option>
                        <option value="5">晚上第一节课</option>
                    </select>
                </div>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">教师工号:</label>
                <div class="layui-input-block">
                    <input name="courseteachernum" id="courseteachernum" lay-verify="required" autocomplete="off" placeholder="请输入教师工号" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">专业名称:</label>
                <div class="layui-input-block">
                    <select  id="majornum" name="majornum" lay-verify="required" lay-filter="select">
                    </select>
                </div>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">所属学年:</label>
                <div class="layui-input-block">
                    <input name="termyear" id="termyear" lay-verify="required" autocomplete="off" placeholder="请输入课程学年" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">课程学期:</label>
                <div class="layui-input-block">
                    <input name="termtime" id="termtime" lay-verify="required" autocomplete="off" placeholder="请输入学期" class="layui-input">
                </div>
            </div>
        </div>


        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">课程开始周:</label>
                <div class="layui-input-block">
                    <input name="coursestartweek" id="coursestartweek" lay-verify="required" autocomplete="off" placeholder="请输入开始周" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">课程结束周:</label>
                <div class="layui-input-block">
                    <input name="courseendweek" id="courseendweek" lay-verify="required" autocomplete="off" placeholder="请输入结束周" class="layui-input">
                </div>
            </div>
        </div>


        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">课程学时:</label>
                <div class="layui-input-block">
                    <input name="courselong" id="courselong" lay-verify="required" autocomplete="off" placeholder="请输入课程学时" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">课程人限:</label>
                <div class="layui-input-block">
                    <input name="coursenumlimit" id="coursenumlimit"  autocomplete="off" placeholder="请输入人数限制" class="layui-input">
                </div>
            </div>
        </div>


        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">人数限制:</label>
                <div class="layui-input-block">
                    <input name="courseopennum" id="courseopennum" lay-verify="required" autocomplete="off" placeholder="请输入人限" class="layui-input">
                </div>
            </div>
        </div>

        <div class="layui-form-item" hidden>
            <div class="layui-inline" >
                <label class="layui-form-label">人数限制:</label>
                <div class="layui-input-block">
                    <input name="coursestatus" id="cs" autocomplete="off" placeholder="请输入人限" class="layui-input">
                </div>
            </div>
        </div>

        <div class="layui-form-item" hidden>
            <div class="layui-inline" >
                <label class="layui-form-label">人数限制:</label>
                <div class="layui-input-block">
                    <input name="ifgrade" id="ifgrade" autocomplete="off" placeholder="请输入人限" class="layui-input">
                </div>
            </div>
        </div>

        <div class="layui-form-item" >
            <div class="layui-input-block" style="margin:0 250px;">
                <button class="layui-btn" lay-submit="" lay-filter="submit">提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
        </div>
    </fieldset>
</form>

<%--更多展示模块start--%>
<form id="form2" class="layui-form" action=""  style="display: none;padding-left: 25px;padding-top: 25px">
    <fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
        <legend>更多信息</legend>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">课程学分:</label>
            <div class="layui-input-block">
                <input disabled id="showcoursecredit" lay-verify="required" autocomplete="off" placeholder="请输入辅导员名称" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">创建时间:</label>
            <div class="layui-input-block">
                <input  disabled id="showcreatetime" lay-verify="required" autocomplete="off" placeholder="请输入辅导员名称" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">更新时间:</label>
            <div class="layui-input-block">
                <input  disabled  id="showupdatetime" lay-verify="required" autocomplete="off" placeholder="请输入辅导员名称" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
        <label class="layui-form-label">学时:</label>
        <div class="layui-input-block">
            <input disabled id="showcourselong" lay-verify="required" autocomplete="off" placeholder="请输入辅导员名称" class="layui-input">
        </div>
    </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">开始周:</label>
            <div class="layui-input-block">
                <input  id="showstartweek"disabled lay-verify="required" autocomplete="off" placeholder="请输入辅导员名称" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
        <label class="layui-form-label">结束周:</label>
        <div class="layui-input-block">
            <input  disabled id="showendweek" lay-verify="required" autocomplete="off" placeholder="请输入辅导员名称" class="layui-input">
        </div>
    </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">所属专业:</label>
            <div class="layui-input-block">
                <input  disabled id="showmajornum" lay-verify="required" autocomplete="off" placeholder="请输入辅导员名称" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">学期:</label>
            <div class="layui-input-block">
                <input disabled id="showtermtime" lay-verify="required" autocomplete="off" placeholder="请输入辅导员名称" class="layui-input">
            </div>
        </div>
    </fieldset>
</form>
<%--更多展示模块end--%>

<script src="../static/plugins/layui/layui.js"></script>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-mini" lay-event="detail">查看更多</a>
</script>
<script type="text/html" id="titleTpl">
    <a href="detail/{{d.coursenum}}" class="layui-table-link">{{d.courseteachernum
        }}</a>
</script>
<script type="text/html" id="coursestatus">
    {{#  if(d.coursestatus==0){ }}
    未开课
    {{#  } }}
    {{#  if(d.coursestatus==1){ }}
    已开课
    {{#  } }}
    {{#  if(d.coursestatus==2){ }}
    已结课
    {{#  } }}
</script>
<script type="text/html" id="coursestatusbutton">
    {{#  if(d.coursestatus==0){ }}
    <a class="layui-btn layui-btn-warm layui-btn-mini" lay-event="openCourse">开课</a>
    {{#  } }}
    {{#  if(d.coursestatus==1){ }}
    <a class="layui-btn layui-btn-danger layui-btn-mini" >开课中</a>
    {{#  } }}
    {{#  if(d.coursestatus==2){ }}
    <a class="layui-btn layui-btn-danger layui-btn-mini" >已结课</a>
    {{#  } }}
</script>
<script>
    layui.use(['jquery','layer','form','table','laydate','laytpl'], function(){
        var $ = layui.$;
        var layer=layui.layer;
        var table=layui.table;
        var form=layui.form;
        var laydate = layui.laydate;
        var laytpl=layui.laytpl;


//        动态生成select start
        function selajax() {
            $.ajax({
                url: '/listmajorinfoselect',
                type: 'post',
                dataType: 'json',
                success: function (result) {
                    $('#selmajornum').append('<option value="">全部</option>');
                    for(var i=0;i<result.length;i++){
                        var majorname=result[i]['majorname'];
                        var majornum=result[i]['majornum'];
                        $('#majornum').append('<option value='+ majornum+'>'+majorname+'</option>');
                        $('#selmajornum').append('<option value='+ majornum+'>'+majorname+'</option>');
                    }
                    form.render();
                } });
        }
        selajax();
        form.render();
//        动态生成select end



//        初始化参数表单 start
        function init() {
            $("#coursenum").val("");
            $("#coursename").val("");
            $("#coursecredit").val("");
            $("#classnum").val("");
            $("#courseteachernum").val("");
            $("#termyear").val("");
            $("#coursestartweek").val("");
            $("#courseendweek").val("");
            $('#courselong').val("");
            $('#coursenumlimit').val("");
            $('#termtime').val("");
            $('#yes').prop("checked",true);
        }
//        end

//            表格start
        var tabb=table.render({
            id:'courseInfoTable',
            elem: '#courseInfoTable',
            url: '/courseInfoTable',
            cols:  [[ //标题栏
                {checkbox: true, LAY_CHECKED: false}
                ,{field: 'coursenum', align:'center',title: '课程编号', width: 150}
                ,{field: 'coursename', align:'center',title: '课程名称', width: 150}
                ,{field: 'classnum', align:'center',title: '课室编号', width: 100}
                ,{field:'courseteachernum', align:'center', title: '教师工号', width: 100, templet: '#titleTpl'}
                ,{field: 'coursenumlimit',align:'center', title: '人数限制', width: 100}
                ,{field: 'termyear',align:'center', title: '学年', width: 100}
                ,{field: 'coursefree',align:'center', title: '人数剩余', width: 100}
                ,{field: 'scourseDay',align:'center', title: '上课日期', width: 100}
                ,{field: 'scourseDayTime',align:'center', title: '上课时段', width: 150}
                ,{field: 'courseopennum',align:'center', title: '开课人数下限', width: 120}
                ,{field: 'ifopen',align:'center', title: '是否公布', width: 100}
                ,{field: 'coursestatus',align:'center', title: '开课状态', width: 100,templet:'#coursestatus'}
                ,{fixed: 'right',title: '查看更多', width:100, align:'center', toolbar: '#barDemo'}
                ,{field: 'coursestatus',align:'center', title: '是否开课', width: 120,templet:'#coursestatusbutton'}
            ]],
            page:true,
            limits: [10,20,30],
            limit:10,
            height:800,
        });
        table.on('tool(courseInfoTable)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值
            var tr = obj.tr; //获得当前行 tr 的DOM对象

            if(layEvent === 'detail'){ //查看
                layer.open({
                    title:"更多信息",
                    area:['600px','600px'],
                    skin:'layui-anim-upbit',
                    type: 1,
                    content: $('#form2'),
                    success:function () {
                        $('#showstartweek').val(obj.data['coursestartweek']);
                        $('#showupdatetime').val(obj.data['updatetime']);
                        $('#showcreatetime').val(obj.data['createtime']);
                        $('#showcourselong').val(obj.data['courselong']);
                        $('#showendweek').val(obj.data['courseendweek']);
                        $('#showtermtime').val(obj.data['termtime']);
                        $('#showcoursecredit').val(obj.data['coursecredit']);
                        $('#showmajornum').val(obj.data['majornum'])
                    }
                });
            } ;


            if (layEvent === 'openCourse') {
                layer.confirm('确定开课', {icon: 3, title: '提示'}, function (index) {
                    if (index) {
                        $.ajax({
                            traditional: true,//传输组专用
                            url: '/changeCourseStatus' + '/manager/'+data['coursenum'],
                            type: 'POST',
                            dataType: 'json',
                            contentType: 'application/json',
                            data: JSON.stringify(data),
                            success: function (result) {
                                if (result.status === 1) {
                                    layer.msg("成功开课", {
                                        time: 2000, //2s后自动关闭
                                    });
                                }
                                if (result.status === 2) {
                                    layer.msg("人数不足，开课失败", {
                                        time: 2000, //2s后自动关闭
                                    });
                                }
                                table.reload('courseInfoTable', {});
                            }
                        });
                    }
                    layer.close(index);
                });
            }
        });
//            表格end

//        增加课程start
        $('#add').on('click',function () {
            init();
            $('#change').html("发布课程");
            $('#coursenum').attr("disabled", false);
            layer.open({
                title: "新增课程",
                area: ['800px', '700px'],
                skin: 'layui-anim-upbit',
                type: 1,
                content: $('#form'),
                success:function () {
                    form.on('submit(submit)', function(data){
//                        layer.msg(JSON.stringify(data.field));
                        layer.confirm('确认新建课程', {icon: 3, title:'提示'}, function(index){
                            if(index){
                                $.ajax({
                                    url: '/addCourseInfo',
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
                                            table.reload('courseInfoTable', {
                                            });
                                            layer.closeAll('page');
                                        }
                                    }
                                });
                            }
                        });
                        return false;
                    });
                }

            });
        });
//        增加课程end

//        修改课程start
        $('#edit').on('click',function () {
            init();
            $('#change').html("修改课程");

            var checkStatus = table.checkStatus('courseInfoTable'); //test即为基础参数id对应的值
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
                    title: "修改课程",
                    area: ['800px', '700px'],
                    skin: 'layui-anim-upbit',
                    type: 1,
                    content: $('#form'),
                    success:function () {

//                        数据回显start
                        $("#coursenum").val((checkStatus.data)[0]['coursenum']);
                        $("#coursefree").val((checkStatus.data)[0]['coursefree']);
                        $("#createtime").val((checkStatus.data)[0]['createtime']);
                        $('#coursename').val((checkStatus.data)[0]['coursename']);
                        $('#coursecredit').val((checkStatus.data)[0]['coursecredit']);
                        $('#classnum').val((checkStatus.data)[0]['classnum']);
                        $('#courseteachernum').val((checkStatus.data)[0]['courseteachernum']);
                        $('#termyear').val((checkStatus.data)[0]['termyear']);
                        $('#termtime').val((checkStatus.data)[0]['termtime']);
                        $('#coursestartweek').val((checkStatus.data)[0]['coursestartweek']);
                        $('#courseendweek').val((checkStatus.data)[0]['courseendweek']);
                        $('#courselong').val((checkStatus.data)[0]['courselong']);
                        $('#coursenumlimit').val((checkStatus.data)[0]['coursenumlimit']);
                        $('#courseopennum').val((checkStatus.data)[0]['courseopennum']);
                        $('#cs').val((checkStatus.data)[0]['coursestatus']);
                        $('#ifgrade').val((checkStatus.data)[0]['ifgrade']);
//                        radio的渲染start
                        if(typeof ((checkStatus.data)[0].ifopen)!='undefined'){
                            if(((checkStatus.data)[0].ifopen).replace(/["“”]/g,"")==='是'){
                                $('#yes').prop("checked",true);
                            }else{
                                $('#no').prop("checked",true);
                            }
                        }else{
                            $('#yes').prop("checked",true);
                        }
//                        radio的渲染end

//                        select的渲染start
                        var optionsel=(checkStatus.data)[0]['scourseDay'];
                        $("#courseday").find('option').each(function(){
                            if($(this).html()===optionsel){
                                $(this).prop("selected",true);
                            }else {
                                $(this).prop("selected",false);
                            }
                        });
                        var optionsel=(checkStatus.data)[0]['scourseDayTime'];
                        $("#coursedaytime").find('option').each(function(){
                            if($(this).html()===optionsel){
                                $(this).prop("selected",true);
                            }else {
                                $(this).prop("selected",false);
                            }
                        });
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

//                        数据回显end
                        form.on('submit(submit)', function(data){
//                        layer.msg(JSON.stringify(data.field));
                            layer.confirm('确认修改课程', {icon: 3, title:'提示'}, function(index) {
                                if (index) {
                                    $.ajax({
                                        url: '/editCourseInfo',
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
                                                table.reload('courseInfoTable', {
                                                });
                                                layer.closeAll('page');
                                            }
                                        }
                                    });
                                }
                            });
                            return false;
                        });
                    }

                });
            }
        });
//        修改课程end

//        删除课程start
        $('#delete').on('click',function () {
            var checkStatus = table.checkStatus('courseInfoTable');
            if(checkStatus.data.length==0){
                layer.msg("请选中再删除", {
                    time: 2000, //2s后自动关闭
                });
            }else{
                var nums=[];
                for(var i=0;i<checkStatus.data.length;i++){
                    nums.push((checkStatus.data)[i]['coursenum']);
                }
                layer.confirm('确认删除所选课程', {icon: 3, title:'提示'}, function(index){
                    if(index){
                        $.ajax({
                            traditional: true,//传输组专用
                            url: '/delCourseInfo',
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
                                table.reload('courseInfoTable', {
                                });
                            }
                        });
                    }
                });
            }
        })
//        删除课程end

//      查询课程start
        $('#search').on('click',function () {
            form.on('submit(search)', function(data){
//                layer.alert(JSON.stringify(data.field), {
//                    title: '最终的提交信息'
//                })
                table.reload('courseInfoTable', {
                    url: '/searchCourseByCondition'
                    ,where: data.field
                    //,height: 300
                });
                return false;
            });
        })

        
//        查询课程end
    });
</script>
</body>
</html>
