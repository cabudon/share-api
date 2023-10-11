package top.th.share.user.domain.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.th.share.user.domain.entity.User;

/**
 * @author cabudon
 * @date 2023/10/11 18:28
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserLoginResp {
    private User user;
    private String token;
}
