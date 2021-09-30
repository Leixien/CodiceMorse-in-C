import java.util.*;
import java.io.*;


public class main
{
    // variable used to store the sentence to be decoded or encoded
    private String txt;

    char[] alfabeto = { 'a', 'b', 'c', 'd', 'e', 'f',
                        'g', 'h', 'i', 'j', 'k', 'l',
                        'm', 'n', 'o', 'p', 'q', 'r',
                        's', 't', 'u', 'v', 'w', 'x',
                        'y', 'z', '1', '2', '3', '4',
                        '5', '6', '7', '8', '9', '0' };

    String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
                       ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                       "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                       "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                       "-----", "--..--", ".-.-.-", "..--.." };


    
    public main()
    {
        txt = "";
        
        richiestaFrase();
    }


    public void richiestaFrase(){

        Scanner input = new Scanner(System.in);

        System.out.println(" Please enter what you would like translate ");
        System.out.println("       into Morse Code or vice-versa. ");
        System.out.println(" ============================================ ");

        txt = input.nextLine();

        if(txt.charAt(1) == '-' || txt.charAt(1) == '.'){

            morseToText();

        }else{

            textToMorse();

        }
        
        System.out.println();

        txt = txt.toLowerCase();

        //System.out.println(txt);

    }

    public void morseToText(){

        int i = 0, j = 0;

        //the function object.split() is used to split the string into an array of strings using a metacharacter 
        //for morse code obviously empty space
        String[] arrayCode = txt.split(" ");

        System.out.print("Morse Code --> " + txt + " --> to text is --> ");

        for(i = 0; i < arrayCode.length; i++){

            for(j = 0; j < morse.length; j++){

                if(arrayCode[i].compareTo(morse[j]) == 0){

                    System.out.print((char)(j + 'a') + "");

                    break;

                }

            }

        }


    }

    public void textToMorse(){

        System.out.println("Text --> " + txt + " --> to Morse is --> ");

        int i = 0, j = 0;

        for( i = 0; i < txt.length(); i++ ){

            for( j = 0; j < alfabeto.length; j++){

                if(txt.charAt(i) == alfabeto[j]){

                    System.out.print(morse[j] + " ");

                    break;

                }

            }

        }

    }
}