<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>岗位列表</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script language="javascript" src="${pageContext.request.contextPath}/script/jquery.js"></script>
    <script language="javascript" src="${pageContext.request.contextPath}/script/pageCommon.js" charset="utf-8"></script>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/style/blue/pageCommon.css" />
    <script type="text/javascript">
    	//删除的提交函数
    	function toFrom(id) {
    		$("#"+id).submit()
		} 
    	//修改的传参的提交函数
    	function toEdit(id) {
    		//alert(id)
    		$("#"+id).submit()
		}
    </script>
</head>
<body>
 
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 岗位管理
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table cellspacing="0" cellpadding="0" class="TableStyle">
       
        <!-- 表头-->
        <thead>
            <tr align="CENTER" valign="MIDDLE" id="TableTitle">
            	<td width="200px">岗位名称</td>
                <td width="300px">岗位说明</td>
                <td>相关操作</td>
            </tr>
        </thead>

		<!--显示数据列表-->
	<c:forEach var="role" items="${ list }" varStatus="temp">
        <tbody class="dataContainer" datakey="roleList">
			<tr class="TableDetail1 template">
				<td>${role.rname}&nbsp;</td>
				<td>${role.note}&nbsp;</td>
				<td>
					<form id="${role.rid }" method="post" action="${pageContext.request.contextPath }/role_delOne">
						<input type="hidden" name="rid" value="${role.rid }">
					</form>
					<form id="edit${role.rid }" method="post" action="${pageContext.request.contextPath }/role_edit">
						<input type="hidden" name="rid" value="${role.rid }">
						<input type="hidden" name="rname" value="${role.rname }">
						<input type="hidden" name="note" value="${role.note }">
					</form>
					<a onClick="delConfirm();toFrom(${role.rid});" href="javascript:void(0)">删除</a>
					<a onclick="toEdit('edit'+${role.rid })" href="javascript:void(0)">修改</a>
					<a href="setPrivilegeUI.html">设置权限</a>
				</td>
			</tr>
        </tbody>
    </c:forEach>
    </table>
    
    <!-- 其他功能超链接 -->
    <div id="TableTail">
        <div id="TableTail_inside">
            <a href="${pageContext.request.contextPath}/role_addUI"><img src="${pageContext.request.contextPath}/style/images/createNew.png" /></a>
        </div>
    </div>
</div>
</body>

</html>