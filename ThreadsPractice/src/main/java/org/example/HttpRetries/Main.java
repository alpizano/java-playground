package org.example.HttpRetries;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class Main {

    public static void main(String[] args) {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String url = "https://api.github.com";
        HttpGet httpGet = new HttpGet(url);

        int attempts = 3;
        int answer = 0;
        CloseableHttpResponse response1 = httpclient.execute(httpGet);

        while(attempts-- > 0) {
            try {
                //answer = 5/0;
                System.out.println("In try, attempts is: " + attempts);
            }
            catch (ArithmeticException e) {
                e.printStackTrace();
                System.out.println("In catch, attempts is: " + attempts);

            }


        }



    }
}
