<%--
  Created by IntelliJ IDEA.
  User: xiaojianyu
  Date: 2017/10/5
  Time: 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@page language="java" contentType="text/html;UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <meta charset="utf-8">
    <title>教师个人信息修改</title>
    <link rel="stylesheet" href="../static/plugins/layui/css/layui.css" media="all">
</head>
<body>

<fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
    <legend>操作</legend>
    <blockquote class="layui-elem-quote">
        <a href="javascript:;" class="layui-btn layui-btn-small" id="edit">
            <i class="layui-icon">&#xe608;</i> 修改个人信息
        </a>
    </blockquote>
</fieldset>
<fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
    <legend>教师信息</legend>
    <img class="layui-upload-img" style="width:200px;height:200px" src="${teacherinfo.teacherpic}">
    <table class="layui-table" lay-size="lg">
        <tbody>
        <tr>
            <td style="width: 200px"><strong>姓名</strong></td>
            <td style="width: 200px">${teacherinfo.teachername}</td>
            <td style="width: 200px"><strong>联系电话</strong></td>
            <td style="width: 200px">${teacherinfo.teacherphone}</td>
        </tr>
        <tr>
            <td style="width: 200px"><strong>性别</strong></td>
            <td style="width: 200px">${teacherinfo.teachersex}</td>
            <td style="width: 200px"><strong>生日</strong></td>
            <td id="bd" style="width: 200px"></td>
        </tr>
        </tbody>
    </table>

</fieldset>

<%--表单添加模块start--%>
<form id="form" class="layui-form" action="" lay-filter="form" style="display: none;padding-left: 100px;padding-top: 50px">
        <div  class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">教师姓名:</label>
            <div class="layui-input-block">
                <input name="teachername" id="teachername" lay-verify="required" autocomplete="off" placeholder="请输入教师姓名" class="layui-input">
            </div>
        </div>
        <div  class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">教师联系电话:</label>
            <div class="layui-input-block">
                <input name="teacherphone" id="teacherphone" lay-verify="required" autocomplete="off" placeholder="请输入教师联系电话" class="layui-input">
            </div>
        </div>
        <div  class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">教师生日:</label>
            <div class="layui-input-block">
                <input name="teacherbirthday" id="teacherbirthday" lay-verify="required" autocomplete="off" placeholder="请输入教师生日" class="layui-input">
            </div>
        </div>
        <div  class="layui-form-item" style="width: 400px">
            <label class="layui-form-label">新密码:</label>
            <div class="layui-input-block">
                <input name="teacherpassword" id="teacherpassword" autocomplete="off" placeholder="请输入教师新密码" class="layui-input">
            </div>
        </div>

        <div class="layui-upload" style="margin-left: 50px">
            <button type="button" class="layui-btn" id="uploadFile">更改头像</button>
            <div class="layui-upload-list">
                <img class="layui-upload-img" style="width:200px;height:200px" id="picReview">
                <p id="demoText"></p>
            </div>
        </div>

        <div  class="layui-form-item" style="width: 400px" hidden>
            <div class="layui-input-block">
                <input name="teacherpic" id="teacherpic" autocomplete="off" class="layui-input">
            </div>
        </div>

         <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit="" lay-filter="submit">提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>


</form>
<%--表单添加模块end--%>

<script src="../static/plugins/layui/layui.js"></script>
    <script>
        layui.use(['jquery','layer','form','table','laydate','upload'], function(){
                    var $ = layui.$;
                    var layer=layui.layer;
                    var table=layui.table;
                    var form=layui.form;
                    var laydate=layui.laydate;
                    var upload =layui.upload;
//                    日期显示处理start
                var d = new Date('${teacherinfo.teacherbirthday}');
                var sd = d.getFullYear() + '-' + (d.getMonth() + 1) + '-' + d.getDate();
                $('#bd').html(sd);
//              日期显示处理end

//            文件上传start
                var uploadInst =upload.render({
                    elem:'#uploadFile'
                    ,url:'/uploadTeacherPic'
                    ,field:'uploadFile'
//                    这个是用来回显头像的此时图片还没上传
                    ,before:function(obj){obj.preview(function(index,file,result){$('#picReview').attr('src',result);});}
//                    上传成功后的回调
                    ,done:function(result){
                      $('#teacherpic').val(result['data']);
                    }
//                    上传失败后的处理
                    ,error:function(){
                        var demoText =$('#demoText');demoText.html('<span style="color: #FF5722;">上传失败</span> ' +
                            '<a class="layui-btn layui-btn-mini demo-reload">重试</a>');
                        demoText.find('.demo-reload').on('click',function(){uploadInst.upload();});}
                });
//            文件上传end



//        日历start
                laydate.render({
                    elem: '#teacherbirthday'
                });
//        日历end

//            显示初始化start
            $('#teachername').val('${teacherinfo.teachername}');
            $('#teacherphone').val('${teacherinfo.teacherphone}');
            $('#teacherbirthday').val(sd);
//            显示初始化end

//            默认值设置
                $('#teacherpassword').val("");
                $('#teacherpic').val("");
//            默认值设置

                    $('#edit').on('click',function () {

                        layer.open({
                            title:"修改教师个人信息",
                            area:['600px','700px'],
                            skin:'layui-anim-upbit',
                            type: 1,
                            content: $('#form'),
                            success:function () {
                                form.on('submit(submit)', function(data){
                                    $.ajax({
                                        url: '/editTeacherInfoForSelf',
                                        type: 'post',
                                        data: data.field,
                                        dataType: 'json',
                                        //                async: false,这个能把ajax变同步
                                        success: function (result) {
                                            if(result.status===1){
                                                layer.msg(result.msg, {
                                                    time: 2000, //2s后自动关闭
                                                });
                                                layer.closeAll('page');
                                            }
                                            if(result.status===2){
                                                layer.msg(result.msg, {
                                                    time: 2000, //2s后自动关闭
                                                });
                                                layer.closeAll('page');
                                            }
                                            window.location.reload(true);
                                            parent.document.getElementById("pic").setAttribute('src',result.data);
                                        }
                                    });
                                    return false;
                                });
                            }
                        });
                    })
                }
            );
    </script>
</body>
</html>
