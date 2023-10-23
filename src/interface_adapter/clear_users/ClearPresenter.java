package interface_adapter.clear_users;

import interface_adapter.ViewModel;
import use_case.clear_users.ClearOutputBoundary;
import interface_adapter.clear_users.ClearViewModel;
import interface_adapter.ViewManagerModel;
import interface_adapter.clear_users.ClearState;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {

    private final ClearViewModel clearViewModel;
    private ViewManagerModel viewManagerModel;

    public ClearPresenter(ViewManagerModel viewManagerModel, ClearViewModel clearViewModel){
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData delete){
        ClearState clearState = clearViewModel.getState();
        clearState.setDelete(delete.getDelete());
        this.clearViewModel.setState(clearState);
        this.clearViewModel.firePropertyChanged();

        viewManagerModel.setActiveView(clearViewModel.getViewName());
        viewManagerModel.firePropertyChanged();

    }

}
