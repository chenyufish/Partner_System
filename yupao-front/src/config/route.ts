import Index from '../pages/Index.vue';
import Team from '../pages/TeamPage.vue';
import User from '../pages/UserPage.vue';
import SearchPage from '../pages/SearchPage.vue';
import UserEditPage from '../pages/UserEditPage.vue';
import UserAccountEditPage from '../pages/UserAccountEditPage.vue';
import SearchResultPage from "../pages/SearchResultPage.vue";

const routes=[
    {path:'/',component: Index},
    {path: '/team',component: Team},
    {path: '/user',component: User},
    {path: '/search',component: SearchPage},
    {path: '/user/edit', component: UserEditPage},
    {path: '/user/accountEdit',component:UserAccountEditPage},
    {path: '/user/list',component:SearchResultPage},

]

export default routes;