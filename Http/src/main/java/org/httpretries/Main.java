package org.httpretries;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void something(List list) {
        System.out.println(list);
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        List<Integer> httpStatusCodes = new ArrayList<>(Arrays.asList(200,400));
        //System.out.println(httpStatusCodes);

        Main.something(new ArrayList<>(Arrays.asList(69,777)));


        if(httpStatusCodes.contains(205)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("missing");
        }

        CloseableHttpClient httpclient = HttpClients.createDefault();

        String url = "https://api.github.com";
        HttpGet httpGet = new HttpGet(url);

        CloseableHttpResponse response1 = null;

        int attempts = 3;
        int answer = 0;

        while(attempts-- > 0) {
            try {
                response1 = httpclient.execute(httpGet);
                System.out.println(response1.getStatusLine());
                HttpEntity entity1 = response1.getEntity();
                System.out.println(EntityUtils.toString(entity1, StandardCharsets.UTF_8));
                EntityUtils.consume(entity1);
                //answer = 5/0;
                System.out.println("In try, attempts is: " + attempts);
            }
            catch (Exception e) {
                e.printStackTrace();
                System.out.println("In catch, attempts is: " + attempts);

            }
            finally {
                response1.close();
            }
        }

        attempts = 3;

        while(attempts-- > 0) {
            try {
                answer = 10/5;
                if(answer == 1) {
                    System.out.println("In break");
                    break;
                }
                System.out.println("Http status code != 200");
            }
            catch (Exception e){
                System.out.println("In catch");
                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }
            Thread.sleep(5000);
        }



    }
}
