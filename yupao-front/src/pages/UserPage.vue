<template>
    <template v-if="user">
      <van-cell title="昵称" is-link to="/user/edit" :value="user.username"  @click="toEdit('username', '昵称', user.username)"/>
      <van-cell title="账号" is-link to="/user/accountEdit" :value="user.userAccount" @click="toAccountEdit('userAccount','账户',user.userAccount)"/>
      <van-cell title="头像" is-link to="/user/edit">
        <img style="height: 48px" :src="user.avatarUrl"/>
      </van-cell>
      <van-cell title="性别" is-link :value="user.gender" @click="toEdit('gender', '性别', user.gender)"/>
      <van-cell title="电话" is-link to="/user/edit" :value="user.phone" @click="toEdit('phone', '电话', user.phone)"/>
      <van-cell title="邮箱" is-link to="/user/edit" :value="user.email" @click="toEdit('email', '邮箱', user.email)"/>
      <van-cell title="星球编号" :value="user.planetCode"/>
      <van-cell title="注册时间" :value="user.createTime.toISOString()"/>
    </template>
</template>

<script setup lang="ts">
import {useRouter} from "vue-router";
const router=useRouter();
const toEdit = (editKey: string, editName: string, currentValue: string) => {
  router.push({
    path: '/user/edit',
    query: {
      editKey,
      editName,
      currentValue,
    }
  })
}

//TODO 这里准备加一个新页面那，用于修改密码
const toAccountEdit = (editKey: string, editName: string, currentValue: string) => {
  router.push({
    path: '/user/accountEdit',
    query: {
      editKey,
      editName,
      currentValue,
    }
  })
}

const user = {
  id: 1,
  username: '昏睡红茶',
  userAccount: '114514',
  avatarUrl: 'https://636f-codenav-8grj8px727565176-1256524210.tcb.qcloud.la/img/logo.png',
  gender: '男',
  phone: '123112312',
  email: '12345@qq.com',
  planetCode: '1234',
  createTime: new Date(),
}
</script>



<style scoped>

</style>