<template>
	<view class="content">
		<form class="app-update-pv">
			
			<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left"}' class="title">汽车名称</view>
				<picker @change="qichemingchengChange" :value="qichemingchengIndex" :range="qichemingchengOptions">
					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0,0,0,.6)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' class="uni-input">{{qichemingchengOptions[qichemingchengIndex]}}</view>
				</picker>
			</view>
			<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">汽车类型</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0,0,0,.6)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.qicheleixing" v-model="ruleForm.qicheleixing" placeholder="汽车类型"></input>
			</view>
			<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">汽车品牌</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0,0,0,.6)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.qichepinpai" v-model="ruleForm.qichepinpai" placeholder="汽车品牌"></input>
			</view>
			<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">车牌</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0,0,0,.6)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.chepai" v-model="ruleForm.chepai" placeholder="车牌"></input>
			</view>
			<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">入库时间</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0,0,0,.6)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' v-model="ruleForm.rukushijian" placeholder="入库时间" @tap="toggleTab('rukushijian')"></input>
			</view>
			
			<!-- 否 -->
 

			<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"308rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">入库内容</view>
				<textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0,0,0,.6)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"280rpx"}' v-model="ruleForm.rukuneirong" placeholder="入库内容"></textarea>
			</view>
			
			
			<view class="btn">
				<button :style='{"boxShadow":"0 0 0px rgba(0,0,0,0) inset","backgroundColor":"rgba(215, 148, 104, 1)","borderColor":"#409EFF","borderRadius":"8rpx","color":"#fff","borderWidth":"0","width":"80%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="rukushijianConfirm" ref="rukushijian" themeColor="#333333"></w-picker>
			
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				ruleForm: {
				qichemingcheng: '',
				qicheleixing: '',
				qichepinpai: '',
				chepai: '',
				rukushijian: '',
				rukuneirong: '',
				},
				qichemingchengOptions: [],
				qichemingchengIndex: 0,
				// 登陆用户信息
				user: {},
                                ro:{
                                   qichemingcheng : false,
                                   qicheleixing : false,
                                   qichepinpai : false,
                                   chepai : false,
                                   rukushijian : false,
                                   rukuneirong : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
			
			
			
			
			
			
		},
		async onLoad(options) {
        		this.ruleForm.rukushijian = this.$utils.getCurDateTime();

			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取

			// 下2
			res = await this.$api.option(`qichexinxi`,`qichemingcheng`,{});
			this.qichemingchengOptions = res.data;

			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`qicheruku`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='qichemingcheng'){
					this.ruleForm.qichemingcheng = obj[o];
					this.ro.qichemingcheng = true;
					continue;
					}
					if(o=='qicheleixing'){
					this.ruleForm.qicheleixing = obj[o];
					this.ro.qicheleixing = true;
					continue;
					}
					if(o=='qichepinpai'){
					this.ruleForm.qichepinpai = obj[o];
					this.ro.qichepinpai = true;
					continue;
					}
					if(o=='chepai'){
					this.ruleForm.chepai = obj[o];
					this.ro.chepai = true;
					continue;
					}
					if(o=='rukushijian'){
					this.ruleForm.rukushijian = obj[o];
					this.ro.rukushijian = true;
					continue;
					}
					if(o=='rukuneirong'){
					this.ruleForm.rukuneirong = obj[o];
					this.ro.rukuneirong = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},
			// 下二随
			async qichemingchengChange (e) {
				this.qichemingchengIndex = e.target.value
				this.ruleForm.qichemingcheng = this.qichemingchengOptions[this.qichemingchengIndex]
				let res = await this.$api.follow(`qichexinxi`, `qichemingcheng`,{
					columnValue: this.ruleForm.qichemingcheng
				});
				if(res.data.qicheleixing){
					this.ruleForm.qicheleixing = res.data.qicheleixing
				}
				if(res.data.qichepinpai){
					this.ruleForm.qichepinpai = res.data.qichepinpai
				}
				if(res.data.chepai){
					this.ruleForm.chepai = res.data.chepai
				}
			},

			// 多级联动参数


			// 日长控件选择日期时间
			rukushijianConfirm(val) {
				console.log(val)
				this.ruleForm.rukushijian = val.result;
				this.$forceUpdate();
			},



			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
				if(this.ruleForm.id){
					await this.$api.update(`qicheruku`, this.ruleForm);
				}else{
					await this.$api.add(`qicheruku`, this.ruleForm);
				}
				this.$utils.msgBack('提交成功');
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
		background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 60rpx;
	}
	
	.select .uni-input {
		line-height: 60rpx;
	}
	
	.input .right-input {
		line-height: 60rpx;
	}
</style>
