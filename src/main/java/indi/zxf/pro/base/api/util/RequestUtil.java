package indi.zxf.pro.base.api.util;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;

/**
 * 请求工具类
 *
 * @author zhouxiaofa
 * @date 2022/12/12 9:47
 **/
public class RequestUtil {

    public static String getRequestIp(HttpServletRequest request) {
        // 通过http代理服务器转发时添加
        String ip = request.getHeader("x-forwarded-for");
        if (null == ip || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (null == ip || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (null == ip || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
            // 从本地访问时根据网卡读取本机配置的IP
            if ("127.0.0.1".equals(ip) || "0:0:0:0:0:0:0:1".equals(ip)) {
                InetAddress inetAddress = null;
                try {
                    inetAddress = InetAddress.getLocalHost();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ip = inetAddress.getHostAddress();
            }
        }
        // 处理通过多个代理转发的情况, 取第1个客户端真实IP, 多个IP以','分割
        if (ip != null && ip.length() > 15) {
            if (ip.indexOf(",") > 0) {
                ip = ip.substring(0, ip.indexOf(","));
            }
        }
        return ip;
    }
}
