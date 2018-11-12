package patterns.common;

public class StudentController {
    private Student mModel;
    private StudentView mView;

    StudentController(Student model, StudentView view) {
        mModel = model;
        mView = view;
    }

    public String getStudentRollNo() {
        return mModel.getRollNo();
    }

    public void setStudentRollNo(String rollNo) {
        mModel.setRollNo(rollNo);
    }

    public String getStudentName() {
        return mModel.getName();
    }

    public void setStudentName(String name) {
        mModel.setName(name);
    }

    public void updateView() {
        mView.printStudentDetail(mModel);
    }
}
