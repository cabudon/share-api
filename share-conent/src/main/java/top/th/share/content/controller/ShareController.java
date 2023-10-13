package top.th.share.content.controller;

import cn.hutool.json.JSONObject;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import top.th.share.common.resp.CommonResp;
import top.th.share.common.util.JwtUtil;
import top.th.share.content.domain.entity.Notice;
import top.th.share.content.domain.entity.Share;
<<<<<<< HEAD
import top.th.share.content.domain.resp.ShareResp;
=======
>>>>>>> bae15a51377faa68405c6417441f2547de0d04a7
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

<<<<<<< HEAD
    //定义每页最多的数据量，以防前端定义传递超大参数，造成页面数据量过大
    private final int MAX = 100;

=======
>>>>>>> bae15a51377faa68405c6417441f2547de0d04a7
    @GetMapping(value = "/notice")
    public CommonResp<Notice> getLatestNotice() {
        CommonResp<Notice> commonResp = new CommonResp<>();
        commonResp.setData(noticeService.getLatest());
        return commonResp;
    }

    @GetMapping("/list")
<<<<<<< HEAD
    public CommonResp<List<Share>> getShareList(@RequestParam(required = false) String title,
                                                @RequestParam(required = false, defaultValue = "1") Integer pageNo,
                                                @RequestParam(required = false, defaultValue = "3") Integer pageSize,
                                                @RequestHeader(value = "token", required = false) String token) {
        if (pageSize > MAX) {
            pageSize = MAX;
        }
        Long userId = getUserIdFromToken(token);
        CommonResp<List<Share>> commonResp = new CommonResp<>();
        commonResp.setData(shareService.getList(title, pageNo, pageSize, userId));
=======
    public CommonResp<List<Share>> getShareList(@RequestParam(required = false) String title) {
        CommonResp<List<Share>> commonResp = new CommonResp<>();
        Long userId = 2L;
        //commonResp.setData(shareService.getList(title,userId));
        commonResp.setData(shareService.getList(title,userId));
>>>>>>> bae15a51377faa68405c6417441f2547de0d04a7
        return commonResp;

    }

<<<<<<< HEAD
    private Long getUserIdFromToken(String token) {
        log.info(">>>>>>>>>> token" + token);
        long userId = 0;
        String noToken = "no-token";
        if (!noToken.equals(token)) {
            JSONObject jsonObject = JwtUtil.getJSONObject(token);
            userId = Long.parseLong(jsonObject.get("id").toString());
        } else {
            log.info("没有 token");
        }
        return userId;
    }

    @GetMapping("/{id}")
    public CommonResp<ShareResp> getShareById(@PathVariable Long id){
        ShareResp shareResp=shareService.findById(id);
        CommonResp<ShareResp> commonResp=new CommonResp<>();
        commonResp.setData(shareResp);
        return commonResp;
    }
=======

>>>>>>> bae15a51377faa68405c6417441f2547de0d04a7
}
