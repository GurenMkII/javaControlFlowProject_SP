import java.util.Scanner;

public class ScannerClass {

    public static void scannerGreeting(){
        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.printf("\nGreetings and salutations %s!!!\n", userName);
        System.out.println("Would you like to continue to the interactive portion of this program? (Y/N)");
        String yesCheck = "";
        boolean xCheck = true;
        do{
            String anslow = scanner.nextLine();
            String ans = anslow.toUpperCase();
            if (ans.equals("YES")||ans.equals("Y")){
                System.out.println("\nGreat choice! Lets continue!");
                yesCheck = "yes";
                break;
            } else if (ans.equals("NO")||ans.equals("N")){
                System.out.println("Please return later to complete the survey!\nHave a nice day.");
                break;
            } else {
                System.out.println("Sorry, no valid input detected...\nWould you like to continue to the interactive portion of this program? (Y/N)\n");
                xCheck = false;
            }
        }while(xCheck == false);

        

        String favPet;
        int favPetAge;
        int luckyNum;
        int favQuarterback = 1;
        int carNum = 1;
        String favAct;
        int randomNum;
        boolean repeat = false;

        if (yesCheck.equals("yes")){
            do{
                System.out.println("Please enter the name of your favorite pet.");
                favPet = scanner.nextLine();
                System.out.println("You entered '"+favPet+"'\n");
                System.out.println("Please enter the age of your favorite pet.");
                favPetAge = scanner.nextInt();
                System.out.println("You entered '"+favPetAge+"'\n");
                System.out.println("Please enter your lucky number.");
                luckyNum = scanner.nextInt();
                System.out.println("You entered '"+luckyNum+"'\n");
                System.out.println("Do you have a favorite quarterback? (Y/N)");
                    boolean qCheck = true;
                    do{
                        scanner.nextLine();
                        String ansQ = scanner.nextLine();
                        String qAns = ansQ.toUpperCase();
                        if (qAns.equals("YES")||qAns.equals("Y")){
                            System.out.println("\nWhat is your favorite quarterback jersey number? (numbers 1 to 19)");
                            favQuarterback = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("You entered '"+favQuarterback+"'\n");
                            break;
                        } else if (qAns.equals("NO")||qAns.equals("N")){
                            System.out.println("Alright, lets continue to the next question...\n");
                            break;
                        } else {
                            System.out.println("Sorry, no valid input detected...\nDo you have a favorite quarterback? (Y/N)\n");
                            qCheck = false;
                        }
                    }while(qCheck == false);
                    System.out.println("Do you have a car? (Y/N)");
                    boolean cCheck = true;
                    do{
                        String ansC = scanner.nextLine();
                        String cAns = ansC.toUpperCase();
                        if (cAns.equals("YES")||cAns.equals("Y")){
                            System.out.println("\nWhat is the two-digit model year of your car?\nExample: if you have 1998 Toyota Corolla enter '98', or '05' if it is 2005.");
                            String carNumStr = scanner.nextLine();
                            carNum = Integer.parseInt(carNumStr);
                            System.out.println("You entered '"+carNumStr+"'\n");
                            break;
                        } else if (cAns.equals("NO")||cAns.equals("N")){
                            System.out.println("Alright, lets continue to the next question...\n");
                            break;
                        } else {
                            System.out.println("Sorry, no valid input detected...\nDo you have a car? (Y/N)\n");
                            cCheck = false;
                        }
                    }while(cCheck == false);
                System.out.println("What is the first name of your favorite actor or actress?");
                favAct = scanner.nextLine();
                System.out.println("You entered '"+favAct+"'\n");
                System.out.println("Please enter a random number between 1 and 50.");
                randomNum = scanner.nextInt();
                System.out.println("You entered '"+randomNum+"'\n");
                
                
                int random1 = (int)(6*Math.random())+1;
                int random2 = (int)(10*Math.random())+1;
                int random3 = (int)(20*Math.random())+1;
                final int magicMax = 75;
                final int setMax = 65;
                final int setMin = 1;
                
                int numOne = 1;
                int numTwo = 1;
                int numThree = 1;
                int numFour = 1;
                int numFive = 1;
                int numMagic = 1;
                
                if (qCheck){
                    numMagic = favQuarterback * random1;
                    while(numMagic>magicMax){
                        numMagic -= 75;
                    }
                } else {
                    numMagic = luckyNum * random2;
                    while(numMagic>magicMax){
                        numMagic -= 75;
                    }
                }
                
                if (favPet.length()>2){
                    char blah = favPet.charAt(2);
                    int meh = (int)blah;
                    numOne = meh;
                    while (numOne>setMax){
                        numOne =(int)numOne/2;
                    }
                } else {
                    numOne = 42*random3;
                    while (numOne>setMax){
                        numOne =(int)numOne/2;
                    }
                }
                
                if (cCheck){
                    numTwo = carNum + luckyNum;
                    while (numTwo>setMax){
                        numTwo = (int)numTwo/2;
                    }
                } else {
                    numOne = 42*random3;
                    while (numOne>setMax){
                        numOne =(int)numOne/2;
                    }
                }
                
                numThree = randomNum - random3;
                while(numThree<setMin){
                    numThree += random2;
                }
                
                
                char blaah = favAct.charAt(0);
                int meeh = (int)blaah;
                numFour = meeh;
                while (numFour>setMax){
                    numFour = (int)numFour/2;
                }
                
                
                
                if (cCheck){
                    numFive = favPetAge + carNum;
                    while (numFive>setMax){
                        numTwo = (int)numTwo/2;
                    }
                } else {
                    numFive = favPetAge*42*random3;
                    while (numOne>setMax){
                        numOne =(int)numOne/2;
                    }
                }
                
                
                
                
                
                System.out.printf("\nLottery numbers: %d, %d, %d, %d, %d  Magic ball: %d\nUse at your own risk...\n", numOne, numTwo, numThree, numFour, numFive, numMagic);
                
                // After the numbers have been printed, ask the user if they would like to answer questions to generate another set of numbers.  If so, repeat the entire process.  If not, print a thank you message and exit.  
                System.out.println("Would you like to answer questions again to generate another set of numbers? (Y/N)");
                scanner.nextLine();
                boolean repeatCheck = true;
                do{
                        String repeatCheckAns = scanner.nextLine().toUpperCase();
                        if (repeatCheckAns.equals("YES")||repeatCheckAns.equals("Y")){
                            System.out.println("\nGreat choice! Lets continue!");
                            repeat = true;
                            break;
                        } else if (repeatCheckAns.equals("NO")||repeatCheckAns.equals("N")){
                            System.out.println("\nThan you for your time. Good luck with the lottery!\n");
                            repeat = false;
                            break;
                        } else {
                            System.out.println("Sorry, no valid input detected...\nWould you like to answer questions again to generate another set of numbers? (Y/N)\n");
                            repeatCheck = false;
                        }
                    } while (!repeatCheck);
                    
                } while (repeat);
                
            }
            
            scanner.close();
        }
        
    
}