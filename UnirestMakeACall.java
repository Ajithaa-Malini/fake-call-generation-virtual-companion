
package cyber;

/**
 *
 * @author Ajithaa Vanathi
 */

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class UnirestMakeCall {
    public static void main(String[] args) {
        try {
            System.out.println("Sending SMS");

            HttpResponse<String> response = Unirest.post("https://api.46elks.com/a1/Calls")
                .basicAuth("<API Username>","<API Password>")
                .field("to", "//Enter any valid number")
                .field("from", "//Enter any valid number")
                .field("voice_start", '{"connect":"//the number you have entered"}')
                .asString();
        
            System.out.println(response.getBody());
            }
                
        catch (Exception e){
            System.out.println(e);
        }
    }
}
}
