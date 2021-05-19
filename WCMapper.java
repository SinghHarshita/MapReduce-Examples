// Importing libraries 
import java.io.IOException; 

import org.apache.hadoop.io.IntWritable; 
import org.apache.hadoop.io.LongWritable; 
import org.apache.hadoop.io.Text; 
import org.apache.hadoop.mapred.MapReduceBase; 
import org.apache.hadoop.mapred.Mapper; 
import org.apache.hadoop.mapred.OutputCollector; 
import org.apache.hadoop.mapred.Reporter; 
import org.apache.hadoop.mapreduce.Mapper.Context;


// Mapper Class
public class WCMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable> { 

	// Map function 
	public void map(LongWritable key, Text value, OutputCollector<Text,  
            IntWritable> output, Reporter rep) throws IOException
	{ 
		
		// Splitting the line on spaces
		String[] line = value.toString().split("\\s+"); 

		// Mapper Output Key-Value paris for Word Co-coccurrence
		for (int i = 0; i <  line.length - 1; i++) {
			if(line[i].length() > 0 && line[i+1].length() > 0) {
//				output.collect(new Text(line[i]), new Text(line[i+1]), new IntWritable(1));
				String segment = line[i] + "\t" + line[i+1];
				output.collect(new Text(segment), new IntWritable(1));
			}
		}
	} 
} 
