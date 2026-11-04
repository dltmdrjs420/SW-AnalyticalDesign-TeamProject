
/**
 * UserDB : 등록된 이용자(User)들을 저장하고 검색하는 DB 클래스
 *
 * @author (2022320001 이승건)
 * @version (2026.11.02.)
 */
public class UserDB
{
    /**
     * 이용자 학번으로 이용자를 찾는 메소드.
     *
     * @param  userID  찾을 이용자의 학번
     * @return 찾은 이용자, 없다면 null
     */
    public User search(String userID)
    {
        for(User u : user){
            if(u.userID.equals(userID)){
                return u;
            }
        }
        return null;
    }
}