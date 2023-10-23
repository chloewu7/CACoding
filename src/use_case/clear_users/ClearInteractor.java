package use_case.clear_users;

public class ClearInteractor implements ClearInputBoundary {

    final ClearUserDataAccessInterface userDataAccessObject;

    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject,
                           ClearOutputBoundary clearPresenter) {
        this.userDataAccessObject = userDataAccessObject;
        this.clearPresenter = clearPresenter;
    }

    @Override
    public void execute(){
        ClearOutputData clearOutputData = new ClearOutputData(userDataAccessObject.getDelete());
        userDataAccessObject.clear();
        clearPresenter.prepareSuccessView(clearOutputData);

    }


}
