/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texttospongebob;

/**
 *
 * @author Tim
 */
public class TextToSpongebob {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "Hello there, General Kenobi";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < input.length(); i++){
            if(i%2 == 0){
                sb.append(Character.toLowerCase(input.charAt(i)));
            }else{
                sb.append(Character.toUpperCase(input.charAt(i)));
            }
        }
        System.out.println("Your input was: " +input);
        System.out.println("Spongebob says: ");
        System.out.println(sb.toString());
    }
    
}
