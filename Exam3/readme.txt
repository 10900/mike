����maven����
mvn archetype:generate -DgroupId=com.hand -DartifactId=Exam3 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=internal

����·���±�������
cd Exam3

mvn clean compile exec:java -Dexec.mainClass="com.hand.App" -Dexec.args="arg0 arg1 arg2"

