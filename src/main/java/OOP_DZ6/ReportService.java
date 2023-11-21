package OOP_DZ6;

import java.util.ArrayList;


public class ReportService {
    public ReportService (Document document, String reportType){
        ArrayList<SuportedReportsTypes> suportedTypeList = new ArrayList<>();
        suportedTypeList.add(new PdfCreate());
        suportedTypeList.add(new XmlCreate());
        suportedTypeList.add(new JsonCreate());
        // добавлять сюда
        SuportedReportsTypes CorrectType = null;
        for (int i = 0; i < suportedTypeList.size(); i++) {
            if(suportedTypeList.get(i).getFileType() == reportType.toUpperCase()){
                CorrectType = suportedTypeList.get(i);
                break;
            }
        }
        assert CorrectType != null;
        CorrectType.CreateFile(document);
    }



}
