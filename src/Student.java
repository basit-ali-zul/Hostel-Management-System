
public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private String fatherName;
    private String phoneNo;
    private String email;
    private String studentId;
    private String gender;
    private int age;
    private String country;
    private String room;
    private String address;
    
    public void country(String input){
        this.country = input;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    Student(String firstName, String middleName, String lastName, 
            String fatherName, String phoneNo, String email, 
            String studentId, String gender, String age, 
            String country, String room, String address){
//        this.firstName = firstName;
//        this.middleName = middleName;
//        this.lastName = lastName;
//        this.fatherName = fatherName;
//        this.phoneNo = phoneNo;
//        this.email = email;
//        this.studentId = studentId;
//        this.gender = gender;
//        this.age = Integer.parseInt(age);
//        this.country = country;
//        this.room = room;
//        this.address = address;
            setFirstName(firstName);
            setMiddleName(middleName);
            setLastName(lastName);
            setFatherName(fatherName);
            setPhoneNo(phoneNo);
            setEmail(email);
            setStudentId(studentId);
            setGender(gender);
            setAge(Integer.parseInt(age));
            setCountry(country);
            setRoom(room);
            setAddress(address);
    }

    @Override
    public String toString() {
        return (studentId.toUpperCase() + "|" + firstName.toUpperCase() + "|" + middleName.toUpperCase() + "|"
                        + lastName.toUpperCase() + "|" + fatherName.toUpperCase() + "|" + phoneNo.toUpperCase() + "|"
                        + email.toUpperCase() + "|" + gender.toUpperCase() + "|"
                        + age + "|" + country + "|" + room + "|" + address.toUpperCase());
    }
    
    
}
