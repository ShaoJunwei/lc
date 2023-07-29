package com.ruoyi.business.mapper;

import java.util.List;
import com.ruoyi.business.domain.ComponentInfo;

/**
 * 零件信息Mapper接口
 * 
 * @author sjw
 * @date 2023-07-19
 */
public interface ComponentInfoMapper 
{
    /**
     * 查询零件信息
     * 
     * @param id 零件信息主键
     * @return 零件信息
     */
    public ComponentInfo selectComponentInfoById(Long id);

    /**
     * 查询零件信息列表
     * 
     * @param componentInfo 零件信息
     * @return 零件信息集合
     */
    public List<ComponentInfo> selectComponentInfoList(ComponentInfo componentInfo);

    /**
     * 新增零件信息
     * 
     * @param componentInfo 零件信息
     * @return 结果
     */
    public int insertComponentInfo(ComponentInfo componentInfo);

    /**
     * 修改零件信息
     * 
     * @param componentInfo 零件信息
     * @return 结果
     */
    public int updateComponentInfo(ComponentInfo componentInfo);

    /**
     * 删除零件信息
     * 
     * @param id 零件信息主键
     * @return 结果
     */
    public int deleteComponentInfoById(Long id);

    /**
     * 批量删除零件信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteComponentInfoByIds(Long[] ids);
}
