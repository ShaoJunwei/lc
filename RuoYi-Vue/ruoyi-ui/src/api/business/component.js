import request from '@/utils/request'

// 查询零件信息列表
export function listComponent(query) {
  return request({
    url: '/business/component/list',
    method: 'get',
    params: query
  })
}

// 查询零件信息详细
export function getComponent(id) {
  return request({
    url: '/business/component/' + id,
    method: 'get'
  })
}

// 新增零件信息
export function addComponent(data) {
  return request({
    url: '/business/component',
    method: 'post',
    data: data
  })
}

// 修改零件信息
export function updateComponent(data) {
  return request({
    url: '/business/component',
    method: 'put',
    data: data
  })
}

// 删除零件信息
export function delComponent(id) {
  return request({
    url: '/business/component/' + id,
    method: 'delete'
  })
}
