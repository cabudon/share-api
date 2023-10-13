package top.th.share.content.controller;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import top.th.share.common.resp.CommonResp;
import top.th.share.content.domain.entity.Notice;
import top.th.share.content.domain.entity.Share;
import top.th.share.content.service.NoticeService;
import top.th.share.content.service.ShareService;

import java.util.List;


/**
 * @author cabudon
 * @date 2023/10/08 15:33
 */

@RestController
@RequestMapping(value = "/share")
@Slf4j
public class ShareController {
    @Resource
    private NoticeService noticeService;

    @Resource
    private ShareService shareService;

    @GetMapping(value = "/notice")
    public CommonResp<Notice> getLatestNotice() {
        CommonResp<Notice> commonResp = new CommonResp<>();
        commonResp.setData(noticeService.getLatest());
        return commonResp;
    }

    @GetMapping("/list")
    public CommonResp<List<Share>> getShareList(@RequestParam(required = false) String title) {
        CommonResp<List<Share>> commonResp = new CommonResp<>();
        Long userId = 2L;
        commonResp.setData(shareService.getList(title,userId));
        return commonResp;

    }


}
