(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-qicheguihai-add-or-update"],{"14e6":function(r,e,i){"use strict";i.r(e);var t=i("1f64"),o=i.n(t);for(var n in t)"default"!==n&&function(r){i.d(e,r,(function(){return t[r]}))}(n);e["default"]=o.a},"1f64":function(r,e,i){"use strict";var t=i("4ea4");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,i("ac6a"),i("96cf");var o=t(i("3b8d")),n=t(i("e2b1")),a={data:function(){return{ruleForm:{dingdanbianhao:"",qichemingcheng:"",qicheleixing:"",qichepinpai:"",chepai:"",guihaineirong:"",guihaishijian:"",yonghuming:"",xingming:"",shouji:"",sfsh:"",shhf:"",userid:""},user:{},ro:{dingdanbianhao:!1,qichemingcheng:!1,qicheleixing:!1,qichepinpai:!1,chepai:!1,guihaineirong:!1,guihaishijian:!1,yonghuming:!1,xingming:!1,shouji:!1,sfsh:!1,shhf:!1,userid:!1}}},components:{wPicker:n.default},computed:{},onLoad:function(){var r=(0,o.default)(regeneratorRuntime.mark((function r(e){var i,t,o,n;return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return this.ruleForm.guihaishijian=this.$utils.getCurDateTime(),i=uni.getStorageSync("nowTable"),r.next=4,this.$api.session(i);case 4:if(t=r.sent,this.user=t.data,this.ruleForm.yonghuming=this.user.yonghuming,this.ruleForm.xingming=this.user.xingming,this.ruleForm.shouji=this.user.shouji,this.ruleForm.userid=uni.getStorageSync("userid"),e.refid&&(this.ruleForm.refid=e.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!e.id){r.next=17;break}return this.ruleForm.id=e.id,r.next=15,this.$api.info("qicheguihai",this.ruleForm.id);case 15:t=r.sent,this.ruleForm=t.data;case 17:if(!e.cross){r.next=68;break}o=uni.getStorageSync("crossObj"),r.t0=regeneratorRuntime.keys(o);case 20:if((r.t1=r.t0()).done){r.next=68;break}if(n=r.t1.value,"dingdanbianhao"!=n){r.next=26;break}return this.ruleForm.dingdanbianhao=o[n],this.ro.dingdanbianhao=!0,r.abrupt("continue",20);case 26:if("qichemingcheng"!=n){r.next=30;break}return this.ruleForm.qichemingcheng=o[n],this.ro.qichemingcheng=!0,r.abrupt("continue",20);case 30:if("qicheleixing"!=n){r.next=34;break}return this.ruleForm.qicheleixing=o[n],this.ro.qicheleixing=!0,r.abrupt("continue",20);case 34:if("qichepinpai"!=n){r.next=38;break}return this.ruleForm.qichepinpai=o[n],this.ro.qichepinpai=!0,r.abrupt("continue",20);case 38:if("chepai"!=n){r.next=42;break}return this.ruleForm.chepai=o[n],this.ro.chepai=!0,r.abrupt("continue",20);case 42:if("guihaineirong"!=n){r.next=46;break}return this.ruleForm.guihaineirong=o[n],this.ro.guihaineirong=!0,r.abrupt("continue",20);case 46:if("guihaishijian"!=n){r.next=50;break}return this.ruleForm.guihaishijian=o[n],this.ro.guihaishijian=!0,r.abrupt("continue",20);case 50:if("yonghuming"!=n){r.next=54;break}return this.ruleForm.yonghuming=o[n],this.ro.yonghuming=!0,r.abrupt("continue",20);case 54:if("xingming"!=n){r.next=58;break}return this.ruleForm.xingming=o[n],this.ro.xingming=!0,r.abrupt("continue",20);case 58:if("shouji"!=n){r.next=62;break}return this.ruleForm.shouji=o[n],this.ro.shouji=!0,r.abrupt("continue",20);case 62:if("userid"!=n){r.next=66;break}return this.ruleForm.userid=o[n],this.ro.userid=!0,r.abrupt("continue",20);case 66:r.next=20;break;case 68:this.styleChange();case 69:case"end":return r.stop()}}),r,this)})));function e(e){return r.apply(this,arguments)}return e}(),methods:{styleChange:function(){this.$nextTick((function(){}))},guihaishijianConfirm:function(r){console.log(r),this.ruleForm.guihaishijian=r.result,this.$forceUpdate()},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var r=(0,o.default)(regeneratorRuntime.mark((function r(){return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:if(!this.ruleForm.id){r.next=5;break}return r.next=3,this.$api.update("qicheguihai",this.ruleForm);case 3:r.next=7;break;case 5:return r.next=7,this.$api.add("qicheguihai",this.ruleForm);case 7:this.$utils.msgBack("提交成功");case 8:case"end":return r.stop()}}),r,this)})));function e(){return r.apply(this,arguments)}return e}(),optionsChange:function(r){this.index=r.target.value},bindDateChange:function(r){this.date=r.target.value},getDate:function(r){var e=new Date,i=e.getFullYear(),t=e.getMonth()+1,o=e.getDate();return"start"===r?i-=60:"end"===r&&(i+=2),t=t>9?t:"0"+t,o=o>9?o:"0"+o,"".concat(i,"-").concat(t,"-").concat(o)},toggleTab:function(r){this.$refs[r].show()}}};e.default=a},"203b":function(r,e,i){"use strict";var t=i("884f"),o=i.n(t);o.a},"7b9b":function(r,e,i){"use strict";i.r(e);var t=i("a880"),o=i("14e6");for(var n in o)"default"!==n&&function(r){i.d(e,r,(function(){return o[r]}))}(n);i("203b");var a,l=i("f0c5"),u=Object(l["a"])(o["default"],t["b"],t["c"],!1,null,"310cc1be",null,!1,t["a"],a);e["default"]=u.exports},"884f":function(r,e,i){var t=i("adb5");"string"===typeof t&&(t=[[r.i,t,""]]),t.locals&&(r.exports=t.locals);var o=i("4f06").default;o("c25f37a6",t,!0,{sourceMap:!1,shadowMode:!1})},a880:function(r,e,i){"use strict";var t={"w-picker":i("e2b1").default},o=function(){var r=this,e=r.$createElement,i=r._self._c||e;return i("v-uni-view",{staticClass:"content"},[i("v-uni-form",{staticClass:"app-update-pv"},[i("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(51, 51, 51, 1)",textAlign:"center"}},[r._v("订单编号")]),i("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"8rpx",color:"rgba(51, 51, 51, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"26rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.dingdanbianhao,placeholder:"订单编号"},model:{value:r.ruleForm.dingdanbianhao,callback:function(e){r.$set(r.ruleForm,"dingdanbianhao",e)},expression:"ruleForm.dingdanbianhao"}})],1),i("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(51, 51, 51, 1)",textAlign:"center"}},[r._v("汽车名称")]),i("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"8rpx",color:"rgba(51, 51, 51, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"26rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.qichemingcheng,placeholder:"汽车名称"},model:{value:r.ruleForm.qichemingcheng,callback:function(e){r.$set(r.ruleForm,"qichemingcheng",e)},expression:"ruleForm.qichemingcheng"}})],1),i("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(51, 51, 51, 1)",textAlign:"center"}},[r._v("汽车类型")]),i("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"8rpx",color:"rgba(51, 51, 51, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"26rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.qicheleixing,placeholder:"汽车类型"},model:{value:r.ruleForm.qicheleixing,callback:function(e){r.$set(r.ruleForm,"qicheleixing",e)},expression:"ruleForm.qicheleixing"}})],1),i("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(51, 51, 51, 1)",textAlign:"center"}},[r._v("汽车品牌")]),i("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"8rpx",color:"rgba(51, 51, 51, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"26rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.qichepinpai,placeholder:"汽车品牌"},model:{value:r.ruleForm.qichepinpai,callback:function(e){r.$set(r.ruleForm,"qichepinpai",e)},expression:"ruleForm.qichepinpai"}})],1),i("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(51, 51, 51, 1)",textAlign:"center"}},[r._v("车牌")]),i("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"8rpx",color:"rgba(51, 51, 51, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"26rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.chepai,placeholder:"车牌"},model:{value:r.ruleForm.chepai,callback:function(e){r.$set(r.ruleForm,"chepai",e)},expression:"ruleForm.chepai"}})],1),i("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(51, 51, 51, 1)",textAlign:"center"}},[r._v("归还时间")]),i("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"8rpx",color:"rgba(51, 51, 51, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"26rpx",borderStyle:"solid",height:"60rpx"},attrs:{placeholder:"归还时间"},on:{click:function(e){arguments[0]=e=r.$handleEvent(e),r.toggleTab("guihaishijian")}},model:{value:r.ruleForm.guihaishijian,callback:function(e){r.$set(r.ruleForm,"guihaishijian",e)},expression:"ruleForm.guihaishijian"}})],1),i("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(51, 51, 51, 1)",textAlign:"center"}},[r._v("用户名")]),i("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"8rpx",color:"rgba(51, 51, 51, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"26rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.yonghuming,placeholder:"用户名"},model:{value:r.ruleForm.yonghuming,callback:function(e){r.$set(r.ruleForm,"yonghuming",e)},expression:"ruleForm.yonghuming"}})],1),i("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(51, 51, 51, 1)",textAlign:"center"}},[r._v("姓名")]),i("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"8rpx",color:"rgba(51, 51, 51, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"26rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.xingming,placeholder:"姓名"},model:{value:r.ruleForm.xingming,callback:function(e){r.$set(r.ruleForm,"xingming",e)},expression:"ruleForm.xingming"}})],1),i("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(51, 51, 51, 1)",textAlign:"center"}},[r._v("手机")]),i("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"8rpx",color:"rgba(51, 51, 51, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"26rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.shouji,placeholder:"手机"},model:{value:r.ruleForm.shouji,callback:function(e){r.$set(r.ruleForm,"shouji",e)},expression:"ruleForm.shouji"}})],1),i("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"308rpx"}},[i("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(51, 51, 51, 1)",textAlign:"center"}},[r._v("归还内容")]),i("v-uni-textarea",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"8rpx",color:"rgba(51, 51, 51, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"26rpx",borderStyle:"solid",height:"280rpx"},attrs:{placeholder:"归还内容"},model:{value:r.ruleForm.guihaineirong,callback:function(e){r.$set(r.ruleForm,"guihaineirong",e)},expression:"ruleForm.guihaineirong"}})],1),i("v-uni-view",{staticClass:"btn"},[i("v-uni-button",{staticClass:"bg-red",style:{boxShadow:"0 0 0px rgba(0,0,0,0) inset",backgroundColor:"rgba(215, 148, 104, 1)",borderColor:"#409EFF",borderRadius:"8rpx",color:"#fff",borderWidth:"0",width:"80%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},on:{click:function(e){arguments[0]=e=r.$handleEvent(e),r.onSubmitTap.apply(void 0,arguments)}}},[r._v("提交")])],1)],1),i("w-picker",{ref:"guihaishijian",attrs:{mode:"dateTime",step:"1",current:!1,hasSecond:!1,themeColor:"#333333"},on:{confirm:function(e){arguments[0]=e=r.$handleEvent(e),r.guihaishijianConfirm.apply(void 0,arguments)}}})],1)},n=[];i.d(e,"b",(function(){return o})),i.d(e,"c",(function(){return n})),i.d(e,"a",(function(){return t}))},adb5:function(r,e,i){var t=i("24fb");e=t(!1),e.push([r.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.container[data-v-310cc1be]{padding:%?20?%}.content[data-v-310cc1be]:after{position:fixed;top:0;right:0;left:0;bottom:0;content:"";background-attachment:fixed;background-size:cover;background-position:50%}uni-textarea[data-v-310cc1be]{border:%?1?% solid #eee;border-radius:%?20?%;padding:%?20?%}.title[data-v-310cc1be]{width:%?180?%}.avator[data-v-310cc1be]{width:%?150?%;height:%?60?%}.right-input[data-v-310cc1be]{-webkit-box-flex:1;-webkit-flex:1;flex:1;text-align:left;padding:0 %?24?%}.cu-form-group.active[data-v-310cc1be]{-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between}.btn[data-v-310cc1be]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;-webkit-flex-wrap:wrap;flex-wrap:wrap;padding:%?20?% 0}.cu-form-group[data-v-310cc1be]{padding:0 %?24?%;background-color:initial;min-height:inherit}.cu-form-group + .cu-form-group[data-v-310cc1be]{border:0}.cu-form-group uni-input[data-v-310cc1be]{padding:0 %?30?%}.uni-input[data-v-310cc1be]{padding:0 %?30?%}.cu-form-group uni-textarea[data-v-310cc1be]{padding:%?30?%;margin:0}.cu-form-group uni-picker[data-v-310cc1be]::after{line-height:%?60?%}.select .uni-input[data-v-310cc1be]{line-height:%?60?%}.input .right-input[data-v-310cc1be]{line-height:%?60?%}',""]),r.exports=e}}]);