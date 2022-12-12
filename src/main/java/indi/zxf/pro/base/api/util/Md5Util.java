package indi.zxf.pro.base.api.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密工具类
 *
 * @author zhouxiaofa
 * @date 2022/12/3 1:08
 */
public class Md5Util {

    private static final Logger logger = LoggerFactory.getLogger(Md5Util.class);

    private static final String DIGEST_UTILS = "DigestUtils";

    private static final String MESSAGE_DIGEST = "MessageDigest";

    /**
     * MD5加密算法(DigestUtils/MessageDigest)
     *
     * @param       str-->待加密字符串
     * @param       utilName-->工具名称
     * @return      加密后字符串
     * @throws      NoSuchAlgorithmException-->异常
     */
    public static String md5(String str, String utilName) throws NoSuchAlgorithmException {
        byte[] s;
        switch (utilName) {
            case DIGEST_UTILS:
                s = DigestUtils.md5Digest(str.getBytes(StandardCharsets.UTF_8));
                break;
            case MESSAGE_DIGEST:
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.reset();
                messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
                s = messageDigest.digest();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + utilName);
        }
        return String.valueOf(s);
    }

    /**
     * 默认MD5加密算法(DigestUtils)
     *
     * @param       str-->待加密字符串
     * @return      加密后字符串
     */
    public static String md5(String str) {
        byte[] s = DigestUtils.md5Digest(str.getBytes(StandardCharsets.UTF_8));
        return String.valueOf(s);
    }
}
