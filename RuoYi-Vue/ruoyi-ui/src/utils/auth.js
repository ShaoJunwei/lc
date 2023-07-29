import Cookies from 'js-cookie'

const TokenKey = 'Admin-Token'


export function getToken() {
  const token = localStorage.getItem(TokenKey)
  return token
}
export function setToken(token) {
  localStorage.setItem(TokenKey, token)
}
export function removeToken() {
  return localStorage.removeItem(TokenKey)
}
/*

export function getToken() {
  return Cookies.get(TokenKey)
}

export function setToken(token) {
  return Cookies.set(TokenKey, token)
}

export function removeToken() {
  return Cookies.remove(TokenKey)
}
*/
