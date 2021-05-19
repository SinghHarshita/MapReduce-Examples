# MapReduce Matrix Multiplication
Word co-occurrence using MapReduce framework.

## How to execute the programs
1. Clone the repository.
2. Navigate to the working directory via the ternimal
3. Upload the dataset file (reviews.txt) to HDFS
```shell
 hdfs dfs -put matrices / 
```
4. Compile each .java file
```shell
 javac -classpath 'hadoop classpath' *.java 
```
5. Create jar file
```shell
 jar cvf MRAdvancedMM.jar *.class
```
6. Submit a map reduce job to hadoop.
```shell
 hadoop jar MRAdvancedMM.jar MMDriver /matrices MRAdvancedMMOutput
```
7. View the output file using the following command :
```shell
 hdfs dfs -cat MRAdvancedMMOutput/part-r-00000
```

## Dataset Used
Used 1000 x 100 matrix M and 100 x 1000 matrix N with sparsity level of 0.3. This means each matrix has about 30K entries. 