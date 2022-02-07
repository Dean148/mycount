<template>
  <div>
    <el-table
      border
      width="100%"
      height="calc(100vh - 220px)"
      :data="tableData.list">
      <el-table-column
        v-for="item in columns"
        :key="item.prop"
        :prop="item.prop"
        :label="item.label"
        :width="item.width">
      </el-table-column>
      <el-table-column
        label="操作"
        width="150">
        <template slot-scope="scope">
          <el-button icon="el-icon-view" size="mini" circle type="primary" @click="view(scope)"></el-button>
          <el-button icon="el-icon-edit" size="mini" circle type="success" @click="edit(scope)"></el-button>
          <el-button icon="el-icon-delete" size="mini" circle type="danger" @click="rowDelete(scope)"></el-button>
        </template>
      </el-table-column>
    </el-table>
    <el-pagination
      style="float: right"
      @size-change="handleSizeChange"
      @current-change="handleCurrentChange"
      :current-page="currentPage"
      :page-sizes="[15, 20, 25, 30]"
      :page-size="15"
      layout="total, sizes, prev, pager, next, jumper"
      :total="tableData.count">
    </el-pagination>
    <el-dialog :visible.sync="showDetail" width="1200px">
      <detail @cancel="showDetail=false" :rows="currentRow" :type="detailType"></detail>
    </el-dialog>
  </div>

</template>

<script>
  import Detail from "./detail"

  export default {
    name: "homeList",
    components: {Detail},
    data() {
      return {
        detailType: "ck",
        showDetail: false,
        currentRow: {},
        currentPage: 1,
        tableData: [],
        columns: [
          {
            prop: "label",
            label: "消费名称"
          },
          {
            prop: "cusDate",
            label: "记录日期"
          },
          {
            prop: "type",
            label: "记录分类"
          },
          {
            prop: "custom",
            label: "消费者"
          },
          {
            prop: "count",
            label: "消费金额"
          },
          {
            prop: "used",
            label: "是否已销费"
          }

        ]
      }
    },
    methods: {
      view(scope) {
        this.currentRow = scope.row
        this.detailType = "ck"
        this.showDetail = true
      },
      edit(scope) {
        this.currentRow = scope.row
        this.detailType = "bj"
        this.showDetail = true
      },
      rowDelete(scope) {

      },
      handleSizeChange() {

      },
      handleCurrentChange() {

      },
      getData() {
        this.$axios.get("/static/api/home/list").then(res => {
          this.tableData = res.data
          this.tableData.list.map((item) => {
            item.used = item.used ? "是" : "否"
          })
        })
      }
    },
    mounted() {
      this.getData()
    }
  }
</script>
