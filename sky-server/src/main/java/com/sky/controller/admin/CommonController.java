package com.sky.controller.admin;

import com.sky.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 通用接口
 */
@RestController
@RequestMapping("/admin/common")
@Api(tags = "通用模块")
@Slf4j
public class CommonController {


    // TODO 待完成
    /**
     * 文件上传
     * @param file
     * @return
     */
    @ApiOperation("上传文件")
    @PostMapping("/upload")
    public Result<String> upload(@RequestParam("file") MultipartFile file) {
        // 检查文件是否为空
        if (file.isEmpty()) {
            return Result.error("上传失败");
        }

        try {
            // 获取文件的字节数组并进行存储等操作
            byte[] bytes = file.getBytes();
            // 进行文件存储操作，此处省略
            // 假设存储成功后返回文件上传路径
            String filePath = "C:\\Users\\alext\\OneDrive\\Desktop\\full stack project\\tempFile" + file.getOriginalFilename();
            return Result.success(filePath);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error("上传失败");
        }
    }



}
