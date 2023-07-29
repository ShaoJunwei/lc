<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="客户" prop="customerName">
        <el-input
          v-model="queryParams.customerName"
          placeholder="请输入客户"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="零件编号" prop="componentNo">
        <el-input
          v-model="queryParams.componentNo"
          placeholder="请输入零件编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="零件材质" prop="componentMaterial">
        <el-input
          v-model="queryParams.componentMaterial"
          placeholder="请输入零件材质"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="工件硬度" prop="componentHardness">
        <el-input
          v-model="queryParams.componentHardness"
          placeholder="请输入工件硬度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="表面处理工艺" prop="componentTechnology">
        <el-input
          v-model="queryParams.componentTechnology"
          placeholder="请输入表面处理工艺"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="孔型" prop="holeModel">
        <el-input
          v-model="queryParams.holeModel"
          placeholder="请输入孔型"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="孔径" prop="holeDiameter">
        <el-input
          v-model="queryParams.holeDiameter"
          placeholder="请输入孔径"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="孔长" prop="holeLength">
        <el-input
          v-model="queryParams.holeLength"
          placeholder="请输入孔长"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="圆度" prop="roundness">
        <el-input
          v-model="queryParams.roundness"
          placeholder="请输入圆度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="圆柱度" prop="cylindricity">
        <el-input
          v-model="queryParams.cylindricity"
          placeholder="请输入圆柱度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="粗糙度" prop="roughness">
        <el-input
          v-model="queryParams.roughness"
          placeholder="请输入粗糙度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="工序" prop="process">
        <el-input
          v-model="queryParams.process"
          placeholder="请输入工序"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="加工余量" prop="processAllowance">
        <el-input
          v-model="queryParams.processAllowance"
          placeholder="请输入加工余量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="要求节拍" prop="requireTime">
        <el-input
          v-model="queryParams.requireTime"
          placeholder="请输入要求节拍"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="工具型号" prop="toolNo">
        <el-input
          v-model="queryParams.toolNo"
          placeholder="请输入工具型号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="纱条型号" prop="stripNo">
        <el-input
          v-model="queryParams.stripNo"
          placeholder="请输入纱条型号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="珩磨时间" prop="boningDuration">
        <el-input
          v-model="queryParams.boningDuration"
          placeholder="请输入珩磨时间"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="实测圆度" prop="realRoundness">
        <el-input
          v-model="queryParams.realRoundness"
          placeholder="请输入实测圆度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="实测圆柱度" prop="realCylindricity">
        <el-input
          v-model="queryParams.realCylindricity"
          placeholder="请输入实测圆柱度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="实测粗糙度" prop="realRoughness">
        <el-input
          v-model="queryParams.realRoughness"
          placeholder="请输入实测粗糙度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="设备型号" prop="equipmentNo">
        <el-input
          v-model="queryParams.equipmentNo"
          placeholder="请输入设备型号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="操作人" prop="operator">
        <el-input
          v-model="queryParams.operator"
          placeholder="请输入操作人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="操作时间" prop="operateTime">
        <el-date-picker clearable
          v-model="queryParams.operateTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择操作时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="创建人" prop="createUser">
        <el-input
          v-model="queryParams.createUser"
          placeholder="请输入创建人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['business:component:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['business:component:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['business:component:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['business:component:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="componentList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="客户" align="center" prop="customerName" />
      <el-table-column label="零件编号" align="center" prop="componentNo" />
      <el-table-column label="零件材质" align="center" prop="componentMaterial" />
      <el-table-column label="工件硬度" align="center" prop="componentHardness" />
      <el-table-column label="表面处理工艺" align="center" prop="componentTechnology" />
      <el-table-column label="孔型" align="center" prop="holeModel" />
      <el-table-column label="孔径" align="center" prop="holeDiameter" />
      <el-table-column label="孔长" align="center" prop="holeLength" />
      <el-table-column label="圆度" align="center" prop="roundness" />
      <el-table-column label="圆柱度" align="center" prop="cylindricity" />
      <el-table-column label="粗糙度" align="center" prop="roughness" />
      <el-table-column label="工序" align="center" prop="process" />
      <el-table-column label="加工余量" align="center" prop="processAllowance" />
      <el-table-column label="要求节拍" align="center" prop="requireTime" />
      <el-table-column label="工具型号" align="center" prop="toolNo" />
      <el-table-column label="纱条型号" align="center" prop="stripNo" />
      <el-table-column label="珩磨时间" align="center" prop="boningDuration" />
      <el-table-column label="实测圆度" align="center" prop="realRoundness" />
      <el-table-column label="实测圆柱度" align="center" prop="realCylindricity" />
      <el-table-column label="实测粗糙度" align="center" prop="realRoughness" />
      <el-table-column label="设备型号" align="center" prop="equipmentNo" />
      <el-table-column label="操作人" align="center" prop="operator" />
      <el-table-column label="操作时间" align="center" prop="operateTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.operateTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="创建人" align="center" prop="createUser" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['business:component:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['business:component:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改零件信息对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="id" prop="id">
          <el-input v-model="form.id" placeholder="请输入id" />
        </el-form-item>
        <el-form-item label="客户" prop="customerName">
          <el-input v-model="form.customerName" placeholder="请输入客户" />
        </el-form-item>
        <el-form-item label="零件编号" prop="componentNo">
          <el-input v-model="form.componentNo" placeholder="请输入零件编号" />
        </el-form-item>
        <el-form-item label="零件材质" prop="componentMaterial">
          <el-input v-model="form.componentMaterial" placeholder="请输入零件材质" />
        </el-form-item>
        <el-form-item label="工件硬度" prop="componentHardness">
          <el-input v-model="form.componentHardness" placeholder="请输入工件硬度" />
        </el-form-item>
        <el-form-item label="表面处理工艺" prop="componentTechnology">
          <el-input v-model="form.componentTechnology" placeholder="请输入表面处理工艺" />
        </el-form-item>
        <el-form-item label="孔型" prop="holeModel">
          <el-input v-model="form.holeModel" placeholder="请输入孔型" />
        </el-form-item>
        <el-form-item label="孔径" prop="holeDiameter">
          <el-input v-model="form.holeDiameter" placeholder="请输入孔径" />
        </el-form-item>
        <el-form-item label="孔长" prop="holeLength">
          <el-input v-model="form.holeLength" placeholder="请输入孔长" />
        </el-form-item>
        <el-form-item label="圆度" prop="roundness">
          <el-input v-model="form.roundness" placeholder="请输入圆度" />
        </el-form-item>
        <el-form-item label="圆柱度" prop="cylindricity">
          <el-input v-model="form.cylindricity" placeholder="请输入圆柱度" />
        </el-form-item>
        <el-form-item label="粗糙度" prop="roughness">
          <el-input v-model="form.roughness" placeholder="请输入粗糙度" />
        </el-form-item>
        <el-form-item label="工序" prop="process">
          <el-input v-model="form.process" placeholder="请输入工序" />
        </el-form-item>
        <el-form-item label="加工余量" prop="processAllowance">
          <el-input v-model="form.processAllowance" placeholder="请输入加工余量" />
        </el-form-item>
        <el-form-item label="要求节拍" prop="requireTime">
          <el-input v-model="form.requireTime" placeholder="请输入要求节拍" />
        </el-form-item>
        <el-form-item label="工具型号" prop="toolNo">
          <el-input v-model="form.toolNo" placeholder="请输入工具型号" />
        </el-form-item>
        <el-form-item label="纱条型号" prop="stripNo">
          <el-input v-model="form.stripNo" placeholder="请输入纱条型号" />
        </el-form-item>
        <el-form-item label="珩磨时间" prop="boningDuration">
          <el-input v-model="form.boningDuration" placeholder="请输入珩磨时间" />
        </el-form-item>
        <el-form-item label="实测圆度" prop="realRoundness">
          <el-input v-model="form.realRoundness" placeholder="请输入实测圆度" />
        </el-form-item>
        <el-form-item label="实测圆柱度" prop="realCylindricity">
          <el-input v-model="form.realCylindricity" placeholder="请输入实测圆柱度" />
        </el-form-item>
        <el-form-item label="实测粗糙度" prop="realRoughness">
          <el-input v-model="form.realRoughness" placeholder="请输入实测粗糙度" />
        </el-form-item>
        <el-form-item label="设备型号" prop="equipmentNo">
          <el-input v-model="form.equipmentNo" placeholder="请输入设备型号" />
        </el-form-item>
        <el-form-item label="操作人" prop="operator">
          <el-input v-model="form.operator" placeholder="请输入操作人" />
        </el-form-item>
        <el-form-item label="操作时间" prop="operateTime">
          <el-date-picker clearable
            v-model="form.operateTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择操作时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="创建人" prop="createUser">
          <el-input v-model="form.createUser" placeholder="请输入创建人" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listComponent, getComponent, delComponent, addComponent, updateComponent } from "@/api/business/component";

