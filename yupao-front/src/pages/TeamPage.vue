<template>
<div id="teamPage">
  <van-button type="primary" @click="doJoinTeam">加入队伍</van-button>
  <team-card-list :teamList="teamList" />
</div>
</template>

<script setup lang="ts">
import {useRouter} from "vue-router";
import {onMounted, ref} from "vue";
import myAxios from "../plugins/myAxios.js";
import {showFailToast} from "vant";
import TeamCardList from "../components/TeamCardList.vue";

const router=useRouter();
const doJoinTeam=()=>{
  router.push({
    path:"/team/add"
  })
}

const teamList=ref([]);

onMounted(async ()=>{
  const res=await myAxios.get("/team/list");
  if(res?.code===0) teamList.value=res.data;
  else showFailToast("加载队伍失败，请刷新！")
})
</script>

<style scoped>

</style>