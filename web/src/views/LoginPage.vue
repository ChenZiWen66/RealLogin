<template>
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-10 col-md-offset-2 col-md-pull-1">
                <div class="col-md-12">
                    <img alt="登陆banner" src="../assets/xiaolan.jpg" style="width: 100%;height: 200px"/>
                </div>
                <Login/>
            </div>
        </div>
    </div>
</template>

<script>
    import Login from "../components/Login";

    export default {
        name: "LoginPage",
        components: {
            Login
        }
    }
</script>

<style scoped>

</style>