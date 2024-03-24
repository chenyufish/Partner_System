<template>
  <van-card
      v-for="user in userList"
      :desc="user.profile"
      :title="`${user.username} (${user.planetCode})`"
      :thumb="user.avatarUrl"
  >
    <template #tags>
      <van-tag plain type="danger" v-for="tag in tags" style="margin-right: 8px; margin-top: 8px" >
        {{tag}}
      </van-tag>
    </template>
    <template #footer>
      <van-button size="mini">联系我</van-button>
    </template>
  </van-card>
</template>

<script setup >
import {ref} from "vue";
import {useRoute} from "vue-router";

const route = useRoute();
const {tags} = route.query;

const mockUser = ref({
  id: 931,
  username: '沙鱼',
  userAccount: 'shayu',
  profile: '一条咸鱼',
  gender: 0,
  phone: '123456789101',
  email: 'shayu-yusha@qq.com',
  planetCode: '931',
  avatarUrl: 'https://avatars.githubusercontent.com/u/60722058?v=4',
  tags: ['java', 'emo', '打工中', 'emo', '打工中'],
  createTime: new Date(),
})

const userList = ref({mockUser});

</script>

<style scoped>

</style>