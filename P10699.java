import java.text.SimpleDateFormat;
import java.util.Date;

public class P10699 {
    public static void P10699(String[] args){
        Date now = new Date();
        SimpleDateFormat spdf = new SimpleDateFormat("YYYY-MM-dd");
        // SimpleDateFormat으로 날짜 형식 지정
        // DD랑 dd는 다름
        // DD는 Day in year
        // dd는 Day in month -> 이걸 사용해야함
        System.out.println(spdf.format(now));
    }
}
