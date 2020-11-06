package pageobjects.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigWeb;
import utils.DataHelper;
import utils.FakerValues;
import utils.WebUtils;

public class CadastrarFuncionarioPage extends ConfigWeb {

    @FindBy(xpath = "//a[contains(text(), 'Novo Funcionário')]")
    private WebElement novoFuncionario;

    @FindBy(id = "inputNome")
    private WebElement fieldNome;

    @FindBy(id = "cpf")
    private WebElement fieldCpf;

    @FindBy(id = "slctSexo")
    private WebElement dropDownSexo;

    @FindBy(id = "inputAdmissao")
    private WebElement fieldAdmissao;

    @FindBy(id = "inputCargo")
    private WebElement fieldCargo;

    @FindBy(id = "dinheiro")
    private WebElement fieldSalario;

    @FindBy(id = "clt")
    private WebElement radioButtonClt;

    @FindBy(id = "pj")
    private WebElement radioButtonPj;

    @FindBy(className = "cadastrar-form-btn")
    private WebElement btnEnviar;

    @FindBy(xpath = "//div[@role='alert']")
    private WebElement sucessText;

    WebUtils webUtils;
    FakerValues faker;
    WebDriver driver;
    DataHelper data;

    public CadastrarFuncionarioPage(){
        this.webUtils = new WebUtils();
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
        this.faker = new FakerValues();
        this.data = new DataHelper();
    }

    public void clicarNovoFuncionario(){
        webUtils.clickElement(novoFuncionario);
    }

    public void inserirDadosCadastrais(){
        webUtils.setText(fieldNome, faker.getName(10));
        webUtils.setText(fieldCpf, faker.cpf());
        webUtils.setText(dropDownSexo, faker.getSexoWeb());
        webUtils.setText(fieldAdmissao, data.getDataAtualBr());
        webUtils.setText(fieldCargo, faker.getCargo());
        webUtils.setText(fieldSalario, faker.getSalario());
        webUtils.clickElement(By.id(faker.getCltOuPj()));
    }

    public void inserirCpfInvalido(){
        webUtils.setText(fieldCpf, "11111111111");
    }

    public void validarAlerta(){
        webUtils.validateAlert();
    }

    public void enviarCadastro(){
        webUtils.clickElement(btnEnviar);
    }

    public void validarCadastro(){
        webUtils.validateElement(sucessText);
    }
}
