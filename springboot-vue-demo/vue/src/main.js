import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import '@/assets/css/global.css'
import zhCn from 'element-plus/lib/locale/lang/zh-cn'

const app = createApp(App).use(store).use(router).use(ElementPlus,{locale:zhCn,size:"small"}).mount('#app')
