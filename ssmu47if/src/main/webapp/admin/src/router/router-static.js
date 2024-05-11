import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import qichepinche from '@/views/modules/qichepinche/list'
    import qicheruku from '@/views/modules/qicheruku/list'
    import qicheguihai from '@/views/modules/qicheguihai/list'
    import qichechuku from '@/views/modules/qichechuku/list'
    import discussqichexinxi from '@/views/modules/discussqichexinxi/list'
    import storeup from '@/views/modules/storeup/list'
    import qichezulin from '@/views/modules/qichezulin/list'
    import pinchexinxi from '@/views/modules/pinchexinxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import qichexinxi from '@/views/modules/qichexinxi/list'
    import messages from '@/views/modules/messages/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '新闻资讯',
        component: news
      }
      ,{
	path: '/qichepinche',
        name: '汽车拼车',
        component: qichepinche
      }
      ,{
	path: '/qicheruku',
        name: '汽车入库',
        component: qicheruku
      }
      ,{
	path: '/qicheguihai',
        name: '汽车归还',
        component: qicheguihai
      }
      ,{
	path: '/qichechuku',
        name: '汽车出库',
        component: qichechuku
      }
      ,{
	path: '/discussqichexinxi',
        name: '汽车信息评论',
        component: discussqichexinxi
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/qichezulin',
        name: '汽车租赁',
        component: qichezulin
      }
      ,{
	path: '/pinchexinxi',
        name: '拼车信息',
        component: pinchexinxi
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/qichexinxi',
        name: '汽车信息',
        component: qichexinxi
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
