
/**
 * Evaluates if the String is "Bob" or "Alice" are the input.  In that case it concatinates with a "Hello ".  Also evaluate if the String "Bobert" or 
 * "Alicia" are the input.  In that case the output is "I DON'T KNOW YOU, YOU ARE SCARY".  
 *
 * @author Chris Farmer
 * @version Version 1.1
 */
public class AliceAndBobEngine
{
    String result;
    
    AliceAndBobEngine(){
        result = "";
    }

    //HINT: LOOK AT THE TESTS TO SEE WHAT IS EXPECTED FOR DIFFERENT CONDITIONS
    public String evaluateAliceOrBob(String input)
    {
        if (input.equals("Alice") || input.equals("Bob")){
            return "Hello " + input;
        }
        else if (input.equals ("Bobert") || input.equals("Alicia")){
            return "I DON'T KNOW YOU, YOU ARE SCARY";
        }
        return result;
    }
}
