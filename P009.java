public class P009{

    public static void main(String []args){
        pythagoreanTriplet();
    }
    
    /*
    Little math if m and n are any two positive integers (m > n):
    a = m2 − n2
    b = 2mn
    c = m2 + n2
    then a, b, and c form a Pythagorean Triple.
    */
    public static void pythagoreanTriplet() {
        for(int m=1; m<=22;m++) {
            for(int n=1; n<=22; n++) {
                if((m*m+m*n)==500)
                 System.out.println((m*m-n*n)*(2*m*n)*(m*m+n*n));
            }
        }
       
    }
     
}
