package top.th.share.content.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.th.share.content.domain.entity.Notice;
import top.th.share.content.mapper.NoticeMapper;

import java.util.List;

/**
 * @author cabudon
 * @date 2023/10/08 15:27
 */

@Service
public class NoticeService {
    @Resource
    private NoticeMapper noticeMapper;

    public Notice getLatest() {
        LambdaQueryWrapper<Notice> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Notice::getShowFlag, 1);
        wrapper.orderByDesc(Notice::getId);
        List<Notice> notices = noticeMapper.selectList(wrapper);
        return notices.get(0);
    }
}
