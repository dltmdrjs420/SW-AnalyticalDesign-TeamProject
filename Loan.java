
/**
 * Loan : 한 이용자가 한 권의 책을 빌린 대출 기록을 나타내는 클래스
 *
 * @author (2022320001 이승건)
 * @version (2026.11.02.)
 */
public class Loan
{
    private User borrower;
    private Book borrowedBook;
    
    /**
     * Loan 클래스의 객체 생성자
     */
    public Loan(User user, Book book)
    {
        this.borrower = user;
        this.borrowedBook = book;
    }
}