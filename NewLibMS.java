
/**
 * NewLibMS : 도서관 대출 시스템을 제어하는 클래스
 *
 * @author (2022320001 이승건)
 * @version (2026.11.02.)
 */
public class NewLibMS
{
    /**
     * 책의 대출을 처리하는 메소드.
     *
     * @param  bookID 대출할 책의 등록번호
     * @param  userID 대출하는 이용자의 학번
     */
    public void borrowBook(String bookID, String userID)
    {
        User user = userDB.search(userID);
        Book book = bookDB.search(bookID);
        if(user == null || book == null){
            printErrorMessage();
            return;
        }
        Loan loan = new Loan(user, book);
        loanDB.save(loan);
    }

    /**
     * 요청을 처리할 수 없을 때 도서관 직원에게 오류 메시지를 출력하는 메소드.
     *
     */
    public void printErrorMessage()
    {
        System.out.println("오류가 발생하였습니다. 처리할 수 없습니다.");
    }

    /**
     * 오류가 발생할 시 시스템을 종료하는 메소드.
     *
     */
    public void exitSystem()
    {
        System.exit(0);
    }
}