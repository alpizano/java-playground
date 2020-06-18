package org.example.HttpRetries;

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

    public static void main(String[] args) throws IOException {

        List<Integer> httpStatusCodes = new ArrayList<>(Arrays.asList(200,400));
        System.out.println(httpStatusCodes);

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



    }
}
