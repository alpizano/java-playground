package org.example.randomtests.httpcallable;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class HttpGet implements Runnable {
    @Override
    public void run() {

        CloseableHttpClient httpclient = HttpClients.createDefault();

        String url = "https://api.github.com";
        org.apache.http.client.methods.HttpGet httpGet = new org.apache.http.client.methods.HttpGet(url);

        //CloseableHttpResponse response1 = null;

           try (CloseableHttpResponse response1 = httpclient.execute(httpGet)) {
               System.out.println(response1.getStatusLine());
               HttpEntity entity1 = response1.getEntity();
               String body = EntityUtils.toString(entity1, StandardCharsets.UTF_8);
               System.out.println(body);
               EntityUtils.consume(entity1);
           }
           catch(IOException e) {
               System.out.println(e.getMessage());
           }


    }
}
