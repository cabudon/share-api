package top.th.share.content.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cabudon
 * @date 2023/10/12 14:19
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Share {
    private Long id;

    private Long userId;

    private String title;

    private Boolean isOriginal;

    private String author;

    private String cover;

    private String summary;

    private Integer price;

    private String downloadUrl;

    private Integer buyCount;

    private Boolean showFlag;

<<<<<<< HEAD
    private String auditStatus;
=======
    private String audiStatus;
>>>>>>> bae15a51377faa68405c6417441f2547de0d04a7

    private String reason;

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Data createTime;

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Data updateTime;
}
