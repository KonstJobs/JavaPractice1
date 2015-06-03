/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import api.MusicSchoolOrganizer;
import api.Performance;
import api.SchoolClass;
import api.Student;
import java.util.List;

/**
 *
 * @author konst
 */
public class Organizer implements MusicSchoolOrganizer {

    @Override
    public void addNewStudent(Student student, SchoolClass schoolClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteStudentFromClass(Student student, SchoolClass schoolClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getAllStudents() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getStudensFromClass(SchoolClass schoolClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void schedulePerformance(Performance performance) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
