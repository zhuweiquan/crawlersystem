package aproject.acrawler.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DownloadSetting {
    private String charset = "UTF-8";
    private boolean forceCharset = false;
    private String postEncode = "UTF-8";
    private boolean openProxy = false;
    private int retryTimes = 3;
    private int timeout = 60000;
    private int retryInterval = 5000;
    private boolean useMobileUserAgent;
    private String method = "GET";
    private boolean openGzip = false;
    private Map<String, String> headers = new HashMap();
    private Map<String, Object> clientSetting;
    private String forceProxyServId = null;
    private String forceRetryStr = null;
    private boolean randomLocalIP = false;
    private String forceLocalIP = null;
    private boolean isCacheCookie = true;
    private boolean openCodeRetry = false;
    private boolean openCodePrint = false;
    private boolean openUniqueProxy = false;
    private int ipFrequency = 3000;
    private boolean openRandomUA = false;
    private boolean openEmptyMsgPrint = false;
    private List<Map<String, String>> proxyList = null;

    public int getIpFrequency() {
        return this.ipFrequency;
    }

    public void setIpFrequency(int ipFrequency) {
        this.ipFrequency = ipFrequency;
    }

    public boolean isOpenUniqueProxy() {
        return this.openUniqueProxy;
    }

    public void setOpenUniqueProxy(boolean openUniqueProxy) {
        this.openUniqueProxy = openUniqueProxy;
    }

    public boolean isOpenRandomUA() {
        return this.openRandomUA;
    }

    public void setOpenRandomUA(boolean openRandomUA) {
        this.openRandomUA = openRandomUA;
    }

    public boolean isOpenEmptyMsgPrint() {
        return this.openEmptyMsgPrint;
    }

    public void setOpenEmptyMsgPrint(boolean openEmptyMsgPrint) {
        this.openEmptyMsgPrint = openEmptyMsgPrint;
    }

    public boolean isOpenCodePrint() {
        return this.openCodePrint;
    }

    public void setOpenCodePrint(boolean openCodePrint) {
        this.openCodePrint = openCodePrint;
    }

    public DownloadSetting() {
    }

    public DownloadSetting(DownloadSetting setting) {
        this.setCharset(setting.getCharset());
        this.setForceCharset(setting.isForceCharset());
        this.setPostEncode(setting.getPostEncode());
        this.setOpenProxy(setting.isOpenProxy());
        this.setRetryTimes(setting.getRetryTimes());
        this.setTimeout(setting.getTimeout());
        this.setUseMobileUserAgent(setting.isUseMobileUserAgent());
        this.setMethod(setting.getMethod());
        this.setOpenGzip(setting.isOpenGzip());
        this.setHeaders(setting.getHeaders());
        this.setClientSetting(setting.getClientSetting());
        this.setForceRetryStr(setting.getForceRetryStr());
        this.setCacheCookie(setting.isCacheCookie());
        this.setOpenCodeRetry(setting.isOpenCodeRetry());
    }

    public boolean isCacheCookie() {
        return this.isCacheCookie;
    }

    public void setCacheCookie(boolean cacheCookie) {
        this.isCacheCookie = cacheCookie;
    }

    public String getCharset() {
        return this.charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public boolean isOpenProxy() {
        return this.openProxy;
    }

    public void setOpenProxy(boolean openProxy) {
        this.openProxy = openProxy;
    }

    public int getRetryInterval() {
        return this.retryInterval;
    }

    public void setRetryInterval(int retryInterval) {
        this.retryInterval = retryInterval;
    }

    public boolean isOpenGzip() {
        return this.openGzip;
    }

    public void setOpenGzip(boolean openGzip) {
        this.openGzip = openGzip;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public boolean isUseMobileUserAgent() {
        return this.useMobileUserAgent;
    }

    public void setUseMobileUserAgent(boolean useMobileUserAgent) {
        this.useMobileUserAgent = useMobileUserAgent;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public Map<String, Object> getClientSetting() {
        return this.clientSetting;
    }

    public void setClientSetting(Map<String, Object> clientSetting) {
        this.clientSetting = clientSetting;
    }

    public boolean isForceCharset() {
        return this.forceCharset;
    }

    public void setForceCharset(boolean forceCharset) {
        this.forceCharset = forceCharset;
    }

    public int getRetryTimes() {
        return this.retryTimes;
    }

    public void setRetryTimes(int retryTimes) {
        this.retryTimes = retryTimes;
    }

    public String getForceRetryStr() {
        return this.forceRetryStr;
    }

    public void setForceRetryStr(String forceRetryStr) {
        this.forceRetryStr = forceRetryStr;
    }

    public boolean isRandomLocalIP() {
        return this.randomLocalIP;
    }

    public void setRandomLocalIP(boolean randomLocalIP) {
        this.randomLocalIP = randomLocalIP;
    }

    public String getForceLocalIP() {
        return this.forceLocalIP;
    }

    public void setForceLocalIP(String forceLocalIP) {
        this.forceLocalIP = forceLocalIP;
    }

    public boolean isOpenCodeRetry() {
        return this.openCodeRetry;
    }

    public void setOpenCodeRetry(boolean openCodeRetry) {
        this.openCodeRetry = openCodeRetry;
    }

    public List<Map<String, String>> getProxyList() {
        return this.proxyList;
    }

    public void setProxyList(List<Map<String, String>> proxyList) {
        this.proxyList = proxyList;
    }

    public String getForceProxyServId() {
        return this.forceProxyServId;
    }

    public void setForceProxyServId(String forceProxyServId) {
        this.forceProxyServId = forceProxyServId;
    }

    public String getPostEncode() {
        return this.postEncode;
    }

    public void setPostEncode(String postEncode) {
        this.postEncode = postEncode;
    }

    public String toString() {
        return "DownloadSetting{charset='" + this.charset + '\'' + ", forceCharset=" + this.forceCharset + ", postEncode=" + this.postEncode + ", openProxy=" + this.openProxy + ", retryTimes=" + this.retryTimes + ", timeout=" + this.timeout + ", retryInterval=" + this.retryInterval + ", useMobileUserAgent=" + this.useMobileUserAgent + ", method='" + this.method + '\'' + ", openGzip=" + this.openGzip + ", headers=" + this.headers + ", clientSetting=" + this.clientSetting + ", forceRetryStr='" + this.forceRetryStr + '\'' + ", randomLocalIP=" + this.randomLocalIP + ", forceLocalIP='" + this.forceLocalIP + '\'' + ", isCacheCookie=" + this.isCacheCookie + ", openCodeRetry=" + this.openCodeRetry + ", proxyList=" + this.proxyList + '}';
    }
}