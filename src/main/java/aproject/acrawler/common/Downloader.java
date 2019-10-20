package aproject.acrawler.common;


import com.fasterxml.jackson.databind.util.JSONPObject;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.NameValuePair;
import org.apache.http.ProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultRedirectStrategy;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.springframework.util.StringUtils;
import org.apache.http.util.EntityUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Downloader {
    private static final int SOCK_TIMEOUT = 30000;
    private static final int CONNECT_TIMEOUT = 30000;
    private String lastRedirectUrl = null;
    private DownloadSetting downloadSetting = null;
    private static final String DEFAULT_UA_PC_CHROME = "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.81 Safari/537.36";
    private final Map<String, String> cacheCookieMap = new HashMap();

    public Downloader() {

    }

    public Downloader(DownloadSetting downloadSetting) {
        this.downloadSetting = downloadSetting;
    }



    public String processUrl(String url) {
        CloseableHttpClient client = null;
        String res = null;
        HttpGet httpGet = new HttpGet(url);
        try {
            client = HttpClientBuilder.create().build();
            httpGet.setHeader("User-Agent", DEFAULT_UA_PC_CHROME);
            httpGet.setHeader(new BasicHeader("Content-Type", "application/json; charset=utf-8"));
            httpGet.setHeader(new BasicHeader("Accept", "text/plain;charset=utf-8"));

            HttpResponse response = client.execute(httpGet);
            // 获取响应码
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == 200) {
                res = EntityUtils.toString(response.getEntity(), "utf-8");
            }
            res = EntityUtils.toString(response.getEntity());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

    public String processUrl(String url,  Map<String, String> postData) {
        CloseableHttpClient client = null;
        String res = null;
        try {
            client = HttpClientBuilder.create().build();
            HttpPost post = new HttpPost(url);
            post.setHeader("User-Agent", DEFAULT_UA_PC_CHROME);
            post.setHeader("Content-Type", "application/json;charset=UTF-8");

            List<NameValuePair> params = new ArrayList<>();
            if (!postData.isEmpty()) {
                for (String key : postData.keySet()) {
                    params.add(new BasicNameValuePair(key, postData.get(key)));
                }
            }
            post.setEntity(new UrlEncodedFormEntity(params, "utf-8"));
            HttpResponse response = client.execute(post);
            res = EntityUtils.toString(response.getEntity());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

//    public static void main(String[] args) {
//        Downloader downloader = new Downloader();
//        Map<String, String> map = new HashMap<>();
//        String url = "http://blog.sina.com.cn/s/blog_6e47de3e01017ole.html";
//        String s = downloader.processUrl(url);
//        System.out.println(s);
//    }

}
