package top.th.share.content.domain.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.th.share.content.domain.entity.Share;

/**
 * @author cabudon
 * @date 2023/10/13 15:51
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShareResp {
//    分享内容
    private Share share;

//    发布者昵称
    private String nickname;

//    发布者头像
    private String avatarUrl;
}
