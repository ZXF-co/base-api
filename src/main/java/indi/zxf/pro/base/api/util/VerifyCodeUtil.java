package indi.zxf.pro.base.api.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.SecureRandom;
import java.util.Random;

/**
 * 验证码工具类
 *
 * @author zhouxiaofa
 * @date 2022/12/6 23:15
 */
public class VerifyCodeUtil {

    private static final Logger logger = LoggerFactory.getLogger(VerifyCodeUtil.class);

    private static final String VERIFY_CODE = "123456789ABCDEFGHJKLMNPQRSTUVWXYZ";

    private static Random random = new SecureRandom();

    /**
     * 使用系统默认字符源生成指定长度验证码
     *
     * @param       size-->验证码长度
     * @return      指定长度验证码
     */
    public static String generateVerifyCode(int size) {
        return generateVerifyCode(size, VERIFY_CODE);
    }

    /**
     * 使用指定源生成指定长度验证码
     *
     * @param       size-->验证码长度
     * @param       source-->验证码字符源
     * @return      指定源生成的指定长度验证码
     */
    public static String generateVerifyCode(int size, String source) {
        if (StringUtils.isBlank(source)) {
            source = VERIFY_CODE;
        }
        Random random = new Random(System.currentTimeMillis());
        StringBuilder verifyCode = new StringBuilder(size);
        for (int i=0; i<size; i++) {
            verifyCode.append(source.charAt(random.nextInt(source.length() - 1)));
        }
        return verifyCode.toString();
    }
}
