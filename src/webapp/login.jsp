
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<link rel="stylesheet" href="./resources/layui/css/layui.css">
<script type="text/javascript" src="./resources/layui/layui.js"></script>
<div class="box">
    <h1> <p style="text-align: center">登录</p></h1><br><br>
    <form action="/login" class="layui-form-item">
        <div class="layui-form-item">
            <label class="layui-form-label">用户:</label>
            <div class="layui-input-block">
                <input type="text" name="username" required  lay-verify="required" placeholder="请输入用户" autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">密码:</label>
            <div class="layui-input-block">
                <input type="password" name="password" required  lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
            </div>
        </div>


        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="formDemo">登录</button>
                <button type="reset" class="layui-btn layui-btn-primary"><a href="register1.jsp" class="font-set">立即注册</a></button>
            </div>
        </div>
    </form>
</div>
</body>
</html>