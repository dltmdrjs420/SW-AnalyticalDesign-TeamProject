
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

    /**
     * 해당 학번의 이용자가 등록되어 있는지 확인하는 메소드.
     *
     * @param  userID 확인할 이용자의 학번
     * @return  등록되어 있으면 true
     */
    public boolean containsUser(String userID)
    {
        return search(userID) != null;
    }

    /**
     * 새 이용자를 저장하는 메소드.
     *
     * @param  user 저장할 이용자 객체
     */
    public void save(User user)
    {
        this.user.add(user);
    }
}