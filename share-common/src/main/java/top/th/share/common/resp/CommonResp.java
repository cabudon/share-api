package top.th.share.common.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cabudon
 * @date 2023/10/07 22:58
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommonResp<T> {

//    业务成功或失败
    private Boolean success=true;

//    返回信息
    private String message;

//    返回泛型数据、自定义类型
    private T data;
}
