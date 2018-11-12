package patterns.common;

public class Student {
    private String mRollNo;
    private String mName;

    Student(String rollNo, String name) {
        mRollNo = rollNo;
        mName = name;
    }

    public void setRollNo(String rollNo) {
        mRollNo = rollNo;
    }

    public String getRollNo() {
        return mRollNo;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    @Override
    public String toString() {
        return "Student [ name:" + mName + ", rollNo:" + mRollNo + "]";
    }
}
