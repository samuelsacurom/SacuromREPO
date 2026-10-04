/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sacurom
 */

    public class counter 
{
    public static void main (String[] args)
    {

            System.out.println("Simple Java Word Count Program");

            String str1 = "Today is Holdiay Day";

            int wordCount = 1;

            for (int i = 0; i < str1.length(); i++) 
            {
                if (str1.charAt(i) == ' ') 
                {
                    wordCount++;
                } 
            }

            System.out.println("Word count is = " + wordCount);
    }
}

