package com.yupi.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.usercenter.model.domain.Team;
import com.yupi.usercenter.model.domain.User;
import org.springframework.transaction.annotation.Transactional;

/**
* @author fishman
* @description 针对表【team(队伍)】的数据库操作Service
* @createDate 2024-03-28 19:27:08
*/
public interface TeamService extends IService<Team> {

    @Transactional(rollbackFor = Exception.class)
    long addTeam(Team team, User loginUser);
}
