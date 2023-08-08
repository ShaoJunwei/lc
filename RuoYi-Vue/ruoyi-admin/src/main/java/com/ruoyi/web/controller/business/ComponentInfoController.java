package com.ruoyi.web.controller.business;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.business.domain.ComponentInfo;
import com.ruoyi.business.service.IComponentInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 零件信息Controller
 * 
 * @author sjw
 * @date 2023-07-19
 */
@RestController
@RequestMapping("/business/component")
public class ComponentInfoController extends BaseController
{
    @Autowired
    private IComponentInfoService componentInfoService;

    /**
     * 查询零件信息列表
     */
    @PreAuthorize("@ss.hasPermi('business:component:list')")
    @GetMapping("/list")
    public TableDataInfo list(ComponentInfo componentInfo)
    {
        startPage();
        List<ComponentInfo> list = componentInfoService.selectComponentInfoList(componentInfo);
        return getDataTable(list);
    }

    /**
     * 导出零件信息列表
     */
    @PreAuthorize("@ss.hasPermi('business:component:export')")
    @Log(title = "零件信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ComponentInfo componentInfo)
    {
        List<ComponentInfo> list = componentInfoService.selectComponentInfoList(componentInfo);
        ExcelUtil<ComponentInfo> util = new ExcelUtil<ComponentInfo>(ComponentInfo.class);
        util.exportExcel(response, list, "零件信息数据");
    }

    /**
     * 导出零件信息列表
     */
    @PreAuthorize("@ss.hasPermi('business:component:export')")
    @Log(title = "零件信息", businessType = BusinessType.EXPORT)
    @PostMapping("/exportByMobile")
    public AjaxResult exportByMobile(HttpServletRequest request, ComponentInfo componentInfo)
    {
       String path = request.getContextPath();
        List<ComponentInfo> list = componentInfoService.selectComponentInfoList(componentInfo);
        ExcelUtil<ComponentInfo> util = new ExcelUtil<ComponentInfo>(ComponentInfo.class);
        return util.exportExcel(list, "零件信息数据");
    }

    /**
     * 获取零件信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('business:component:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(componentInfoService.selectComponentInfoById(id));
    }

    /**
     * 新增零件信息
     */
    @PreAuthorize("@ss.hasPermi('business:component:add')")
    @Log(title = "零件信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ComponentInfo componentInfo)
    {
        return toAjax(componentInfoService.insertComponentInfo(componentInfo));
    }

    /**
     * 修改零件信息
     */
    @PreAuthorize("@ss.hasPermi('business:component:edit')")
    @Log(title = "零件信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ComponentInfo componentInfo)
    {
        return toAjax(componentInfoService.updateComponentInfo(componentInfo));
    }

    /**
     * 删除零件信息
     */
    @PreAuthorize("@ss.hasPermi('business:component:remove')")
    @Log(title = "零件信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(componentInfoService.deleteComponentInfoByIds(ids));
    }
}
