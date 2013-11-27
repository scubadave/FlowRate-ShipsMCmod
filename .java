*/
import java.lang.Math;
import java.util.*;
import java.io.*;
import java.text.*

class FlowRate-ShipsMCmod {

    public static void main( String args[] ) {
int main()
{
    float diameter;
    float velocity;
    float area;
    float q;
    float pi=3.1415;
    printf("Enter diameter in meters: ");
    scanf("%f",&diameter);
    printf("\nEnter velocity in meters per second : ");
    scanf("%f",&velocity);
    area=(pi*diameter*2)/4;
    q=area*velocity;
    printf("\n\nVolume flow rate q = %.2f",q);
    system("pause");
    return 0;
}
