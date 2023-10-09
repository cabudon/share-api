package top.th.share.content.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cabudon
 * @date 2023/10/08 15:24
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Notice {
    private Long id;

    private String content;

    private Boolean showFlag;

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH")
    private Data createTime;
}
