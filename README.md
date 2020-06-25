## 平台简介

* 采用前后端分离的模式，微服务版本前端(基于 [hk-Vue](https://gitee.com/y_project/hk-Vue))。
* 后端采用Spring Boot、Spring Cloud & Alibaba。
* 注册中心、配置中心选型Nacos，权限认证使用OAuth2。
* 流量控制框架选型Sentinel。
* 感谢[hk-cloud-design](https://gitee.com/zhangmrit/hk-cloud)，[pig](https://gitee.com/log4j/pig)。
* 如需不分离应用，请移步 [hk](https://gitee.com/y_project/hk)，如需分离应用，请移步 [hk-Vue](https://gitee.com/y_project/hk-Vue)
* 阿里云优惠券：[点我进入](https://www.aliyun.com/minisite/goods?userCode=brki8iof&share_source=copy_link)，腾讯云优惠券：[点我领取](https://cloud.tencent.com/redirect.php?redirect=1025&cps_key=198c8df2ed259157187173bc7f4f32fd&from=console)&nbsp;&nbsp;


## 系统模块

~~~
com.hk     
├── hk-ui              // 前端框架 [80]
├── hk-gateway         // 网关模块 [8080]
├── hk-auth            // 认证中心 [9200]
├── hk-api             // 接口模块
│       └── hk-api-system                          // 系统接口
├── hk-common          // 通用模块
│       └── hk-common-core                         // 核心模块
│       └── hk-common-datascope                    // 权限范围
│       └── hk-common-log                          // 日志记录
│       └── hk-common-redis                        // 缓存服务
│       └── hk-common-security                     // 安全模块
│       └── hk-common-swagger                      // 系统接口
├── hk-modules         // 业务模块
│       └── hk-modules-system                              // 系统模块 [9201]
│       └── hk-modules-gen                                 // 代码生成 [9202]
│       └── hk-modules-job                                 // 定时任务 [9203]
├── hk-visual          // 图形化管理模块
│       └── hk-visual-monitor                      // 监控中心 [9100]
├──pom.xml                // 公共依赖
~~~

## 架构图

<img src="https://oscimg.oschina.net/oscnet/up-aaa2d885b0fba37e52b56f0948edde1c4fe.png"/>

## 内置功能

1.  用户管理：用户是系统操作者，该功能主要完成系统用户配置。
2.  部门管理：配置系统组织机构（公司、部门、小组），树结构展现支持数据权限。
3.  岗位管理：配置系统用户所属担任职务。
4.  菜单管理：配置系统菜单，操作权限，按钮权限标识等。
5.  角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。
6.  字典管理：对系统中经常使用的一些较为固定的数据进行维护。
7.  参数管理：对系统动态配置常用参数。
8.  通知公告：系统通知公告信息发布维护。
9.  操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。
10. 登录日志：系统登录日志记录查询包含登录异常。
11. 在线用户：当前系统中活跃用户状态监控。
12. 定时任务：在线（添加、修改、删除)任务调度包含执行结果日志。
13. 代码生成：前后端代码的生成（java、html、xml、sql）支持CRUD下载 。
14. 系统接口：根据业务代码自动生成相关的api接口文档。
15. 服务监控：监视当前系统CPU、内存、磁盘、堆栈等相关信息。
16. 在线构建器：拖动表单元素生成相应的HTML代码。
17. 连接池监视：监视当前系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈。

## 在线体验

- admin/admin123  
- 陆陆续续收到一些打赏，为了更好的体验已用于演示服务器升级。谢谢各位小伙伴。

演示地址：http://hk.vip  
文档地址：http://doc.hk.vip
