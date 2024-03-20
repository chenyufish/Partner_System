import { createApp } from 'vue'
import { Button } from 'vant';
import './style.css'
import 'vant/lib/index.css';
import App from './App.vue'

const app=createApp(App);
app.use(Button);
app.mount('#app')



