/* create a program that computes the distance an object will
 * fall in Earth's gravity
 */



class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81;  // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double fallingTimeSquared = Math.pow(fallingTime, 2);
        double initialPosition = 0.0;
        double finalPosition = (0.5 * gravity * fallingTimeSquared) 
        						+ (initialVelocity * fallingTime)
        						+ initialPosition;
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }
} 