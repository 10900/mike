创建maven工程
mvn archetype:generate -DgroupId=com.hand -DartifactId=Exam1 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=internal

进入路径下编译运行
cd Exam1

mvn clean compile exec:java -Dexec.mainClass="com.hand.App" -Dexec.args="arg0 arg1 arg2"

