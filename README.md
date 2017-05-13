# onlineMarket-backend
## 使用技术
* Java web 
* Bootstrap
## 环境使用
* Jdk 1.8 
* Tomcat 9.0
* eclipse
* Sql Server数据库
## 分工
* 买家方
* 卖家方
* 后台管理方  
三部分 ,三组负责买家方（工作分别为：个人信息管理以及购买物品管理宣传的照片，）、二组负责卖家方、一组负责后台管理、一组负责注册与登录的实现
## 三组负责买家方,工作分别为
1. 个人信息管理以及购买物品管理宣传的照片,见`/src/webapp/buy/buyMain.jsp` 第一部分
2. 按照类别搜索、按照具体东西搜索见 `/src/webapp/buy/buyMain.jsp` 第二部分 
3. 显示产品介绍，包括类别，定价等，以及进行购买  见 `/src/webapp/buy/buyMain.jsp` 
### 第三部分
二组负责卖家方,工作分别为：
1. 商品的管理，发布，删除，修改  见`/src/webapp/sale/saleMain.jsp` 第一部分
2. 新的订单，进行发货处理，订单查询  见`/src/webapp/sale/saleMain.jsp` 第一部分
一组负责后台管理：对总的数据进行汇总
### 最后一组：
* 负责注册与登录的实现以及一些网站介绍与友情链接  `/src/webapp/buy/buyMain.jsp` 
### 第四部分                                              
#### 目录说明 ：
1.    * `onlineMarket-backend/src/webapp/WEB-INF/index.jsp` 为登录首页
      * `onlineMarket-backend/src/webapp/buy` 为买家部分`jsp`代码目录，所用到的jsp
      * `onlineMarket-backend/src/webapp/buy/buyMain.jsp` 为买家登录后的首页
      * `onlineMarket-backend/src/webapp/sale` 为卖家部分`jsp`代码目录
      * `onlineMarket-backend/src/webapp/sale/saleMain.jsp` 为卖家登录后的首页
      * `onlineMarket-backend/src/webapp/manage` 为后台管理部分`jsp`代码目录
      * `onlineMarket-backend/src/webapp/sale/manageMain.jsp` 为后台管理登录后的首页
2. 
      * `onlineMarket-backend/src/webapp/resources/image` 用到所有的图片放在此处，命名规则：买方图片以`buy`开头，卖方以`sale`开头，后台管理方以`admin`开头。
     *  `resources`文件夹下部署有`angularjs`、`bootstrap`与`jQuery`，有需要可以直接调用
3. 
     *  `onlineMarket-backend/src/com/backend/defaultEnd`为登录时处理的`servlet`文件包，所有的登录部分处理文件放在此包
      * `onlineMarket-backend/src/com/backend/buyerEnd`为买方处理的`servlet`文件包，所有的买方部分处理文件放在此包
      * `onlineMarket-backend/src/com/backend/sellerEnd`为卖方处理的`servlet`文件包，所有的卖方部分处理文件放在此包
      * `onlineMarket-backend/src/com/backend/adminEnd`为后台处理的`servlet`文件包，所有的后台部分处理文件放在此包
      * 如果技术条件允许请使用部署文件方式配置`servlet`，即修改`web.xml`进行路由，谢谢！！！不会的翻教科书。
#### 补充说明：
1. 根据数据库表，都会用到的数据进行了封装，类中包括数据库中所用到的所有变量，以及常用函数，在`com.backend.defaultEnd`包里
    1. `Goods`类，为商品类，对应于数据库`Goods`表
    2. `Order`类，为订单类，对应于数据库表`Order`表
    3. `User`类，为用户类，对应于数据库`User`表
    4. `Composition`类，为构成类，对应于数据库`composition`表
    5. `Dao`类，访问数据库类，连接数据库时可使用，例：见`login.java`以及`register.java`
2. 登录用户名可以自己注册或者使用已注册用户名：`ttt` 密码：`123456`
3. 以登录为例，流程图：`index.jsp`-->`login.java`-->(访问数据库验证)-->根据不同类别分别进入`buyMain.jsp\saleMain.jsp\adminMain.jsp`
4. 对不同组配置了不同的`branch`，请自行百度使用方式，切忌直接在`master branch`上改动，切忌直接在`master branch`上改动，切忌直接在`master branch`上改动！！！
