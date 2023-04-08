
package cyber;

/**
 *
 * @author Ajithaa Vanathi
 */

    import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class UnirestSendSMS {
    public static void main(String[] args) {
        try {
            System.out.println("Sending SMS");

            HttpResponse<String> response = Unirest.post("https://api.46elks.com/a1/SMS")
                .basicAuth("<API Username>","<API Password>")
                .field("to", "Any number")
                .field("from", "Your phone number")
                .field("message", "I am in danger!!!help me")
                .asString();
        
            System.out.println(response.getBody());
            }
                
        catch (Exception e){
            System.out.println(e);
        }
    }
}


