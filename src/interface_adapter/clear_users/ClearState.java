package interface_adapter.clear_users;

public class ClearState {

    private String delete;

    public ClearState(ClearState copy){
        this.delete = copy.delete;
    }

    public ClearState(){}

    public String getDelete(){return delete;}

    public void setDelete(String delete){this.delete = delete;}
}
