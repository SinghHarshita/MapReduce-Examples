# MapReduce Word Co-occurrence
Word co-occurrence using MapReduce framework.

## How to execute the programs
1. Clone the repository.
2. Navigate to the working directory via the ternimal
3. Upload the dataset file (reviews.txt) to HDFS
```shell
 hdfs dfs -put reviews.txt / 
```
4. Compile each .java file
```shell
 javac -classpath 'hadoop classpath' *.java 
```
5. Create jar file
```shell
 jar cvf MRBasicWC.jar *.class
```
6. Submit a map reduce job to hadoop.
```shell
 hadoop jar MRBasicWC.jar WCDriver /reviews.txt WCOutput
```
7. View the output file using the following command :
```shell
 hadoop fs -cat WCOutput/part-00000
```
