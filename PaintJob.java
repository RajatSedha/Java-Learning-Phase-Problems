public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2)); // you can add your own parameters here
        System.out.println(getBucketCount(3.4, 2.1, 1.5));  // you can add your own parameters here
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;
        double newArea = area - (extraBuckets * areaPerBucket);
        newArea = newArea / areaPerBucket;
        return (int)Math.ceil(newArea);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        return (int) Math.ceil(area / areaPerBucket);
    }
}
