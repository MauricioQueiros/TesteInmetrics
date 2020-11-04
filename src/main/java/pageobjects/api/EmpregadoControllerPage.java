package pageobjects.api;

import utils.DataHelper;
import utils.FakerValues;

public class EmpregadoControllerPage {

    DataHelper dataHelper;
    FakerValues fakerValues;

    public EmpregadoControllerPage(){
        this.dataHelper = new DataHelper();
        this.fakerValues = new FakerValues();
    }

    public String[] getParametrosPost(boolean correto){

        String[]parametros;

        if(correto){

            parametros = new String[]{
                    dataHelper.getDataAtualBr(),
                    fakerValues.getCargo(),
                    fakerValues.getSalario(),
                    fakerValues.cpf(),
                    fakerValues.getName(8),
                    fakerValues.getSalario(),
                    fakerValues.getSexo(),
                    fakerValues.getCltOuPj()
            };

        } else {
            parametros = new String[]{
                    dataHelper.getDataAtualBr(),
                    fakerValues.getCargo(),
                    fakerValues.getSalario(),
                    fakerValues.cpf(),
                    fakerValues.getName(8),
                    fakerValues.getSalario(),
                    "g",
                    fakerValues.getCltOuPj()
            };
        }
        return parametros;
    }
}
