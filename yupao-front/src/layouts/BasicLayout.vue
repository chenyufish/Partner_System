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
    <template v-if="active === 'index' ">
      <Index />
    </template>
    <template v-if="active === 'team' ">
      <Team />
    </template>

  </div>

  <van-tabbar v-model="active" @change="onChange">
    <van-tabbar-item icon="home-o"  replace to="/"  name="index">主页</van-tabbar-item>
    <van-tabbar-item icon="search"  replace to ="/search" name="team">队伍</van-tabbar-item>
    <van-tabbar-item icon="friends-o" replace to="/user" name="user">个人</van-tabbar-item>
  </van-tabbar>

</template>

<script setup>
import {ref} from "vue";
import Index from "../pages/Index.vue";
import Team from "../pages/Team.vue";
import 'vant/es/toast/style';
import { showToast } from 'vant';

const onClickLeft = () => alert('左');
const onClickRight = () => alert("右");

const active = ref("index");
const onChange = (index) => showToast(`标签 ${index}`);


</script>

<style scoped>

</style>


