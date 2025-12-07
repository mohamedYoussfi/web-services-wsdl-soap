package ws;



import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
@WebService(serviceName = "BankWS")
public class BankAccountService {
    @WebMethod(operationName = "ConversionEuroToDh")
    public double convertToDh(@WebParam(name = "montant") double amount){
        return amount*11;
    }
    @WebMethod
    public Account getAccount(@WebParam(name = "code") int code){
        return new Account(code, 43000, new Date());
    }
    @WebMethod
    public List<Account> listAccounts(){
        return List.of(
                new Account(1, 43000, new Date()),
                new Account(2, 12000, new Date()),
                new Account(3, 33000, new Date())
        );
    }
}
