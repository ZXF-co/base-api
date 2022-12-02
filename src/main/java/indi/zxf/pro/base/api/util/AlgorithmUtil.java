package indi.zxf.pro.base.api.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 数字运算工具类
 *
 * @author zhouxiaofa
 * @date 2022/12/2 22:47
 */
public class AlgorithmUtil {

    private static final Logger logger = LoggerFactory.getLogger(AlgorithmUtil.class);

    /**
     * 不允许被实例化
     */
    private AlgorithmUtil() {

    }

    /**
     * 精确的double类型加法运算
     *
     * @param       param1-->被加数
     * @param       param2-->加数
     * @return      和
     */
    public static double add(double param1, double param2) {
        BigDecimal b1 = BigDecimal.valueOf(param1);
        BigDecimal b2 = BigDecimal.valueOf(param2);
        return b1.add(b2).doubleValue();
    }

    /**
     * 精确的double类型减法运算
     *
     * @param       param1-->被减数
     * @param       param2-->减数
     * @return      差
     */
    public static double sub(double param1, double param2) {
        BigDecimal b1 = BigDecimal.valueOf(param1);
        BigDecimal b2 = BigDecimal.valueOf(param2);
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 精确的double类型乘法运算
     *
     * @param       param1-->被乘数
     * @param       param2-->乘数
     * @return      积
     */
    public static double mul(double param1, double param2) {
        BigDecimal b1 = BigDecimal.valueOf(param1);
        BigDecimal b2 = BigDecimal.valueOf(param2);
        return b1.multiply(b2).doubleValue();
    }

    /**
     * 精确的double类型除法运算
     * scale参数指定精度(保存位数), 以后的数字四舍五入
     *
     * @param       param1-->被除数
     * @param       param2-->除数
     * @param       scale-->小数点后精确的位数
     * @return      商
     */
    public static double div(double param1, double param2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero!");
        }
        BigDecimal b1 = BigDecimal.valueOf(param1);
        BigDecimal b2 = BigDecimal.valueOf(param2);
        if (b1.compareTo(BigDecimal.ZERO) == 0) {
            return BigDecimal.ZERO.doubleValue();
        }
        return b1.divide(b2, scale, RoundingMode.HALF_UP).doubleValue();
    }

    /**
     * 精确的小数位四舍五入运算
     *
     * @param       param-->待处理数据
     * @param       scale-->小数点后精确的位数
     * @return      四舍五入结果
     */
    public static double round(double param, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero!");
        }
        BigDecimal b = BigDecimal.valueOf(param);
        return b.divide(BigDecimal.ONE, scale, RoundingMode.HALF_UP).doubleValue();
    }
}
