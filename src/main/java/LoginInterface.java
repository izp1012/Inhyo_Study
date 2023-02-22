public interface LoginInterface {
    void insertUser(UserVO vo);
    void deleteUser(UserVO vo);
    void updateUser(UserVO vo);
    /*중복확인*/
    int checkUser(UserVO vo);
    /*사용자 정보 조회*/
    UserVO getUserInfo(String userId);
}
