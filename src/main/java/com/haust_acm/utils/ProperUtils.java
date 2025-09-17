package com.haust_acm.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @FileName ProperUtils
 * @Description
 * @Author ouyu
 * @Date 2025-09-17
 **/
public class ProperUtils {
    private static Properties props = new Properties() ;
    private static Map<String,String> PROPER_MAP = new ConcurrentHashMap<>() ;
    static {
        InputStream is = null ;
        try{
            is = ProperUtils.class.getClassLoader().getResourceAsStream("application.properties") ;
            props.load(new InputStreamReader(is, StandardCharsets.UTF_8));
            for (Object o : props.keySet()) {
                String key = o.toString();
                PROPER_MAP.put(key, props.getProperty(key));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if(is != null){
                try{
                    is.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public static String getString(String key){
        return PROPER_MAP.get(key) ;
    }


}
