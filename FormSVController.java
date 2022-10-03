package assignment;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.Collections;
import java.util.Comparator;
import java.util.Observable;

public class FormSVController {
    public TextField txtName;
    public TextField txtMail;
    public TextField txtPoin;
    public ListView<Student> lv;
    public Text errors;

    ObservableList<Student> studentList = FXCollections.observableArrayList();
    public void add(){
        try {
            errors.setVisible(false);
            if (txtName.getText().isEmpty() || txtMail.getText().isEmpty() || txtPoin.getText().isEmpty()){
                throw new Exception("Vui long nhap day du thong tin");

            }
          studentList.add(new Student(txtName.getText(),txtMail.getText(),txtPoin.getText()));
            printResult();
        } catch (Exception e) {
            errors.setText(e.getMessage());
            errors.setVisible(true);
        }



    }
    public void printResult(){
        lv.setItems(studentList);
        lv.refresh();
    }


       public void sxName() {
            Collections.sort(studentList, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });


    }

    public void sxPoin() {
    }


}
