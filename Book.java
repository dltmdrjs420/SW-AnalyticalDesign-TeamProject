
/**
 * Book : 도서관이 소장한 책의 정보를 나타내는 클래스
 *
 * @author (2022320001 이승건)
 * @version (2026.11.02.)
 */
public class Book
{
    private String title;
    private String author;
    private String bookID;

    /**
     * Book 클래스의 객체 생성자
     */
    public Book(String bookID, String title, String author)
    {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
    }

    /**
     * 책의 정보(등록번호, 제목, 저자)를 출력하는 메소드.
     *
     */
    public void display()
    {
        System.out.println("책 정보 [등록번호 : " + bookID + ", 제목 : " + title + ", 저자 : " + author + "]");
    }

    /**
     * 해당 책이 대출중인지 검사하는 메소드.
     *
     * @param  bookID  확인할 책의 등록번호
     * @return 대출 불가능하면 true
     */
    public boolean checkDuplicate(String userID)
    {
        return this.bookID.equals(userID);
    }
}