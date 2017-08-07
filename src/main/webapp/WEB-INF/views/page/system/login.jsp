https://github.com/orzzzzz/platform.git<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" href="<c:url value='/js/lib/bootstrap/css/bootstrap.min.css'/>"/>
    <link rel="stylesheet" href="<c:url value='/css/client.css'/>"/>
</head>
<body>
<div class="mod-login">
    <form id="js-form">
        <div class="form-group">
            <label for="loginName" class="col-sm-4"> 用户名：</label>
            <input name="loginName" id="loginName" placeholder="请输入用户名" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-4"> 密码：</label>
            <input type="password" name="password" id="password" placeholder="请输入密码" class="form-control"/>
        </div>
        <div class="form-group">
            <label>验证码 </label>
            <input name="captcha" type="text" id="kaptcha" maxlength="4" class="form-control"/>
            <br/>
            <img src="<c:url value='/client/captcha/generatecode'/>" id="kaptchaImage"  style="margin-bottom: -3px"/>
            <a id="change">看不清?换一张</a>
        </div>
        <button id="js-submit" class="btn btn-primary">登录</button>
        <button type="reset" class="btn btn-default">重置</button>
    </form>
</div>
<script src="<c:url value="/js/client/system/controller/loginController.js"/>"></script>
</body>
</html>
