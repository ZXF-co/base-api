package indi.zxf.pro.base.api.util;

import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.management.ManagementFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具类
 *
 * @author zhouxiaofa
 * @date 2022/12/2 23:14
 */
public class DateUtil extends DateUtils {

    private static final Logger logger = LoggerFactory.getLogger(DateUtil.class);

    private static final String MINUTE = "MINUTE";

    private static final String HOUR = "HOUR";

    private static final String DAY = "DAY";

    private static final String FORMAT_1_1 = "yyyy";

    private static final String FORMAT_2_1 = "yyyy-MM";

    private static final String FORMAT_2_2 = "yyyy/MM";

    private static final String FORMAT_2_3 = "yyyy.MM";

    private static final String FORMAT_3_1 = "yyyy-MM-dd";

    private static final String FORMAT_3_2 = "yyyy/MM/dd";

    private static final String FORMAT_3_3 = "yyyy.MM.dd";

    private static final String FORMAT_4_1 = "yyyy-MM-dd HH:mm";

    private static final String FORMAT_4_2 = "yyyy/MM/dd HH:mm";

    private static final String FORMAT_4_3 ="yyyy.MM.dd HH:mm";

    private static final String FORMAT_5_1 = "yyyy-MM-dd HH:mm:ss";

    private static final String FORMAT_5_2 = "yyyy/MM/dd HH:mm:ss";

    private static final String FORMAT_5_3 = "yyyy.MM.dd HH:mm:ss";

    private static final String FORMAT_6_1 = "yyyyMMddHHmmss";

    private static String[] parsePatterns = {
         "yyyy-MM", "yyyy-MM-dd", "yyyy-MM-dd HH:mm", "yyyy-MM-dd HH:mm:ss",
         "yyyy/MM", "yyyy/MM/dd", "yyyy/MM/dd HH:mm", "yyyy/MM/dd HH:mm:ss",
         "yyyy.MM", "yyyy.MM.dd", "yyyy.MM.dd HH:mm", "yyyy.MM.dd HH:mm:ss"
    };

    /**
     * 获取当前String型日期, 默认格式为yyyy-MM-dd
     *
     * @return      String型日期
     */
    public static String getDate() {
        return getDate(FORMAT_3_1);
    }

    /**
     * 获取当前String型日期
     *
     * @param       format-->时间显示格式
     * @return      String型日期
     */
    public static String getDate(String format) {
        return new SimpleDateFormat(format).format(new Date());
    }

    /**
     * 获取当前Date型日期
     *
     * @return      Date型日期
     */
    public static Date getNowDate() {
        return new Date();
    }

    /**
     * String型日期-->Date型日期
     *
     * @param       object-->String型日期
     * @return      Date型日期
     */
    public static Date parseDate(Object object) {
        if (null == object) {
            return null;
        }
        try {
            return parseDate(object.toString(), parsePatterns);
        } catch (ParseException e) {
            logger.error("String型日期转换为Date型日期发生错误, 信息为: " + e);
            return null;
        }
    }

    /**
     * 获取服务器启动时间
     *
     * @return      服务器启动时间
     */
    public static Date getServiceStartDate() {
        return new Date(ManagementFactory.getRuntimeMXBean().getStartTime());
    }

    /**
     * 获取开始时间和结束时间的时间差
     *
     * @param       startDate-->开始时间
     * @param       endDate-->结束时间
     * @param       format-->计算相差格式
     * @return      时间差
     */
    public static String getTimeDifference(Date startDate, Date endDate, String format) {
        long mb = 1000 * 60;
        long hb = 1000 * 60 * 60;
        long db = 1000 * 60 * 60 * 24;
        // 获取(开始时间-结束时间)的毫秒时间差
        long diff = endDate.getTime() - startDate.getTime();
        logger.info("The time difference between startDate and endDate is: " + diff + "ms");
        // 计算相差分钟
        long minute = diff % db % hb / mb;
        // 计算相差小时
        long hour = diff % db / hb;
        // 计算相差天数
        long day = diff / db;
        String betweenTime;
        switch (format) {
            case MINUTE:
                betweenTime = String.valueOf(minute);
                break;
            case HOUR:
                betweenTime = String.valueOf(hour);
                break;
            case DAY:
            default:
                betweenTime = String.valueOf(day);
                break;
        }
        return betweenTime;
    }
}
