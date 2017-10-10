<%--
  Created by IntelliJ IDEA.
  User: xiaojianyu
  Date: 2017/10/3
  Time: 10:55
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
        <%--表格start--%>
            <fieldset class="layui-elem-field site-demo-button"style="padding-left: 20px;margin-left: 20px;margin-right: 20px">
                <legend>课程具体信息信息</legend>
                <table id="teacherCourseInfoTable" class="layui-table"  lay-filter="teacherCourseInfoTable" ></table>
            </fieldset>
        <%--表格end--%>

        <script type="text/html" id="termTimeTpl">
            {{#  if(d.coursedaytime == 1){ }}
                上午第一节
            {{#  } }}
            {{#  if(d.coursedaytime == 2){ }}
                上午第二节
            {{#  } }}
            {{#  if(d.coursedaytime == 3){ }}
                下午第一节
            {{#  } }}
            {{#  if(d.coursedaytime == 4){ }}
                下午第二节
            {{#  } }}
            {{#  if(d.coursedaytime == 5){ }}
                晚上第一节
            {{#  } }}
        </script>

        <script type="text/html" id="courseDayTimeTpl">
            {{#  if(d.termtime == 1){ }}
                第一学期
            {{#  } else { }}
                第二学期
            {{#  } }}
        </script>

        <script type="text/html" id="courseDayTpl">
            {{#  if(d.courseday == 1){ }}
            星期一
            {{#  } }}

            {{#  if(d.courseday == 2){ }}
            星期二
            {{#  } }}

            {{#  if(d.courseday == 3){ }}
            星期三
            {{#  } }}

            {{#  if(d.courseday == 4){ }}
            星期四
            {{#  } }}

            {{#  if(d.courseday == 5){ }}
            星期五
            {{#  } }}

            {{#  if(d.courseday == 6){ }}
            星期六
            {{#  } }}

            {{#  if(d.courseday == 7){ }}
            星期日
            {{#  } }}
        </script>

        <script type="text/html" id="courseNameTpl">
            <a href="/detail/{{d.coursenum}}" class="layui-table-link">{{d.coursename}}</a>
        </script>

        <script src="../static/plugins/layui/layui.js"></script>

        <script>
            layui.use(['jquery','layer','table'], function(){
                var $ = layui.$;
                var layer=layui.layer;
                var table=layui.table;

//            表格start
                var tabb=table.render({
                    id:'teacherCourseInfoTable',
                    elem: '#teacherCourseInfoTable',
                    url: '/teacherCourseInfoTable',
                    cols:  [[ //标题栏
                        {checkbox: true, LAY_CHECKED: false}
                        ,{field: 'coursename', align:'center',title: '课程名', width: 150,templet:'#courseNameTpl'}
                        ,{field: 'classnum', align:'center',title: '教室', width: 150}
                        ,{field: 'courseday', align:'center',title: '上课周', width: 150,templet:'#courseDayTpl'}
                        ,{field: 'coursedaytime',align:'center', title: '上课时间段', width: 150,templet:'#courseDayTimeTpl'}
                        ,{field: 'coursefree', align:'center',title: '课程剩余量', width: 150}
                        ,{field: 'coursenumlimit', align:'center',title: '课程人数上限', width: 150}
                        ,{field: 'termyear', align:'center',title: '学年', width: 150}
                        ,{field: 'termtime', align:'center',title: '学期', width: 150,templet: '#termTimeTpl'}
                    ]],
                    page:true,
                    limits: [10,20,30],
                    limit:10,
                    height:800,
                });
            });
        </script>
</body>
</html>
