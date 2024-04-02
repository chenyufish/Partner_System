package com.yupi.usercenter.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.usercenter.model.domain.User;
import com.yupi.usercenter.model.request.UserRegisterRequest;
import com.yupi.usercenter.model.request.UserUpdateRequest;
import com.yupi.usercenter.model.vo.UserVO;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 用户服务
 *
 * @description 针对表【user】的数据库操作Service
 */
public interface UserService extends IService<User> {
    /**
     * 用户登记
     *
     * @param userRegisterRequest 用户登记要求
     * @param request             要求
     * @return {@link String}
     */
    String userRegister(UserRegisterRequest userRegisterRequest, HttpServletRequest request);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户暗语
     * @param request      要求
     */
    String userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 管理员登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户暗语
     * @param request      要求
     */
    String adminLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 收到安全用户
     *
     * @param originUser 起源用户
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     *
     * @param request 要求
     * @return int
     */
    int userLogout(HttpServletRequest request);

    /**
     * 按标签搜索用户
     *
     * @param tagNameList 标记名称列表
     * @param currentPage 当前页码
     */
    Page<User> searchUsersByTags(List<String> tagNameList, long currentPage);

    /**
     * 是否为管理员
     *
     * @param loginUser 登录用户
     * @return boolean
     */
    boolean isAdmin(User loginUser);

    /**
     * 使现代化用户
     *
     * @param user    用户
     * @param request 要求
     * @return boolean
     */
    boolean updateUser(User user, HttpServletRequest request);

    /**
     * 用户分页
     *
     * @param currentPage 当前页码
     */
    Page<UserVO> userPage(long currentPage);

    /**
     * 收到登录用户
     *
     * @param request 要求
     * @return {@link User}
     */
    User getLoginUser(HttpServletRequest request);


    /**
     * 是登录名
     *
     * @param request 要求
     */
    Boolean isLogin(HttpServletRequest request);

    /**
     * 火柴用户
     *
     * @param currentPage 当前页码
     * @param loginUser   登录用户
     */
    Page<UserVO> matchUser(long currentPage, User loginUser);

    /**
     * 收到用户通过id
     *
     * @param userId      用户id
     * @param loginUserId 登录用户id
     */
    UserVO getUserById(Long userId, Long loginUserId);

    /**
     * 收到用户标签
     *
     * @param id id
     */
    List<String> getUserTags(Long id);

    /**
     * 更新标记
     *
     * @param tags   标签
     * @param userId 用户id
     */
    void updateTags(List<String> tags, Long userId);

    /**
     * 使现代化用户具有密码
     *
     * @param updateRequest 更新请求
     * @param userId        用户id
     */
    void updateUserWithCode(UserUpdateRequest updateRequest, Long userId);

    /**
     * 收到随机用户
     *
     * @return {@link Page}<{@link UserVO}>
     */
    Page<UserVO> getRandomUser();

    /**
     * 更新密码
     *
     * @param phone           电话
     * @param code            密码
     * @param password        暗语
     * @param confirmPassword 确认密码
     */
    void updatePassword(String phone, String code, String password, String confirmPassword);

    /**
     * 之前火柴用户
     *
     * @param currentPage 当前页码
     * @param username    用户名
     * @param loginUser   登录用户
     */
    Page<UserVO> preMatchUser(long currentPage, String username, User loginUser);

    /**
     * 之后插入用户
     *
     * @param key     钥匙
     * @param userId  用户id
     * @param request 要求
     */
    String afterInsertUser(String key, long userId, HttpServletRequest request);

    /**
     * 管理员寄存器
     *
     * @param userRegisterRequest 用户登记要求
     * @param request             要求
     */
    Long adminRegister(UserRegisterRequest userRegisterRequest, HttpServletRequest request);

    /**
     * 改变用户地位
     *
     * @param id id
     */
    void changeUserStatus(Long id);
}
