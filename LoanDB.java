
/**
 * LoanDB : 대출 기록(Loan)들을 저장하는 DB 클래스
 *
 * @author (2022320001 이승건)
 * @version (2026.11.02.)
 */
public class LoanDB
{
    /**
     * 새로운 대출 기록을 저장하는 메소드.
     *
     * @param  loan  저장할 대출객체
     */
    public void save(Loan loan)
    {
        this.loan.add(loan);
    }
}