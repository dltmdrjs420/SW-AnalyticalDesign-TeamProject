
/**
 * NewLibMS : 도서관 대출 시스템을 제어하는 클래스
 *
 * @author (2022320001 이승건)
 * @version (2026.11.02.)
 */
public class NewLibMS
{
    /**
     * 책의 대출을 처리하는 메소드
     *
     * @param  bookID 대출할 책의 등록번호
     * @param  userID 대출하는 이용자의 학번
     */
    public void borrowBook(String bookID, String userID)
    {
        User user = userDB.search(userID);
        Book book = bookDB.search(bookID);
        if(user == null || book == null){
            book.display();
            user.display();
        }else{
            printErrorMessage();
            return;
        }

        boolean resultBook = book.checkDuplicate(bookID);
        boolean resultUser = user.checkDuplicate(userID);
        if (resultBook || resultUser) {
            printErrorMessage();
            exitSystem();
        } else {
            Loan loan = new Loan(user, book);
            loanDB.save(loan);
        }
    }

    /**
     * 새 이용자를 등록하는 메소드.
     *
     * @param  userID 등록할 이용자 학번
     * @param  name 등록할 이용자 이름
     */
    public void registerNewBorrower(String userID, String name) {
        if (userDB.containsUser(userID)) {
            printErrorMessage();
            return;
        }else{
            User user = new User(userID, name);
            UserDB.save(user);
        }
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