<template>
  <div>
    <el-col :span="12">
      <h5 class="mb-2">Default colors</h5>
      <el-menu
          style="width:200px;min-height:calc(100vh - 50px)"
          default-active="1"
          class="el-menu-vertical-demo"
      >
        <el-menu-item index="1">
          <span>Navigator One</span>
        </el-menu-item>
        <el-menu-item index="2">
          <span>Navigator Two</span>
        </el-menu-item>
        <el-menu-item index="3">
          <span>Navigator Three</span>
        </el-menu-item>
        <el-menu-item index="4">
          <span>Navigator Four</span>
        </el-menu-item>
      </el-menu>
    </el-col>
  </div>
</template>

<script>
export default {
  name: "Aside"
}
</script>

<style scoped>

</style>