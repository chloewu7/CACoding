package use_case.clear_users;


public class ClearOutputData {

    private String useCaseDelete;

    public ClearOutputData(String useCaseDelete){
        this.useCaseDelete = useCaseDelete;
    }

    public String getDelete(){return useCaseDelete;}
}
