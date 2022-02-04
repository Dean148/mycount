<template>
  <div>
    <home-list></home-list>
    <el-button @click="add" type="primary" size="mini">新增</el-button>
  </div>

</template>

<script>
	import HomeList from "../components/homeList"
  export default {
		name: "home",
    components: {HomeList},
    methods:{
      add(){
        let form ={
          "comment": "1111111111",
          "count": 0,
          "cusDate": "2022-02-04",
          "custom": "string",
          "label": "2222",
          "type": "string"
        }

        this.$axiosJava.post("api/home/add",form).then(res=>{
          this.$message.success("成功")
        }).catch(e=>{
          this.$message.error(e)
        })
      }
    }
  }
</script>

<style scoped>

</style>
