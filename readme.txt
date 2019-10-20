		普通配置：
		复制文件到编译目录：
			slf4j-api-1.7.x.jar
			logback-classic-1.2.x.jar
			logback-core-1.2.x.jar
			然后设置classpath为该目录编译类似46
		eclipse配置：
			项目新建lib->复制文件到lib
			slf4j-api-1.7.x.jar
			logback-classic-1.2.x.jar
			logback-core-1.2.x.jar
			->右键项目点击BuildPath->configure BuildPath>Library->点击classpath->AddJARs选择即可
			
			slf4j：
			import org.slf4j.Logger;
			import org.slf4j.LoggerFactory;
		maven配置：
		        <dependency>
			    <groupId>log4j</groupId>
			    <artifactId>log4j</artifactId>
			    <version>1.2.17</version>
			</dependency>
			<!-- log -->
			<!-- https://mvnrepository.com/artifact/org.slf4j/slf4j-api -->
			<dependency>
			    <groupId>org.slf4j</groupId>
			    <artifactId>slf4j-api</artifactId>
			    <version>1.7.25</version>
			</dependency>
			<!-- https://mvnrepository.com/artifact/org.slf4j/slf4j-log4j12 -->
			<dependency>
			    <groupId>org.slf4j</groupId>
			    <artifactId>slf4j-log4j12</artifactId>
			    <version>1.7.25</version>
			    <!-- <scope>test</scope> -->
			</dependency>
