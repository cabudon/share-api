package top.th.share.user.domain.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cabudon
 * @date 2023/10/07 21:42
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginDTO {

    @NotBlank(message = "[手机号]不能为空")
    private String phone;
    private String password;

}
