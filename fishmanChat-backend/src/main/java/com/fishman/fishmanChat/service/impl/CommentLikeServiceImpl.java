package com.fishman.fishmanChat.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fishman.fishmanChat.mapper.CommentLikeMapper;
import com.fishman.fishmanChat.model.domain.CommentLike;
import com.fishman.fishmanChat.service.CommentLikeService;
import org.springframework.stereotype.Service;

/**
 * @author fishman
 * @description 针对表【comment_like】的数据库操作Service实现
 * @createDate 2023-06-08 16:24:28
 */
@Service
public class CommentLikeServiceImpl extends ServiceImpl<CommentLikeMapper, CommentLike>
        implements CommentLikeService {

}




