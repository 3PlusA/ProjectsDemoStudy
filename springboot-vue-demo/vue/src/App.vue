body{
margin:0;
padding:0;
}
<template>

  <div id="nav">
<!--    头-->
    <Header />

<!--    主体-->
    <div style="display:flex">

<!--      侧边栏-->
      <Aside />

<!--      内容区域-->
      <router-view style="flex:0.9"/>
    </div>

  </div>
</template>

<style>

</style>

<script>
import Header from "@/components/Header";
import Aside from "@/components/Aside";


export default{
  name:"Layout",
  components:{
    Header,
    Aside
  }
}
</script>
