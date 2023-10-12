package top.th.share.content.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.th.share.common.resp.CommonResp;
import top.th.share.content.domain.entity.Notice;
import top.th.share.content.service.NoticeService;

import java.util.List;

/**
 * @author cabudon
 * @date 2023/10/08 15:33
 */

@RestController
@RequestMapping(value = "/share")
public class ShareController {


    @Resource
    private NoticeService noticeService;

    @GetMapping(value = "/notice")
    public CommonResp<Notice> getNotice() {
        CommonResp<Notice> commonResp = new CommonResp<>();
        commonResp.setData(noticeService.getLatest());
        return commonResp;
    }
}
