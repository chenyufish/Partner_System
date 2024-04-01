import {setCurrentUserState} from "../states/user";
import myAxios from '../plugins/myAxios.js';
export const getCurrentUser =async ()=>{
    //如果去getCurrentUserState，我们只会取到缓存里面的结果，并不会拿到current，所以只需要用Axios去get就行（面对小量用户）
    const res =await myAxios.get('/user/current');
    if (res.code ===0) {
    setCurrentUserState(res.data);
    return res.data;
}
    return null;
}