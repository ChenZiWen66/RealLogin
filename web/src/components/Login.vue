<template>
    <div>
        <form class="form-horizontal" style="background-color: cornsilk">
            <div class="form-group">
                <label for="login_name" class="col-md-2 control-label">用户名</label>
                <div class="col-md-10">
                    <input type="text" class="form-control" id="login_name" placeholder="请输入用户名">
                </div>
            </div>
            <div class="form-group">
                <label for="password" class="col-md-2 control-label">密码</label>
                <div class="col-md-10">
                    <input type="password" class="form-control" id="password" placeholder="请输入密码">
                </div>
            </div>
            <div class="form-group">
                <label for="verifyCode" class="col-md-2 control-label">验证码</label>
                <div class="col-md-8">
                    <input type="text" class="form-control" id="verifyCode" placeholder="请输入验证码">
                </div>
                <div class="col-md-2">
                    <img id="verify_img" src="../assets/xiaolan.jpg" alt="这是验证码图片" style="width: 100px;height: 50px">
                </div>
            </div>
        </form>
        <div class="row">
            <div class="col-md-2 col-md-offset-4">
                <div class="checkbox">
                    <label>
                        <input id="remember_me" type="checkbox">记住密码
                    </label>
                </div>
            </div>
            <div class="col-md-2 col-md-offset-4 col-md-pull-4">
                <button class="btn btn-link" @click="register">注册账号</button>
            </div>
        </div>
        <div class="row">
            <div class="col-md-offset-4 col-md-8 col-md-pull-2">
                <button class="btn btn-info btn-block" @click="userLogin">登陆</button>
            </div>
        </div>

    </div>
</template>

<script>
    import sso from '../components/SSO'
    export default {
        name: "Login",
        methods: {
            register: function () {
                console.log("点击了注册账号按钮，触发了注册账号功能");
            },
            userLogin: function () {
                console.log("点击了登陆按钮，触发了登陆功能");
                let _this = this;
                let login_name=document.querySelector('#login_name').value;
                let password=document.querySelector('#password').value;
                let verifyCode=document.querySelector('#verifyCode').value;
                let is_remember=document.querySelector('#remember_me').checked;
                let password_md5 = sso.transform2md5(password);
                console.log("用户名：",login_name);
                console.log("密  码：",password);
                console.log("验证码：",verifyCode);
                console.log("是否记住密码：",is_remember);
                console.log("MD5加密后密码：",password_md5);
                let formData= new window.FormData();
                formData.append("loginName",login_name);
                formData.append("password",password_md5);
                formData.append("loginName",login_name);

                this.$router.push("/");
            }
        }
    }
</script>

<style scoped>

</style>