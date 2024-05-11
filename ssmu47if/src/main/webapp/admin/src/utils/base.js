const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmu47if/",
            name: "ssmu47if",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmu47if/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "微信小程序小区租拼车管理信息系统"
        } 
    }
}
export default base
