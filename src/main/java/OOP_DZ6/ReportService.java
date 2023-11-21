package OOP_DZ6;

import java.util.ArrayList;
import java.util.Objects;


public class ReportService {
    public ReportService (Document document, String reportType){
        ArrayList<SuportedReportsTypes> suportedTypeList = new ArrayList<>();
        suportedTypeList.add(new PdfCreate());
        suportedTypeList.add(new XmlCreate());
        suportedTypeList.add(new JsonCreate());
        // добавлять сюда
        SuportedReportsTypes CorrectType = null;
        for (SuportedReportsTypes suportedReportsTypes : suportedTypeList) {
            if (Objects.equals(suportedReportsTypes.getFileType(), reportType.toUpperCase())) {
                CorrectType = suportedReportsTypes;
                break;
            }
        }
        assert CorrectType != null;
        CorrectType.CreateFile(document);
    }



}
