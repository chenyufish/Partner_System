<template>
  <user-card-list :user-list="userList"/>
  <van-empty v-if="!userList || userList.length < 1" description="数据为空" />
</template>

<script setup >
import {onMounted, ref} from "vue";
import {useRoute} from "vue-router";
import {showFailToast, showSuccessToast} from "vant";

import myAxios from "../plugins/myAxios.js";
import UserCardList from "../components/UserCardList.vue"
import qs from 'qs'


const route = useRoute();
const {tags} = route.query;


const userList = ref([]);


onMounted( async () =>{
  // 为给定 ID 的 user 创建请求
  const userListData = await  myAxios.get('/user/recommend',{
    withCredentials: true,
    params: {
      pageSize:8,
      pageNum:1,
    },
    //todo 这里页面固定显示大小应该可以优化
    //序列化
    paramsSerializer: {
      serialize: params => qs.stringify(params, { indices: false}),
    }
  })
      .then(function (response) {
        console.log('/user/recommend succeed',response);
        showSuccessToast('请求成功');
        return response?.data.records;
      })
      //todo 减少了一层data的读取，即可以成功解析出用户数据
      .catch(function (error) {
        console.log('/user/recommend error',error);
        showFailToast('请求失败');
      });
  if (userListData){
    userListData.forEach(user =>{
      if (user.tags){
        user.tags = JSON.parse(user.tags);
      }
    })
    userList.value = userListData;
  }
})



</script>

<style scoped>

</style>