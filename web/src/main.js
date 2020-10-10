import Vue from 'vue'
import App from './App.vue'
import router from './router'
import axios from 'axios'
import md5 from 'js-md5'

Vue.prototype.$md5 = md5;
Vue.prototype.$http = axios;
Vue.config.productionTip = false;

new Vue({
    router,
    render: h => h(App)
}).$mount('#app');