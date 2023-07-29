package com.ruoyi.business.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 零件信息对象 component_info
 * 
 * @author sjw
 * @date 2023-07-19
 */
public class ComponentInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 客户 */
    @Excel(name = "客户")
    private String customerName;

    /** 零件编号 */
    @Excel(name = "零件编号")
    private String componentNo;

    /** 零件材质 */
    @Excel(name = "零件材质")
    private String componentMaterial;

    /** 工件硬度 */
    @Excel(name = "工件硬度")
    private String componentHardness;

    /** 表面处理工艺 */
    @Excel(name = "表面处理工艺")
    private String componentTechnology;

    /** 孔型 */
    @Excel(name = "孔型")
    private String holeModel;

    /** 孔径 */
    @Excel(name = "孔径")
    private String holeDiameter;

    /** 孔长 */
    @Excel(name = "孔长")
    private String holeLength;

    /** 圆度 */
    @Excel(name = "圆度")
    private String roundness;

    /** 圆柱度 */
    @Excel(name = "圆柱度")
    private String cylindricity;

    /** 粗糙度 */
    @Excel(name = "粗糙度")
    private String roughness;

    /** 工序 */
    @Excel(name = "工序")
    private String process;

    /** 加工余量 */
    @Excel(name = "加工余量")
    private String processAllowance;

    /** 要求节拍 */
    @Excel(name = "要求节拍")
    private String requireTime;

    /** 工具型号 */
    @Excel(name = "工具型号")
    private String toolNo;

    /** 纱条型号 */
    @Excel(name = "纱条型号")
    private String stripNo;

    /** 珩磨时间 */
    @Excel(name = "珩磨时间")
    private String boningDuration;

    /** 实测圆度 */
    @Excel(name = "实测圆度")
    private String realRoundness;

    /** 实测圆柱度 */
    @Excel(name = "实测圆柱度")
    private String realCylindricity;

    /** 实测粗糙度 */
    @Excel(name = "实测粗糙度")
    private String realRoughness;

    /** 设备型号 */
    @Excel(name = "设备型号")
    private String equipmentNo;

    /** 操作人 */
    @Excel(name = "操作人")
    private String operator;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date operateTime;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createUser;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName;
    }

    public String getCustomerName() 
    {
        return customerName;
    }
    public void setComponentNo(String componentNo) 
    {
        this.componentNo = componentNo;
    }

    public String getComponentNo() 
    {
        return componentNo;
    }
    public void setComponentMaterial(String componentMaterial) 
    {
        this.componentMaterial = componentMaterial;
    }

    public String getComponentMaterial() 
    {
        return componentMaterial;
    }
    public void setComponentHardness(String componentHardness) 
    {
        this.componentHardness = componentHardness;
    }

    public String getComponentHardness() 
    {
        return componentHardness;
    }
    public void setComponentTechnology(String componentTechnology) 
    {
        this.componentTechnology = componentTechnology;
    }

    public String getComponentTechnology() 
    {
        return componentTechnology;
    }
    public void setHoleModel(String holeModel) 
    {
        this.holeModel = holeModel;
    }

    public String getHoleModel() 
    {
        return holeModel;
    }
    public void setHoleDiameter(String holeDiameter) 
    {
        this.holeDiameter = holeDiameter;
    }

    public String getHoleDiameter() 
    {
        return holeDiameter;
    }
    public void setHoleLength(String holeLength) 
    {
        this.holeLength = holeLength;
    }

    public String getHoleLength() 
    {
        return holeLength;
    }
    public void setRoundness(String roundness) 
    {
        this.roundness = roundness;
    }

    public String getRoundness() 
    {
        return roundness;
    }
    public void setCylindricity(String cylindricity) 
    {
        this.cylindricity = cylindricity;
    }

    public String getCylindricity() 
    {
        return cylindricity;
    }
    public void setRoughness(String roughness) 
    {
        this.roughness = roughness;
    }

    public String getRoughness() 
    {
        return roughness;
    }
    public void setProcess(String process) 
    {
        this.process = process;
    }

    public String getProcess() 
    {
        return process;
    }
    public void setProcessAllowance(String processAllowance) 
    {
        this.processAllowance = processAllowance;
    }

    public String getProcessAllowance() 
    {
        return processAllowance;
    }
    public void setRequireTime(String requireTime) 
    {
        this.requireTime = requireTime;
    }

    public String getRequireTime() 
    {
        return requireTime;
    }
    public void setToolNo(String toolNo) 
    {
        this.toolNo = toolNo;
    }

    public String getToolNo() 
    {
        return toolNo;
    }
    public void setStripNo(String stripNo) 
    {
        this.stripNo = stripNo;
    }

    public String getStripNo() 
    {
        return stripNo;
    }
    public void setBoningDuration(String boningDuration) 
    {
        this.boningDuration = boningDuration;
    }

    public String getBoningDuration() 
    {
        return boningDuration;
    }
    public void setRealRoundness(String realRoundness) 
    {
        this.realRoundness = realRoundness;
    }

    public String getRealRoundness() 
    {
        return realRoundness;
    }
    public void setRealCylindricity(String realCylindricity) 
    {
        this.realCylindricity = realCylindricity;
    }

    public String getRealCylindricity() 
    {
        return realCylindricity;
    }
    public void setRealRoughness(String realRoughness) 
    {
        this.realRoughness = realRoughness;
    }

    public String getRealRoughness() 
    {
        return realRoughness;
    }
    public void setEquipmentNo(String equipmentNo) 
    {
        this.equipmentNo = equipmentNo;
    }

    public String getEquipmentNo() 
    {
        return equipmentNo;
    }
    public void setOperator(String operator) 
    {
        this.operator = operator;
    }

    public String getOperator() 
    {
        return operator;
    }
    public void setOperateTime(Date operateTime) 
    {
        this.operateTime = operateTime;
    }

    public Date getOperateTime() 
    {
        return operateTime;
    }
    public void setCreateUser(String createUser) 
    {
        this.createUser = createUser;
    }

    public String getCreateUser() 
    {
        return createUser;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("customerName", getCustomerName())
            .append("componentNo", getComponentNo())
            .append("componentMaterial", getComponentMaterial())
            .append("componentHardness", getComponentHardness())
            .append("componentTechnology", getComponentTechnology())
            .append("holeModel", getHoleModel())
            .append("holeDiameter", getHoleDiameter())
            .append("holeLength", getHoleLength())
            .append("roundness", getRoundness())
            .append("cylindricity", getCylindricity())
            .append("roughness", getRoughness())
            .append("process", getProcess())
            .append("processAllowance", getProcessAllowance())
            .append("requireTime", getRequireTime())
            .append("toolNo", getToolNo())
            .append("stripNo", getStripNo())
            .append("boningDuration", getBoningDuration())
            .append("realRoundness", getRealRoundness())
            .append("realCylindricity", getRealCylindricity())
            .append("realRoughness", getRealRoughness())
            .append("equipmentNo", getEquipmentNo())
            .append("operator", getOperator())
            .append("operateTime", getOperateTime())
            .append("createTime", getCreateTime())
            .append("createUser", getCreateUser())
            .toString();
    }
}
