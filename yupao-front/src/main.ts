import { createApp } from 'vue'
// import './style.css'
import 'vant/lib/index.css';
import App from './App.vue'
import { Tabbar, TabbarItem ,Toast,Icon,NavBar,Button} from 'vant';
import 'vant/es/toast/style';

const app=createApp(App);
app.use(Button);
app.use(NavBar);
app.use(Icon);
app.use(Tabbar);
app.use(Toast);
app.use(TabbarItem);


app.mount('#app')



