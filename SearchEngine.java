import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    int num = 0;

    public String handleRequest(URI url) {
        Boolean value = false;
        ArrayList<String> list = new ArrayList<String>();
        String[] parameters = url.getQuery().split("=");
        if (url.getPath().contains("/add")) {
            if (parameters[0].equals("s")) {
                if (parameters[1].equals("anewstringtoadd")) {
                    value = true;
                }
                else {
                    if (value = true) {list.add(parameters[1]);}
                }
                return null;
            }
        }
        else if (url.getPath().contains("/search")) {
            if (parameters[0].equals("s") && parameters[1].equals("app")) {
                value = false;
                return String.format("", list);
            }
        }
        return "404 Not Found!";
    }
}

class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}


/* if (url.getPath().equals("/")) {
            return String.format("Number: %d", num);
        } else if (url.getPath().equals("/increment")) {
            num += 1;
            return String.format("Number incremented!");
        } else {
            System.out.println("Path: " + url.getPath());
            if (url.getPath().contains("/add")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("count")) {
                    num += Integer.parseInt(parameters[1]);
                    return String.format("Number increased by %s! It's now %d", parameters[1], num);
                }
            }
            return "404 Not Found!";
        }
*/