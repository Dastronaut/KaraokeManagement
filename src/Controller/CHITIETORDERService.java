package Controller;
/**
 *
 * @author Trần Kim Tiến Đạt
 */
import java.util.HashMap;
import java.util.List;

public class CHITIETORDERService {
    public static void insertChiTietOrder(int idorder, HashMap<String, Integer> spdvHashMap) {
        Model.CHITIETORDERModel.insertChiTietOrder(idorder, spdvHashMap);
    }
    
    public static Object[] getSoldbySP(String tensp) {
        return Model.CHITIETORDERModel.getSoldbySP(tensp);
    }
    
    public static List<Object[]> getSPbyDate(String timefrom, String timeto) {
        return Model.CHITIETORDERModel.getSPbyDate(timefrom, timeto);
    }
}
