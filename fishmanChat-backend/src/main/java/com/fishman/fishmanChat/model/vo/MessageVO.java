package com.fishman.fishmanChat.model.vo;

import com.fishman.fishmanChat.model.domain.Message;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 消息vo
 *
 * @author fishman
 * @date 2023/06/22
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(value = "消息返回")
public class MessageVO extends Message {
    /**
     * 串行版本uid
     */
    private static final long serialVersionUID = 4353136955942044222L;
    /**
     * 从用户
     */
    @ApiModelProperty(value = "发送用户id")
    private UserVO fromUser;
    /**
     * 博客
     */
    @ApiModelProperty(value = "博客")
    private BlogVO blog;
    /**
     * 评论
     */
    @ApiModelProperty(value = "评论")
    private BlogCommentsVO comment;
}