export default {
  name: "Component",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 零件信息表格数据
      componentList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        customerName: null,
        componentNo: null,
        componentMaterial: null,
        componentHardness: null,
        componentTechnology: null,
        holeModel: null,
        holeDiameter: null,
        holeLength: null,
        roundness: null,
        cylindricity: null,
        roughness: null,
        process: null,
        processAllowance: null,
        requireTime: null,
        toolNo: null,
        stripNo: null,
        boningDuration: null,
        realRoundness: null,
        realCylindricity: null,
        realRoughness: null,
        equipmentNo: null,
        operator: null,
        operateTime: null,
        createUser: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询零件信息列表 */
    getList() {
      this.loading = true;
      listComponent(this.queryParams).then(response => {
        this.componentList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        customerName: null,
        componentNo: null,
        componentMaterial: null,
        componentHardness: null,
        componentTechnology: null,
        holeModel: null,
        holeDiameter: null,
        holeLength: null,
        roundness: null,
        cylindricity: null,
        roughness: null,
        process: null,
        processAllowance: null,
        requireTime: null,
        toolNo: null,
        stripNo: null,
        boningDuration: null,
        realRoundness: null,
        realCylindricity: null,
        realRoughness: null,
        equipmentNo: null,
        operator: null,
        operateTime: null,
        createTime: null,
        createUser: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加零件信息";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getComponent(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改零件信息";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateComponent(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addComponent(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除零件信息编号为"' + ids + '"的数据项？').then(function() {
        return delComponent(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('business/component/export', {
        ...this.queryParams
      }, `component_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
