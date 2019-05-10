import java.util.List;
import java.io.FileNotFoundException;
import java.util.Arrays;



public class kNNMain{

  public static void main(String... args) throws FileNotFoundException{

    // TASK 1: Use command line arguments to point DataSet.readDataSet method to
    // the desired file. Choose a given DataPoint, and print its features and label
		
		int dataPointNum = 5;
		List<DataPoint> dataset = DataSet.readDataSet("data/iris.csv");

        System.out.print("DataPoint #" + dataPointNum + " feature is: ");
        String printablex = Arrays.toString (dataset.get(dataPointNum).getX());
        System.out.println(printablex);
        System.out.print("DataPoint #" + dataPointNum + " label is: ");
        System.out.println(dataset.get(dataPointNum).getLabel());

    //TASK 2:Use the DataSet class to split the fullDataSet into Training and Held Out Test Dataset
	
		List<DataPoint> testSet= DataSet.getTrainingSet(dataset,0.8);
		List<DataPoint> trainingSet= DataSet.getTestSet(dataset,0.2);
	
    // TASK 4: write a new method in DataSet.java which takes as arguments two DataPoint objects,
    // and returns the Euclidean distance between those two points (as a double)
	
		double[] point1 = new double[2];
		
		point1[0] = 1; // X Value of Point 1
		point1[1] = 2; // Y value of Point 1
		
		double[] point2 = new double[2];
		
		point2[0] = 4; // X Value of Point 2
		point2[1] = 10; // Y value of Point 2
		
		
	
		DataPoint dp1 = new DataPoint ("Point 1", point1);
		
		DataPoint dp2 = new DataPoint ("Point 2", point2);
		
		System.out.println(DataSet.EuclideanDistance(dp1, dp2));

	
    // TASK 5: Use the KNNClassifier class to determine the k nearest neighbors to a given DataPoint,
    // and make a print a predicted target label



    // TASK 6: loop over the datapoints in the held out test set, and make predictions for Each
    // point based on nearest neighbors in training set. Calculate accuracy of model.


  }

}
