
/**
 * BookDB : 소장된 도서(Book)들을 저장하고 검색하는 DB 클래스
 *
 * @author (2022320001 이승건)
 * @version (2026.11.02.)
 */
public class BookDB
{
    /**
     * 책 등록번호로 책을 찾는 메소드.
     *
     * @param  bookID  찾을 책의 등록번호
     * @return 찾은 책, 없으면 null
     */
    public Book search(String bookID)
    {
        for(Book b : book){
            if(b.bookID.equals(bookID)){
                return b;
            }
        }
        return null;
    }
}