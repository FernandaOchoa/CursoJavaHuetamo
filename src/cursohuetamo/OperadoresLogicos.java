package cursohuetamo;

public class OperadoresLogicos {

    public static void main(String[] args) {
        //a few numbers

        int i = 37;
        int j = 42;
        int k = 42;

        //print value of variables
        System.out.println("Variable values...");
        System.out.println(" i= " + i);
        System.out.println(" j= " + j);
        System.out.println(" k= " + k);

        //grater than
        System.out.println(" i>j= " + (i > j));
        System.out.println(" j>i= " + (j > i));
        System.out.println(" k>j= " + (k > j));

        //grater or equal
        System.out.println(" i>=j= " + (i >= j));
        System.out.println(" j>=i= " + (j >= i));
        System.out.println(" k>=j= " + (k >= j));

        //less than
        System.out.println(" i<j= " + (i < j));
        System.out.println(" j<i= " + (j < i));
        System.out.println(" k<j= " + (k < j));

        //less or equal
        System.out.println(" i<=j= " + (i <= j));
        System.out.println(" j<=i= " + (j <= i));
        System.out.println(" k<=j= " + (k <= j));

        //equal to
        System.out.println(" i==j= " + (i == j));
        System.out.println(" j==i= " + (j == i));
        System.out.println(" k==j= " + (k == j));

        //different to...
        System.out.println(" i!=j= " + (i != j));
        System.out.println(" j!=i= " + (j != i));
        System.out.println(" k!=j= " + (k != j));
    }

}
