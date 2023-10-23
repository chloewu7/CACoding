package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInputData;

public class ClearController {

    final ClearInputBoundary userClearUseCaseInteractor;

    public ClearController(ClearInputBoundary userClearUseCaseInteractor){
        this.userClearUseCaseInteractor = userClearUseCaseInteractor;
    }

    public void execute(String delete){
        ClearInputData clearInputData = new ClearInputData(delete);
        userClearUseCaseInteractor.execute();
    }


}
