����maven����
mvn archetype:generate -DgroupId=com.hand -DartifactId=Exam4 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=internal

����·���±�������
cd Exam4

mvn clean compile exec:java -Dexec.mainClass="com.hand.App" -Dexec.args="arg0 arg1 arg2"

