package com.ruoyi.business.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.business.mapper.ComponentInfoMapper;
import com.ruoyi.business.domain.ComponentInfo;
import com.ruoyi.business.service.IComponentInfoService;

/**
 * 零件信息Service业务层处理
 * 
 * @author sjw
 * @date 2023-07-19
 */
@Service
public class ComponentInfoServiceImpl implements IComponentInfoService 
{
    @Autowired
    private ComponentInfoMapper componentInfoMapper;

    /**
     * 查询零件信息
     * 
     * @param id 零件信息主键
     * @return 零件信息
     */
    @Override
    public ComponentInfo selectComponentInfoById(Long id)
    {
        return componentInfoMapper.selectComponentInfoById(id);
    }

    /**
     * 查询零件信息列表
     * 
     * @param componentInfo 零件信息
     * @return 零件信息
     */
    @Override
    public List<ComponentInfo> selectComponentInfoList(ComponentInfo componentInfo)
    {
        return componentInfoMapper.selectComponentInfoList(componentInfo);
    }

    /**
     * 新增零件信息
     * 
     * @param componentInfo 零件信息
     * @return 结果
     */
    @Override
    public int insertComponentInfo(ComponentInfo componentInfo)
    {
        componentInfo.setCreateTime(DateUtils.getNowDate());
        return componentInfoMapper.insertComponentInfo(componentInfo);
    }

    /**
     * 修改零件信息
     * 
     * @param componentInfo 零件信息
     * @return 结果
     */
    @Override
    public int updateComponentInfo(ComponentInfo componentInfo)
    {
        return componentInfoMapper.updateComponentInfo(componentInfo);
    }

    /**
     * 批量删除零件信息
     * 
     * @param ids 需要删除的零件信息主键
     * @return 结果
     */
    @Override
    public int deleteComponentInfoByIds(Long[] ids)
    {
        return componentInfoMapper.deleteComponentInfoByIds(ids);
    }

    /**
     * 删除零件信息信息
     * 
     * @param id 零件信息主键
     * @return 结果
     */
    @Override
    public int deleteComponentInfoById(Long id)
    {
        return componentInfoMapper.deleteComponentInfoById(id);
    }
}
