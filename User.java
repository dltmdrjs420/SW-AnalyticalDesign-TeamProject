
/**
 * User : 도서관 이용자의 정보를 나타내는 클래스
 *
 * @author (2022320001 이승건)
 * @version (2026.11.02.)
 */
public class User
{
    private String name;
    private String userID;

    /**
     * User 클래스의 객체 생성자
     */
    public User(String userID, String name)
    {
        this.userID = userID;
        this.name = name;
    }

    /**
     * 이용자의 정보(학번, 이름)을 출력하는 메소드.
     *
     */
    public void display()
    {
        System.out.println("이용자 정보 [학번 : " + userID + ", 이름 : " + name + "]");
    }

    /**
     * 해당 이용자가 대출중인지 검사하는 메소드.
     *
     * @param  userID  검사할 이용자의 학번
     * @return 대출이 불가능하면 true
     */
    public boolean checkDuplicate(String userID)
    {
        return this.userID.equals(userID);
    }
}