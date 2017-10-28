# spring_mybatis_mapper
# spring_mybatis_mapper
spring mybatis整合，这个案例是使用mapper代理方式，同时是针对批处理
http://blog.csdn.net/u013013553/article/details/78378763
它有：1 、dao方式的
     2 、mapper方式的，mapper方式里面
         1 针对单个接口配置
          <!-- 配置UserMapper代理类 -->
	<bean id="userMapper" class="org.mybatis.spring.mapper.MapperFactoryBean">
		<!-- 设置代理类的接口 -->
		<property name="mapperInterface" value="com.itheima.ms.mapper.UserMapper"></property>
		<!-- 依赖注入SqlSessionFactory -->
		<property name="sqlSessionFactory" ref="sqlSessionFactory"></property>
	</bean>
         2 针对批处理配置
          <!-- 批量配置mapper代理类，默认bean的id为类名首字母小写 -->
	<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
		<!-- 配置扫描的包 -->
		<property name="basePackage" value="com.itheima.ms.mapper"></property>

		<!-- 默认不需要配置SqlSessionFactory（只有一个SqlSessionFactory时），单独配置也可以 -->
		<property name="sqlSessionFactoryBeanName" value="sqlSessionFactory"></property>
	</bean>
一般整合中，applicationcontext.xml里面需要：
        1、设置数据源
        2、设置SqlSessionFactory
        3、设置mapper代理类，或者dao类
