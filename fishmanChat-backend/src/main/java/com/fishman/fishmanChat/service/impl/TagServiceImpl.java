package com.fishman.fishmanChat.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fishman.fishmanChat.mapper.TagMapper;
import com.fishman.fishmanChat.model.domain.Tag;
import com.fishman.fishmanChat.service.TagService;
import org.springframework.stereotype.Service;


@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {
}




