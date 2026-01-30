void main() {

    //problem5
/*
    System.out.print("Enter lenght of sides: ");
    Scanner side = new Scanner(System.in);
    float sside = side.nextInt();
    System.out.print("\nEnter lenght of height: ");
    Scanner height = new Scanner(System.in);
    float sheight = height.nextInt();


    double area = Math.sqrt(3)/4 * sside*sside;
    double volume = area * sheight;

    System.out.printf("There area is %.2f", area);
    System.out.printf("There volume of the Triangle prism %.2f", volume);
*/

    //problem6


    //problem 7
    /*
    System.out.print("Enter the distance: ");
    Scanner distance = new Scanner(System.in);
    float sdis = distance.nextFloat();
    System.out.print("\nEnter mile per gallon: ");
    Scanner gallon = new Scanner(System.in);
    float sgal = gallon.nextFloat();
    System.out.print("\nEnter price per gallon: ");
    Scanner price = new Scanner(System.in);
    float sprice = price.nextFloat();

    float total = sdis/sgal*sprice;
    System.out.print("\nTotal cost: "+total);
*/

    //problem 8
    /*
    System.out.print("Enter number: ");
    Scanner num = new Scanner(System.in);
    int snum = num.nextInt();

    int total = 0;

    for (int i = 0; i < 4; i++) {
        int temp = snum/10;
        total += snum - temp*10;
        snum = temp;
    }

    System.out.print("total: "+total);
*/


    //problem 9

    /*
    System.out.print("Enter number 1: ");
    Scanner num1 = new Scanner(System.in);
    int snum1 = num1.nextInt();

    System.out.print("Enter number 2: ");
    Scanner num2 = new Scanner(System.in);
    int snum2 = num2.nextInt();

    System.out.print("Enter number 3: ");
    Scanner num3 = new Scanner(System.in);
    int snum3 = num3.nextInt();

    int maxNum = 0, minNum = 0;

    //max function
    if(snum1 > snum2 && snum1 > snum3){
        maxNum = snum1;
    } else if (snum2 > snum1 && snum2 > snum3) {
        maxNum = snum2;
    } else if (snum3 > snum1 && snum3 > snum2) {
        maxNum = snum3;
    }


    //min function
    if(snum1 < snum2 && snum1 < snum3){
        minNum = snum1;
    } else if (snum2 < snum1 && snum2 < snum3) {
        minNum = snum2;
    } else if (snum3 < snum1 && snum3 < snum2) {
        minNum = snum3;
    }

    System.out.print("Max: "+maxNum+" Min: "+ minNum);

    int middleNum = (snum1+snum2+snum3)-(maxNum+minNum);
    System.out.print("\nMiddle num: "+middleNum);


     */
}
