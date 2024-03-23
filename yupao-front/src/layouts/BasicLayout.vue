<template>
  <van-nav-bar
      title="标题"
      left-arrow
      @click-left="onClickLeft"
      @click-right="onClickRight"
  >
    <template #right>
      <van-icon name="search" size="18" />
    </template>
  </van-nav-bar>

  <div id="content">
    <router-view />
  </div>

  <van-tabbar route @change="onChange">
    <van-tabbar-item icon="home-o"   to="/"  name="index">主页</van-tabbar-item>
    <van-tabbar-item icon="search"   to ="/team" name="team">队伍</van-tabbar-item>
    <van-tabbar-item icon="friends-o" to="/user" name="user">个人</van-tabbar-item>
  </van-tabbar>

</template>

<script setup>
import 'vant/es/toast/style';
import { showToast } from 'vant';
import {useRouter} from "vue-router";



const onChange = (index) => showToast(`标签 ${index}`);
const router=useRouter();
const onClickRight =()=>{
  router.push('/search')
};
const onClickLeft =()=>{
  router.back()
};


</script>



<style scoped>

</style>


