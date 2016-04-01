package com.yubin.util;


import com.alibaba.fastjson.JSONObject;
import com.yubin.contants.UrlContants;
import com.yubin.model.Drug;
import com.yubin.model.Hospital;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 * 调用远程API工具类
 * @Author:percent
 *
 **/

public class HttpClient {
    public static final String DEF_CHATSET = "UTF-8";
    public static final int DEF_CONN_TIMEOUT = 30000;
    public static final int DEF_READ_TIMEOUT = 30000;
    public static String userAgent =  "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";

    //1.请求
    public static Object request(String url, Map params, String method, Class type){
        String result = null;
        try {
            result = net(url, params, method);
            return JacksonUtils.jsonObjUnSerializer(result, type);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object getRequest(String url, Map params, Class type) {
        return request(url, params, UrlContants.GET, type);
    }

    public static Object postRequest(String url, Map params, Class type) {
        return request(url, params, UrlContants.POST, type);
    }

    public static void main(String[] args) {
        Map params = new HashMap();
        params.put("name", "复旦大学附属华山医院");
        Hospital hospital = (Hospital) getRequest(UrlContants.HOSPTIAL_NAME, params, Hospital.class);
        System.out.println(hospital.toString());
    }

    /**
     *
     * @param strUrl 请求地址
     * @param params 请求参数
     * @param method 请求方法
     * @return  网络请求字符串
     * @throws Exception
     */
    public static String net(String strUrl, Map params, String method) throws Exception {
        HttpURLConnection conn = null;
        BufferedReader reader = null;
        String rs = null;
        try {
            StringBuffer sb = new StringBuffer();
            if(method == null || method.equals("GET")){
                strUrl = strUrl+"?"+urlencode(params);
            }
            URL url = new URL(strUrl);
            conn = (HttpURLConnection) url.openConnection();
            if(method == null || method.equals("GET")){
                conn.setRequestMethod("GET");
            }else{
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);
            }
            conn.setRequestProperty("User-agent", userAgent);
            conn.setUseCaches(false);
            conn.setConnectTimeout(DEF_CONN_TIMEOUT);
            conn.setReadTimeout(DEF_READ_TIMEOUT);
            conn.setInstanceFollowRedirects(false);
            conn.connect();
            if (params!= null && method.equals("POST")) {
                DataOutputStream out = new DataOutputStream(conn.getOutputStream());
                out.writeBytes(urlencode(params));
            }
            InputStream is = conn.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, DEF_CHATSET));
            String strRead = null;
            while ((strRead = reader.readLine()) != null) {
                sb.append(strRead);
            }
            rs = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (conn != null) {
                conn.disconnect();
            }
        }
        return rs;
    }

    //将map型转为请求参数型
    public static String urlencode(Map data) {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = data.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            try {
                sb.append(entry.getKey()).append("=").append(URLEncoder.encode(entry.getValue()+"","UTF-8")).append("&");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}