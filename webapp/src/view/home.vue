<template>
  <div class="box">
    <HeaderTop></HeaderTop>
    <div class="content">
      <tool></tool>
      <el-row :gutter="20" style="margin-top: 18px">
        <el-col :span="16">
          <home-list></home-list>
        </el-col>
        <el-col :span="8">
          <el-tabs v-model="tabNow" class="chartBox">
            <el-tab-pane name="total" label="总消费">
              <echart1></echart1>
              <echart2></echart2>
            </el-tab-pane>
            <el-tab-pane lazy name="vs" label="消费对比">
              <echart3></echart3>
            </el-tab-pane>
          </el-tabs>
        </el-col>
      </el-row>
    </div>
  </div>

</template>

<script>
  import HomeList from "../components/homeList"
  import HeaderTop from "../components/headerTop"
  import Tool from "../components/tool"
  import Echart1 from "../components/echart1"
  import Echart2 from "../components/echart2"
  import Echart3 from "../components/echart3"

  export default {
    name: "home",
    data() {
      return {
        tabNow: "total",
      }
    },
    components: {Echart3, Echart1, Echart2, Tool, HeaderTop, HomeList},
    methods: {
      add() {
        let form = {
          "comment": "1111111111",
          "count": 0,
          "cusDate": "2022-02-04",
          "custom": "string",
          "label": "2222",
          "type": "string"
        }

        this.$axiosJava.post("api/home/add", form).then(res => {
          this.$message.success("成功")
        }).catch(e => {
          this.$message.error(e)
        })
      }
    }
  }
</script>

<style scoped>
  .box {
    margin: 0;
    background-color: #f0f0f0;
  }

  .box .content {
    margin: 12px;
    background-color: white;
    padding: 18px;
  }

  /deep/ .chartBox .el-tabs__content{
    height: 700px;
    position: relative;
  }
</style>
