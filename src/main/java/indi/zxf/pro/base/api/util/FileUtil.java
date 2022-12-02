package indi.zxf.pro.base.api.util;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * 文件工具类
 *
 * @author zhouxiaofa
 * @date 2022/12/2 21:50
 */
public class FileUtil {

    private static final Logger logger = LoggerFactory.getLogger(FileUtil.class);
    /**
     * 获取文件类型
     * 例如: test.txt-->返回: txt
     *
     * @param       file-->源文件
     * @return      文件类型
     */
    public static String getFileType(File file) {
        if (null == file) {
            return StringUtils.EMPTY;
        }
        return getFileType(file.getName());
    }

    /**
     * 获取文件类型
     * 例如: test.txt-->返回: txt
     *
     * @param       fileName-->源文件名称
     * @return      文件类型
     */
    public static String getFileType(String fileName) {
        // 获取最后一个"."位置
        int index = fileName.lastIndexOf(".");
        if (index < 0) {
            return StringUtils.EMPTY;
        }
        // 返回文件类型(小写)
        return fileName.substring(index + 1).toLowerCase();
    }

    /**
     * 获取文件类型
     * 例如: test.txt-->返回: txt
     *
     * @param       fileBytes-->源文件字节码
     * @return      文件类型
     */
    public static String getFileType(byte[] fileBytes) {
        String fileType = StringUtils.EMPTY;
        if ((fileBytes[0] == 66) && (fileBytes[1] == 77)) {
            fileType = "BMP";
        } else if ((fileBytes[0] == 71) && (fileBytes[1] == 73) && (fileBytes[2] == 70) && (fileBytes[3] == 56)
                && ((fileBytes[4] == 55) || (fileBytes[4] == 57)) && (fileBytes[5] == 97)) {
            fileType = "GIF";
        } else if ((fileBytes[6] == 74) && (fileBytes[7] == 70) && (fileBytes[8] == 73) && (fileBytes[9] == 70)) {
            fileType = "JPG";
        } else if ((fileBytes[1] == 80) && (fileBytes[2] == 78) && (fileBytes[3] == 71)) {
            fileType = "PNG";
        }
        return fileType;
    }

    /**
     * 获取文件类型
     *
     * @param       file-->源文件
     * @return      文件类型
     */
    public static String getFileType(MultipartFile file) {
        String fileType = FilenameUtils.getExtension(file.getOriginalFilename());
        if (StringUtils.isBlank(fileType)) {
            fileType = getExtension(file.getContentType());
        }
        return fileType;
    }

    /**
     * 获取文件类型
     *
     * @param       prefix-->源文件前缀
     * @return      文件类型
     */
    public static String getExtension(String prefix) {
        switch (prefix) {
            case "image/bmp":
                return "bmp";
            case "image/gif":
                return "gif";
            case "image/jpeg":
                return "jpeg";
            case "image/jpg":
                return "jpg";
            case "image/png":
                return "png";
            default:
                return StringUtils.EMPTY;
        }
    }
}
