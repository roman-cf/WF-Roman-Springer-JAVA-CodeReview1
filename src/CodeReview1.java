public class CodeReview1 {
    public static int width1;
    public static int height1;
    public static int width2;
    public static int height2;
    public static int widthS1;
    public static int widthS2;
    public static int widthArr[];
    public static int heightArr[];
    public static int resultsArr[];


    public static void main(String[] args) {
        width1 = 20;
        height1 = 30;
        width2 = 40;
        height2 = 50;
        widthS1 = 4;
        widthS2 = 2;
        widthArr = new int[]{10, 3, 5, 34, 17};
        heightArr = new int[]{3, 66, 15, 7, 17};
        resultsArr = new int[5];

        System.out.println("rectangle one has: "+ calculateRectArea(width1,height1)+" cm²");
        System.out.println("rectangle two has: "+ calculateRectArea(width2,height2)+" cm²");
        System.out.println("first square has an area of: " + squareArea(widthS1)+" cm²");
        System.out.println("second square has an area of: " + squareArea(widthS2)+" cm²");
        System.out.println("first square has a perimeter of: " + squarePerimeter(widthS1)+" cm");
        System.out.println("second square has a perimeter of: " + squarePerimeter(widthS2)+" cm");

        for(int i = 0; i < resultsArr.length; i++){
            resultsArr[i] = calculateRectArea(widthArr[i],heightArr[i]);
        }

        for(int i = 0; i < resultsArr.length; i++){
            System.out.println("Area "+(i+1)+" has: "+ resultsArr[i]+ " cm²");
        }
    }

    public static int calculateRectArea(int width, int height){
        return width*height;
    }

    public static int squareArea(int width){
        return width^2;
    }

    public static int squarePerimeter(int width){
        return width*4;
    }
}
